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
public class RVar3x3 extends javax.swing.JFrame {

    /**
     * Creates new form RVar3x3
     */
    public RVar3x3() {
        initComponents();
    }
    
    public RVar3x3(String cA1, String cA2, String cA3, String cRA,
            String cB1, String cB2, String cB3, String cRB,
            String cC1, String cC2, String cC3, String cRC) {
        initComponents();
        A1.setText(cA1);
        A2.setText(cA2);
        A3.setText(cA3);
        RA1.setText(cRA);
        B1.setText(cB1);
        B2.setText(cB2);
        B3.setText(cB3);
        RB2.setText(cRB);
        C1.setText(cC1);
        C2.setText(cC2);
        C3.setText(cC3);
        RC3.setText(cRC);
        
        pivActLabel.setText(A1.getText());
        pAct = Integer.parseInt(A1.getText());
    }
    
    int iA1, iA2, iA3, iRA1, iRA2, iRA3, iB1, iB2, iB3, iRB1, iRB2, iRB3,
            iC1, iC2, iC3, iRC1, iRC2, iRC3,
            iMA1, iMA2, iMA3, iMRA1, iMRA2, iMRA3, iMB1, iMB2, iMB3, iMRB1, iMRB2, iMRB3,
            iMC1, iMC2, iMC3, iMRC1, iMRC2, iMRC3;
    int pAnt, pAct;
    int paso=0;
    
    int x, y, z;
    
