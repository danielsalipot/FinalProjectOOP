package FinalProjectPackage;
import java.sql.*;
import javax.swing.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import javax.swing.table.DefaultTableModel;


public class BorrowForm extends javax.swing.JInternalFrame {

    Statement st;
    ResultSet rs;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            
    public BorrowForm() {
        initComponents();
        fillComboBox();
        borrowtxt.setText(dtf.format(getDate()));
        returndatetxt.setText(dtf.format(getDate().plusDays(7)));
    }
    
    public LocalDateTime getDate(){  
        LocalDateTime now = LocalDateTime.now(); 
        return now;
    }
    
    public void fillComboBox(){
        try{
            rs = newStatement().executeQuery("SELECT customerid FROM customertbl");
            while(rs.next()){
                custcmb.addItem(rs.getString("customerid"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            rs = newStatement().executeQuery("SELECT bookid FROM bookstbl");
            while(rs.next()){
                bookcmb.addItem(rs.getString("bookid"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public Statement newStatement(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libsysdb?zeroDateTimeBehavior=convertToNull","root","");
            st = con.createStatement();
            return st;
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("libsysdb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bookstblQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bookstbl b");
        bookstblList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bookstblQuery.getResultList();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        emailtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        lnametxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        custcmb = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cnumtxt = new javax.swing.JTextField();
        confirmcust = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        publishertxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        genretxt = new javax.swing.JTextField();
        locationtxt = new javax.swing.JTextField();
        titletxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bookcmb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        returncmb = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        borrowtxt = new javax.swing.JLabel();
        returndatetxt = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transtbl = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        confirmbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailtxt.setEnabled(false);
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 188, 330, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("First Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Last Name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 50, -1, -1));

        fnametxt.setEnabled(false);
        jPanel1.add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 197, -1));

        lnametxt.setEnabled(false);
        jPanel1.add(lnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 80, 192, -1));

        addresstxt.setEnabled(false);
        jPanel1.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 114, 342, -1));

        custcmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                custcmbItemStateChanged(evt);
            }
        });
        jPanel1.add(custcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 218, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        cnumtxt.setEnabled(false);

        confirmcust.setBackground(new java.awt.Color(51, 51, 51));
        confirmcust.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmcust.setForeground(new java.awt.Color(255, 255, 255));
        confirmcust.setText("Confirm User");
        confirmcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmcustActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Contact #:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Email:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(confirmcust, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)))
                .addContainerGap(693, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(65, 65, 65)
                .addComponent(confirmcust, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1110, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publishertxt.setEnabled(false);
        jPanel2.add(publishertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 116, 192, -1));

        authortxt.setEnabled(false);
        jPanel2.add(authortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, 172, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Publisher:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 94, -1, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Location:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        genretxt.setEnabled(false);
        jPanel2.add(genretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 184, 190, -1));

        locationtxt.setEnabled(false);
        jPanel2.add(locationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 167, -1));

        titletxt.setEnabled(false);
        jPanel2.add(titletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 375, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Author:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Book Title:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, -1, -1));

        bookcmb.setEnabled(false);
        bookcmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bookcmbItemStateChanged(evt);
            }
        });
        jPanel2.add(bookcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 218, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Genre:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 162, -1, -1));

        returncmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Week", "2 Weeks", "3 Weeks", "4 Weeks", "5 Weeks", " " }));
        returncmb.setToolTipText("");
        returncmb.setEnabled(false);
        returncmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                returncmbItemStateChanged(evt);
            }
        });
        jPanel2.add(returncmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 230, 160, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Duration:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Date Borrowed:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Date to be returned:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        borrowtxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        borrowtxt.setText("Date");
        jPanel3.add(borrowtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        returndatetxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        returndatetxt.setText("Date");
        jPanel3.add(returndatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel15.setText("Dates");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        transtbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        transtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Book ID", "Book Name", "Borrow Date", "Return Date"
            }
        ));
        jScrollPane1.setViewportView(transtbl);

        addbtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addbtn.setText("Add");
        addbtn.setEnabled(false);
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmbtn.setBackground(new java.awt.Color(51, 51, 51));
        confirmbtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        confirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmbtn.setText("Confirm");
        confirmbtn.setEnabled(false);
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Transaction List ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
=======
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmcust, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 1dc8a3f012362f11593482c04e340383e04d2e70
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
=======
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmcust, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
>>>>>>> 1dc8a3f012362f11593482c04e340383e04d2e70
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(323, 323, 323)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custcmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_custcmbItemStateChanged
        try{
            ResultSet rscust = newStatement().executeQuery("SELECT * FROM customertbl WHERE customerid="+custcmb.getSelectedItem());
            rscust.next();
            // UPDATE THE TEXTBOX
            updateTextField(fnametxt,rscust,"firstname");
            updateTextField(lnametxt,rscust,"lastname");
            updateTextField(cnumtxt,rscust,"contactnum");
            updateTextField(emailtxt,rscust,"email");
            updateTextField(addresstxt,rscust,"address");
        }catch(Exception e){
            System.out.println(e + "a");
        }
    }//GEN-LAST:event_custcmbItemStateChanged

    private void bookcmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bookcmbItemStateChanged
        try{
            ResultSet rsbook = newStatement().executeQuery("SELECT * FROM bookstbl WHERE bookid="+bookcmb.getSelectedItem());
            rsbook.next();
            // UPDATE THE TEXTBOX
            updateTextField(titletxt,rsbook,"title");
            updateTextField(authortxt,rsbook,"author");
            updateTextField(publishertxt,rsbook,"publisher");
            updateTextField(genretxt,rsbook,"genre");
            updateTextField(locationtxt,rsbook,"location");
        }catch(Exception e){
            System.out.println(e + "a");
        }
    }//GEN-LAST:event_bookcmbItemStateChanged

    private void returncmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_returncmbItemStateChanged
        int weeks = returncmb.getSelectedIndex() + 1;
        returndatetxt.setText(dtf.format(getDate().plusDays(weeks * 7)));
    }//GEN-LAST:event_returncmbItemStateChanged

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        int n = JOptionPane.showOptionDialog(this, "Record The Transaction?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Record", "Cancel"},new Object[]{"Record"});
        if(n == 0){
            try{
                String s = "custid,custname,bookid,btitle,borrowdate,promiseddate";
                String cid,cname,bid,bttl,bd,rd;
                for(int i = 0; i < transtbl.getRowCount(); i++){
                    cid = transtbl.getValueAt(i, 0).toString();
                    cname = transtbl.getValueAt(i, 1).toString();
                    bid = transtbl.getValueAt(i, 2).toString();
                    bttl = transtbl.getValueAt(i, 3).toString();
                    bd = transtbl.getValueAt(i, 4).toString();
                    rd = transtbl.getValueAt(i, 5).toString();
                    newStatement().executeUpdate("INSERT INTO transactiontbl ("+s+") VALUES("+cid+",'"+cname+"',"+bid+",'"+bttl+"','"+bd+"','"+rd+"')");
                }
                JOptionPane.showMessageDialog(this, "Transaction Has Been Recorded");
            }catch(Exception e){
                System.out.println(e);
            }      
        } 
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) transtbl.getModel();
        confirmbtn.setEnabled(true);
        borrowtxt.setText(dtf.format(getDate()));
        model.addRow(new Object[]{custcmb.getSelectedItem(),fnametxt.getText() + " " + lnametxt.getText(),bookcmb.getSelectedItem(),titletxt.getText(),borrowtxt.getText(),returndatetxt.getText()});
    }//GEN-LAST:event_addbtnActionPerformed

    private void confirmcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmcustActionPerformed
        custcmb.setEnabled(false);
        confirmcust.setEnabled(false);
        addbtn.setEnabled(true);
        bookcmb.setEnabled(true);
        returncmb.setEnabled(true);
    }//GEN-LAST:event_confirmcustActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        custcmb.setEnabled(true);
        confirmcust.setEnabled(true);
        addbtn.setEnabled(false);
        bookcmb.setEnabled(false);
        confirmbtn.setEnabled(false);
        returncmb.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) transtbl.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void updateTextField(JTextField txt,ResultSet r, String s){
        try{
            txt.setText(r.getString(s));
        }catch(Exception e){
            System.out.println(e + "b");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField authortxt;
    private javax.swing.JComboBox<String> bookcmb;
    private java.util.List<FinalProjectPackage.Bookstbl> bookstblList;
    private javax.persistence.Query bookstblQuery;
    private javax.swing.JLabel borrowtxt;
    private javax.swing.JTextField cnumtxt;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JButton confirmcust;
    private javax.swing.JComboBox<String> custcmb;
    private javax.swing.JTextField emailtxt;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JTextField genretxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JTextField locationtxt;
    private javax.swing.JTextField publishertxt;
    private javax.swing.JComboBox<String> returncmb;
    private javax.swing.JLabel returndatetxt;
    private javax.swing.JTextField titletxt;
    private javax.swing.JTable transtbl;
    // End of variables declaration//GEN-END:variables
}
