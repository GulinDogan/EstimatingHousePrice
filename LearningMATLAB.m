function [TahminVsGercek, net, MSE, RMSE]  = LearningMATLAB()

% Connection to database 
conn = database('mydb1','root','');
conn.Message % ans = [] if successful connection 

% mysql data reading
sqlQuery = 'SELECT * FROM real_estate_information';
data = fetch(conn,sqlQuery);

inputs= data(:,4:end);
targets = data(:,3);
id = data(:,1);

inputs = inputs';
targets = targets';

inputs_n = mapminmax(inputs,0,1);
[targets_n, ps] = mapminmax(targets,0,1);

% Create a Fitting Network
hiddenLayer1 = 8;
hiddenLayer2 = 8;
lrate = 1.0; % learning rate , ��renme h�z�

net = fitnet([hiddenLayer1,hiddenLayer2],'trainbr'); 

% Set up Division of Data for Training, Validation, Testing
net.divideParam.trainRatio = 0.7;
net.divideParam.valRatio = 0.15;
net.divideParam.testRatio = 0.15;
net.trainParam.lr = lrate; % a� �zerinde ��renme parametresinin learning rate de�eri benim girdi�im lrate olsun.
net.trainParam.epochs = 1000; % a� da yap�lacak olan iterasoyon(dongu say�s�) belirtilir.
net.trainParam.goal = 0; % goal �zelli�i belli bir iterasyondan sonra tahmin edilen de�erler 1e-20(10 �zeri -20)ye yak�nsad���nda dur.
net.trainParam.show = NaN; % show() ka� d�ng�de bir algoritmadan haber almak istersin? NaN sonu�land���nda algoritma bilgilerini g�stermesini istedik.

% Train the Network
[net,tr] = train(net,inputs_n,targets_n);

% Test the Network
outputs_n = net(inputs_n);

outputs = mapminmax('reverse', outputs_n, ps);

outputs = outputs';
targets = targets';

TahminVsGercek = [targets(:,:),outputs(:,:)];

MSE = mse(net,targets_n,outputs_n);  % 0 a yak�n olmas� gerekli
RMSE = sqrt(mean((targets_n - outputs_n).^2));

% mysql data reading
sqlQuery = 'SELECT * FROM learning_information';
data2 = fetch(conn,sqlQuery);

TF = isempty(data2); % 1 Bo� 0 Dolu

if TF == 1

       
    Mse = MSE;
    Rmse = RMSE;

   colnames = {'MSE','RMSE'};
   data = {Mse,Rmse};
   tablename = 'learning_information';
   datainsert(conn,tablename,colnames,data);

else
    
    sqlquery =['DELETE FROM compare_data'];
    curs = exec(conn,sqlquery);
    
    sqlquery =['DELETE FROM learning_information'];
    curs = exec(conn,sqlquery);
       
    Mse = MSE;
    Rmse = RMSE;

   colnames = {'MSE','RMSE'};
   data = {Mse,Rmse};
   tablename = 'learning_information';
   datainsert(conn,tablename,colnames,data);

  end

end