    public void procedimiento(int paso) {
        switch(paso) {
            case 1:
                instruccionText.setText("Prepara la otra matriz a trabajar.");
                MA1.setText(A1.getText());
                MA2.setText(A2.getText());
                MA3.setText(A3.getText());
                MRA1.setText(RA1.getText());
                MRA2.setText(RA2.getText());
                MRA3.setText(RA3.getText());
                MB1.setText("0");
                MB2.setText("-");
                MB3.setText("-");
                MRB1.setText("-");
                MRB2.setText("-");
                MRB3.setText("-");
                MC1.setText("0");
                MC2.setText("-");
                MC3.setText("-");
                MRC1.setText("-");
                MRC2.setText("-");
                MRC3.setText("-");
                establecerInts();
            break;
            case 2:
                A1.setForeground(Color.red);
                B1.setForeground(Color.blue);
                B2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                iMB2 = obtenerResultado(iA1, iB2, iB1, iA2);
                MB2.setText(Integer.toString(iMB2));
                MB2.setForeground(Color.pink);
            break;
            case 3:
                B2.setForeground(Color.black);
                A2.setForeground(Color.black);
                
                B3.setForeground(Color.red);
                A3.setForeground(Color.blue);
                
                iMB3 = obtenerResultado(iA1, iB3, iB1, iA3);
                MB3.setText(Integer.toString(iMB3));
                MB3.setForeground(Color.pink);
            break;
            case 4:
                B3.setForeground(Color.black);
                A3.setForeground(Color.black);
                
                RB1.setForeground(Color.red);
                RA1.setForeground(Color.blue);
                
                iMRB1 = obtenerResultado(iA1, iRB1, iB1, iRA1);
                MRB1.setText(Integer.toString(iMRB1));
                MRB1.setForeground(Color.pink);
            break;
            case 5:
                RB1.setForeground(Color.black);
                RA1.setForeground(Color.black);
                
                RB2.setForeground(Color.red);
                RA2.setForeground(Color.blue);
                
                iMRB2 = obtenerResultado(iA1, iRB2, iB1, iRA2);
                MRB2.setText(Integer.toString(iMRB2));
                MRB2.setForeground(Color.pink);
            break;
            case 6:
                RB2.setForeground(Color.black);
                RA2.setForeground(Color.black);
                
                RB3.setForeground(Color.red);
                RA3.setForeground(Color.blue);
                
                iMRB3 = obtenerResultado(iA1, iRB3, iB1, iRA3);
                MRB3.setText(Integer.toString(iMRB3));
                MRB3.setForeground(Color.pink);
            break;
            case 7:
                //CAMBIO A C
                RB3.setForeground(Color.black);
                RA3.setForeground(Color.black);
                B1.setForeground(Color.black);
                
                C1.setForeground(Color.blue);
                C2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                iMC2 = obtenerResultado(iA1, iC2, iC1, iA2);
                MC2.setText(Integer.toString(iMC2));
                MC2.setForeground(Color.pink);
            break;
            case 8:
                C2.setForeground(Color.black);
                A2.setForeground(Color.black);
                
                C3.setForeground(Color.red);
                A3.setForeground(Color.blue);
                
                iMC3 = obtenerResultado(iA1, iC3, iC1, iA3);
                MC3.setText(Integer.toString(iMC3));
                MC3.setForeground(Color.pink);
            break;
            case 9:
                C3.setForeground(Color.black);
                A3.setForeground(Color.black);
                
                RC1.setForeground(Color.red);
                RA1.setForeground(Color.blue);
                
                iMRC1 = obtenerResultado(iA1, iRC1, iC1, iRA1);
                MRC1.setText(Integer.toString(iMRC1));
                MRC1.setForeground(Color.pink);
            break;
            case 10:
                RC1.setForeground(Color.black);
                RA1.setForeground(Color.black);
                
                RC2.setForeground(Color.red);
                RA2.setForeground(Color.blue);
                
                iMRC2 = obtenerResultado(iA1, iRC2, iC1, iRA2);
                MRC2.setText(Integer.toString(iMRC2));
                MRC2.setForeground(Color.pink);
            break;
            case 11:
                RC2.setForeground(Color.black);
                RA2.setForeground(Color.black);
                
                RC3.setForeground(Color.red);
                RA3.setForeground(Color.blue);
                
                iMRC3 = obtenerResultado(iA1, iRC3, iC1, iRA3);
                MRC3.setText(Integer.toString(iMRC3));
                MRC3.setForeground(Color.pink);
            break;
            case 12:
                instruccionText.setText("Se utiliza la segunda matriz para los procedimientos. Se crea una nueva matriz.");
                backToBlack();
                swapMatriz();
                MA1.setText(MB2.getText());
                MB1.setText("0");
                MC1.setText("0");
                MA2.setText("0");
                MC2.setText("0");
                
                MA3.setText("-");
                MRA1.setText("-");
                MRA2.setText("-");
                MRA3.setText("-");
                MC3.setText("-");
                MRC1.setText("-");
                MRC2.setText("-");
                MRC3.setText("-");
                cambioPivotes();
                establecerInts();
            break;
            case 13:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                B2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                A3.setForeground(Color.red);
                B3.setForeground(Color.blue);
                
                iMA3 = obtenerResultado(iB2, iA3, iA2, iB3);
                MA3.setText(Integer.toString(iMA3));
                MA3.setForeground(Color.pink);
            break;
            case 14:
                A3.setForeground(Color.black);
                B3.setForeground(Color.black);
                
                RA1.setForeground(Color.red);
                RB1.setForeground(Color.blue);
                
                iMRA1 = obtenerResultado(iB2, iRA1, iA2, iRB1);
                MRA1.setText(Integer.toString(iMRA1));
                MRA1.setForeground(Color.pink);
            break;
            case 15:
                RA1.setForeground(Color.black);
                RB1.setForeground(Color.black);
                
                RA2.setForeground(Color.red);
                RB2.setForeground(Color.blue);
                
                iMRA2 = obtenerResultado(iB2, iRA2, iA2, iRB2);
                MRA2.setText(Integer.toString(iMRA2));
                MRA2.setForeground(Color.pink);
            break;
            case 16:
                RA2.setForeground(Color.black);
                RB2.setForeground(Color.black);
                
                RA3.setForeground(Color.red);
                RB3.setForeground(Color.blue);
                
                iMRA3 = obtenerResultado(iB2, iRA3, iA2, iRB3);
                MRA3.setText(Integer.toString(iMRA3));
                MRA3.setForeground(Color.pink);
            break;
            case 17:
                //CAMBIO A C
                RA2.setForeground(Color.black);
                RB2.setForeground(Color.black);
                A2.setForeground(Color.black);
                
                C2.setForeground(Color.blue);
                C3.setForeground(Color.red);
                B3.setForeground(Color.blue);
                
                iMC3 = obtenerResultado(iB2, iC3, iC2, iB3);
                MC3.setText(Integer.toString(iMC3));
                MC3.setForeground(Color.pink);
            break;
            case 18:
                C3.setForeground(Color.black);
                B3.setForeground(Color.black);
                
                RC1.setForeground(Color.red);
                RB1.setForeground(Color.blue);
                
                iMRC1 = obtenerResultado(iB2, iRC1, iC2, iRB1);
                MRC1.setText(Integer.toString(iMRC1));
                MRC1.setForeground(Color.pink);
            break;
            case 19:
                RC1.setForeground(Color.black);
                RB1.setForeground(Color.black);
                
                RC2.setForeground(Color.red);
                RB2.setForeground(Color.blue);
                
                iMRC2 = obtenerResultado(iB2, iRC2, iC2, iRB2);
                MRC2.setText(Integer.toString(iMRC2));
                MRC2.setForeground(Color.pink);
            break;
            case 20:
                RC2.setForeground(Color.black);
                RB2.setForeground(Color.black);
                
                RC3.setForeground(Color.red);
                RB3.setForeground(Color.blue);
                
                iMRC3 = obtenerResultado(iB2, iRC3, iC2, iRB3);
                MRC3.setText(Integer.toString(iMRC3));
                MRC3.setForeground(Color.pink);
            break;
            case 21:
                instruccionText.setText("Se utiliza la segunda matriz para los procedimientos. Se crea una nueva matriz.");
                backToBlack();
                swapMatriz();
                MA1.setText(MC3.getText());
                MB1.setText("0");
                MC1.setText("0");
                MA2.setText("0");
                MB2.setText(MC3.getText());
                MC2.setText("0");
                MA3.setText("0");
                MB3.setText("0");
                
                MRA1.setText("-");
                MRA2.setText("-");
                MRA3.setText("-");
                MRB1.setText("-");
                MRB2.setText("-");
                MRB3.setText("-");
                cambioPivotes();
                establecerInts();
            break;
            case 22:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                C3.setForeground(Color.red);
                A3.setForeground(Color.blue);
                
                RA1.setForeground(Color.red);
                RC1.setForeground(Color.blue);
                
                iMRA1 = obtenerResultado(iC3, iRA1, iA3, iRC1);
                MRA1.setText(Integer.toString(iMRA1));
                MRA1.setForeground(Color.pink);
            break;
            case 23:
                RA1.setForeground(Color.black);
                RC1.setForeground(Color.black);
                
                RA2.setForeground(Color.red);
                RC2.setForeground(Color.blue);
                
                iMRA2 = obtenerResultado(iC3, iRA2, iA3, iRC2);
                MRA2.setText(Integer.toString(iMRA2));
                MRA2.setForeground(Color.pink);
            break;
            case 24:
                RA2.setForeground(Color.black);
                RC2.setForeground(Color.black);
                
                RA3.setForeground(Color.red);
                RC3.setForeground(Color.blue);
                
                iMRA3 = obtenerResultado(iC3, iRA3, iA3, iRC3);
                MRA3.setText(Integer.toString(iMRA3));
                MRA3.setForeground(Color.pink);
            break;
            case 25:
                //CAMBIO A B
                RA3.setForeground(Color.black);
                RC3.setForeground(Color.black);
                A3.setForeground(Color.black);
                
                B3.setForeground(Color.blue);
                RB1.setForeground(Color.red);
                RC1.setForeground(Color.blue);
                
                iMRB1 = obtenerResultado(iC3, iRB1, iB3, iRC1);
                MRB1.setText(Integer.toString(iMRB1));
                MRB1.setForeground(Color.pink);
            break;
            case 26:
                RB1.setForeground(Color.black);
                RC1.setForeground(Color.black);
                
                RB2.setForeground(Color.red);
                RC2.setForeground(Color.blue);
                
                iMRB2 = obtenerResultado(iC3, iRB2, iB3, iRC2);
                MRB2.setText(Integer.toString(iMRB2));
                MRB2.setForeground(Color.pink);
            break;
            case 27:
                RB2.setForeground(Color.black);
                RC2.setForeground(Color.black);
                
                RB3.setForeground(Color.red);
                RC3.setForeground(Color.blue);
                
                iMRB3 = obtenerResultado(iC3, iRB3, iB3, iRC3);
                MRB3.setText(Integer.toString(iMRB3));
                MRB3.setForeground(Color.pink);
            break;
            case 28:
                instruccionText.setText("Se utiliza la segunda matriz para su examinación.");
                backToBlack();
                swapMatriz();
                allBlankInMirror();
            break;
            case 29:
                instruccionText.setText("Sumamos valores y dividimos por la determinante.");
                MA1.setText("1");
                MB2.setText("1");
                MC3.setText("1");
                MA2.setText("0");
                MA3.setText("0");
                MB1.setText("0");
                MB3.setText("0");
                MC1.setText("0");
                MC2.setText("0");
                
                establecerInts();
                resultadoFinal(iA1, iRA1, iRA2, iRA3,
                        iB2, iRB1, iRB2, iRB3,
                        iC3, iRC1, iRC2, iRC3);
                MRA1.setText(Integer.toString(x));
                MRB2.setText(Integer.toString(y));
                MRC3.setText(Integer.toString(z));
                MRA2.setText(" ");
                MRA3.setText(" ");
                MRB1.setText(" ");
                MRB3.setText(" ");
                MRC1.setText(" ");
                MRC2.setText(" ");
            break;
            case 30:
                instruccionText.setText("¡El resultado de X1 es " + x + ", X2 es " + y + ", X3 es " + z + "!");
                MRA1.setForeground(Color.pink);
                MRB2.setForeground(Color.pink);
                MRC3.setForeground(Color.pink);
            break;
        }
    }
    
