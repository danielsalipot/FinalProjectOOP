package FinalProjectPackage;
import java.awt.Color;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ReturnForm extends javax.swing.JInternalFrame {

    Statement st;
    ResultSet rs;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public ReturnForm() {
        initComponents();
        fillComboBox();
        updateTbl();
    }
    
    public void updateTbl(){
       try{
           rs = newStatement().executeQuery("Select * from transactiontbl");
           transtbl.setModel(DbUtils.resultSetToTableModel(rs));
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
        catch(Exception e){
            return null;
        }
    }
    
    public void fillComboBox(){
        try{
            rs = newStatement().executeQuery("SELECT transid FROM transactiontbl");
            while(rs.next()){
                tcmb.addItem(rs.getString("transid"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void fillCustTxt(){
        try{
            ResultSet custid = newStatement().executeQuery("SELECT custid FROM transactiontbl WHERE transid = " + tcmb.getSelectedItem());
            custid.next();
            ResultSet custrs = newStatement().executeQuery("SELECT * FROM customertbl WHERE customerid = " + custid.getString("custid"));   
            custrs.next();
            fnametxt.setText(custrs.getString("firstname"));
            lnametxt.setText(custrs.getString("lastname"));
            cnumtxt.setText(custrs.getString("contactnum"));
            addresstxt.setText(custrs.getString("address"));
            emailtxt.setText(custrs.getString("email"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void fillBookTxt(){
        try{
            ResultSet bookid = newStatement().executeQuery("SELECT bookid FROM transactiontbl WHERE transid = " + tcmb.getSelectedItem());
            bookid.next();
            ResultSet custrs = newStatement().executeQuery("SELECT * FROM bookstbl WHERE bookid = " + bookid.getString("bookid"));   
            custrs.next();
            titletxt.setText(custrs.getString("title"));
            authortxt.setText(custrs.getString("author"));
            publishertxt.setText(custrs.getString("publisher"));
            locationtxt.setText(custrs.getString("location"));
            genretxt.setText(custrs.getString("genre"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public LocalDateTime getDate(){  
        LocalDateTime now = LocalDateTime.now(); 
        return now;
    }
    
    public void fillDates(){
        try {
            ResultSet dates = newStatement().executeQuery("SELECT borrowdate,promiseddate FROM transactiontbl WHERE transid = " + tcmb.getSelectedItem());
            dates.next();
            borrowtxt.setText(dates.getString("borrowdate"));
            returndatetxt.setText(dates.getString("promiseddate"));
            returnedtxt.setText(dtf.format(getDate()));
            CompareDates(returndatetxt.getText(),returnedtxt.getText());
        }catch(Exception e){
            System.out.println(e);
        }
    }
    LocalDateTime returndate;
    LocalDateTime returned;
    public void CompareDates(String a, String b){
        returndate = LocalDateTime.parse(a,dtf);
        returned = LocalDateTime.parse(b,dtf);
        
        if(returned.isBefore(returndate)){
            returnedtxt.setForeground(Color.green);
        }
        else{
            ComputeFee((int) ChronoUnit.DAYS.between(returndate, returned));
            returnedtxt.setForeground(Color.RED);
        }
    }
    
    public void ComputeFee(int a){
        latefeetxt.setText(String.valueOf(a * 100) + "₱" );
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        custpayment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        emailtxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        lnametxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        cnumtxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tcmb = new javax.swing.JComboBox<>();
        returnbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        publishertxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        genretxt = new javax.swing.JTextField();
        locationtxt = new javax.swing.JTextField();
        titletxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        latefeetxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transtbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        borrowtxt = new javax.swing.JLabel();
        returndatetxt = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        returnedtxt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jButton2.setText("Return");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setResizable(true);
        setOpaque(false);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        custpayment.setEnabled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transaction Id");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailtxt.setEnabled(false);
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 188, 330, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 120, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("First Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 50, -1, -1));

        fnametxt.setEnabled(false);
        jPanel1.add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 197, -1));

        lnametxt.setEnabled(false);
        jPanel1.add(lnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 80, 200, -1));

        addresstxt.setEnabled(false);
        jPanel1.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 114, 342, -1));

        cnumtxt.setEnabled(false);
        jPanel1.add(cnumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 154, 330, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 194, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact #");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 160, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Customer Details");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("Pay");
        jButton1.setEnabled(false);

        tcmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tcmbItemStateChanged(evt);
            }
        });

        returnbtn.setText("Return");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Late return fee");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publishertxt.setEnabled(false);
        jPanel2.add(publishertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 116, 192, -1));

        authortxt.setEnabled(false);
        jPanel2.add(authortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, 172, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Publisher");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 94, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Location");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        genretxt.setEnabled(false);
        jPanel2.add(genretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 190, -1));

        locationtxt.setEnabled(false);
        jPanel2.add(locationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 167, 30));

        titletxt.setEnabled(false);
        jPanel2.add(titletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, 375, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Author");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Title");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Book Details");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jButton3.setText("Cancel");

        latefeetxt.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        transtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transtblMouseClicked(evt);
            }
        });
        transtbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                transtblKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(transtbl);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 350));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Borrowed:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date to be returned:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        borrowtxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        borrowtxt.setForeground(new java.awt.Color(255, 255, 255));
        borrowtxt.setText("date");
        jPanel3.add(borrowtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        returndatetxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        returndatetxt.setForeground(new java.awt.Color(255, 255, 255));
        returndatetxt.setText("date");
        jPanel3.add(returndatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date returned:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        returnedtxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        returnedtxt.setForeground(new java.awt.Color(255, 255, 255));
        returnedtxt.setText("date");
        jPanel3.add(returnedtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Customer Payment");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tcmb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(385, 385, 385))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(latefeetxt)
                                    .addComponent(jLabel16)
                                    .addComponent(custpayment)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(returnbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(latefeetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel16))
                                    .addComponent(returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(custpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tcmbItemStateChanged
        fillCustTxt();
        fillBookTxt();
        fillDates();       
    }//GEN-LAST:event_tcmbItemStateChanged

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        if(returned.isBefore(returndate)){
            try{
                newStatement().executeUpdate("UPDATE transactiontbl SET returndate = '"+returnedtxt.getText()+"' WHERE transid = " + tcmb.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Transaction Complete");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_returnbtnActionPerformed

    private void transtblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transtblKeyReleased

    }//GEN-LAST:event_transtblKeyReleased

    private void transtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transtblMouseClicked
        for(int i = 0; i < tcmb.getItemCount();i++){
             if(tcmb.getItemAt(i).equals(String.format("%011d",transtbl.getValueAt(transtbl.getSelectedRow(),0)))){
               tcmb.setSelectedIndex(i);
           }
        }
    }//GEN-LAST:event_transtblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField authortxt;
    private javax.swing.JLabel borrowtxt;
    private javax.swing.JTextField cnumtxt;
    private javax.swing.JTextField custpayment;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JTextField genretxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField latefeetxt;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JTextField locationtxt;
    private javax.swing.JTextField publishertxt;
    private javax.swing.JButton returnbtn;
    private javax.swing.JLabel returndatetxt;
    private javax.swing.JLabel returnedtxt;
    private javax.swing.JComboBox<String> tcmb;
    private javax.swing.JTextField titletxt;
    private javax.swing.JTable transtbl;
    // End of variables declaration//GEN-END:variables
}
