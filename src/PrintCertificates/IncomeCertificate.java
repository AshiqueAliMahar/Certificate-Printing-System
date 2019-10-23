package PrintCertificates;

import BeanClasses.CDetailBean;
import Frames.PrintSearch;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class IncomeCertificate extends javax.swing.JFrame {

    public IncomeCertificate() {
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
                String details = cpsNameNumber.getCertificateDetails();
                int index = 0;
                String occupationString = null;
                String salaryString = null;
                for (index = 11; index < details.length(); index++) {
                    if (details.charAt(index) == ',') {
                        occupationString = details.substring(11, index);
                        break;
                    }
                }
                salaryString=details.substring(index+8,details.length());
                lblCertificateNumber.setText("Paper No:"+PrintSearch.pageNumberString.toUpperCase());
                lblCpsNumber.setText("CPS No:"+ PrintSearch.cpsNo.toUpperCase());
                lblNameFatherName.setText((cpsNameNumber.getAppName() + " S/O " + cpsNameNumber.getFatherName()));
                lblAddress.setText(cpsNameNumber.getAppAddress());
                lblCNIC.setText(cpsNameNumber.getAppCNIC());
                lblCaste.setText(cpsNameNumber.getSurName());
                lblRecommended.setText(cpsNameNumber.getRecommendedBy());
                lblRecommendedBy.setText(cpsNameNumber.getRecommededPerson());
                lblDate.setText(cpsNameNumber.getCertificateDate());
                lblWardNumber.setText(cpsNameNumber.getWardNum() + "");
                lblOccupation.setText(occupationString);
                lblSalary.setText(salaryString);
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
        jLabel5 = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblCertificateNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCertificateNumber.setText("Paper No:CPS00001");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        jLabel2.setText("Income Certificate");

        jLabel3.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel3.setText("Certify that the annual income from all resourses of");

        lblCpsNumber.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        lblCpsNumber.setText("CPS No:IC-0001");

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
        jLabel13.setText("bears a good  ");

        jLabel16.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel16.setText("Moral Charcter.This Certificate is issued as per recommendation of ");

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

        jLabel5.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel5.setText("his Occupation is");

        lblOccupation.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblOccupation.setText("Own Bussiness");

        jLabel8.setFont(new java.awt.Font("High Tower Text", 0, 14)); // NOI18N
        jLabel8.setText("and annual salary in Pakistani Rs:");

        lblSalary.setFont(new java.awt.Font("High Tower Text", 3, 14)); // NOI18N
        lblSalary.setText("123456789");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(lblRecommendedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCertificateNumber)
                        .addGap(361, 361, 361)
                        .addComponent(lblCpsNumber)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lblCNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addComponent(lblAddress))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblCaste)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblOccupation)
                    .addComponent(jLabel8)
                    .addComponent(lblSalary)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblRecommended))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWardNumber)
                    .addComponent(jLabel18))
                .addGap(100, 100, 100)
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCNIC;
    private javax.swing.JLabel lblCaste;
    private javax.swing.JLabel lblCertificateNumber;
    private javax.swing.JLabel lblCpsNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNameFatherName;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblRecommended;
    private javax.swing.JLabel lblRecommendedBy;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblWardNumber;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