    public void backToBlack() {
        A1.setForeground(Color.black);
        A2.setForeground(Color.black);
        A3.setForeground(Color.black);
        B1.setForeground(Color.black);
        B2.setForeground(Color.black);
        B3.setForeground(Color.black);
        C1.setForeground(Color.black);
        C2.setForeground(Color.black);
        C3.setForeground(Color.black);
        RA1.setForeground(Color.black);
        RA2.setForeground(Color.black);
        RA3.setForeground(Color.black);
        RB1.setForeground(Color.black);
        RB2.setForeground(Color.black);
        RB3.setForeground(Color.black);
        RC1.setForeground(Color.black);
        RC2.setForeground(Color.black);
        RC3.setForeground(Color.black);
        
        MA1.setForeground(Color.black);
        MA2.setForeground(Color.black);
        MA3.setForeground(Color.black);
        MB1.setForeground(Color.black);
        MB2.setForeground(Color.black);
        MB3.setForeground(Color.black);
        MC1.setForeground(Color.black);
        MC2.setForeground(Color.black);
        MC3.setForeground(Color.black);
        MRA1.setForeground(Color.black);
        MRA2.setForeground(Color.black);
        MRA3.setForeground(Color.black);
        MRB1.setForeground(Color.black);
        MRB2.setForeground(Color.black);
        MRB3.setForeground(Color.black);
        MRC1.setForeground(Color.black);
        MRC2.setForeground(Color.black);
        MRC3.setForeground(Color.black);
    }
    
