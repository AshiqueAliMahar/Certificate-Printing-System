package Frames;

import BalClasses.CCBal;
import BalClasses.ECBal;
import BalClasses.JTextFieldLimit;
import BeanClasses.CDetailBean;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ECertificate extends javax.swing.JInternalFrame {

    private boolean found;
    
    public ECertificate() {
        initComponents();
        txtCNIC.setDocument(new JTextFieldLimit(15));
        
        txtHusbandCNIC.setDocument(new JTextFieldLimit(15));
        txtOptionalCNIC.setDocument(new JTextFieldLimit(15));
        txtMobileNo.setDocument(new JTextFieldLimit(12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPSNo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtApplicantName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCNIC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOptionalCNIC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRelation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFathersName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSurName = new javax.swing.JTextField();
        txtHusbandCNIC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtHusbandName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        cmbMaritalStatus = new javax.swing.JComboBox<>();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        cmbDistrict = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbTaluka = new javax.swing.JComboBox<>();
        spWardNo = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbRecommended = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBlockCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtElectrolArea = new javax.swing.JTextField();
        txtFamilyTree = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        spCensusYear = new javax.swing.JSpinner();
        lblPageNo = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setTitle("Electrol Certificate");
        setOpaque(false);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lblCPSNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCPSNo.setText("CPS NO:EC-0001");
        getContentPane().add(lblCPSNo);
        lblCPSNo.setBounds(542, 0, 130, 17);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Applicant Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Applicant Name:");

        txtApplicantName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("CNIC");

        txtCNIC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCNICKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Optional CNIC");

        txtOptionalCNIC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtOptionalCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOptionalCNICKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Relation");

        txtRelation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Father Name:");

        txtFathersName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("SurName");

        txtSurName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtHusbandCNIC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHusbandCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHusbandCNICKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Husband CNIC");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Date Of Birth:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Gender");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Marital Status:");

        txtHusbandName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Husband Name:");

        txtMobileNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Mobile");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Address");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        cmbGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "SheMale" }));

        cmbMaritalStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Single" }));

        DateChooser.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtApplicantName)
                            .addComponent(txtRelation, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOptionalCNIC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHusbandName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHusbandCNIC)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSurName)
                                .addComponent(txtMobileNo)
                                .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFathersName)
                                .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtAddress))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApplicantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRelation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHusbandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHusbandCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOptionalCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFathersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSurName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 23, 664, 275);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recommended Person Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel2.setOpaque(false);

        cmbDistrict.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khairpur Mirus", "Bolhari" }));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("District:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Taluka:");

        cmbTaluka.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbTaluka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kingri", "Manghanwari" }));

        spWardNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        spWardNo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Ward:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Recommended:");

        cmbRecommended.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbRecommended.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chairman" }));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Name:");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTaluka, 0, 131, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spWardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(cmbTaluka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spWardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(6, 304, 670, 105);

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(187, 526, 55, 28);

        btnClear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(429, 526, 58, 28);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abstract Of Electrol Certificate Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setOpaque(false);

        txtBlockCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Block Code:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Serial:");

        txtSerial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Electrol Area:");

        txtElectrolArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtFamilyTree.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Family Tree");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Census Year");

        spCensusYear.setModel(new javax.swing.SpinnerNumberModel(2000, null, null, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBlockCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElectrolArea, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spCensusYear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFamilyTree)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(spCensusYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBlockCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtElectrolArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(txtFamilyTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(6, 415, 670, 105);

        lblPageNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPageNo.setText("Page No:MCB00001");
        getContentPane().add(lblPageNo);
        lblPageNo.setBounds(6, 0, 170, 17);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/screenshot-pxhere.com-2017-11-04-23-13-09-801.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(-10, -4, 700, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        getcpCertificateNo();
        
    }//GEN-LAST:event_formInternalFrameOpened
    private void  getcpCertificateNo(){
        ECBal certificateBal = new ECBal();
        CDetailBean cpsCertificateNO = certificateBal.getCPSCertificateNO();
        String cpString = "CPS NO:";
        cpsCertificateNO.setCertificateNo(cpsCertificateNO.getCertificateNo()+1);
        switch (String.valueOf(cpsCertificateNO.getCertificateNo()).length()) {
            case 1:
                lblPageNo.setText("Page No:"+ "MCB0000" + (cpsCertificateNO.getCertificateNo()));
                break;
            case 2:
                lblPageNo.setText("Page No:"+ "MCB000" + (cpsCertificateNO.getCertificateNo()));
                break;
            case 3:
                lblPageNo.setText("Page No:"+ "MCB00" + (cpsCertificateNO.getCertificateNo()));
                break;
            case 4:
                lblPageNo.setText("Page No:"+ "MCB0" + (cpsCertificateNO.getCertificateNo()));
                break;
            case 5:
                lblPageNo.setText("Page No:"+ "MCB" + (cpsCertificateNO.getCertificateNo()));
                break;
            default:
                break;
        }
        cpsCertificateNO.setIssueCPSNo(cpsCertificateNO.getIssueCPSNo()+1);
        switch (String.valueOf(cpsCertificateNO.getIssueCPSNo()).length()) {
            case 1:
                lblCPSNo.setText(cpString + "EC-000" + (cpsCertificateNO.getIssueCPSNo()));
                break;
            case 2:
                lblCPSNo.setText(cpString + "EC-00" + (cpsCertificateNO.getIssueCPSNo()));
                break;
            case 3:
                lblCPSNo.setText(cpString + "EC-0" + (cpsCertificateNO.getIssueCPSNo()));
                break;
            case 4:
                lblCPSNo.setText(cpString + "EC-" + (cpsCertificateNO.getIssueCPSNo()));
                break;
            default:
                break;
        }
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        clear();
        
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void clear(){
        txtAddress.setText("");
        txtApplicantName.setText("");
        txtCNIC.setText("");
        txtFathersName.setText("");
        txtHusbandCNIC.setText("");
        txtHusbandName.setText("");
        txtMobileNo.setText("");
        txtName.setText("");
        txtOptionalCNIC.setText("");
        txtRelation.setText("");
        txtSurName.setText("");
        DateChooser.setDate(null);
        cmbDistrict.setSelectedIndex(-1);
        cmbGender.setSelectedIndex(-1);
        cmbMaritalStatus.setSelectedIndex(-1);
        cmbRecommended.setSelectedIndex(-1);
        cmbTaluka.setSelectedIndex(-1);
        txtBlockCode.setText("");
        txtElectrolArea.setText("");
        txtFamilyTree.setText("");
        txtSerial.setText("");
        spWardNo.setValue(0);
        spCensusYear.setValue(2000);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        ECBal eCBal=new ECBal();
        int cpsNo=Integer.parseInt(lblCPSNo.getText().substring(10,14));
        int pageNo=Integer.parseInt(lblPageNo.getText().substring(11,16));
        System.out.println(cpsNo+"   "+pageNo);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate;
        currentDate = dateFormat.format(date);
        String details="Block Code:"+txtBlockCode.getText()+","+"Serial:"+txtSerial.getText()+","+"Family Tree:"+txtFamilyTree.getText()+","+"ElectrolArea:"+txtElectrolArea.getText()+","+"CensusYear:"+spCensusYear.getValue().toString();
        CDetailBean cDetailBean=new CDetailBean(1,1,txtApplicantName.getText(),txtRelation.getText(),txtCNIC.getText(),dateFormat.format(DateChooser.getDate()),txtFathersName.getText(),cmbGender.getSelectedItem().toString(),txtHusbandCNIC.getText(),txtHusbandName.getText(),cmbMaritalStatus.getSelectedItem().toString(),txtMobileNo.getText(),txtOptionalCNIC.getText(),txtSurName.getText(),txtAddress.getText(),cmbDistrict.getSelectedItem().toString(),cpsNo,currentDate,details,"electrol",pageNo,cmbRecommended.getSelectedItem().toString(),txtName.getText(),cmbTaluka.getSelectedItem().toString(),Integer.parseInt(spWardNo.getValue().toString()),1);
        eCBal.addRecord(cDetailBean,found);
        getcpCertificateNo();
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtHusbandCNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHusbandCNICKeyReleased
        String cnic = txtHusbandCNIC.getText();
        if (cnic.length() == 5) {
            txtHusbandCNIC.setText(cnic + "-");
        } else if (cnic.length() == 13) {
            txtHusbandCNIC.setText(cnic + "-");
        }
    }//GEN-LAST:event_txtHusbandCNICKeyReleased

    private void txtOptionalCNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOptionalCNICKeyReleased
        String cnic = txtOptionalCNIC.getText();
        if (cnic.length() == 5) {
            txtOptionalCNIC.setText(cnic + "-");
        } else if (cnic.length() == 13) {
            txtOptionalCNIC.setText(cnic + "-");
        }
    }//GEN-LAST:event_txtOptionalCNICKeyReleased

    private void txtCNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNICKeyReleased

        String cnic = txtCNIC.getText();
        if (cnic.length() == 5) {
            txtCNIC.setText(cnic + "-");
        } else if (cnic.length() == 13) {
            txtCNIC.setText(cnic + "-");
        }
        if (cnic.length() == 15) {

            CDetailBean search = new CCBal().search(cnic);
            if (search != null) {
                txtAddress.setText(search.getAppAddress());
                txtApplicantName.setText(search.getAppName());
                txtCNIC.setText(search.getAppCNIC());
                txtFathersName.setText(search.getFatherName());
                txtHusbandCNIC.setText(search.getHusbandCNIC());
                txtHusbandName.setText(search.getHusbandName());
                txtMobileNo.setText(search.getMobile());
                txtOptionalCNIC.setText(search.getOptionalCNIC());
                txtRelation.setText(search.getAppRelation());
                txtSurName.setText(search.getSurName());
                txtName.setText(search.getRecommededPerson());
                spWardNo.setValue(search.getWardNum());
                try {
                    DateChooser.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(search.getDateOfBirth()));
                } catch (ParseException ex) {
                    Logger.getLogger(CCertificate.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < cmbGender.getItemCount(); i++) {

                    if (search.getGender().equals(cmbGender.getItemAt(i))) {
                        cmbGender.setSelectedIndex(i);
                    }
                }
                for (int i = 0; i < cmbGender.getItemCount(); i++) {

                    if (search.getMaritalStatus().equals(cmbMaritalStatus.getItemAt(i))) {
                        cmbMaritalStatus.setSelectedIndex(i);
                    }
                }
                for (int i = 0; i < cmbDistrict.getItemCount(); i++) {

                    if (search.getDistrictName().equals(cmbDistrict.getItemAt(i))) {
                        cmbDistrict.setSelectedIndex(i);
                    }
                }
                for (int i = 0; i < cmbTaluka.getItemCount(); i++) {

                    if (search.getTaluka().equals(cmbTaluka.getItemAt(i))) {
                        cmbTaluka.setSelectedIndex(i);
                    }
                }
                for (int i = 0; i < cmbRecommended.getItemCount(); i++) {

                    if (search.getRecommendedBy().equals(cmbRecommended.getItemAt(i))) {
                        cmbRecommended.setSelectedIndex(i);
                    }
                }
                found=true;
            }
        }else{
            found=false;
        }
    }//GEN-LAST:event_txtCNICKeyReleased

    private void txtMobileNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyReleased
        String mobileNo = txtMobileNo.getText();
        if (mobileNo.length() == 4) {
            txtMobileNo.setText(mobileNo+ "-");
        }
    }//GEN-LAST:event_txtMobileNoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbDistrict;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbMaritalStatus;
    private javax.swing.JComboBox<String> cmbRecommended;
    private javax.swing.JComboBox<String> cmbTaluka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel lblCPSNo;
    private javax.swing.JLabel lblPageNo;
    private javax.swing.JSpinner spCensusYear;
    private javax.swing.JSpinner spWardNo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtApplicantName;
    private javax.swing.JTextField txtBlockCode;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtElectrolArea;
    private javax.swing.JTextField txtFamilyTree;
    private javax.swing.JTextField txtFathersName;
    private javax.swing.JTextField txtHusbandCNIC;
    private javax.swing.JTextField txtHusbandName;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOptionalCNIC;
    private javax.swing.JTextField txtRelation;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtSurName;
    // End of variables declaration//GEN-END:variables
}
