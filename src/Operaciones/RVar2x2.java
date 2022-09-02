/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.awt.Color;

/**
 *
 * @author GUILLERMO
 */
public class RVar2x2 extends javax.swing.JFrame {

    /**
     * Creates new form RVar2x2
     */
    public RVar2x2() {
        initComponents();
    }
    
    public RVar2x2(String cA1, String cA2, String cRA,
            String cB1, String cB2, String cRB) {
        initComponents();
        A1.setText(cA1);
        A2.setText(cA2);
        RA1.setText(cRA);
        B1.setText(cB1);
        B2.setText(cB2);
        RB2.setText(cRB);
        
        pivActLabel.setText(A1.getText());
        pAct = Integer.parseInt(A1.getText());
    }
    
    int iA1, iA2, iRA1, iRA2, iB1, iB2, iRB1, iRB2,
            iMA1, iMA2, iMRA1, iMRA2, iMB1, iMB2, iMRB1, iMRB2;
    int pAnt, pAct;
    int paso=0;
    
    int x, y;
    
    public void procedimiento(int paso) {
        switch(paso) {
            case 1: 
                instruccionText.setText("Prepara la otra matriz a trabajar.");
                MA1.setText(A1.getText());
                MA2.setText(A2.getText());
                MRA1.setText(RA1.getText());
                MRA2.setText(RA2.getText());
                MB1.setText("0");
                MB2.setText("-");
                MRB1.setText("-");
                MRB2.setText("-");
                establecerInts();
            break;
            case 2:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                A1.setForeground(Color.red);
                B2.setForeground(Color.red);
                B1.setForeground(Color.blue);
                A2.setForeground(Color.blue);
                iMB2 = obtenerResultado(iA1, iB2, iB1, iA2);
                MB2.setText(Integer.toString(iMB2));
                MB2.setForeground(Color.pink);
            break;
            case 3:
                A2.setForeground(Color.black);
                B2.setForeground(Color.black);
                
                RB1.setForeground(Color.red);
                RA1.setForeground(Color.blue);
                
                iMRB1 = obtenerResultado(iA1, iRB1, iB1, iRA1);
                MRB1.setText(Integer.toString(iMRB1));
                MRB1.setForeground(Color.pink);
            break;
            case 4:
                RB1.setForeground(Color.black);
                RA1.setForeground(Color.black);
                
                RA2.setForeground(Color.blue);
                RB2.setForeground(Color.red);
                
                iMRB2 = obtenerResultado(iA1, iRB2, iB1, iRA2);
                MRB2.setText(Integer.toString(iMRB2));
                MRB2.setForeground(Color.pink);
            break;
            case 5:
                instruccionText.setText("Se utiliza la segunda matriz para los procedimientos. Se crea una nueva matriz.");
                backToBlack();
                swapMatriz();
                MA1.setText(MB2.getText());
                MA2.setText("0");
                MRA1.setText("-");
                MRA2.setText("-");
                cambioPivotes();
                establecerInts();
            break;
            case 6:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                B2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                RA1.setForeground(Color.red);
                RB1.setForeground(Color.blue);
                
                iMRA1 = obtenerResultado(iB2, iRA1, iA2, iRB1);
                MRA1.setText(Integer.toString(iMRA1));
                MRA1.setForeground(Color.pink);
            break;
            case 7:
                RA1.setForeground(Color.black);
                RB1.setForeground(Color.black);
                
                RA2.setForeground(Color.red);
                RB2.setForeground(Color.blue);
                
                iMRA2 = obtenerResultado(iB2, iRA2, iA2, iRB2);
                MRA2.setText(Integer.toString(iMRA2));
                MRA2.setForeground(Color.pink);
            break;
            case 8:
                instruccionText.setText("Se utiliza la segunda matriz para su examinación.");
                backToBlack();
                swapMatriz();
                allBlankInMirror();
            break;
            case 9:
                instruccionText.setText("Sumamos valores y dividimos por la determinante.");
                MA1.setText("1");
                MB2.setText("1");
                MA2.setText("0");
                MB1.setText("0");
                
                establecerInts();
                resultadoFinal(iA1, iRA1, iRA2, iB2, iRB1, iRB2);
                MRA1.setText(Integer.toString(x));
                MRB2.setText(Integer.toString(y));
                MRA2.setText(" ");
                MRB1.setText(" ");
            break;
            case 10:
                instruccionText.setText("¡El resultado de X1 es " + x + ", y X2 es " + y + "!");
                MRA1.setForeground(Color.pink);
                MRB2.setForeground(Color.pink);
            break;
        }
    }
    
    public void backToBlack() {
        A1.setForeground(Color.black);
        A2.setForeground(Color.black);
        B1.setForeground(Color.black);
        B2.setForeground(Color.black);
        RA1.setForeground(Color.black);
        RA2.setForeground(Color.black);
        RB1.setForeground(Color.black);
        RB2.setForeground(Color.black);
        
        MA1.setForeground(Color.black);
        MA2.setForeground(Color.black);
        MB1.setForeground(Color.black);
        MB2.setForeground(Color.black);
        MRA1.setForeground(Color.black);
        MRA2.setForeground(Color.black);
        MRB1.setForeground(Color.black);
        MRB2.setForeground(Color.black);
    }
    
