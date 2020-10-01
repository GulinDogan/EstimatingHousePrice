function [TahminVsGercek, MSE, RMSE] = EstimationMATLAB()

load matlab net 

% Connection to database 
conn = database('mydb1','root','');
conn.Message % ans = [] if successful connection 

sqlQuery = 'SELECT * FROM estimation_house_information';
data1 = fetch(conn,sqlQuery);

id = data1(:,1);
test_inputs = data1(:,2:7);
test_targets = data1(:,8);

test_inputs = test_inputs';
test_targets = test_targets';

test_inputs_n = mapminmax(test_inputs,0,1);
[test_targets_n, ps] = mapminmax(test_targets,0,1);

% Test the Network
test_outputs_n = net(test_inputs_n);
test_outputs = mapminmax('reverse', test_outputs_n, ps);
test_outputs = test_outputs';
test_targets = test_targets';

TahminVsGercek = [test_targets(:,:),test_outputs(:,:)];

MSE = mse(test_targets_n-test_outputs_n);  % 0 a yakýn olmasý gerekli
RMSE = sqrt(mean((test_targets_n - test_outputs_n).^2));

% mysql data reading
sqlQuery = 'SELECT * FROM compare_data';
data2 = fetch(conn,sqlQuery);

TF = isempty(data2); % 1 Boþ 0 Dolu

if TF == 1
    
    n=1;
    [m,~] = size(id);

    for i= n:m

        ID = id(i,1);
        tvg1 = TahminVsGercek(i,1);
        tvg2 = TahminVsGercek(i,2);

       colnames = {'id','real_price','estimation_price'};
       data = {ID,tvg1,tvg2};
       tablename = 'compare_data';
       datainsert(conn,tablename,colnames,data);
     
    end

else
    
    sqlquery =['DELETE FROM compare_data'];
    curs = exec(conn,sqlquery);
    
    n=1;
    [m,~] = size(id);

    for i= n:m
    
       ID = id(i,1);
       tvg1 = TahminVsGercek(i,1);
       tvg2 = TahminVsGercek(i,2);

       colnames = {'id','real_price','estimation_price'};
       data = {ID,tvg1 tvg2};
       tablename = 'compare_data';
       datainsert(conn,tablename,colnames,data);
    
    end
end

end




