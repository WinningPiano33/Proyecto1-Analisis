/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author GUILLERMO
 */
public class RVar3x3 extends javax.swing.JFrame {

    /**
     * Creates new form RVar3x3
     */
    public RVar3x3() {
        initComponents();
    }
    
    int iA1, iA2, iA3, iRA1, iRA2, IRA3, iB1, iB2, iB3, iRB1, iRB2, iRB3,
            iC1, iC2, iC3, iRC1, iRC2, iRC3,
            iMA1, iMA2, iMA3, iMRA1, iMRA2, iMRA3, iMB1, iMB2, iMB3, iMRB1, iMRB2, iMRB3,
            iMC1, iMC2, iMC3, iMRC1, iMRC2, iMRC3;
    int pAnt, pAct;
    int paso=0;
    
    int x, y, z;
    
    private void procedimiento(int paso) {
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A1 = new javax.swing.JLabel();
        MRB1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        RA1 = new javax.swing.JLabel();
        MRB2 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        RA2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        RB1 = new javax.swing.JLabel();
        RB2 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        instruccionText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pivAntLabel = new javax.swing.JLabel();
        pivActLabel = new javax.swing.JLabel();
        MA1 = new javax.swing.JLabel();
        MA2 = new javax.swing.JLabel();
        MRA1 = new javax.swing.JLabel();
        SigPaso = new javax.swing.JButton();
        MB1 = new javax.swing.JLabel();
        OmiPaso = new javax.swing.JButton();
        MRA2 = new javax.swing.JLabel();
        MB2 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        RC1 = new javax.swing.JLabel();
        RC2 = new javax.swing.JLabel();
        RC3 = new javax.swing.JLabel();
        RA3 = new javax.swing.JLabel();
        RB3 = new javax.swing.JLabel();
        MA3 = new javax.swing.JLabel();
        MB3 = new javax.swing.JLabel();
        MRA3 = new javax.swing.JLabel();
        MRB3 = new javax.swing.JLabel();
        MC1 = new javax.swing.JLabel();
        MC2 = new javax.swing.JLabel();
        MC3 = new javax.swing.JLabel();
        MRC1 = new javax.swing.JLabel();
        MRC2 = new javax.swing.JLabel();
        MRC3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        A1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A1.setText("0");

        MRB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRB1.setText("0");

        A2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A2.setText("0");

        RA1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RA1.setText("0");

        MRB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRB2.setText("0");

        B1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B1.setText("0");

        RA2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RA2.setText("0");

        B2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B2.setText("0");

        RB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB1.setText("0");

        RB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB2.setText("0");

        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        instruccionText.setEditable(false);
        instruccionText.setText("Se empieza el procedimiento.");

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setText("Pivote Actual:");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel2.setText("Pivote Anterior:");

        pivAntLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pivAntLabel.setText("1");

        pivActLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pivActLabel.setText("0");

        MA1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MA1.setText("0");

        MA2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MA2.setText("0");

        MRA1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRA1.setText("0");

        SigPaso.setText("Siguiente Paso");
        SigPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigPasoMouseClicked(evt);
            }
        });

        MB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MB1.setText("0");

        OmiPaso.setText("Omitir Pasos");
        OmiPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OmiPasoMouseClicked(evt);
            }
        });

        MRA2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRA2.setText("0");

        MB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MB2.setText("0");

        C1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C1.setText("0");

        C2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C2.setText("0");

        C3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C3.setText("0");

        A3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A3.setText("0");

        B3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B3.setText("0");

        RC1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RC1.setText("0");

        RC2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RC2.setText("0");

        RC3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RC3.setText("0");

        RA3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RA3.setText("0");

        RB3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB3.setText("0");

        MA3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MA3.setText("0");

        MB3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MB3.setText("0");

        MRA3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRA3.setText("0");

        MRB3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRB3.setText("0");

        MC1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MC1.setText("0");

        MC2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MC2.setText("0");

        MC3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MC3.setText("0");

        MRC1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRC1.setText("0");

        MRC2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRC2.setText("0");

        MRC3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRC3.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C1)
                                        .addGap(40, 40, 40)
                                        .addComponent(C2)
                                        .addGap(30, 30, 30)
                                        .addComponent(C3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B1)
                                            .addComponent(A1))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B2)
                                            .addComponent(A2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B3)
                                            .addComponent(A3))))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RB1)
                                            .addComponent(RA1))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RB2)
                                            .addComponent(RA2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RC1)
                                        .addGap(40, 40, 40)
                                        .addComponent(RC2)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RC3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RB3)
                                        .addComponent(RA3)))
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MB1)
                                            .addComponent(MA1))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MB2)
                                            .addComponent(MA2))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MB3)
                                            .addComponent(MA3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MC1)
                                        .addGap(29, 29, 29)
                                        .addComponent(MC2)
                                        .addGap(29, 29, 29)
                                        .addComponent(MC3)))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MRB1)
                                    .addComponent(MRA1)
                                    .addComponent(MRC1))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MRC2)
                                    .addComponent(MRB2)
                                    .addComponent(MRA2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MRB3)
                                    .addComponent(MRA3)
                                    .addComponent(MRC3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(pivAntLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SigPaso)
                                        .addGap(18, 18, 18)
                                        .addComponent(OmiPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regresarButton)
                                    .addComponent(pivActLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(A1)
                                        .addComponent(A2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(B1)
                                        .addComponent(B2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(A3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C1)
                                .addComponent(C2)
                                .addComponent(C3)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(MRA3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MRB3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MRC3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MA1)
                                    .addComponent(MA2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MB1)
                                    .addComponent(MB2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MRA1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MRB1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MB3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MC1)
                                    .addComponent(MC2))
                                .addComponent(MC3))
                            .addComponent(MRC1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(MRC2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MRA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MRB2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RA1)
                                    .addComponent(RA2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RB1)
                                    .addComponent(RB2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RC1)
                            .addComponent(RC2)
                            .addComponent(RC3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(pivAntLabel)
                    .addComponent(pivActLabel))
                .addGap(54, 54, 54)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigPaso)
                    .addComponent(OmiPaso)
                    .addComponent(regresarButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        Variables2x2 b = new Variables2x2();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void SigPasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigPasoMouseClicked
        // TODO add your handling code here:
        paso++;
        procedimiento(paso);
    }//GEN-LAST:event_SigPasoMouseClicked

    private void OmiPasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OmiPasoMouseClicked
        // TODO add your handling code here:
        for(int i=paso;paso <= 10;paso++) {
            procedimiento(paso);
        }
    }//GEN-LAST:event_OmiPasoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RVar3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RVar3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RVar3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RVar3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RVar3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel MA1;
    private javax.swing.JLabel MA2;
    private javax.swing.JLabel MA3;
    private javax.swing.JLabel MB1;
    private javax.swing.JLabel MB2;
    private javax.swing.JLabel MB3;
    private javax.swing.JLabel MC1;
    private javax.swing.JLabel MC2;
    private javax.swing.JLabel MC3;
    private javax.swing.JLabel MRA1;
    private javax.swing.JLabel MRA2;
    private javax.swing.JLabel MRA3;
    private javax.swing.JLabel MRB1;
    private javax.swing.JLabel MRB2;
    private javax.swing.JLabel MRB3;
    private javax.swing.JLabel MRC1;
    private javax.swing.JLabel MRC2;
    private javax.swing.JLabel MRC3;
    private javax.swing.JButton OmiPaso;
    private javax.swing.JLabel RA1;
    private javax.swing.JLabel RA2;
    private javax.swing.JLabel RA3;
    private javax.swing.JLabel RB1;
    private javax.swing.JLabel RB2;
    private javax.swing.JLabel RB3;
    private javax.swing.JLabel RC1;
    private javax.swing.JLabel RC2;
    private javax.swing.JLabel RC3;
    private javax.swing.JButton SigPaso;
    private javax.swing.JTextField instruccionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pivActLabel;
    private javax.swing.JLabel pivAntLabel;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
