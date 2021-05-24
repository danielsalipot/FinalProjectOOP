package FinalProjectPackage;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import net.proteanit.sql.DbUtils;

public class CustomerForm extends javax.swing.JInternalFrame {

    Statement st;
    ResultSet rs;
    public CustomerForm() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("libsysdb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        customertblQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customertbl c");
        customertblList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customertblQuery.getResultList();
        customertblQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Customertbl c");
        customertblList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customertblQuery1.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        custtbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchcmb = new javax.swing.JComboBox<>();
        address = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cnum = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                closing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, customertblList1, custtbl);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${customerid}"));
        columnBinding.setColumnName("Customerid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstname}"));
        columnBinding.setColumnName("Firstname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastname}"));
        columnBinding.setColumnName("Lastname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${contactnum}"));
        columnBinding.setColumnName("Contactnum");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        custtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custtblClick(evt);
            }
        });
        jScrollPane1.setViewportView(custtbl);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, custtbl, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.customerid}"), jLabel7, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact #:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel1.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 219, 30));

        email.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, custtbl, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.email}"), email, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 219, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        searchcmb.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        searchcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "customerid", "firstname", "lastname", "contactnum", "email", "address" }));
        jPanel1.add(searchcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 219, -1));

        address.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, custtbl, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.address}"), address, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 219, 30));

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        refresh.setText("Refresh Table");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 160, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Home Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        updatebtn.setBackground(new java.awt.Color(0, 0, 0));
        updatebtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update Customer");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 160, 50));

        deletebtn.setBackground(new java.awt.Color(255, 51, 51));
        deletebtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete Customer");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 160, 50));

        fname.setBackground(new java.awt.Color(240, 240, 240));
        fname.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, custtbl, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.firstname}"), fname, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 196, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add Customer");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, 50));

        lname.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, custtbl, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.lastname}"), lname, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 196, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer Id: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        cnum.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, custtbl, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.contactnum}"), cnum, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jPanel1.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 196, 30));

        lblId.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // enable all text fields
    public void setFields(Boolean b){
        fname.setEnabled(b);
        lname.setEnabled(b);
        cnum.setEnabled(b);
        email.setEnabled(b);
        address.setEnabled(b);
    }
    
    // Clear all text fields
    public void clearTxt(){
        fname.setText("");
        lname.setText("");
        cnum.setText("");
        email.setText("");
        address.setText("");
    }
    
    // Set button to save changes to confirm the changes
    public void setSaveButton(JButton b){
        b.setText("Save Changes");
        b.setBackground(Color.RED);
        b.setForeground(Color.white);
    }
    
    // Set button to default State
    public void setDefaultButton(JButton b){
        b.setBackground(new Color(214,217,223));
        b.setForeground(Color.BLACK);
    }
    
    // Returns new connection object
    public Connection newCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libsysdb?zeroDateTimeBehavior=convertToNull","root","");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        if(addbtn.getText() != "Save Changes"){
            setFields(true);
            setSaveButton(addbtn);
            clearTxt();
        }else{
            try {
               Statement st = newCon().createStatement();
               st.executeUpdate("INSERT INTO customertbl(firstname,lastname,contactnum,email,address) VALUES('"+fname.getText()+"','"+lname.getText()+"','"+cnum.getText()+"','"+email.getText()+"','"+address.getText()+"')");
               JOptionPane.showMessageDialog(null, "Created Successfull");
               updateTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Creation Failed");
                System.out.println(e);
            }
            
            setFields(false);
            addbtn.setText("Add Customer");
            setDefaultButton(addbtn);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    //Refresh the data on the table 
    public void updateTable(){
       try{
            st = newCon().createStatement();
            rs = st.executeQuery("SELECT * FROM customertbl");
            custtbl.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       if(updatebtn.getText() != "Save Changes"){
            setFields(true);
            setSaveButton(updatebtn);
        }else{
            try {
                st = newCon().createStatement();
                st.executeUpdate("UPDATE customertbl SET firstname='"+fname.getText()+"', lastname = '"+lname.getText()+"', contactnum = '"+cnum.getText()+"',email = '"+email.getText()+"', address = '"+address.getText()+"' WHERE customerid = "+jLabel7.getText()+"");
                JOptionPane.showMessageDialog(null, "Update Successfull");
                setFields(false);
                updateTable();
                updatebtn.setText("Update Customer");
                setDefaultButton(updatebtn);
                
            }catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Update Failed");
                setFields(false);
                updateTable();
                updatebtn.setText("Update Customer");
                setDefaultButton(updatebtn);
            }
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(deletebtn.getText() == "Delete Customer"){
            setSaveButton(deletebtn);
            deletebtn.setText("Delete User: "+jLabel7.getText());
        }
        else{
            setDefaultButton(deletebtn);
            deletebtn.setText("Delete Customer");
            try{
                st = newCon().createStatement();
                st.executeUpdate("DELETE FROM customertbl where customerid = "+jLabel7.getText());
                updateTable();
                JOptionPane.showMessageDialog(null, "User: "+jLabel7.getText()+" record has been deleted");
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void closing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_closing
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.hide();
    }//GEN-LAST:event_closing

    // jLabel7 = customer id
    private void custtblClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custtblClick
        fname.setText(custtbl.getValueAt(custtbl.getSelectedRow(), 1).toString());
        lname.setText(custtbl.getValueAt(custtbl.getSelectedRow(), 2).toString());
        cnum.setText(custtbl.getValueAt(custtbl.getSelectedRow(), 3).toString());
        email.setText(custtbl.getValueAt(custtbl.getSelectedRow(), 4).toString());
        address.setText(custtbl.getValueAt(custtbl.getSelectedRow(), 5).toString());
        jLabel7.setText(custtbl.getValueAt(custtbl.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_custtblClick

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        try{
            if(searchcmb.getSelectedItem() == "customerid"){
                st = newCon().createStatement();
                rs = st.executeQuery("SELECT * FROM customertbl WHERE "+searchcmb.getSelectedItem().toString()+" = "+searchtxt.getText());
                custtbl.setModel(DbUtils.resultSetToTableModel(rs));
            }else{
                st = newCon().createStatement();
                rs = st.executeQuery("SELECT * FROM customertbl WHERE "+searchcmb.getSelectedItem().toString()+" like '%"+searchtxt.getText()+"%'");
                custtbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchtxtKeyReleased

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        updateTable();
    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField address;
    private javax.swing.JTextField cnum;
    private java.util.List<FinalProjectPackage.Customertbl> customertblList;
    private java.util.List<FinalProjectPackage.Customertbl> customertblList1;
    private javax.persistence.Query customertblQuery;
    private javax.persistence.Query customertblQuery1;
    private javax.swing.JTable custtbl;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField email;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField lname;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox<String> searchcmb;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JButton updatebtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
