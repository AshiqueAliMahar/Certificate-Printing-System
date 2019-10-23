package PrintCertificates;

import BeanClasses.CDetailBean;
import Frames.PrintSearch;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;

public class ResidenceCertificates extends javax.swing.JFrame {

    public ResidenceCertificates() {

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

    private void setLabels() {

        PrintSearch p = new PrintSearch();
        CDetailBean cpsNameNumber = p.getCpsNameNumber();
        if (cpsNameNumber!=null) {

            String appResidenceSince = cpsNameNumber.getCertificateDetails();
            for (int i = 0; i < appResidenceSince.length(); i++) {
                if (appResidenceSince.charAt(i) == ':') {
                    appResidenceSince = appResidenceSince.substring(i + 1, appResidenceSince.length());
                    break;
                }
            }
            lblResidenceSince.setText(appResidenceSince);
            lblRecommendedBy.setText(cpsNameNumber.getRecommededPerson());
            lblDate.setText(cpsNameNumber.getCertificateDate());
            lblWardNo.setText(cpsNameNumber.getWardNum()+"");
            lblCertificateNumber.setText("Paper No:"+PrintSearch.pageNumberString.toUpperCase());
            lblCpsNumber.setText(lblCpsNumber.getText() + PrintSearch.cpsNo.toUpperCase());
            lblNameFatherName.setText((cpsNameNumber.getAppName() + " S/o " + cpsNameNumber.getFatherName()));
            lblAddress.setText(cpsNameNumber.getAppAddress());
            lblCNIC.setText(cpsNameNumber.getAppCNIC());
            lblCaste.setText(cpsNameNumber.getSurName());
            lblRecommended.setText(cpsNameNumber.getRecommendedBy());
            
        }

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
        jLabel8 = new javax.swing.JLabel();
        lblCNIC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblResidenceSince = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblRecommended = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblWardNo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblRecommendedBy = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblCertificateNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCertificateNumber.setText("Paper No:");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        jLabel2.setText("Residence Certificate");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel3.setText("Certify that");

        lblCpsNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCpsNumber.setText("CPS No:");

        lblNameFatherName.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblNameFatherName.setText("Ashique Ali s/o hakim Ali       ");

        jLabel6.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel6.setText("By Caste ");

        lblCaste.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblCaste.setText("MAhar     ");

        jLabel8.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel8.setText("holding CNIC:");

        lblCNIC.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblCNIC.setText("42401-84772293");

        jLabel11.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel11.setText("is residing at");

        lblAddress.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblAddress.setText("jamshoro       ");

        jLabel13.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel13.setText("Since");

        lblResidenceSince.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblResidenceSince.setText("Birth");

        jLabel16.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel16.setText("as per recommendation of ");

        lblRecommended.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblRecommended.setText("Mr.Ashique Ali");

        jLabel18.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel18.setText("Chairman Ward No:");

        lblWardNo.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblWardNo.setText("1");

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
        jLabel4.setText(".This certificate is issued");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(142, 142, 142)
                            .addComponent(lblCpsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRecommendedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(lblCNIC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(12, 12, 12)
                                        .addComponent(lblResidenceSince, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblWardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblCaste)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResidenceSince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblRecommended)
                    .addComponent(jLabel18)
                    .addComponent(lblWardNo))
                .addGap(159, 159, 159)
                .addComponent(lblRecommendedBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(262, 262, 262))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCNIC;
    private javax.swing.JLabel lblCaste;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCpsNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNameFatherName;
    private javax.swing.JLabel lblRecommended;
    private javax.swing.JLabel lblRecommendedBy;
    private javax.swing.JLabel lblResidenceSince;
    private javax.swing.JLabel lblWardNo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
