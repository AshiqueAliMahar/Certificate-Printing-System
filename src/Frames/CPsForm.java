package Frames;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CPsForm extends javax.swing.JFrame {
    
    
    
    
    public CPsForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCharacter = new javax.swing.JButton();
        btnElectrol = new javax.swing.JButton();
        btnIncome = new javax.swing.JButton();
        btnNoMarriage = new javax.swing.JButton();
        btnNoObjection = new javax.swing.JButton();
        btnResidence = new javax.swing.JButton();
        btnSearching = new javax.swing.JButton();
        btnReporting = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dpCertificates = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mehran_University_of_Engineering_and_Technology_logo.svg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setOpaque(false);

        btnCharacter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCharacter.setText("Character Certificate");
        btnCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharacterActionPerformed(evt);
            }
        });

        btnElectrol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnElectrol.setText("Electrol Certificate");
        btnElectrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectrolActionPerformed(evt);
            }
        });

        btnIncome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnIncome.setText("Income Certificate");
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnNoMarriage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNoMarriage.setText("No Marriage Certificate");
        btnNoMarriage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoMarriageActionPerformed(evt);
            }
        });

        btnNoObjection.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNoObjection.setText("No Objection Certificate");
        btnNoObjection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoObjectionActionPerformed(evt);
            }
        });

        btnResidence.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnResidence.setText("Residence Certificate");
        btnResidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResidenceActionPerformed(evt);
            }
        });

        btnSearching.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearching.setText("Searching & Printing");
        btnSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchingActionPerformed(evt);
            }
        });

        btnReporting.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReporting.setText("Reporting");
        btnReporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCharacter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElectrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNoMarriage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNoObjection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResidence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearching, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnElectrol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNoMarriage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNoObjection, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSearching, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnReporting, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel1.setText("MUET Jamshoro");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel2.setText("CPS(CERTFICATE PRINTING SYSTEM)");

        dpCertificates.setOpaque(false);

        javax.swing.GroupLayout dpCertificatesLayout = new javax.swing.GroupLayout(dpCertificates);
        dpCertificates.setLayout(dpCertificatesLayout);
        dpCertificatesLayout.setHorizontalGroup(
            dpCertificatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpCertificatesLayout.setVerticalGroup(
            dpCertificatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(dpCertificates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dpCertificates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharacterActionPerformed
        dpCertificates.removeAll();
        CCertificate cCertificate = new CCertificate();
        dpCertificates.add(cCertificate);
        dpCertificates.setOpaque(true);
        cCertificate.setOpaque(true);
        
        try {
            cCertificate.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        cCertificate.setVisible(true);
        
        
    }//GEN-LAST:event_btnCharacterActionPerformed

    private void btnElectrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectrolActionPerformed
        dpCertificates.removeAll();
        ECertificate eCertificate = new ECertificate();
        dpCertificates.add(eCertificate);
        try {
            eCertificate.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        eCertificate.setVisible(true);
        
    }//GEN-LAST:event_btnElectrolActionPerformed

    private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed
        
        dpCertificates.removeAll();
        ICertificate iCertificate=new ICertificate();
        dpCertificates.add(iCertificate);
        try {
            iCertificate.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        iCertificate.setVisible(true);
    }//GEN-LAST:event_btnIncomeActionPerformed

    private void btnNoMarriageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoMarriageActionPerformed
        
        dpCertificates.removeAll();
        NMCertificate nMCertificate=new NMCertificate();
        dpCertificates.add(nMCertificate);
        try {
            nMCertificate.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        nMCertificate.setVisible(true);
        
    }//GEN-LAST:event_btnNoMarriageActionPerformed

    private void btnNoObjectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoObjectionActionPerformed
        dpCertificates.removeAll();
        NOCertificate nOCertificate=new NOCertificate();
        dpCertificates.add(nOCertificate);
        try {
            nOCertificate.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        nOCertificate.setVisible(true);
    }//GEN-LAST:event_btnNoObjectionActionPerformed

    private void btnSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchingActionPerformed
        
        try {
            dpCertificates.removeAll();
            PrintSearch printSearch=new PrintSearch();
            dpCertificates.add(printSearch);
            printSearch.setVisible(true);
            printSearch.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSearchingActionPerformed

    private void btnResidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResidenceActionPerformed
        try {
            dpCertificates.removeAll();
            RCertificate rCertificate=new RCertificate();
            dpCertificates.add(rCertificate);
            rCertificate.setVisible(true);
            rCertificate.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnResidenceActionPerformed

    private void btnReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportingActionPerformed
        try {
            dpCertificates.removeAll();
            Reporting printSearch=new Reporting();
            dpCertificates.add(printSearch);
            printSearch.setVisible(true);
            printSearch.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CPsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReportingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCharacter;
    private javax.swing.JButton btnElectrol;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnNoMarriage;
    private javax.swing.JButton btnNoObjection;
    private javax.swing.JButton btnReporting;
    private javax.swing.JButton btnResidence;
    private javax.swing.JButton btnSearching;
    private javax.swing.JPanel dpCertificates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