    public void allBlankInMirror() {
        MA1.setText("-");
        MA2.setText("-");
        MA3.setText("-");
        MB1.setText("-");
        MB2.setText("-");
        MB3.setText("-");
        MC1.setText("-");
        MC2.setText("-");
        MC3.setText("-");
        MRA1.setText("-");
        MRA2.setText("-");
        MRA3.setText("-");
        MRB1.setText("-");
        MRB2.setText("-");
        MRB3.setText("-");
        MRC1.setText("-");
        MRC2.setText("-");
        MRC3.setText("-");
    }
    
    public void swapMatriz() {
        A1.setText(MA1.getText());
        A2.setText(MA2.getText());
        A3.setText(MA3.getText());
        B1.setText(MB1.getText());
        B2.setText(MB2.getText());
        B3.setText(MB3.getText());
        C1.setText(MC1.getText());
        C2.setText(MC2.getText());
        C3.setText(MC3.getText());
        
        RA1.setText(MRA1.getText());
        RA2.setText(MRA2.getText());
        RA3.setText(MRA3.getText());
        RB1.setText(MRB1.getText());
        RB2.setText(MRB2.getText());
        RB3.setText(MRB3.getText());
        RC1.setText(MRC1.getText());
        RC2.setText(MRC2.getText());
        RC3.setText(MRC3.getText());
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
        iA3 = Integer.parseInt(A3.getText());
        iB1 = Integer.parseInt(B1.getText());
        iB2 = Integer.parseInt(B2.getText());
        iB3 = Integer.parseInt(B3.getText());
        iC1 = Integer.parseInt(C1.getText());
        iC2 = Integer.parseInt(C2.getText());
        iC3 = Integer.parseInt(C3.getText());
        iRA1 = Integer.parseInt(RA1.getText());
        iRA2 = Integer.parseInt(RA2.getText());
        iRA3 = Integer.parseInt(RA3.getText());
        iRB1 = Integer.parseInt(RB1.getText());
        iRB2 = Integer.parseInt(RB2.getText());
        iRB3 = Integer.parseInt(RB3.getText());
        iRC1 = Integer.parseInt(RC1.getText());
        iRC2 = Integer.parseInt(RC2.getText());
        iRC3 = Integer.parseInt(RC3.getText());
        
        pAnt = Integer.parseInt(pivAntLabel.getText());
    }
    
