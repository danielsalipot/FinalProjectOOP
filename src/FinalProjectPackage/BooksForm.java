package FinalProjectPackage;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class BooksForm extends javax.swing.JInternalFrame {

    Statement st;
    ResultSet rs;
    
    public BooksForm() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }
    
    public void updateTable(){
        try{
            rs = newStatement().executeQuery("SELECT * FROM bookstbl");
            booktbl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
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
    
    public void setFields(Boolean b){
        titletxt.setEnabled(b);
        authortxt.setEnabled(b);
        publishertxt.setEnabled(b);
        genretxt.setEnabled(b);
        shelfcmb.setEnabled(b);
        rowspnr.setEnabled(b);
    }
    
    public void clearTxt(){
        titletxt.setText("");
        authortxt.setText("");
        publishertxt.setText("");
        genretxt.setText("");
        shelfcmb.setSelectedItem(0);
        rowspnr.setValue(0);
        idlbl.setText("");
    }
    
    public void setSaveButton(JButton b){
        b.setText("Save");
        b.setBackground(Color.red);
        cancelbtn.setEnabled(true);
    }
    
    public void setDefaultButton(JButton b, String a){
        b.setBackground(Color.white);
        b.setText(a);
        cancelbtn.setEnabled(false);
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("libsysdb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        bookstblQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bookstbl b");
        bookstblList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bookstblQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        titletxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        publishertxt = new javax.swing.JTextField();
        genretxt = new javax.swing.JTextField();
        shelfcmb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rowspnr = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktbl = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        searchtxt = new javax.swing.JTextField();
        searchcmb = new javax.swing.JComboBox<>();
        refreshbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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

        jLabel1.setText("Book Title");

        jLabel2.setText("Author");

        jLabel3.setText("Publisher");

        jLabel4.setText("Genre");

        jLabel5.setText("Book Shelf:");

        titletxt.setEnabled(false);

        authortxt.setEnabled(false);

        publishertxt.setEnabled(false);

        genretxt.setEnabled(false);

        shelfcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        shelfcmb.setEnabled(false);

        jLabel6.setText("Row: ");

        rowspnr.setEnabled(false);
        rowspnr.setRequestFocusEnabled(false);
        rowspnr.setValue(1);

        jLabel7.setText("Book Id: ");

        idlbl.setText("0");

        booktbl.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bookstblList, booktbl);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bookid}"));
        columnBinding.setColumnName("Bookid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("Title");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${author}"));
        columnBinding.setColumnName("Author");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${publisher}"));
        columnBinding.setColumnName("Publisher");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${genre}"));
        columnBinding.setColumnName("Genre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${location}"));
        columnBinding.setColumnName("Location");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        booktbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booktblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booktbl);

        addbtn.setText("Add Book");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.setEnabled(false);
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete Book");
        deletebtn.setEnabled(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update Book");
        updatebtn.setEnabled(false);
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });

        searchcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bookid", "Title", "Author", "Publisher", "Genre", "Location" }));

        refreshbtn.setText("Refresh Table");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Library Management System");

        jLabel9.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(shelfcmb, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(publishertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(updatebtn))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel7)
                                                            .addComponent(jLabel6))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(rowspnr, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(idlbl))))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(189, 189, 189)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(searchcmb, 0, 256, Short.MAX_VALUE)
                                            .addComponent(searchtxt)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(108, 108, 108))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel8)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(shelfcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publishertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(rowspnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idlbl)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(deletebtn)
                    .addComponent(updatebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        if(!"Add Book".equals(addbtn.getText())){
            if("".equals(titletxt.getText()) || "".equals(authortxt.getText()) || "".equals(publishertxt.getText()) || "".equals(genretxt.getText())){
                JOptionPane.showMessageDialog(null, "Update Failed","All fields are required",JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{                
                    String location = String.valueOf(genretxt.getText().charAt(0))+ ":" + shelfcmb.getSelectedItem() + ":" + rowspnr.getValue();
                    newStatement().executeUpdate("INSERT INTO bookstbl (title,author,publisher,genre,location) VALUES ('"+titletxt.getText()+"','"+authortxt.getText()+"','"+publishertxt.getText()+"','"+genretxt.getText()+"','"+location+"')");
                    JOptionPane.showMessageDialog(null,"Record Added","A new book has added",JOptionPane.INFORMATION_MESSAGE);
                    updateTable();
                    setDefaultButton(addbtn, "Add Book");
                    addbtn.setText("Add Book");
                    clearTxt();
                    setFields(false);
                }catch(HeadlessException | SQLException e){
                    System.out.println(e);
                }
            }
        }
        else{
            clearTxt();
            setSaveButton(addbtn);
            setFields(true);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        setFields(false);
        clearTxt();
        cancelbtn.setEnabled(false);
        deletebtn.setEnabled(false);
        updatebtn.setEnabled(false);
        setDefaultButton(deletebtn,"Delete Book");
        setDefaultButton(updatebtn, "Update Book");
        setDefaultButton(addbtn, "Add Book");
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(!"Delete Book".equals(deletebtn.getText())){
            try{
                newStatement().executeUpdate("DELETE FROM bookstbl where bookid = "+idlbl.getText());
                JOptionPane.showMessageDialog(null,"Record Deleted","Book #" + idlbl.getText() + " records has been deleted",JOptionPane.INFORMATION_MESSAGE);
                clearTxt();
                setFields(false);
                setDefaultButton(deletebtn, "Delete Book");
                
            }catch(HeadlessException | SQLException e){
                System.out.println(e);
            }
        }
        else{
            setSaveButton(deletebtn);
            deletebtn.setText("Delete Book #" + idlbl.getText());
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void booktblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booktblMouseClicked
        String shelfid = String.valueOf(booktbl.getValueAt(booktbl.getSelectedRow(), 5).toString().charAt(2));
        String rownum = String.valueOf(booktbl.getValueAt(booktbl.getSelectedRow(), 5).toString().charAt(4));
        
        titletxt.setText(booktbl.getValueAt(booktbl.getSelectedRow(), 1).toString());
        authortxt.setText(booktbl.getValueAt(booktbl.getSelectedRow(), 2).toString());
        publishertxt.setText(booktbl.getValueAt(booktbl.getSelectedRow(), 3).toString());
        genretxt.setText(booktbl.getValueAt(booktbl.getSelectedRow(), 4).toString());
        idlbl.setText(booktbl.getValueAt(booktbl.getSelectedRow(), 0).toString());
        rowspnr.setValue(Integer.valueOf(rownum));
                
        for(int i = 0; i < shelfcmb.getItemCount(); i++){
            if(String.valueOf(shelfcmb.getItemAt(i)).equals(shelfid)){
                shelfcmb.setSelectedIndex(i);
            }
        }
        deletebtn.setEnabled(true);
        updatebtn.setEnabled(true);
    }//GEN-LAST:event_booktblMouseClicked

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        updateTable();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        if(!"Update Book".equals(updatebtn.getText())){
            try{
                if(!"".equals(titletxt.getText()) && !"".equals(authortxt.getText()) && !"".equals(publishertxt.getText()) && !"".equals(genretxt.getText())){
                    String location = String.valueOf(genretxt.getText().charAt(0))+ ":" + shelfcmb.getSelectedItem() + ":" + rowspnr.getValue();
                    newStatement().executeUpdate("UPDATE bookstbl SET title ='"+titletxt.getText()+"',author='"+authortxt.getText()+"',publisher = '"+publishertxt.getText()+"',genre = '"+genretxt.getText()+"', location='"+location+"' WHERE bookid = " + idlbl.getText());
                    JOptionPane.showMessageDialog(null,"Book #"+idlbl.getText()+" has been updated");
                    setFields(false);
                    setDefaultButton(updatebtn, "Update Book");
                    updatebtn.setText("Update Book");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Update Failed","All fields are required",JOptionPane.ERROR_MESSAGE);
                }
            }catch(HeadlessException | SQLException e){
                System.out.println(e);
            }
        }else{
            setFields(true);
            setSaveButton(updatebtn);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        try{
            if(searchcmb.getSelectedItem() == "customerid"){
                rs = newStatement().executeQuery("SELECT * FROM bookstbl WHERE "+searchcmb.getSelectedItem().toString()+" = "+searchtxt.getText());
                booktbl.setModel(DbUtils.resultSetToTableModel(rs));
            }else{
                rs = newStatement().executeQuery("SELECT * FROM bookstbl WHERE "+searchcmb.getSelectedItem().toString()+" like '%"+searchtxt.getText()+"%'");
                booktbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchtxtKeyReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.hide();
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField authortxt;
    private java.util.List<FinalProjectPackage.Bookstbl> bookstblList;
    private javax.persistence.Query bookstblQuery;
    private javax.swing.JTable booktbl;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton deletebtn;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField genretxt;
    private javax.swing.JLabel idlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField publishertxt;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JSpinner rowspnr;
    private javax.swing.JComboBox<String> searchcmb;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JComboBox<String> shelfcmb;
    private javax.swing.JTextField titletxt;
    private javax.swing.JButton updatebtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
