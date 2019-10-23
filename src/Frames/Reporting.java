package Frames;

import BalClasses.PrintSearchBal;
import BalClasses.ReportingBal;
import BeanClasses.CDetailBean;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Reporting extends javax.swing.JInternalFrame {
    private boolean found;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public Reporting() {
        initComponents();
        setColumnSiz();
        loadTable();

    }
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCharacter = new javax.swing.JButton();
        btnAllCertificates = new javax.swing.JButton();
        btnElectrol = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnIncome = new javax.swing.JButton();
        btnNoMarrige = new javax.swing.JButton();
        btnNoObjection = new javax.swing.JButton();
        btnResidence = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Reporting");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Print Certificate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setText("Start Date:");

        jLabel2.setText("End Date:");

        btnCharacter.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnCharacter.setText("Character Certificate");
        btnCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharacterActionPerformed(evt);
            }
        });

        btnAllCertificates.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAllCertificates.setText("All Certificate");
        btnAllCertificates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllCertificatesActionPerformed(evt);
            }
        });

        btnElectrol.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnElectrol.setText("Electrol Certificate");
        btnElectrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectrolActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MMM-dd");

        btnIncome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnIncome.setText("Income Certificate");
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnNoMarrige.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnNoMarrige.setText("No Marriage Certificate");
        btnNoMarrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoMarrigeActionPerformed(evt);
            }
        });

        btnNoObjection.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnNoObjection.setText("No Objection Certificate");
        btnNoObjection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoObjectionActionPerformed(evt);
            }
        });

        btnResidence.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnResidence.setText("Residence Certificate");
        btnResidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResidenceActionPerformed(evt);
            }
        });

        jDateChooser2.setDateFormatString("yyyy-MMM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCharacter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnResidence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNoObjection))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnElectrol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNoMarrige)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAllCertificates, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAllCertificates, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNoMarrige, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnElectrol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResidence, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnNoObjection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 666, 212);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Search For Name:");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setForeground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        tblData.setAutoCreateRowSorter(true);
        tblData.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Certificate Name", "Applicant Name", "Applicant Relation", "CNIC", "Date Of Birth", "Father Name", "Gender", "Husband CNIC", "Husband Name", "Martial Status", "Mobile", "Optional CNIC", "SurName", "Applicant Address", "District Name", "CPS Number", "Certificate Number", "Certificate Date", "Other", "Certificate ID", "Recommended By", "Recommended Person", "Taluka Name", "Ward Number"
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
        jScrollPane1.setViewportView(tblData);
        tblData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(6, 224, 666, 329);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/screenshot-pxhere.com-2017-11-04-23-13-09-801.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -4, 700, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setColumnSiz() {

        tblData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < tblData.getColumnCount(); i++) {

            tblData.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
    }
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        String txt = txtSearch.getText();
        if (txt.length() > 0) {
            loadTable(txt);
        } else {
            loadTable();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAllCertificatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllCertificatesActionPerformed
        String startDate = null;
        String endDate = null;
        String character = "character";
        String electrol = "electrol";
        String income = "income";
        String noMarriage = "NoMarriage";
        String noc = "noc";
        String residence = "residence";
        ReportingBal reportingBal = new ReportingBal();
        if (jDateChooser1.getDate() != null && jDateChooser2.getDate() != null) {
            startDate = dateFormat.format(jDateChooser1.getDate());
            endDate = dateFormat.format(jDateChooser2.getDate());
            JOptionPane.showMessageDialog(null, "Character Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character) + "\nElectrol Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, electrol) + "\nIncome Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, income) + "\nNo Marriage Certificates:" + reportingBal.getNoOfCertificates(startDate, endDate, noMarriage) + "\nNo Objection Certificates:" + reportingBal.getNoOfCertificates(startDate, endDate, noc) + "\nResidence Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, residence));
        } else if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(null, "Character Certificate:" + reportingBal.getNoOfCertificates(character) + "\nElectrol Certificate:" + reportingBal.getNoOfCertificates(electrol) + "\nIncome Certificate:" + reportingBal.getNoOfCertificates(income) + "\nNo Marriage Certificates:" + reportingBal.getNoOfCertificates(noMarriage) + "\nNo Objection Certificates:" + reportingBal.getNoOfCertificates(noc) + "\nResidence Certificate:" + reportingBal.getNoOfCertificates(residence));
        }
    }//GEN-LAST:event_btnAllCertificatesActionPerformed

    private void btnCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharacterActionPerformed
        ReportingBal reportingBal = new ReportingBal();
        try {

            String startDate = dateFormat.format(jDateChooser1.getDate());
            String endDate = dateFormat.format(jDateChooser2.getDate());
            String character = "character";

            JOptionPane.showMessageDialog(null, "Character Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character));
        } catch (NullPointerException ex) {
            int noOfCertificates = reportingBal.getNoOfCertificates("character");
            JOptionPane.showMessageDialog(null, "No: Of Character certificates :" + noOfCertificates);
        }
    }//GEN-LAST:event_btnCharacterActionPerformed

    private void btnElectrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectrolActionPerformed
        // TODO add your handling code here:
        ReportingBal reportingBal = new ReportingBal();
        try {
            //ReportingBal reportingBal = new ReportingBal();
            String startDate = dateFormat.format(jDateChooser1.getDate());
            String endDate = dateFormat.format(jDateChooser2.getDate());
            String character = "electrol";

            JOptionPane.showMessageDialog(null, "Electrol Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character));
        } catch (NullPointerException ex) {
            int noOfCertificates = reportingBal.getNoOfCertificates("electrol");
            JOptionPane.showMessageDialog(null, "No: Of Electrol certificates :" + noOfCertificates);

        }
    }//GEN-LAST:event_btnElectrolActionPerformed

    private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed

        ReportingBal reportingBal = new ReportingBal();

        try {
            String startDate = dateFormat.format(jDateChooser1.getDate());
            String endDate = dateFormat.format(jDateChooser2.getDate());
            String character = "income";

            JOptionPane.showMessageDialog(null, "Income Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character));
    }//GEN-LAST:event_btnIncomeActionPerformed
        catch (NullPointerException ex) {
            int noOfCertificates = reportingBal.getNoOfCertificates("income");
            JOptionPane.showMessageDialog(null, "No: Of Income certificates :" + noOfCertificates);

        }
    }
    private void btnNoMarrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoMarrigeActionPerformed

        ReportingBal reportingBal = new ReportingBal();
        try {

            String startDate = dateFormat.format(jDateChooser1.getDate());
            String endDate = dateFormat.format(jDateChooser2.getDate());
            String character = "NoMarriage";

            JOptionPane.showMessageDialog(null, "No Marriage Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character));
        } catch (NullPointerException ex) {
            int noOfCertificates = reportingBal.getNoOfCertificates("NoMarriage");
            JOptionPane.showMessageDialog(null, "No: Of NoMarriage certificates :" + noOfCertificates);
        }

    }//GEN-LAST:event_btnNoMarrigeActionPerformed

    private void btnResidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResidenceActionPerformed
        ReportingBal reportingBal = new ReportingBal();
        try {

            String startDate = dateFormat.format(jDateChooser1.getDate());
            String endDate = dateFormat.format(jDateChooser2.getDate());
            String character = "residence";

            JOptionPane.showMessageDialog(null, "Residence Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character));
        } catch (NullPointerException ex) {
            int noOfCertificates = reportingBal.getNoOfCertificates("residence");
            JOptionPane.showMessageDialog(null, "No: Of Residence certificates :" + noOfCertificates);

        }
    }//GEN-LAST:event_btnResidenceActionPerformed

    private void btnNoObjectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoObjectionActionPerformed
        ReportingBal reportingBal = new ReportingBal();

        try {
            String startDate = dateFormat.format(jDateChooser1.getDate());
            String endDate = dateFormat.format(jDateChooser2.getDate());
            String character = "noc";

            JOptionPane.showMessageDialog(null, "No Objection Certificate:" + reportingBal.getNoOfCertificates(startDate, endDate, character));
        } catch (NullPointerException ex) {
            int noOfCertificates = reportingBal.getNoOfCertificates("noc");
            JOptionPane.showMessageDialog(null, "No: Of Noc Objection certificates :" + noOfCertificates);

        }
    }//GEN-LAST:event_btnNoObjectionActionPerformed
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
        alldata.stream().map((cdb) -> {
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
            return v;
        }).forEachOrdered((v) -> {
            model.addRow(v);
        });
        tblData.setModel(model);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllCertificates;
    private javax.swing.JButton btnCharacter;
    private javax.swing.JButton btnElectrol;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnNoMarrige;
    private javax.swing.JButton btnNoObjection;
    private javax.swing.JButton btnResidence;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
