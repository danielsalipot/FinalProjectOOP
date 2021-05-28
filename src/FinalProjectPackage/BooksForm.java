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
        b.setBackground(Color.BLACK);
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
        addbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        titletxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        shelfcmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        publishertxt = new javax.swing.JTextField();
        genretxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rowspnr = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        searchcmb = new javax.swing.JComboBox<>();
        searchtxt = new javax.swing.JTextField();
        refreshbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setForeground(new java.awt.Color(51, 51, 51));
        setIconifiable(true);
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add Book");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 40));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Book Title:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Author:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Publisher:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Genre:");

        titletxt.setEnabled(false);

        authortxt.setEnabled(false);

        shelfcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        shelfcmb.setEnabled(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Book Shelf:");

        publishertxt.setEnabled(false);

        genretxt.setEnabled(false);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Book Id: ");

        idlbl.setBackground(new java.awt.Color(255, 255, 255));
        idlbl.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        idlbl.setForeground(java.awt.Color.white);
        idlbl.setText("0");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Row: ");

        rowspnr.setEnabled(false);
        rowspnr.setRequestFocusEnabled(false);
        rowspnr.setValue(1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(publishertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rowspnr, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shelfcmb, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idlbl))))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(shelfcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rowspnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(idlbl))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(publishertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIBRARY MANAGMENT SYSTEM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        cancelbtn.setBackground(new java.awt.Color(102, 0, 0));
        cancelbtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setText("Cancel");
        cancelbtn.setEnabled(false);
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 730, 40));

        updatebtn.setBackground(new java.awt.Color(0, 0, 0));
        updatebtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update Book");
        updatebtn.setEnabled(false);
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 40));

        deletebtn.setBackground(new java.awt.Color(255, 0, 0));
        deletebtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete Book");
        deletebtn.setEnabled(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 150, 40));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));

        jPanel2.setBackground(new java.awt.Color(153, 102, 0));

        searchcmb.setBackground(new java.awt.Color(51, 0, 0));
        searchcmb.setForeground(new java.awt.Color(255, 255, 255));
        searchcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bookid", "Title", "Author", "Publisher", "Genre", "Location" }));

        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });

        refreshbtn.setBackground(new java.awt.Color(51, 0, 0));
        refreshbtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("Refresh Table");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("SEARCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel9)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchcmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchtxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchcmb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 300, 210));

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Books Table");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 360));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1060, 350));

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
        updatebtn.setEnabled(false);
        deletebtn.setEnabled(false);
        deletebtn.setBackground(Color.red);
        deletebtn.setForeground(Color.WHITE);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        if(!"Delete Book".equals(deletebtn.getText())){
            try{
                newStatement().executeUpdate("DELETE FROM bookstbl where bookid = "+idlbl.getText());
                JOptionPane.showMessageDialog(null,"Record Deleted","Book #" + idlbl.getText() + " records has been deleted",JOptionPane.INFORMATION_MESSAGE);
                clearTxt();
                setFields(false);
                updateTable();
                setDefaultButton(deletebtn, "Delete Book");
                deletebtn.setBackground(Color.red);
                deletebtn.setForeground(Color.WHITE);
                
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
        deletebtn.setBackground(Color.red);
        deletebtn.setForeground(Color.WHITE);
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
                    updateTable();
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
            rs = newStatement().executeQuery("SELECT * FROM bookstbl WHERE "+searchcmb.getSelectedItem().toString()+" like '%"+searchtxt.getText()+"%'");
            booktbl.setModel(DbUtils.resultSetToTableModel(rs));
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
