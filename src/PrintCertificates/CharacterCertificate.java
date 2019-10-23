package PrintCertificates;

import BeanClasses.CDetailBean;
import Frames.PrintSearch;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;

public class CharacterCertificate extends javax.swing.JFrame {

    public CharacterCertificate() {
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

        if (cpsNameNumber != null) {
            if (cpsNameNumber.getIssueCPSNo() > 0) {
                lblCertificateNumber.setText("Paper No:" + PrintSearch.pageNumberString.toUpperCase());
                lblCpsNumber.setText("CPS No:"+ PrintSearch.cpsNo.toUpperCase());
                lblNameFatherName.setText((cpsNameNumber.getAppName() + " S/O " + cpsNameNumber.getFatherName()));
                lblAddress.setText(cpsNameNumber.getAppAddress());
                lblCNIC.setText(cpsNameNumber.getAppCNIC());
                lblCaste.setText(cpsNameNumber.getSurName());
                lblRecommended.setText(cpsNameNumber.getRecommendedBy());
                lblRecommendedBy.setText(cpsNameNumber.getRecommededPerson());
                lblDate.setText(cpsNameNumber.getCertificateDate());
                lblWardNumber.setText(cpsNameNumber.getWardNum()+"");
            }
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
        jLabel9 = new javax.swing.JLabel();
        lblCNIC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblRecommended = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblWardNumber = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblRecommendedBy = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblCertificateNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCertificateNumber.setText("Paper No:MCB00001");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        jLabel2.setText("Character Certificate");

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

        jLabel13.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel13.setText("bears a good Moral Charcter.This ");

        jLabel16.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel16.setText("Certificate is issued as per recommendation of ");

        lblRecommended.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblRecommended.setText("Mr.Ashique Ali   ");

        jLabel18.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel18.setText("Chairman Ward No:");

        lblWardNumber.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblWardNumber.setText("1");

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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(lblRecommendedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblWardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCertificateNumber))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCpsNumber))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblCaste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblRecommended))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWardNumber)
                    .addComponent(jLabel18))
                .addGap(128, 128, 128)
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCNIC;
    private javax.swing.JLabel lblCaste;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCpsNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNameFatherName;
    private javax.swing.JLabel lblRecommended;
    private javax.swing.JLabel lblRecommendedBy;
    private javax.swing.JLabel lblWardNumber;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
