package BitirmeProjem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public final class HouseInfo extends javax.swing.JFrame {

    private Connection conn = null; //Bağlantı nesnemiz
    private String url = "jdbc:mysql://localhost:3306/";//veritabanının adresi ve portu
    private String dbName = "mydb1"; //veritabanının ismi
    private String driver = "com.mysql.jdbc.Driver";//mySQL ile Java arasındaki bağlantıyı sağlayan JDBC sürücüsü
    private String userName = "root"; //veritabanı için kullanıcı adı
    private String password = ""; //kullanıcı şifresi
    private ResultSet rs; // sorgulardan dönecek kayıtlar (sonuç kümesi) bu nesne içerisinde tutulacak
    private PreparedStatement pst;  
    private Statement stmt;

    
    public java.sql.Statement startConnection() throws Exception {
    
        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url + dbName, userName, password);//bağlantı açılıyor           
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);    
       
    }
 
    public HouseInfo() {
        initComponents();
       
        try{
             
        stmt = startConnection();
     
        String sql = "SELECT * FROM real_estate_information ";
        pst = conn.prepareStatement(sql); 
        rs = pst.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));   //re2xml.jar dos. indir.
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);

        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfBuidYear = new javax.swing.JTextField();
        tfView = new javax.swing.JTextField();
        tfFloors = new javax.swing.JTextField();
        tfSqftLiving = new javax.swing.JTextField();
        tfBathrooms = new javax.swing.JTextField();
        tfBedrooms = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Message = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        addButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Home Information");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setBackground(new java.awt.Color(0, 51, 153));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setText("Id");
        jLabel27.setToolTipText("");

        jLabel26.setBackground(new java.awt.Color(0, 51, 153));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setText("Add Date ");
        jLabel26.setToolTipText("");

        jLabel25.setBackground(new java.awt.Color(0, 51, 153));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setText("Price");
        jLabel25.setToolTipText("");

        jLabel24.setBackground(new java.awt.Color(0, 51, 153));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText("Bedrooms");
        jLabel24.setToolTipText("");

        jLabel23.setBackground(new java.awt.Color(0, 51, 153));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("Bathrooms");
        jLabel23.setToolTipText("");

        jLabel22.setBackground(new java.awt.Color(0, 51, 153));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("Sqft. living");
        jLabel22.setToolTipText("");

        jLabel21.setBackground(new java.awt.Color(0, 51, 153));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("Floors");
        jLabel21.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("View");

        jLabel19.setBackground(new java.awt.Color(0, 51, 153));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Build year");
        jLabel19.setToolTipText("");

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

        tfBathrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBathroomsActionPerformed(evt);
            }
        });

        tfBedrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBedroomsActionPerformed(evt);
            }
        });

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });

        tfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateActionPerformed(evt);
            }
        });

        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Date", "Price", "Rooms", "Bathrooms", "Sqft_liviing", "Floors", "View", "Buil year"
            }
        ));
        table.setToolTipText("");
        table.setColumnSelectionAllowed(true);
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Message.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFloors)
                            .addComponent(tfSqftLiving)
                            .addComponent(tfBathrooms)
                            .addComponent(tfBedrooms)
                            .addComponent(tfDate)
                            .addComponent(tfPrice)
                            .addComponent(tfView)
                            .addComponent(tfId)
                            .addComponent(tfBuidYear, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(tfBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSqftLiving, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFloors, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tfView, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfBuidYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addButton1.setText("Add New Record");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        deleteButton1.setText("Delete Record");
        deleteButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButton1MouseClicked(evt);
            }
        });
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        updateButton1.setText("Update Record");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        log_out.setText("Log out");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(log_out, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // tablo üzerindeki satırları değiştirmek üzerre text field de görünür
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        tfId.setText(model.getValueAt(table.getSelectedRow(), 0).toString());
        tfDate.setText(model.getValueAt(table.getSelectedRow(), 1).toString());
        tfPrice.setText(model.getValueAt(table.getSelectedRow(),2).toString());
        tfBedrooms.setText(model.getValueAt(table.getSelectedRow(), 3).toString());
        tfBathrooms.setText(model.getValueAt(table.getSelectedRow(),4).toString());
        tfSqftLiving.setText(model.getValueAt(table.getSelectedRow(),5).toString());           
        tfFloors.setText(model.getValueAt(table.getSelectedRow(),6).toString());
        tfView.setText(model.getValueAt(table.getSelectedRow(),7).toString()); 
        tfBuidYear.setText(model.getValueAt(table.getSelectedRow(),8).toString());    
    
    }//GEN-LAST:event_tableMouseClicked

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed

        try{

            String Id = tfId.getText();
            String Date = tfDate.getText(); // date dipini cerirerek ata
            String price = tfPrice.getText();
            String rooms = tfBedrooms.getText();
            String bathrooms = tfBathrooms.getText();
            String sqftLiving = tfSqftLiving.getText();
            String floors = tfFloors.getText();
            String view = tfView.getText();
            String buliltYear = tfBuidYear.getText();

            DefaultTableModel model = (DefaultTableModel) table.getModel();

            if (tfId.getText().trim().equals("") || tfDate.getText().trim().equals("") || tfPrice.getText().trim().equals("") || tfBedrooms.getText().trim().equals("") || tfBathrooms.getText().trim().equals("")|| tfSqftLiving.getText().trim().equals("") || tfFloors.getText().trim().equals("") || tfView.getText().trim().equals("") || tfBuidYear.getText().trim().equals("")) {

                Message.setText("Fill in the missing fields!"); // Eksik Alanları Doldurun

            }
            else{
                long id = Long.parseLong(Id);
                System.out.println("id: "+id);

                String query = "SELECT id FROM real_estate_information WHERE id  ="+id+"";
                System.out.println("query: "+query);
             
                stmt =  startConnection();
                ResultSet rs = stmt.executeQuery(query);

                if(rs.next() == true)
                {

                    Message.setText("This ID is used."); // Bu ID kullanılmaktadır.
                }
                else{

                    model.addRow(new Object[]{tfId.getText(), tfDate.getText(), tfPrice.getText(), tfBedrooms.getText(), tfBathrooms.getText(), tfSqftLiving.getText(), tfFloors.getText(),tfView.getText(),tfBuidYear.getText()});
                    Message.setText("");

                    double Price = Double.parseDouble(price);
                    int Rooms = Integer.parseInt(rooms);
                    int Bathrooms = Integer.parseInt(bathrooms);
                    int SqftLiving = Integer.parseInt(sqftLiving);
                    int Floors = Integer.parseInt(floors);
                    int View = Integer.parseInt(view);
                    int BuiltYear = Integer.parseInt(buliltYear);

                    String sql = "insert into real_estate_information (id, date, price , bedrooms, bathrooms, sqft_living, floors, view, built_year) VALUES ('"+id+"','"+Date+"','"+Price+"','"+Rooms+"','"+Bathrooms+"','"+SqftLiving+"','"+Floors+"','"+View+"','"+BuiltYear+"')";
                    System.out.println(""+sql);

                    try {
                       
                        stmt.executeUpdate(sql);

                        
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception ex) {
                        Logger.getLogger(HouseInfo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_addButton1ActionPerformed

    private void deleteButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButton1MouseClicked

       
    }//GEN-LAST:event_deleteButton1MouseClicked

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        
   try {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (table.getSelectedRow() == -1) {
                if (table.getRowCount() == 0) {
                    Message.setText("Table empty");
                } else {
                    Message.setText("Choose from the table");
                }
            } 
            else {
                if (tfId.getText().trim().equals("") || tfDate.getText().trim().equals("") || tfPrice.getText().trim().equals("") || tfBedrooms.getText().trim().equals("") || tfBathrooms.getText().trim().equals("")|| tfSqftLiving.getText().trim().equals("") || tfFloors.getText().trim().equals("") || tfView.getText().trim().equals("") || tfBuidYear.getText().trim().equals("")) {

                    Message.setText("Fill in the missing fields!"); // Eksik Alanları Doldurun

                }
                else{
                   
                    Message.setText(" ");
                    model.removeRow(table.getSelectedRow());
                                
                }
            }    
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        try {

            String sql = "DELETE FROM  real_estate_information WHERE id =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, tfId.getText());
            pst.executeUpdate();
           

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception ex) {
            Logger.getLogger(HouseInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed


        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        Message.setText(" ");

        if (table.getSelectedRow() == -1) {
            if (table.getRowCount() == 0) {
                Message.setText("Table Empty");
            } else {
                Message.setText("You must choose");
            }
        } else {

            model.setValueAt(tfDate.getText(), table.getSelectedRow(), 1);
            model.setValueAt(tfPrice.getText(), table.getSelectedRow(), 2);
            model.setValueAt(tfBedrooms.getText(), table.getSelectedRow(), 3);
            model.setValueAt(tfBathrooms.getText(), table.getSelectedRow(), 4);
            model.setValueAt(tfSqftLiving.getText(), table.getSelectedRow(), 5);
            model.setValueAt(tfFloors.getText(), table.getSelectedRow(), 6);
            model.setValueAt(tfView.getText(), table.getSelectedRow(), 7);
            model.setValueAt(tfBuidYear.getText(), table.getSelectedRow(), 8);
            
        }

        try{
           
            String Id = tfId.getText();
            String Date = tfDate.getText(); // date tipini cerirerek ata 
            String price = tfPrice.getText();
            String rooms = tfBedrooms.getText();
            String bathrooms = tfBathrooms.getText();
            String sqftLiving = tfSqftLiving.getText();
            String floors = tfFloors.getText();
            String view = tfView.getText();
            String buliltYear = tfBuidYear.getText();


            if (tfId.getText().trim().equals("") || tfDate.getText().trim().equals("") || tfPrice.getText().trim().equals("") || tfBedrooms.getText().trim().equals("") || tfBathrooms.getText().trim().equals("")|| tfSqftLiving.getText().trim().equals("") || tfFloors.getText().trim().equals("") || tfView.getText().trim().equals("") || tfBuidYear.getText().trim().equals("")) {

                 Message.setText("Fill in the missing fields!"); // Eksik Alanları Doldurun
                 
            }
            else{
                long id = Long.parseLong(Id);
                System.out.println("id: "+id);
                 
                String query = "SELECT id FROM real_estate_information WHERE id  ="+id+"";
                System.out.println("query: "+query);

                stmt= startConnection();        
                rs = stmt.executeQuery(query);
              
                 if(rs.next() != true)
                 {    

                    Message.setText(" No data to update.."); // Güncellenecek veri bulunamadı.
                 }
                  else{


                    model.setValueAt(tfDate.getText(), table.getSelectedRow(), 1);
                    model.setValueAt(tfPrice.getText(), table.getSelectedRow(), 2);
                    model.setValueAt(tfBedrooms.getText(), table.getSelectedRow(), 3);
                    model.setValueAt(tfBathrooms.getText(), table.getSelectedRow(), 4);
                    model.setValueAt(tfSqftLiving.getText(), table.getSelectedRow(), 5);
                    model.setValueAt(tfFloors.getText(), table.getSelectedRow(), 6);
                    model.setValueAt(tfView.getText(), table.getSelectedRow(), 7);
                    model.setValueAt(tfBuidYear.getText(), table.getSelectedRow(), 8);

            
                }

            String value1 = tfId.getText();
            String value2 = tfDate.getText();
            String value3 = tfPrice.getText();
            String value4 = tfBedrooms.getText();
            String value5 = tfBathrooms.getText();
            String value6 = tfSqftLiving.getText();
            String value7 = tfFloors.getText();
            String value8 = tfView.getText();
            String value9 = tfBuidYear.getText();     


         String sql = "UPDATE real_estate_information SET date = '"+value2+"', price ='"+value3+"', bedrooms = '"+value4+"', bathrooms = '"+value5+"', sqft_living = '"+value6+"', floors= '"+value7+"', view = '"+value8+"', built_year = '"+value9+"' WHERE id ='"+value1+"'" ;
         try {
            
             pst = conn.prepareStatement(sql);
             pst.executeUpdate();
             

         }
         catch (SQLException e) {
             System.out.println(e.getMessage());

         }
         }
         }catch(Exception e){
             e.printStackTrace();
         }

    }//GEN-LAST:event_updateButton1ActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        System.exit(0);
    }//GEN-LAST:event_log_outActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // önceki sayfaya donmek
        this.dispose();
        Menu h = new Menu();
        h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void tfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDateActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void tfBuidYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuidYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuidYearActionPerformed

    private void tfBedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBedroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBedroomsActionPerformed

    private void tfFloorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFloorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFloorsActionPerformed

    private void tfBathroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBathroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBathroomsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        Menu h = new Menu();
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
   public void closeConnection() throws Exception {
        conn.close();
    }
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HouseInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton back;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfBathrooms;
    private javax.swing.JTextField tfBedrooms;
    private javax.swing.JTextField tfBuidYear;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfFloors;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfSqftLiving;
    private javax.swing.JTextField tfView;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}