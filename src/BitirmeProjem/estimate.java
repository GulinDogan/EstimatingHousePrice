package BitirmeProjem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class estimate extends javax.swing.JFrame {
    
    private Connection conn = null; //Bağlantı nesnemiz
    private final String url = "jdbc:mysql://localhost:3306/";//veritabanının adresi ve portu
    private final String dbName = "mydb1"; //veritabanının ismi
    private final String driver = "com.mysql.jdbc.Driver";//mySQL ile Java arasındaki bağlantıyı sağlayan JDBC sürücüsü
    private final String userName = "root"; //veritabanı için kullanıcı adı
    private final String password = ""; //kullanıcı şifresi
    private ResultSet rs; // sorgulardan dönecek kayıtlar (sonuç kümesi) bu nesne içerisinde tutulacak
    private Statement stmt;
    
    public estimate() {
        initComponents();
        
    }

    public java.sql.Statement startConnection() throws Exception {
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url + dbName, userName, password);//bağlantı açılıyor           
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);    

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        log_out = new javax.swing.JButton();
        back = new javax.swing.JButton();
        MatlabNN = new javax.swing.JButton();
        compare = new javax.swing.JButton();
        NewRceord = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfBuidYear = new javax.swing.JTextField();
        tfFloors = new javax.swing.JTextField();
        tfView = new javax.swing.JTextField();
        tfSqftLiving = new javax.swing.JTextField();
        tfBathrooms = new javax.swing.JTextField();
        tfBedrooms = new javax.swing.JTextField();
        Message1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfRealPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estimaton");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        log_out.setText("Log Out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        MatlabNN.setText(" Esimation House Price");
        MatlabNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatlabNNActionPerformed(evt);
            }
        });

        compare.setText("Compare Estimated And Real Home Prices");
        compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareActionPerformed(evt);
            }
        });

        NewRceord.setText("new estimated real estate registration");
        NewRceord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRceordActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gulin\\Documents\\NetBeansProjects\\22.01.19\\image\\yesil_ev.PNG")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewRceord, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MatlabNN, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(compare, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(log_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NewRceord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MatlabNN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(compare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Price Estimation:");

        jLabel3.setText("Bedrooms ");

        jLabel4.setText("Bathrooms");

        jLabel2.setText("Sqft living");

        jLabel8.setText("View");

        jLabel7.setText("Floors");

        jLabel5.setText("Built year");

        tfBuidYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuidYearActionPerformed(evt);
            }
        });

        tfFloors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFloorsActionPerformed(evt);
            }
        });

        tfView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfViewActionPerformed(evt);
            }
        });

        tfSqftLiving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSqftLivingActionPerformed(evt);
            }
        });

        tfBedrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBedroomsActionPerformed(evt);
            }
        });

        Message1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Message1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setText("Gerçek Emlak Fiyatı:");

        tfRealPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRealPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Message1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(tfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addComponent(tfBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSqftLiving, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfView, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFloors, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBuidYear, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRealPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Message1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(tfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(tfBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tfSqftLiving, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(tfView, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(tfFloors, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tfBuidYear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(tfRealPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareActionPerformed

        String bedrooms = tfBedrooms.getText();
        String bathrooms = tfBathrooms.getText();
        String sqftLiving = tfSqftLiving.getText();
        String floors = tfFloors.getText();
        String view = tfView.getText();
        String buliltYear = tfBuidYear.getText();
        String price = tfRealPrice.getText();

        try{

            stmt = startConnection();
                
            String query = "Select estimation_price FROM  compare_data ";
            System.out.println("SQL :"+query);
            rs=stmt.executeQuery(query);


            if(rs.next() == true)
            {
                this.dispose();
                Comparison k = new Comparison();
                k.setVisible(true);


            }else{
                    Message1.setText("No data has been estimated for any data."); // Hiçbir veri için fiyat tahmini yapılmamıştır. 

            }  

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_compareActionPerformed

    private void MatlabNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatlabNNActionPerformed

        String bedrooms = tfBedrooms.getText();
        String bathrooms = tfBathrooms.getText();
        String sqftLiving = tfSqftLiving.getText();
        String floors = tfFloors.getText();
        String view = tfView.getText();
        String buliltYear = tfBuidYear.getText();
        String price = tfRealPrice.getText();
        try{

            if (tfBedrooms.getText().trim().equals("")|| tfBathrooms.getText().trim().equals("")|| tfSqftLiving.getText().trim().equals("") || tfFloors.getText().trim().equals("") || tfView.getText().trim().equals("") || tfBuidYear.getText().trim().equals("")) {

                Message1.setText("Fill empty fields");

            }
            else{
                int Bedrooms = Integer.parseInt(bedrooms);
                int Bathrooms = Integer.parseInt(bathrooms);
                int SqftLiving = Integer.parseInt(sqftLiving);
                int Floors = Integer.parseInt(floors);
                int View = Integer.parseInt(view);
                int BuiltYear = Integer.parseInt(buliltYear);
                double Price = Double.parseDouble(price);
                
              
                stmt = startConnection();
                
                
                String query1 = "Select id FROM  estimation_house_information WHERE bedrooms = "+Bedrooms+" && bathrooms = "+Bathrooms+" && sqft_living = "+SqftLiving+" && view = "+View+" && floors = "+Floors+" && built_year = "+BuiltYear+" && real_price = "+Price+"";
                rs= stmt.executeQuery(query1);

                if(rs.next()== false){
                    Message1.setText("The requested entry is not registered in the database. Please click on Add new record button. ");
                }
                else{

                        Message1.setText("");
                        Process process  = Runtime.getRuntime().exec("matlab -r \"[TahminVsGercek, MSE, RMSE] = EstimationMATLAB()");
                          
                }                

            }

        }
        catch(Exception ex){
            ex.printStackTrace();

        }

    }//GEN-LAST:event_MatlabNNActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // önceki sayfaya donmek
        this.dispose();
        Learning l = new Learning();
        l.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        System.exit(0);
    }//GEN-LAST:event_log_outActionPerformed

    private void tfFloorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFloorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFloorsActionPerformed

    private void tfBuidYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuidYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuidYearActionPerformed

    private void tfViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfViewActionPerformed

    private void tfBedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBedroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBedroomsActionPerformed

    private void tfRealPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRealPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRealPriceActionPerformed

    private void NewRceordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRceordActionPerformed
        
        
        try{

            String price = tfRealPrice.getText();
            String rooms = tfBedrooms.getText();
            String bathrooms = tfBathrooms.getText();
            String sqftLiving = tfSqftLiving.getText();
            String floors = tfFloors.getText();
            String view = tfView.getText();
            String buliltYear = tfBuidYear.getText();

           

            if ( tfRealPrice.getText().trim().equals("") || tfBedrooms.getText().trim().equals("") || tfBathrooms.getText().trim().equals("")|| tfSqftLiving.getText().trim().equals("") || tfFloors.getText().trim().equals("") || tfView.getText().trim().equals("") || tfBuidYear.getText().trim().equals("")) {

                Message1.setText("Fill in the missing fields!"); // Eksik Alanları Doldurun

            }
            else{
               
                Message1.setText("");
               
                double Price = Double.parseDouble(price);
                int Rooms = Integer.parseInt(rooms);
                int Bathrooms = Integer.parseInt(bathrooms);
                int SqftLiving = Integer.parseInt(sqftLiving);
                int Floors = Integer.parseInt(floors);
                int View = Integer.parseInt(view);
                int BuiltYear = Integer.parseInt(buliltYear);
 
                try {
                   
                                    
                    stmt = startConnection();

                    String sql1 = "insert into estimation_house_information ( bedrooms, bathrooms, sqft_living, view, floors, built_year, real_price) VALUES ('"+Rooms+"','"+Bathrooms+"','"+SqftLiving+"','"+View+"','"+Floors+"','"+BuiltYear+"','"+Price+"')";
                    System.out.println(sql1);
                    stmt.executeUpdate(sql1);

                }
                
                catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_NewRceordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        Menu h = new Menu();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfSqftLivingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSqftLivingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSqftLivingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(estimate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estimate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estimate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estimate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estimate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MatlabNN;
    private javax.swing.JLabel Message1;
    private javax.swing.JButton NewRceord;
    private javax.swing.JButton back;
    private javax.swing.JButton compare;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton log_out;
    private javax.swing.JTextField tfBathrooms;
    private javax.swing.JTextField tfBedrooms;
    private javax.swing.JTextField tfBuidYear;
    private javax.swing.JTextField tfFloors;
    private javax.swing.JTextField tfRealPrice;
    private javax.swing.JTextField tfSqftLiving;
    private javax.swing.JTextField tfView;
    // End of variables declaration//GEN-END:variables
}
