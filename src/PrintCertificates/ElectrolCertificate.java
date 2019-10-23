package PrintCertificates;

import BeanClasses.CDetailBean;
import Frames.PrintSearch;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class ElectrolCertificate extends javax.swing.JFrame {

    public ElectrolCertificate() {
        initComponents();
        setLabels();
    }

    public void printPanel() {

        Toolkit tkp = panel.getToolkit();
        PrintJob pjp = tkp.getPrintJob(this, null, null);
        Graphics g = pjp.getGraphics();
        panel.print(g);
        g.dispose();
        pjp.end();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblCertificateNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCpsNumber = new javax.swing.JLabel();
        lblNameFatherName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCaste = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCNIC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblRecommended = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblWardNmber = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblRecommendedBy = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCenusYear = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBlockCode = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblFamilyTree = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblElectrolArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblCertificateNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCertificateNumber.setText("Paper No:");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 30)); // NOI18N
        jLabel2.setText("Abstract Of Electrol Certificate");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel3.setText("Certify that");

        lblCpsNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCpsNumber.setText("CPS No:CC-0001");

        lblNameFatherName.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblNameFatherName.setText("Ashique Ali s/o hakim Ali       ");

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel6.setText("By Caste ");

        lblCaste.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblCaste.setText("MAhar     ");

        jLabel9.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel9.setText("holdingCNIC ");

        lblCNIC.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblCNIC.setText("42401-84772293");

        jLabel11.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel11.setText("is residing at");

        lblAddress.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblAddress.setText("jamshoro       ");

        jLabel16.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel16.setText(".This Certificate is issued as per recommendation of ");

        lblRecommended.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblRecommended.setText("Mr.Ashique Ali   ");

        jLabel18.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel18.setText("Chairman Ward No:");

        lblWardNmber.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblWardNmber.setText("1");

        jLabel20.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel20.setText("Dated :");

        lblDate.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblDate.setText("28 october 2017");

        lblRecommendedBy.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblRecommendedBy.setText("Chairman       ");

        jLabel23.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel23.setText("    Mehran UET ");

        jLabel1.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel1.setText("Jamshoro");

        jLabel4.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel4.setText("is exist in the electrol list as per Census year :");

        lblCenusYear.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblCenusYear.setText("2015");

        jLabel7.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel7.setText("Block Code :");

        lblBlockCode.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblBlockCode.setText("1212");

        jLabel10.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel10.setText(",Serial No :");

        lblSerialNo.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblSerialNo.setText("2345");

        jLabel14.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel14.setText(",Family Tree :");

        lblFamilyTree.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblFamilyTree.setText("2d32d3");

        jLabel21.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel21.setText("Electrol Area:");

        lblElectrolArea.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblElectrolArea.setText("jamshoro polling station");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWardNmber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblBlockCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblFamilyTree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblElectrolArea, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(lblRecommendedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCenusYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26))
                            .addComponent(lblCpsNumber, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(135, 135, 135))))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblCaste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(lblCenusYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblBlockCode)
                    .addComponent(jLabel10)
                    .addComponent(lblSerialNo)
                    .addComponent(jLabel14)
                    .addComponent(lblFamilyTree)
                    .addComponent(jLabel21)
                    .addComponent(lblElectrolArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblAddress)
                    .addComponent(jLabel16)
                    .addComponent(lblRecommended))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblWardNmber))
                .addGap(92, 92, 92)
                .addComponent(lblRecommendedBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setLabels() {

        PrintSearch p = new PrintSearch();
        CDetailBean cpsNameNumber = p.getCpsNameNumber();

        if (cpsNameNumber != null) {

            String certificateDetaiString = cpsNameNumber.getCertificateDetails();
            int blockCode = 0;
            String serialNumber = "N/A";
            String familyTree = "N/A";
            String electrolArea = "N/A";
            String censusYear = "N/A";
            int index = 0;
            for (index = 11; index < certificateDetaiString.length(); index++) {
                if (certificateDetaiString.charAt(index) == ',') {
                    blockCode = Integer.parseInt(certificateDetaiString.substring(11, index));
                    
                    break;
                }
            }
            loop:
            for (int i = index++; i < certificateDetaiString.length(); i++) {
                if (certificateDetaiString.charAt(i) == ':') {
                    if (certificateDetaiString.substring(index, i).equalsIgnoreCase("serial")) {
                        for (int serial = i++; serial < certificateDetaiString.length(); serial++) {
                            if (certificateDetaiString.charAt(serial) == ',') {
                                serialNumber = certificateDetaiString.substring(i, serial);
                                index = serial;
                                break loop;
                            }
                        }
                    }
                }
            }
            loop:
            for (int i = index++; i < certificateDetaiString.length(); i++) {
                if (certificateDetaiString.charAt(i) == ':') {
                    if (certificateDetaiString.substring(index, i).equalsIgnoreCase("family tree")) {
                        for (int serial = i++; serial < certificateDetaiString.length(); serial++) {
                            if (certificateDetaiString.charAt(serial) == ',') {
                                familyTree = certificateDetaiString.substring(i, serial);
                                
                                index = serial;
                                break loop;
                            }
                        }
                    }
                }
            }
            loop:
            for (int i = index++; i < certificateDetaiString.length(); i++) {
                if (certificateDetaiString.charAt(i) == ':') {
                    if (certificateDetaiString.substring(index, i).equalsIgnoreCase("electrolArea")) {
                        for (int serial = i++; serial < certificateDetaiString.length(); serial++) {
                            if (certificateDetaiString.charAt(serial) == ',') {
                                electrolArea = certificateDetaiString.substring(i, serial);
                                index = serial;
                                break loop;
                            }
                        }
                    }
                }
            }
            loop:
            for (int i = index++; i < certificateDetaiString.length(); i++) {
                if (certificateDetaiString.charAt(i) == ':') {
                    if (certificateDetaiString.substring(index, i).equalsIgnoreCase("censusyear")) {
                        censusYear = certificateDetaiString.substring(i + 1, certificateDetaiString.length());
                        break loop;
                    }
                }
            }
            lblCertificateNumber.setText(lblCertificateNumber.getText() + PrintSearch.pageNumberString.toUpperCase());
            lblCpsNumber.setText("CPS No:"+PrintSearch.cpsNo.toUpperCase());
            lblNameFatherName.setText((cpsNameNumber.getAppName() + " S/O " + cpsNameNumber.getFatherName()));
            lblAddress.setText(cpsNameNumber.getAppAddress());
            lblCNIC.setText(cpsNameNumber.getAppCNIC());
            lblCaste.setText(cpsNameNumber.getSurName());
            lblRecommended.setText(cpsNameNumber.getRecommendedBy());
            lblRecommendedBy.setText(cpsNameNumber.getRecommededPerson());
            lblDate.setText(cpsNameNumber.getCertificateDate());
            lblBlockCode.setText(blockCode + "");
            lblSerialNo.setText(serialNumber);
            lblFamilyTree.setText(familyTree);
            lblElectrolArea.setText(electrolArea);
            lblCenusYear.setText(censusYear);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBlockCode;
    private javax.swing.JLabel lblCNIC;
    private javax.swing.JLabel lblCaste;
    private javax.swing.JLabel lblCenusYear;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCpsNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblElectrolArea;
    private javax.swing.JLabel lblFamilyTree;
    private javax.swing.JLabel lblNameFatherName;
    private javax.swing.JLabel lblRecommended;
    private javax.swing.JLabel lblRecommendedBy;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblWardNmber;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
