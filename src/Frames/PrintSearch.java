package Frames;

import BalClasses.PrintSearchBal;
import BeanClasses.CDetailBean;
import PrintCertificates.CharacterCertificate;
import PrintCertificates.ElectrolCertificate;
import PrintCertificates.IncomeCertificate;
import PrintCertificates.NObjctionCertificate;
import PrintCertificates.ResidenceCertificates;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrintSearch extends javax.swing.JInternalFrame {

    public static String cpsNo;
    public static String pageNumberString;
    private boolean found;
    private static boolean isRecordThere;

    public CDetailBean getCpsNameNumber() {

        String certificateName = null;
        int cpsNumber = 0;
        if (!cpsNo.isEmpty()) {

            String cpsNoString = cpsNo;
            cpsNumber = Integer.parseInt(cpsNoString.substring(3, cpsNoString.length()));
            cpsNoString = cpsNoString.substring(0, 2).toUpperCase();
            switch (cpsNoString) {
                case ("CC"):
                    certificateName = "character";
                    break;
                case "EC":
                    certificateName = "electrol";
                    break;
                case "IC":
                    certificateName = "income";
                    break;
                case "NM":
                    certificateName = "NoMarriage";
                    break;
                case "NO":
                    certificateName = "noc";
                    break;
                case "RC":
                    certificateName = "residence";
                    break;
            }
        }
        PrintSearchBal printSearchBal = new PrintSearchBal();
        CDetailBean cdb = printSearchBal.getAllData(certificateName, cpsNumber);
        if (cdb != null) {
            isRecordThere = true;
            pageNumberString = getPageNumber(cdb.getCertificateNo());

        } else if (cdb == null) {
            JOptionPane.showMessageDialog(rootPane, "This is Not Existing", "Notification", 1);
            isRecordThere = false;
        }
        return cdb;
    }

    private String getPageNumber(int pageNumber) {
        String pageNumberString = null;
        switch (String.valueOf(pageNumber).length()) {
            case 1:
                pageNumberString = "MCB0000" + (pageNumber);
                break;
            case 2:
                pageNumberString = "MCB000" + (pageNumber);
                break;
            case 3:
                pageNumberString = ("MCB00" + (pageNumber));
                break;
            case 4:
                pageNumberString = ("MCB0" + pageNumber);
                break;
            case 5:
                pageNumberString = ("MCB" + pageNumber);
                break;
            default:
                break;
        }
        return pageNumberString;
    }

    public CDetailBean getPageNumber() {
        PrintSearchBal printSearchBal = new PrintSearchBal();

        int pageNumberInt = 0;
        String pageNumberString = PrintSearch.pageNumberString;

        if (!pageNumberString.isEmpty()) {
            pageNumberInt = Integer.parseInt(pageNumberString.substring(3, pageNumberString.length()));
        }
        return printSearchBal.getAllData(pageNumberInt);
    }

    public PrintSearch() {
        initComponents();
        setColumnSiz();
        loadTable();

    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCPSNo = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnPreview = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Print And Search");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Print Certificate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Enter CPS Number:");

        btnPrint.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnPreview.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPreview.setText("Preview");
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPSNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(28, 6, 622, 125);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Search For Name:");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(51, 255, 51));

        tblData.setAutoCreateRowSorter(true);
        tblData.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Applicant Name", "Applicant Relation", "CNIC", "Date Of Birth", "Father Name", "Gender", "Husband CNIC", "Husband Name", "Martial Status", "Mobile", "Optional CNIC", "SurName", "Applicant Address", "District Name", "CPS Number", "Certificate Number", "Certificate Date", "Other", "Certificate Name", "Recommended By", "Recommended Person", "Taluka Name", "Ward Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblData.setColumnSelectionAllowed(true);
        tblData.setOpaque(false);
        jScrollPane1.setViewportView(tblData);
        tblData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(28, 137, 622, 416);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/screenshot-pxhere.com-2017-11-04-23-13-09-801.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -4, 700, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setColumnSiz() {

        tblData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < tblData.getColumnCount(); i++) {

            tblData.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
    }
    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        if (txtCPSNo.getText().length() == 7) {
            cpsNo = txtCPSNo.getText();

            switch (cpsNo.trim().substring(0, 2).toUpperCase()) {

                case "RC":
                    ResidenceCertificates r = new ResidenceCertificates();
                    if (isRecordThere) {
                        r.setVisible(true);
                    }
                    break;
                case "CC":
                    CharacterCertificate characterCertificate = new CharacterCertificate();
                    if (isRecordThere) {
                        characterCertificate.setVisible(true);
                    }
                    break;
                case "EC":
                    ElectrolCertificate electrolCertificate = new ElectrolCertificate();
                    if (isRecordThere) {
                        electrolCertificate.setVisible(true);
                    }
                    break;
                case "NO":
                    NObjctionCertificate noc = new NObjctionCertificate();
                    if (isRecordThere) {
                        noc.setVisible(true);
                    }
                case "IC":
                    IncomeCertificate incomeCertificate = new IncomeCertificate();
                    if (isRecordThere) {
                        incomeCertificate.setVisible(true);
                    }
            }
        }
    }//GEN-LAST:event_btnPreviewActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        String txt = txtSearch.getText();
        if (txt.length() > 0) {
            loadTable(txt);
        } else {
            loadTable();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtCPSNo.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (txtCPSNo.getText().length() == 7) {
            cpsNo = txtCPSNo.getText();

            switch (cpsNo.trim().substring(0, 2).toUpperCase()) {

                case "RC":
                    ResidenceCertificates r = new ResidenceCertificates();
                    if (isRecordThere) {
                        r.printPanel();
                    }
                    break;
                case "CC":
                    CharacterCertificate characterCertificate = new CharacterCertificate();
                    if (isRecordThere) {
                        characterCertificate.printPanel();
                    }
                    break;
                case "EC":
                    ElectrolCertificate electrolCertificate = new ElectrolCertificate();
                    if (isRecordThere) {
                        electrolCertificate.printPanel();
                    }
                    break;
                case "NO":
                    NObjctionCertificate noc = new NObjctionCertificate();
                    if (isRecordThere) {
                        noc.printPanel();
                    }
                    break;
                case "IC":
                    IncomeCertificate incomeCertificate = new IncomeCertificate();
                    if (isRecordThere) {
                        incomeCertificate.printPanel();
                    }
                    break;
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed
    private void loadTable(String Name) {

        PrintSearchBal printSearchBal = new PrintSearchBal();
        ArrayList<CDetailBean> alldata = printSearchBal.getAlldata(Name);
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        for (CDetailBean cdb : alldata) {

            Vector v = new Vector();
            v.add(cdb.getCertificateName());
            v.add(cdb.getAppName());
            v.add(cdb.getAppRelation());
            v.add(cdb.getAppCNIC());
            v.add(cdb.getDateOfBirth());
            v.add(cdb.getFatherName());
            v.add(cdb.getGender());
            v.add(cdb.getHusbandCNIC());
            v.add(cdb.getHusbandName());
            v.add(cdb.getMaritalStatus());
            v.add(cdb.getMobile());
            v.add(cdb.getOptionalCNIC());
            v.add(cdb.getSurName());
            v.add(cdb.getAppAddress());
            v.add(cdb.getDistrictName());
            ArrayList cpsNumberCertificateNo = printSearchBal.getcpsNumberCertificateNumber(cdb.getIssueCPSNo(), cdb.getCertificateNo(), cdb.getCertificateName());
            cpsNumberCertificateNo.stream().forEach((s) -> {
                v.add(s);
            });
            v.add(cdb.getCertificateDate());
            v.add(cdb.getCertificateDetails());
            v.add(cdb.getApplicantId());
            v.add(cdb.getRecommendedBy());
            v.add(cdb.getRecommededPerson());
            v.add(cdb.getTaluka());
            v.add(cdb.getWardNum());
            model.addRow(v);

        }
        tblData.setModel(model);
    }

    private void loadTable() {

        PrintSearchBal printSearchBal = new PrintSearchBal();
        ArrayList<CDetailBean> alldata = printSearchBal.getAlldata();
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        for (CDetailBean cdb : alldata) {

            Vector v = new Vector();
            v.add(cdb.getCertificateName());
            v.add(cdb.getAppName());
            v.add(cdb.getAppRelation());
            v.add(cdb.getAppCNIC());
            v.add(cdb.getDateOfBirth());
            v.add(cdb.getFatherName());
            v.add(cdb.getGender());
            v.add(cdb.getHusbandCNIC());
            v.add(cdb.getHusbandName());
            v.add(cdb.getMaritalStatus());
            v.add(cdb.getMobile());
            v.add(cdb.getOptionalCNIC());
            v.add(cdb.getSurName());
            v.add(cdb.getAppAddress());
            v.add(cdb.getDistrictName());
            ArrayList cpsNumberCertificateNo = printSearchBal.getcpsNumberCertificateNumber(cdb.getIssueCPSNo(), cdb.getCertificateNo(), cdb.getCertificateName());
            cpsNumberCertificateNo.stream().forEach((s) -> {
                v.add(s);
            });
            v.add(cdb.getCertificateDate());
            v.add(cdb.getCertificateDetails());
            v.add(cdb.getApplicantId());
            v.add(cdb.getRecommendedBy());
            v.add(cdb.getRecommededPerson());
            v.add(cdb.getTaluka());
            v.add(cdb.getWardNum());
            model.addRow(v);

        }
        tblData.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPreview;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCPSNo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