    public int obtenerResultado(int a, int b, int c, int d) {
        int resultado = (((a)*(b)) - ((c)*(d))) / pAnt;
        
        return resultado;
    }
    
    public void resultadoFinal(int a, int ra1, int ra2, int ra3,
            int b, int rb1, int rb2, int rb3,
            int c, int rc1, int rc2, int rc3) {
        x = (ra1 + ra2 + ra3) / a; 
        y = (rb1 + rb2 + rb3) / b; 
        z = (rc1 + rc2 + rc3) / c; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pivAntLabel = new javax.swing.JLabel();
        MRA3 = new javax.swing.JLabel();
        pivActLabel = new javax.swing.JLabel();
        MRB3 = new javax.swing.JLabel();
        MA1 = new javax.swing.JLabel();
        MA2 = new javax.swing.JLabel();
        MC1 = new javax.swing.JLabel();
        MC2 = new javax.swing.JLabel();
        MRA1 = new javax.swing.JLabel();
        MC3 = new javax.swing.JLabel();
        SigPaso = new javax.swing.JButton();
        MRC1 = new javax.swing.JLabel();
        MB1 = new javax.swing.JLabel();
        MRC2 = new javax.swing.JLabel();
        OmiPaso = new javax.swing.JButton();
        MRC3 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        MRA2 = new javax.swing.JLabel();
        MRB1 = new javax.swing.JLabel();
        MB2 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        RA1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        MRB2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        RA2 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        RC1 = new javax.swing.JLabel();
        RB1 = new javax.swing.JLabel();
        RC2 = new javax.swing.JLabel();
        RB2 = new javax.swing.JLabel();
        RC3 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        RA3 = new javax.swing.JLabel();
        instruccionText = new javax.swing.JTextField();
        RB3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MA3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MB3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        pivAntLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pivAntLabel.setText("1");

        MRA3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA3.setText("0");

        pivActLabel.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        pivActLabel.setText("0");

        MRB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB3.setText("0");

        MA1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA1.setText("0");

        MA2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA2.setText("0");

        MC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC1.setText("0");

        MC2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC2.setText("0");

        MRA1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA1.setText("0");

        MC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC3.setText("0");

        SigPaso.setText("Siguiente Paso");
        SigPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigPasoMouseClicked(evt);
            }
        });

        MRC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC1.setText("0");

        MB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB1.setText("0");

        MRC2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC2.setText("0");

        OmiPaso.setText("Omitir Pasos");
        OmiPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OmiPasoMouseClicked(evt);
            }
        });

        MRC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC3.setText("0");

        A1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A1.setText("0");

        MRA2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA2.setText("0");

        MRB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB1.setText("0");

        MB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB2.setText("0");

        A2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A2.setText("0");

        C1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C1.setText("0");

        RA1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA1.setText("0");

        C2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C2.setText("0");

        MRB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB2.setText("0");

        C3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C3.setText("0");

        B1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B1.setText("0");

        A3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A3.setText("0");

        RA2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA2.setText("0");

        B2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B2.setText("0");

        B3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B3.setText("0");

        RC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC1.setText("0");

        RB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB1.setText("0");

        RC2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC2.setText("0");

        RB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB2.setText("0");

        RC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC3.setText("0");

        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        RA3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA3.setText("0");

        instruccionText.setEditable(false);
        instruccionText.setText("Se empieza el procedimiento.");

        RB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB3.setText("0");

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setText("Pivote Actual:");

        MA3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA3.setText("0");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel2.setText("Pivote Anterior:");

        MB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB3.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(pivAntLabel)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(pivActLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RB1)
                                    .addComponent(RA1)
                                    .addComponent(RC1))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RB2)
                                    .addComponent(RA2)
                                    .addComponent(RC2))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RC3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RB3)
                                        .addComponent(RA3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C1)
                                    .addComponent(B1)
                                    .addComponent(A1))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(C2)
                                        .addGap(30, 30, 30)
                                        .addComponent(C3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B2)
                                            .addComponent(A2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B3)
                                            .addComponent(A3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MB1)
                                    .addComponent(MA1))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MB2)
                                    .addComponent(MA2))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MB3)
                                    .addComponent(MA3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MC1)
                                .addGap(29, 29, 29)
                                .addComponent(MC2)
                                .addGap(29, 29, 29)
                                .addComponent(MC3)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MRB1)
                            .addComponent(MRA1)
                            .addComponent(MRC1))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MRC2)
                    .addComponent(MRB2)
                    .addComponent(MRA2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MRB3)
                    .addComponent(MRA3)
                    .addComponent(MRC3))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SigPaso)
                        .addGap(18, 18, 18)
                        .addComponent(OmiPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(regresarButton)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MRA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MRB3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MRC3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MA1)
                                    .addComponent(MA2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MB1)
                                    .addComponent(MB2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MRA1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MRB1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MB3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MC1)
                                    .addComponent(MC2))
                                .addComponent(MC3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MRC1)
                                .addComponent(MRC2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MRA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MRB2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RA1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RC1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RA2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RC2)
                            .addComponent(RC3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C2)
                            .addComponent(C3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(pivAntLabel)
                    .addComponent(pivActLabel))
                .addGap(41, 41, 41)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigPaso)
                    .addComponent(OmiPaso)
                    .addComponent(regresarButton))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        Variables3x3 b = new Variables3x3();
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
        for(int i=paso;paso <= 30;paso++) {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pivActLabel;
    private javax.swing.JLabel pivAntLabel;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