    public void allBlankInMirror() {
        MA1.setText("-");
        MA2.setText("-");
        MRA1.setText("-");
        MRA2.setText("-");
        MB1.setText("-");
        MB2.setText("-");
        MRB1.setText("-");
        MRB2.setText("-");
    }
    
    public void swapMatriz() {
        A1.setText(MA1.getText());
        A2.setText(MA2.getText());
        B1.setText(MB1.getText());
        B2.setText(MB2.getText());
        RA1.setText(MRA1.getText());
        RA2.setText(MRA2.getText());
        RB1.setText(MRB1.getText());
        RB2.setText(MRB2.getText());
    }
    
    public void cambioPivotes() {
        pAnt = pAct;
        pAct = Integer.parseInt(MA1.getText());
        pivAntLabel.setText(Integer.toString(pAnt));
        pivActLabel.setText(Integer.toString(pAct));
    }
    
    public void establecerInts() {
        iA1 = Integer.parseInt(A1.getText());
        iA2 = Integer.parseInt(A2.getText());
        iRA1 = Integer.parseInt(RA1.getText());
        iRA2 = Integer.parseInt(RA2.getText());
        iB1 = Integer.parseInt(B1.getText());
        iB2 = Integer.parseInt(B2.getText());
        iRB1 = Integer.parseInt(RB1.getText());
        iRB2 = Integer.parseInt(RB2.getText());
        
        pAnt = Integer.parseInt(pivAntLabel.getText());
    }
    
    public int obtenerResultado(int a, int b, int c, int d) {
        int resultado = (((a)*(b)) - ((c)*(d))) / pAnt;
        
        return resultado;
    }
    
    public void resultadoFinal(int a, int ra1, int ra2,
            int b, int rb1, int rb2) {
        
        x = (ra1 + ra2) / a;
        y = (rb1 + rb2) / b;
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
        A2 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        SigPaso = new javax.swing.JButton();
        OmiPaso = new javax.swing.JButton();
        RA1 = new javax.swing.JLabel();
        RA2 = new javax.swing.JLabel();
        RB1 = new javax.swing.JLabel();
        RB2 = new javax.swing.JLabel();
        MA1 = new javax.swing.JLabel();
        MA2 = new javax.swing.JLabel();
        MRA1 = new javax.swing.JLabel();
        MB1 = new javax.swing.JLabel();
        MRA2 = new javax.swing.JLabel();
        MB2 = new javax.swing.JLabel();
        MRB1 = new javax.swing.JLabel();
        MRB2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pivAntLabel = new javax.swing.JLabel();
        pivActLabel = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        instruccionText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        A1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A1.setText("0");

        A2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A2.setText("0");

        B1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B1.setText("0");

        B2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B2.setText("0");

        SigPaso.setText("Siguiente Paso");
        SigPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigPasoMouseClicked(evt);
            }
        });

        OmiPaso.setText("Omitir Pasos");
        OmiPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OmiPasoMouseClicked(evt);
            }
        });

        RA1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RA1.setText("0");

        RA2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RA2.setText("0");

        RB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB1.setText("0");

        RB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB2.setText("0");

        MA1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MA1.setText("0");

        MA2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MA2.setText("0");

        MRA1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRA1.setText("0");

        MB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MB1.setText("0");

        MRA2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRA2.setText("0");

        MB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MB2.setText("0");

        MRB1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRB1.setText("0");

        MRB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MRB2.setText("0");

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setText("Pivote Actual:");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel2.setText("Pivote Anterior:");

        pivAntLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pivAntLabel.setText("1");

        pivActLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pivActLabel.setText("0");

        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        instruccionText.setEditable(false);
        instruccionText.setText("Se empieza el procedimiento.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1)
                            .addComponent(A1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2)
                            .addComponent(A2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB1)
                            .addComponent(RA1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB2)
                            .addComponent(RA2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(pivAntLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MB1)
                    .addComponent(MA1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MB2)
                    .addComponent(MA2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MRB1)
                    .addComponent(MRA1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MRB2)
                    .addComponent(MRA2))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
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
                    .addComponent(pivActLabel))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(A1)
                                .addComponent(A2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B1)
                                .addComponent(B2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RA1)
                                .addComponent(RA2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RB1)
                                .addComponent(RB2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MA1)
                                .addComponent(MA2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MB1)
                                .addComponent(MB2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MRA1)
                                .addComponent(MRA2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MRB1)
                                .addComponent(MRB2)))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(pivAntLabel)
                    .addComponent(pivActLabel))
                .addGap(52, 52, 52)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigPaso)
                    .addComponent(OmiPaso)
                    .addComponent(regresarButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        Variables2x2 b = new Variables2x2();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RVar2x2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RVar2x2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RVar2x2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RVar2x2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RVar2x2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel MA1;
    private javax.swing.JLabel MA2;
    private javax.swing.JLabel MB1;
    private javax.swing.JLabel MB2;
    private javax.swing.JLabel MRA1;
    private javax.swing.JLabel MRA2;
    private javax.swing.JLabel MRB1;
    private javax.swing.JLabel MRB2;
    private javax.swing.JButton OmiPaso;
    private javax.swing.JLabel RA1;
    private javax.swing.JLabel RA2;
    private javax.swing.JLabel RB1;
    private javax.swing.JLabel RB2;
    private javax.swing.JButton SigPaso;
    private javax.swing.JTextField instruccionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pivActLabel;
    private javax.swing.JLabel pivAntLabel;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
