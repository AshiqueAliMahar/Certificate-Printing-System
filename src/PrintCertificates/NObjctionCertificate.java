package PrintCertificates;

import BeanClasses.CDetailBean;
import Frames.PrintSearch;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class NObjctionCertificate extends javax.swing.JFrame {

    public NObjctionCertificate() {
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
        CDetailBean cDetailBean = p.getCpsNameNumber();

        if (cDetailBean != null) {

            String nocForsString = cDetailBean.getCertificateDetails();
            for (int i = 0; i < nocForsString.length(); i++) {
                if (nocForsString.charAt(i) == ':') {
                    nocForsString = nocForsString.substring(i + 1, nocForsString.length());
                    JOptionPane.showMessageDialog(rootPane, nocForsString);
                    break;
                }
            }
            lblCertificateNumber.setText("Paper No:"+ PrintSearch.pageNumberString.toUpperCase());
            lblCpsNumber.setText("CPS No:"+ PrintSearch.cpsNo.toUpperCase());
            lblNameFatherName.setText((cDetailBean.getAppName() + " S/O " + cDetailBean.getFatherName()));
            lblAddress.setText(cDetailBean.getAppAddress());
            lblCNIC.setText(cDetailBean.getAppCNIC());
            lblCaste.setText(cDetailBean.getSurName());
            lblRecommended.setText(cDetailBean.getRecommendedBy());
            lblRecommendedBy.setText(cDetailBean.getRecommededPerson());
            lblDate.setText(cDetailBean.getCertificateDate());
            lblWardNo.setText(cDetailBean.getWardNum() + "");
            lblNocFor.setText(nocForsString);

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
        jLabel16 = new javax.swing.JLabel();
        lblRecommended = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblWardNo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblRecommendedBy = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNocFor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblCertificateNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCertificateNumber.setText("Paper No:");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 44)); // NOI18N
        jLabel2.setText("No Objection Certificate");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel3.setText("This is no objection if a");

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

        jLabel16.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel16.setText(".This certificate is issued as per recommendation of ");

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

        lblNocFor.setFont(new java.awt.Font("High Tower Text", 1, 14)); // NOI18N
        lblNocFor.setText("Electricity");

        jLabel7.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel7.setText("May be given to");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRecommendedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(lblCpsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWardNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNocFor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lblNocFor)
                    .addComponent(jLabel7)
                    .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblCaste)
                    .addComponent(jLabel8)
                    .addComponent(lblCNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblRecommended)
                    .addComponent(jLabel18)
                    .addComponent(lblWardNo))
                .addGap(176, 176, 176)
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCNIC;
    private javax.swing.JLabel lblCaste;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCpsNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNameFatherName;
    private javax.swing.JLabel lblNocFor;
    private javax.swing.JLabel lblRecommended;
    private javax.swing.JLabel lblRecommendedBy;
    private javax.swing.JLabel lblWardNo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
