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
public class RVar4x4 extends javax.swing.JFrame {

    /**
     * Creates new form RVar4x4
     */
    public RVar4x4() {
        initComponents();
    }
    
    public RVar4x4(String cA1, String cA2, String cA3, String cA4, String cRA,
            String cB1, String cB2, String cB3, String cB4, String cRB,
            String cC1, String cC2, String cC3, String cC4, String cRC,
            String cD1, String cD2, String cD3, String cD4, String cRD) {
        initComponents();
        A1.setText(cA1);
        A2.setText(cA2);
        A3.setText(cA3);
        A4.setText(cA4);
        RA1.setText(cRA);
        B1.setText(cB1);
        B2.setText(cB2);
        B3.setText(cB3);
        B4.setText(cB4);
        RB2.setText(cRB);
        C1.setText(cC1);
        C2.setText(cC2);
        C3.setText(cC3);
        C4.setText(cC4);
        RC3.setText(cRC);
        D1.setText(cD1);
        D2.setText(cD2);
        D3.setText(cD3);
        D4.setText(cD4);
        RD4.setText(cRD);
        
        pivActLabel.setText(A1.getText());
        pAct = Integer.parseInt(A1.getText());
    }
    
    int iA1, iA2, iA3, iA4, iRA1, iRA2, iRA3, iRA4, 
            iB1, iB2, iB3, iB4, iRB1, iRB2, iRB3, iRB4,
            iC1, iC2, iC3, iC4, iRC1, iRC2, iRC3, iRC4,
            iD1, iD2, iD3, iD4, iRD1, iRD2, iRD3, iRD4,
            iMA1, iMA2, iMA3, iMA4, iMRA1, iMRA2, iMRA3, iMRA4, 
            iMB1, iMB2, iMB3, iMB4, iMRB1, iMRB2, iMRB3, iMRB4,
            iMC1, iMC2, iMC3, iMC4, iMRC1, iMRC2, iMRC3, iMRC4,
            iMD1, iMD2, iMD3, iMD4, iMRD1, iMRD2, iMRD3, iMRD4;
    int pAnt, pAct;
    int paso=0;
    
    int x, y, z, w;
    
    public void procedimiento(int paso) {
        switch(paso) {
            case 1:
                instruccionText.setText("Prepara la otra matriz a trabajar.");
                MA1.setText(A1.getText());
                MA2.setText(A2.getText());
                MA3.setText(A3.getText());
                MA4.setText(A4.getText());
                MRA1.setText(RA1.getText());
                MRA2.setText(RA2.getText());
                MRA3.setText(RA3.getText());
                MRA4.setText(RA4.getText());
                MB1.setText("0");
                MB2.setText("-");
                MB3.setText("-");
                MB4.setText("-");
                MRB1.setText("-");
                MRB2.setText("-");
                MRB3.setText("-");
                MRB4.setText("-");
                MC1.setText("0");
                MC2.setText("-");
                MC3.setText("-");
                MC4.setText("-");
                MRC1.setText("-");
                MRC2.setText("-");
                MRC3.setText("-");
                MRC4.setText("-");
                MD1.setText("0");
                MD2.setText("-");
                MD3.setText("-");
                MD4.setText("-");
                MRD1.setText("-");
                MRD2.setText("-");
                MRD3.setText("-");
                MRD4.setText("-");
                establecerInts();
            break;
            case 2:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
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
                
                B4.setForeground(Color.red);
                A4.setForeground(Color.blue);
                
                iMB4 = obtenerResultado(iA1, iB4, iB1, iA4);
                MB4.setText(Integer.toString(iMB4));
                MB4.setForeground(Color.pink);
            break;
            case 5:
                B4.setForeground(Color.black);
                A4.setForeground(Color.black);
                
                RB1.setForeground(Color.red);
                RA1.setForeground(Color.blue);
                
                iMRB1 = obtenerResultado(iA1, iRB1, iB1, iRA1);
                MRB1.setText(Integer.toString(iMRB1));
                MRB1.setForeground(Color.pink);
            break;
            case 6:
                RB1.setForeground(Color.black);
                RA1.setForeground(Color.black);
                
                RB2.setForeground(Color.red);
                RA2.setForeground(Color.blue);
                
                iMRB2 = obtenerResultado(iA1, iRB2, iB1, iRA2);
                MRB2.setText(Integer.toString(iMRB2));
                MRB2.setForeground(Color.pink);
            break;
            case 7:
                RB2.setForeground(Color.black);
                RA2.setForeground(Color.black);
                
                RB3.setForeground(Color.red);
                RA3.setForeground(Color.blue);
                
                iMRB3 = obtenerResultado(iA1, iRB3, iB1, iRA3);
                MRB3.setText(Integer.toString(iMRB3));
                MRB3.setForeground(Color.pink);
            break;
            case 8:
                RB3.setForeground(Color.black);
                RA3.setForeground(Color.black);
                
                RB4.setForeground(Color.red);
                RA4.setForeground(Color.blue);
                
                iMRB4 = obtenerResultado(iA1, iRB4, iB1, iRA4);
                MRB4.setText(Integer.toString(iMRB4));
                MRB4.setForeground(Color.pink);
            break;
            case 9:
                RB4.setForeground(Color.black);
                RA4.setForeground(Color.black);
                
                RB4.setForeground(Color.red);
                RA4.setForeground(Color.blue);
                
                iMRB4 = obtenerResultado(iA1, iRB4, iB1, iRA4);
                MRB4.setText(Integer.toString(iMRB4));
                MRB4.setForeground(Color.pink);
            break;
            case 10:
                //CAMBIO A C
                RB4.setForeground(Color.black);
                RA4.setForeground(Color.black);
                B1.setForeground(Color.black);
                
                C1.setForeground(Color.blue);
                C2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                iMC2 = obtenerResultado(iA1, iC2, iC1, iA2);
                MC2.setText(Integer.toString(iMC2));
                MC2.setForeground(Color.pink);
            break;
            case 11:
                C2.setForeground(Color.black);
                A2.setForeground(Color.black);
                
                C3.setForeground(Color.red);
                A3.setForeground(Color.blue);
                
                iMC3 = obtenerResultado(iA1, iC3, iC1, iA3);
                MC3.setText(Integer.toString(iMC3));
                MC3.setForeground(Color.pink);
            break;
            case 12:
                C3.setForeground(Color.black);
                A3.setForeground(Color.black);
                
                C4.setForeground(Color.red);
                A4.setForeground(Color.blue);
                
                iMC4 = obtenerResultado(iA1, iC4, iC1, iA4);
                MC4.setText(Integer.toString(iMC4));
                MC4.setForeground(Color.pink);
            break;
            case 13:
                C4.setForeground(Color.black);
                A4.setForeground(Color.black);
                
                RC1.setForeground(Color.red);
                RA1.setForeground(Color.blue);
                
                iMRC1 = obtenerResultado(iA1, iRC1, iC1, iRA1);
                MRC1.setText(Integer.toString(iMRC1));
                MRC1.setForeground(Color.pink);
            break;
            case 14:
                RC1.setForeground(Color.black);
                RA1.setForeground(Color.black);
                
                RC2.setForeground(Color.red);
                RA2.setForeground(Color.blue);
                
                iMRC2 = obtenerResultado(iA1, iRC2, iC1, iRA2);
                MRC2.setText(Integer.toString(iMRC2));
                MRC2.setForeground(Color.pink);
            break;
            case 15:
                RC2.setForeground(Color.black);
                RA2.setForeground(Color.black);
                
                RC3.setForeground(Color.red);
                RA3.setForeground(Color.blue);
                
                iMRC3 = obtenerResultado(iA1, iRC3, iC1, iRA3);
                MRC3.setText(Integer.toString(iMRC3));
                MRC3.setForeground(Color.pink);
            break;
            case 16:
                RC3.setForeground(Color.black);
                RA3.setForeground(Color.black);
                
                RC4.setForeground(Color.red);
                RA4.setForeground(Color.blue);
                
                iMRC4 = obtenerResultado(iA1, iRC4, iC1, iRA4);
                MRC4.setText(Integer.toString(iMRC4));
                MRC4.setForeground(Color.pink);
            break;
            case 17:
                //CAMBIO A D
                RC4.setForeground(Color.black);
                RA4.setForeground(Color.black);
                C1.setForeground(Color.black);
                
                D1.setForeground(Color.blue);
                D2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                iMD2 = obtenerResultado(iA1, iD2, iD1, iA2);
                MD2.setText(Integer.toString(iMD2));
                MD2.setForeground(Color.pink);
            break;
            case 18:
                D2.setForeground(Color.black);
                A2.setForeground(Color.black);
                
                D3.setForeground(Color.red);
                A3.setForeground(Color.blue);
                
                iMD3 = obtenerResultado(iA1, iD3, iD1, iA3);
                MD3.setText(Integer.toString(iMD3));
                MD3.setForeground(Color.pink);
            break;
            case 19:
                D3.setForeground(Color.black);
                A3.setForeground(Color.black);
                
                D4.setForeground(Color.red);
                A4.setForeground(Color.blue);
                
                iMD4 = obtenerResultado(iA1, iD4, iD1, iA4);
                MD4.setText(Integer.toString(iMD4));
                MD4.setForeground(Color.pink);
            break;
            case 20:
                D4.setForeground(Color.black);
                A4.setForeground(Color.black);
                
                RD1.setForeground(Color.red);
                RA1.setForeground(Color.blue);
                
                iMRD1 = obtenerResultado(iA1, iRD1, iD1, iRA1);
                MRD1.setText(Integer.toString(iMRD1));
                MRD1.setForeground(Color.pink);
            break;
            case 21:
                RD1.setForeground(Color.black);
                RA1.setForeground(Color.black);
                
                RD2.setForeground(Color.red);
                RA2.setForeground(Color.blue);
                
                iMRD2 = obtenerResultado(iA1, iRD2, iD1, iRA2);
                MRD2.setText(Integer.toString(iMRD2));
                MRD2.setForeground(Color.pink);
            break;
            case 22:
                RD2.setForeground(Color.black);
                RA2.setForeground(Color.black);
                
                RD3.setForeground(Color.red);
                RA3.setForeground(Color.blue);
                
                iMRD3 = obtenerResultado(iA1, iRD3, iD1, iRA3);
                MRD3.setText(Integer.toString(iMRD3));
                MRD3.setForeground(Color.pink);
            break;
            case 23:
                RD3.setForeground(Color.black);
                RA3.setForeground(Color.black);
                
                RD4.setForeground(Color.red);
                RA4.setForeground(Color.blue);
                
                iMRD4 = obtenerResultado(iA1, iRD4, iD1, iRA4);
                MRD4.setText(Integer.toString(iMRD4));
                MRD4.setForeground(Color.pink);
            break;
            case 24:
                instruccionText.setText("Se utiliza la segunda matriz para los procedimientos. Se crea una nueva matriz.");
                backToBlack();
                swapMatriz();
                MA1.setText(MB2.getText());
                MB1.setText("0");
                MC1.setText("0");
                MD1.setText("0");
                MA2.setText("0");
                MC2.setText("0");
                MD2.setText("0");
                
                MA3.setText("-");
                MA4.setText("-");
                MRA1.setText("-");
                MRA2.setText("-");
                MRA3.setText("-");
                MRA4.setText("-");
                MC3.setText("-");
                MC4.setText("-");
                MRC1.setText("-");
                MRC2.setText("-");
                MRC3.setText("-");
                MRC4.setText("-");
                MD3.setText("-");
                MD4.setText("-");
                MRD1.setText("-");
                MRD2.setText("-");
                MRD3.setText("-");
                MRD4.setText("-");
                cambioPivotes();
                establecerInts();
            break;
            case 25:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                B2.setForeground(Color.red);
                A2.setForeground(Color.blue);
                
                A3.setForeground(Color.red);
                B3.setForeground(Color.blue);
                
                iMA3 = obtenerResultado(iB2, iA3, iA2, iB3);
                MA3.setText(Integer.toString(iMA3));
                MA3.setForeground(Color.pink);
            break;
            case 26:
                A3.setForeground(Color.black);
                B3.setForeground(Color.black);
                
                A4.setForeground(Color.red);
                B4.setForeground(Color.blue);
                
                iMA4 = obtenerResultado(iB2, iA4, iA2, iB4);
                MA4.setText(Integer.toString(iMA4));
                MA4.setForeground(Color.pink);
            break;
            case 27:
                A4.setForeground(Color.black);
                B4.setForeground(Color.black);
                
                RA1.setForeground(Color.red);
                RB1.setForeground(Color.blue);
                
                iMRA1 = obtenerResultado(iB2, iRA1, iA2, iRB1);
                MRA1.setText(Integer.toString(iMRA1));
                MRA1.setForeground(Color.pink);
            break;
            case 28:
                RA1.setForeground(Color.black);
                RB1.setForeground(Color.black);
                
                RA2.setForeground(Color.red);
                RB2.setForeground(Color.blue);
                
                iMRA2 = obtenerResultado(iB2, iRA2, iA2, iRB2);
                MRA2.setText(Integer.toString(iMRA2));
                MRA2.setForeground(Color.pink);
            break;
            case 29:
                RA2.setForeground(Color.black);
                RB2.setForeground(Color.black);
                
                RA3.setForeground(Color.red);
                RB3.setForeground(Color.blue);
                
                iMRA3 = obtenerResultado(iB2, iRA3, iA2, iRB3);
                MRA3.setText(Integer.toString(iMRA3));
                MRA3.setForeground(Color.pink);
            break;
            case 30:
                RA3.setForeground(Color.black);
                RB3.setForeground(Color.black);
                
                RA4.setForeground(Color.red);
                RB4.setForeground(Color.blue);
                
                iMRA4 = obtenerResultado(iB2, iRA4, iA2, iRB4);
                MRA4.setText(Integer.toString(iMRA4));
                MRA4.setForeground(Color.pink);
            break;
            case 31:
                //CAMBIO A C
                RA4.setForeground(Color.black);
                RB4.setForeground(Color.black);
                A2.setForeground(Color.black);
                
                C2.setForeground(Color.blue);
                C3.setForeground(Color.red);
                B3.setForeground(Color.blue);
                
                iMC3 = obtenerResultado(iB2, iC3, iC2, iB3);
                MC3.setText(Integer.toString(iMC3));
                MC3.setForeground(Color.pink);
            break;
            case 32:
                C3.setForeground(Color.black);
                B3.setForeground(Color.black);
                
                C4.setForeground(Color.red);
                B4.setForeground(Color.blue);
                
                iMC4 = obtenerResultado(iB2, iC4, iC2, iB4);
                MC4.setText(Integer.toString(iMC4));
                MC4.setForeground(Color.pink);
            break;
            case 33:
                C4.setForeground(Color.black);
                B4.setForeground(Color.black);
                
                RC1.setForeground(Color.red);
                RB1.setForeground(Color.blue);
                
                iMRC1 = obtenerResultado(iB2, iRC1, iC2, iRB1);
                MRC1.setText(Integer.toString(iMRC1));
                MRC1.setForeground(Color.pink);
            break;
            case 34:
                RC1.setForeground(Color.black);
                RB1.setForeground(Color.black);
                
                RC2.setForeground(Color.red);
                RB2.setForeground(Color.blue);
                
                iMRC2 = obtenerResultado(iB2, iRC2, iC2, iRB2);
                MRC2.setText(Integer.toString(iMRC2));
                MRC2.setForeground(Color.pink);
            break;
            case 35:
                RC2.setForeground(Color.black);
                RB2.setForeground(Color.black);
                
                RC3.setForeground(Color.red);
                RB3.setForeground(Color.blue);
                
                iMRC3 = obtenerResultado(iB2, iRC3, iC2, iRB3);
                MRC3.setText(Integer.toString(iMRC3));
                MRC3.setForeground(Color.pink);
            break;
            case 36:
                RC3.setForeground(Color.black);
                RB3.setForeground(Color.black);
                
                RC4.setForeground(Color.red);
                RB4.setForeground(Color.blue);
                
                iMRC4 = obtenerResultado(iB2, iRC4, iC2, iRB4);
                MRC4.setText(Integer.toString(iMRC4));
                MRC4.setForeground(Color.pink);
            break;
            case 37:
                //CAMBIO A D
                RC4.setForeground(Color.black);
                RB4.setForeground(Color.black);
                C1.setForeground(Color.black);
                
                D2.setForeground(Color.blue);
                D3.setForeground(Color.red);
                B3.setForeground(Color.blue);
                
                iMD3 = obtenerResultado(iB2, iD3, iD2, iB3);
                MD3.setText(Integer.toString(iMD3));
                MD3.setForeground(Color.pink);
            break;
            case 38:
                D3.setForeground(Color.black);
                B3.setForeground(Color.black);
                
                D4.setForeground(Color.red);
                B4.setForeground(Color.blue);
                
                iMD4 = obtenerResultado(iB2, iD4, iD2, iB4);
                MD4.setText(Integer.toString(iMD4));
                MD4.setForeground(Color.pink);
            break;
            case 39:
                D4.setForeground(Color.black);
                B4.setForeground(Color.black);
                
                RD1.setForeground(Color.red);
                RB1.setForeground(Color.blue);
                
                iMRD1 = obtenerResultado(iB2, iRD1, iD2, iRB1);
                MRD1.setText(Integer.toString(iMRD1));
                MRD1.setForeground(Color.pink);
            break;
            case 40:
                RD1.setForeground(Color.black);
                RB1.setForeground(Color.black);
                
                RD2.setForeground(Color.red);
                RB2.setForeground(Color.blue);
                
                iMRD2 = obtenerResultado(iB2, iRD2, iD2, iRB2);
                MRD2.setText(Integer.toString(iMRD2));
                MRD2.setForeground(Color.pink);
            break;
            case 41:
                RD2.setForeground(Color.black);
                RB2.setForeground(Color.black);
                
                RD3.setForeground(Color.red);
                RB3.setForeground(Color.blue);
                
                iMRD3 = obtenerResultado(iB2, iRD3, iD2, iRB3);
                MRD3.setText(Integer.toString(iMRD3));
                MRD3.setForeground(Color.pink);
            break;
            case 42:
                RD3.setForeground(Color.black);
                RB3.setForeground(Color.black);
                
                RD4.setForeground(Color.red);
                RB4.setForeground(Color.blue);
                
                iMRD4 = obtenerResultado(iB2, iRD4, iD2, iRB4);
                MRD4.setText(Integer.toString(iMRD4));
                MRD4.setForeground(Color.pink);
            break;
            case 43:
                instruccionText.setText("Se utiliza la segunda matriz para los procedimientos. Se crea una nueva matriz.");
                backToBlack();
                swapMatriz();
                MA1.setText(MC3.getText());
                MB1.setText("0");
                MC1.setText("0");
                MD1.setText("0");
                MA2.setText("0");
                MB2.setText(MC3.getText());
                MC2.setText("0");
                MD2.setText("0");
                MA3.setText("0");
                MB3.setText("0");
                MD3.setText("0");
                
                MA4.setText("-");
                MB4.setText("-");
                MD4.setText("-");
                MRA1.setText("-");
                MRB1.setText("-");
                MRD1.setText("-");
                MRA2.setText("-");
                MRB2.setText("-");
                MRD2.setText("-");
                MRA3.setText("-");
                MRB3.setText("-");
                MRD3.setText("-");
                MRA4.setText("-");
                MRB4.setText("-");
                MRD4.setText("-");
                cambioPivotes();
                establecerInts();
            break;
            case 44:
                C3.setForeground(Color.red);
                A3.setForeground(Color.blue);
                
                A4.setForeground(Color.red);
                C4.setForeground(Color.blue);
                
                iMA4 = obtenerResultado(iC3, iA4, iA3, iC4);
                MA4.setText(Integer.toString(iMA4));
                MA4.setForeground(Color.pink);
            break;
            case 45:
                A4.setForeground(Color.black);
                C4.setForeground(Color.black);
                
                RA1.setForeground(Color.red);
                RC1.setForeground(Color.blue);
                
                iMRA1 = obtenerResultado(iC3, iRA1, iA3, iRC1);
                MRA1.setText(Integer.toString(iMRA1));
                MRA1.setForeground(Color.pink);
            break;
            case 46:
                RA1.setForeground(Color.black);
                RC1.setForeground(Color.black);
                
                RA2.setForeground(Color.red);
                RC2.setForeground(Color.blue);
                
                iMRA2 = obtenerResultado(iC3, iRA2, iA3, iRC2);
                MRA2.setText(Integer.toString(iMRA2));
                MRA2.setForeground(Color.pink);
            break;
            case 47:
                RA2.setForeground(Color.black);
                RC2.setForeground(Color.black);
                
                RA3.setForeground(Color.red);
                RC3.setForeground(Color.blue);
                
                iMRA3 = obtenerResultado(iC3, iRA3, iA3, iRC3);
                MRA3.setText(Integer.toString(iMRA3));
                MRA3.setForeground(Color.pink);
            break;
            case 48:
                RA3.setForeground(Color.black);
                RC3.setForeground(Color.black);
                
                RA4.setForeground(Color.red);
                RC4.setForeground(Color.blue);
                
                iMRA4 = obtenerResultado(iC3, iRA4, iA3, iRC4);
                MRA4.setText(Integer.toString(iMRA4));
                MRA4.setForeground(Color.pink);
            break;
            case 49:
                //CAMBIO A B
                RA4.setForeground(Color.black);
                RC4.setForeground(Color.black);
                A3.setForeground(Color.black);
                
                B3.setForeground(Color.blue);
                B4.setForeground(Color.red);
                C4.setForeground(Color.blue);
                
                iMB4 = obtenerResultado(iC3, iB4, iB3, iC4);
                MB4.setText(Integer.toString(iMB4));
                MB4.setForeground(Color.pink);
            break;
            case 50:
                B4.setForeground(Color.black);
                C4.setForeground(Color.black);
                
                RB1.setForeground(Color.red);
                RC1.setForeground(Color.blue);
                
                iMRB1 = obtenerResultado(iC3, iRB1, iB3, iRC1);
                MRB1.setText(Integer.toString(iMRB1));
                MRB1.setForeground(Color.pink);
            break;
            case 51:
                RB1.setForeground(Color.black);
                RC1.setForeground(Color.black);
                
                RB2.setForeground(Color.red);
                RC2.setForeground(Color.blue);
                
                iMRB2 = obtenerResultado(iC3, iRB2, iB3, iRC2);
                MRB2.setText(Integer.toString(iMRB2));
                MRB2.setForeground(Color.pink);
            break;
            case 52:
                RB2.setForeground(Color.black);
                RC2.setForeground(Color.black);
                
                RB3.setForeground(Color.red);
                RC3.setForeground(Color.blue);
                
                iMRB3 = obtenerResultado(iC3, iRB3, iB3, iRC3);
                MRB3.setText(Integer.toString(iMRB3));
                MRB3.setForeground(Color.pink);
            break;
            case 53:
                RB3.setForeground(Color.black);
                RC3.setForeground(Color.black);
                
                RB4.setForeground(Color.red);
                RC4.setForeground(Color.blue);
                
                iMRB4 = obtenerResultado(iC3, iRB4, iB3, iRC4);
                MRB4.setText(Integer.toString(iMRB4));
                MRB4.setForeground(Color.pink);
            break;
            case 54:
                //CAMBIO A D
                RB4.setForeground(Color.black);
                RC4.setForeground(Color.black);
                B1.setForeground(Color.black);
                
                D3.setForeground(Color.blue);
                D4.setForeground(Color.red);
                C4.setForeground(Color.blue);
                
                iMD4 = obtenerResultado(iC3, iD4, iD3, iC4);
                MD4.setText(Integer.toString(iMD4));
                MD4.setForeground(Color.pink);
            break;
            case 55:
                D4.setForeground(Color.black);
                C4.setForeground(Color.black);
                
                RD1.setForeground(Color.red);
                RC1.setForeground(Color.blue);
                
                iMRD1 = obtenerResultado(iC3, iRD1, iD3, iRC1);
                MRD1.setText(Integer.toString(iMRD1));
                MRD1.setForeground(Color.pink);
            break;
            case 56:
                RD1.setForeground(Color.black);
                RC1.setForeground(Color.black);
                
                RD2.setForeground(Color.red);
                RC2.setForeground(Color.blue);
                
                iMRD2 = obtenerResultado(iC3, iRD2, iD3, iRC2);
                MRD2.setText(Integer.toString(iMRD2));
                MRD2.setForeground(Color.pink);
            break;
            case 57:
                RD2.setForeground(Color.black);
                RC2.setForeground(Color.black);
                
                RD3.setForeground(Color.red);
                RC3.setForeground(Color.blue);
                
                iMRD3 = obtenerResultado(iC3, iRD3, iD3, iRC3);
                MRD3.setText(Integer.toString(iMRD3));
                MRD3.setForeground(Color.pink);
            break;
            case 58:
                RD3.setForeground(Color.black);
                RC3.setForeground(Color.black);
                
                RD4.setForeground(Color.red);
                RC4.setForeground(Color.blue);
                
                iMRD4 = obtenerResultado(iC3, iRD4, iD3, iRC4);
                MRD4.setText(Integer.toString(iMRD4));
                MRD4.setForeground(Color.pink);
            break;
            case 59:
                instruccionText.setText("Se utiliza la segunda matriz para los procedimientos. Se crea una nueva matriz.");
                backToBlack();
                swapMatriz();
                MA1.setText(MD4.getText());
                MA2.setText("0");
                MA3.setText("0");
                MA4.setText("0");
                MB1.setText("0");
                MB2.setText(MD4.getText());
                MB3.setText("0");
                MB4.setText("0");
                MC1.setText("0");
                MC2.setText("0");
                MC3.setText(MD4.getText());
                MC4.setText("0");
                MD1.setText("0");
                MD2.setText("0");
                MD3.setText("0");
                
                MRA1.setText("-");
                MRA2.setText("-");
                MRA3.setText("-");
                MRA4.setText("-");
                MRB1.setText("-");
                MRB2.setText("-");
                MRB3.setText("-");
                MRB3.setText("-");
                MRC1.setText("-");
                MRC2.setText("-");
                MRC3.setText("-");
                MRC4.setText("-");
                cambioPivotes();
                establecerInts();
            break;
            case 60:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                D4.setForeground(Color.red);
                A4.setForeground(Color.blue);
                
                RA1.setForeground(Color.red);
                RD1.setForeground(Color.blue);
                
                iMRA1 = obtenerResultado(iD4, iRA1, iA4, iRD1);
                MRA1.setText(Integer.toString(iMRA1));
                MRA1.setForeground(Color.pink);
            break;
            case 61:
                instruccionText.setText("Multiplica los rojos y azules, resta, y divide entre pivote anterior.");
                RA1.setForeground(Color.black);
                RD1.setForeground(Color.black);
                
                RA2.setForeground(Color.red);
                RD2.setForeground(Color.blue);
                
                iMRA2 = obtenerResultado(iD4, iRA2, iA4, iRD2);
                MRA2.setText(Integer.toString(iMRA2));
                MRA2.setForeground(Color.pink);
            break;
            case 62:
                RA2.setForeground(Color.black);
                RD2.setForeground(Color.black);
                
                RA3.setForeground(Color.red);
                RD3.setForeground(Color.blue);
                
                iMRA3 = obtenerResultado(iD4, iRA3, iA4, iRD3);
                MRA3.setText(Integer.toString(iMRA3));
                MRA3.setForeground(Color.pink);
            break;
            case 63:
                RA3.setForeground(Color.black);
                RD3.setForeground(Color.black);
                
                RA4.setForeground(Color.red);
                RD4.setForeground(Color.blue);
                
                iMRA4 = obtenerResultado(iD4, iRA4, iA4, iRD4);
                MRA4.setText(Integer.toString(iMRA4));
                MRA4.setForeground(Color.pink);
            break;
            case 64:
                //CAMBIO A B
                RA4.setForeground(Color.black);
                RD4.setForeground(Color.black);
                A4.setForeground(Color.black);
                
                B4.setForeground(Color.blue);
                RB1.setForeground(Color.red);
                RD1.setForeground(Color.blue);
                
                iMRB1 = obtenerResultado(iD4, iRB1, iB4, iRD1);
                MRB1.setText(Integer.toString(iMRB1));
                MRB1.setForeground(Color.pink);
            break;
            case 65:
                RB1.setForeground(Color.black);
                RD1.setForeground(Color.black);
                
                RB2.setForeground(Color.red);
                RD2.setForeground(Color.blue);
                
                iMRB2 = obtenerResultado(iD4, iRB2, iB4, iRD2);
                MRB2.setText(Integer.toString(iMRB2));
                MRB2.setForeground(Color.pink);
            break;
            case 66:
                RB2.setForeground(Color.black);
                RD2.setForeground(Color.black);
                
                RB3.setForeground(Color.red);
                RD3.setForeground(Color.blue);
                
                iMRB3 = obtenerResultado(iD4, iRB3, iB4, iRD3);
                MRB3.setText(Integer.toString(iMRB3));
                MRB3.setForeground(Color.pink);
            break;
            case 67:
                RB3.setForeground(Color.black);
                RD3.setForeground(Color.black);
                
                RB4.setForeground(Color.red);
                RD4.setForeground(Color.blue);
                
                iMRB4 = obtenerResultado(iD4, iRB4, iB4, iRD4);
                MRB4.setText(Integer.toString(iMRB4));
                MRB4.setForeground(Color.pink);
            break;
            case 68:
                //CAMBIO A C
                RB4.setForeground(Color.black);
                RD4.setForeground(Color.black);
                B4.setForeground(Color.black);
                
                C4.setForeground(Color.red);
                RC1.setForeground(Color.red);
                RD1.setForeground(Color.blue);
                
                iMRC1 = obtenerResultado(iD4, iRC1, iC4, iRD1);
                MRC1.setText(Integer.toString(iMRC1));
                MRC1.setForeground(Color.pink);
            break;
            case 69:
                RC1.setForeground(Color.black);
                RD1.setForeground(Color.black);
                
                RC2.setForeground(Color.red);
                RD2.setForeground(Color.blue);
                
                iMRC2 = obtenerResultado(iD4, iRC2, iC4, iRD2);
                MRC2.setText(Integer.toString(iMRC2));
                MRC2.setForeground(Color.pink);
            break;
            case 70:
                RC2.setForeground(Color.black);
                RD2.setForeground(Color.black);
                
                RC3.setForeground(Color.red);
                RD3.setForeground(Color.blue);
                
                iMRC3 = obtenerResultado(iD4, iRC3, iC4, iRD3);
                MRC3.setText(Integer.toString(iMRC3));
                MRC3.setForeground(Color.pink);
            break;
            case 71:
                RC3.setForeground(Color.black);
                RD3.setForeground(Color.black);
                
                RC4.setForeground(Color.red);
                RD4.setForeground(Color.blue);
                
                iMRC4 = obtenerResultado(iD4, iRC4, iC4, iRD4);
                MRC4.setText(Integer.toString(iMRC4));
                MRC4.setForeground(Color.pink);
            break;
            case 72:
                instruccionText.setText("Se utiliza la segunda matriz para su examinación.");
                backToBlack();
                swapMatriz();
                allBlankInMirror();
            break;
            case 73:
                instruccionText.setText("Sumamos valores y dividimos por la determinante.");
                MA1.setText("1");
                MB2.setText("1");
                MC3.setText("1");
                MD4.setText("1");
                MA2.setText("0");
                MA3.setText("0");
                MA4.setText("0");
                MB1.setText("0");
                MB3.setText("0");
                MB4.setText("0");
                MC1.setText("0");
                MC2.setText("0");
                MC4.setText("0");
                MD1.setText("0");
                MD2.setText("0");
                MD3.setText("0");
                
                establecerInts();
                resultadoFinal(iA1, iRA1, iRA2, iRA3, iRA4,
                        iB2, iRB1, iRB2, iRB3, iRB4,
                        iC3, iRC1, iRC2, iRC3, iRC4,
                        iD4, iRD1, iRD2, iRD3, iRD4);
                MRA1.setText(Integer.toString(x));
                MRB2.setText(Integer.toString(y));
                MRC3.setText(Integer.toString(z));
                MRD4.setText(Integer.toString(w));
                MRA2.setText(" ");
                MRA3.setText(" ");
                MRA4.setText(" ");
                MRB1.setText(" ");
                MRB3.setText(" ");
                MRB4.setText(" ");
                MRC1.setText(" ");
                MRC2.setText(" ");
                MRC4.setText(" ");
                MRD1.setText(" ");
                MRD2.setText(" ");
                MRD3.setText(" ");
            break;
            case 74:
                instruccionText.setText("¡El resultado de X1 es " + x + ", X2 es " + y + ", X3 es " + z + ", y X4 es " + w + "!");
                MRA1.setForeground(Color.pink);
                MRB2.setForeground(Color.pink);
                MRC3.setForeground(Color.pink);
                MRD4.setForeground(Color.pink);
            break;
        }
    }
    
    public void backToBlack() {
        A1.setForeground(Color.black);
        A2.setForeground(Color.black);
        A3.setForeground(Color.black);
        A4.setForeground(Color.black);
        B1.setForeground(Color.black);
        B2.setForeground(Color.black);
        B3.setForeground(Color.black);
        B4.setForeground(Color.black);
        C1.setForeground(Color.black);
        C2.setForeground(Color.black);
        C3.setForeground(Color.black);
        C4.setForeground(Color.black);
        D1.setForeground(Color.black);
        D2.setForeground(Color.black);
        D3.setForeground(Color.black);
        D4.setForeground(Color.black);
        RA1.setForeground(Color.black);
        RA2.setForeground(Color.black);
        RA3.setForeground(Color.black);
        RA4.setForeground(Color.black);
        RB1.setForeground(Color.black);
        RB2.setForeground(Color.black);
        RB3.setForeground(Color.black);
        RB4.setForeground(Color.black);
        RC1.setForeground(Color.black);
        RC2.setForeground(Color.black);
        RC3.setForeground(Color.black);
        RC4.setForeground(Color.black);
        RD1.setForeground(Color.black);
        RD2.setForeground(Color.black);
        RD3.setForeground(Color.black);
        RD4.setForeground(Color.black);
        
        MA1.setForeground(Color.black);
        MA2.setForeground(Color.black);
        MA3.setForeground(Color.black);
        MA4.setForeground(Color.black);
        MB1.setForeground(Color.black);
        MB2.setForeground(Color.black);
        MB3.setForeground(Color.black);
        MB4.setForeground(Color.black);
        MC1.setForeground(Color.black);
        MC2.setForeground(Color.black);
        MC3.setForeground(Color.black);
        MC4.setForeground(Color.black);
        MD1.setForeground(Color.black);
        MD2.setForeground(Color.black);
        MD3.setForeground(Color.black);
        MD4.setForeground(Color.black);
        MRA1.setForeground(Color.black);
        MRA2.setForeground(Color.black);
        MRA3.setForeground(Color.black);
        MRA4.setForeground(Color.black);
        MRB1.setForeground(Color.black);
        MRB2.setForeground(Color.black);
        MRB3.setForeground(Color.black);
        MRB4.setForeground(Color.black);
        MRC1.setForeground(Color.black);
        MRC2.setForeground(Color.black);
        MRC3.setForeground(Color.black);
        MRC4.setForeground(Color.black);
        MRD1.setForeground(Color.black);
        MRD2.setForeground(Color.black);
        MRD3.setForeground(Color.black);
        MRD4.setForeground(Color.black);
    }
    
    public void allBlankInMirror() {
        MA1.setText("-");
        MA2.setText("-");
        MA3.setText("-");
        MA4.setText("-");
        MRA1.setText("-");
        MRA2.setText("-");
        MRA3.setText("-");
        MRA4.setText("-");
        MB1.setText("-");
        MB2.setText("-");
        MB3.setText("-");
        MB4.setText("-");
        MRB1.setText("-");
        MRB2.setText("-");
        MRB3.setText("-");
        MRB4.setText("-");
        MC1.setText("-");
        MC2.setText("-");
        MC3.setText("-");
        MC4.setText("-");
        MRC1.setText("-");
        MRC2.setText("-");
        MRC3.setText("-");
        MRC4.setText("-");
        MD1.setText("-");
        MD2.setText("-");
        MD3.setText("-");
        MD4.setText("-");
        MRD1.setText("-");
        MRD2.setText("-");
        MRD3.setText("-");
        MRD4.setText("-");
    }
    
    public void swapMatriz() {
        A1.setText(MA1.getText());
        A2.setText(MA2.getText());
        A3.setText(MA3.getText());
        A4.setText(MA4.getText());
        B1.setText(MB1.getText());
        B2.setText(MB2.getText());
        B3.setText(MB3.getText());
        B4.setText(MB4.getText());
        C1.setText(MC1.getText());
        C2.setText(MC2.getText());
        C3.setText(MC3.getText());
        C4.setText(MC4.getText());
        D1.setText(MD1.getText());
        D2.setText(MD2.getText());
        D3.setText(MD3.getText());
        D4.setText(MD4.getText());
        
        RA1.setText(MRA1.getText());
        RA2.setText(MRA2.getText());
        RA3.setText(MRA3.getText());
        RA4.setText(MRA4.getText());
        RB1.setText(MRB1.getText());
        RB2.setText(MRB2.getText());
        RB3.setText(MRB3.getText());
        RB4.setText(MRB4.getText());
        RC1.setText(MRC1.getText());
        RC2.setText(MRC2.getText());
        RC3.setText(MRC3.getText());
        RC4.setText(MRC4.getText());
        RD1.setText(MRD1.getText());
        RD2.setText(MRD2.getText());
        RD3.setText(MRD3.getText());
        RD4.setText(MRD4.getText());
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
        iA4 = Integer.parseInt(A4.getText());
        iRA1 = Integer.parseInt(RA1.getText());
        iRA2 = Integer.parseInt(RA2.getText());
        iRA3 = Integer.parseInt(RA3.getText());
        iRA4 = Integer.parseInt(RA4.getText());
        iB1 = Integer.parseInt(B1.getText());
        iB2 = Integer.parseInt(B2.getText());
        iB3 = Integer.parseInt(B3.getText());
        iB4 = Integer.parseInt(B4.getText());
        iRB1 = Integer.parseInt(RB1.getText());
        iRB2 = Integer.parseInt(RB2.getText());
        iRB3 = Integer.parseInt(RB3.getText());
        iRB4 = Integer.parseInt(RB4.getText());
        iC1 = Integer.parseInt(C1.getText());
        iC2 = Integer.parseInt(C2.getText());
        iC3 = Integer.parseInt(C3.getText());
        iC4 = Integer.parseInt(C4.getText());
        iRC1 = Integer.parseInt(RC1.getText());
        iRC2 = Integer.parseInt(RC2.getText());
        iRC3 = Integer.parseInt(RC3.getText());
        iRC4 = Integer.parseInt(RC4.getText());
        iD1 = Integer.parseInt(D1.getText());
        iD2 = Integer.parseInt(D2.getText());
        iD3 = Integer.parseInt(D3.getText());
        iD4 = Integer.parseInt(D4.getText());
        iRD1 = Integer.parseInt(RD1.getText());
        iRD2 = Integer.parseInt(RD2.getText());
        iRD3 = Integer.parseInt(RD3.getText());
        iRD4 = Integer.parseInt(RD4.getText());
        
        pAnt = Integer.parseInt(pivAntLabel.getText());
    }
    
    public int obtenerResultado(int a, int b, int c, int d) {
        int resultado = (((a)*(b)) - ((c)*(d))) / pAnt;
        
        return resultado;
    }
    
    public void resultadoFinal(int a, int ra1, int ra2, int ra3, int ra4,
            int b, int rb1, int rb2, int rb3, int rb4,
            int c, int rc1, int rc2, int rc3, int rc4,
            int d, int rd1, int rd2, int rd3, int rd4) {
        
        x = (ra1 + ra2 + ra3 + ra4) / a;
        y = (rb1 + rb2 + rb3 + rb4) / b;
        z = (rc1 + rc2 + rc3 + rc4) / c;
        w = (rd1 + rd2 + rd3 + rd4) / d;
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
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        RA3 = new javax.swing.JLabel();
        RA4 = new javax.swing.JLabel();
        RB3 = new javax.swing.JLabel();
        RB4 = new javax.swing.JLabel();
        RC1 = new javax.swing.JLabel();
        RC2 = new javax.swing.JLabel();
        RD1 = new javax.swing.JLabel();
        RD2 = new javax.swing.JLabel();
        RC3 = new javax.swing.JLabel();
        RD3 = new javax.swing.JLabel();
        RC4 = new javax.swing.JLabel();
        RD4 = new javax.swing.JLabel();
        MA3 = new javax.swing.JLabel();
        MB3 = new javax.swing.JLabel();
        MA4 = new javax.swing.JLabel();
        MB4 = new javax.swing.JLabel();
        MC1 = new javax.swing.JLabel();
        MD1 = new javax.swing.JLabel();
        MC2 = new javax.swing.JLabel();
        MD2 = new javax.swing.JLabel();
        MC3 = new javax.swing.JLabel();
        MD3 = new javax.swing.JLabel();
        MC4 = new javax.swing.JLabel();
        MD4 = new javax.swing.JLabel();
        MRA3 = new javax.swing.JLabel();
        MRB3 = new javax.swing.JLabel();
        MRA4 = new javax.swing.JLabel();
        MRB4 = new javax.swing.JLabel();
        MRC1 = new javax.swing.JLabel();
        MRD1 = new javax.swing.JLabel();
        MRC2 = new javax.swing.JLabel();
        MRD2 = new javax.swing.JLabel();
        MRC3 = new javax.swing.JLabel();
        MRD3 = new javax.swing.JLabel();
        MRC4 = new javax.swing.JLabel();
        MRD4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        A1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A1.setText("0");

        MRB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB1.setText("0");

        A2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A2.setText("0");

        RA1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA1.setText("0");

        MRB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB2.setText("0");

        B1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B1.setText("0");

        RA2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA2.setText("0");

        B2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B2.setText("0");

        RB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB1.setText("0");

        RB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        MA1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA1.setText("0");

        MA2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA2.setText("0");

        MRA1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA1.setText("0");

        SigPaso.setText("Siguiente Paso");
        SigPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigPasoMouseClicked(evt);
            }
        });

        MB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB1.setText("0");

        OmiPaso.setText("Omitir Pasos");
        OmiPaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OmiPasoMouseClicked(evt);
            }
        });

        MRA2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA2.setText("0");

        MB2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB2.setText("0");

        A3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A3.setText("0");

        A4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A4.setText("0");

        B3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B3.setText("0");

        B4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B4.setText("0");

        C2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C2.setText("0");

        D1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D1.setText("0");

        C3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C3.setText("0");

        D2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D2.setText("0");

        C4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C4.setText("0");

        D3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D3.setText("0");

        D4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D4.setText("0");

        C1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C1.setText("0");

        RA3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA3.setText("0");

        RA4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RA4.setText("0");

        RB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB3.setText("0");

        RB4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB4.setText("0");

        RC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC1.setText("0");

        RC2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC2.setText("0");

        RD1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RD1.setText("0");

        RD2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RD2.setText("0");

        RC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC3.setText("0");

        RD3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RD3.setText("0");

        RC4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RC4.setText("0");

        RD4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RD4.setText("0");

        MA3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA3.setText("0");

        MB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB3.setText("0");

        MA4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MA4.setText("0");

        MB4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MB4.setText("0");

        MC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC1.setText("0");

        MD1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MD1.setText("0");

        MC2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC2.setText("0");

        MD2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MD2.setText("0");

        MC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC3.setText("0");

        MD3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MD3.setText("0");

        MC4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MC4.setText("0");

        MD4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MD4.setText("0");

        MRA3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA3.setText("0");

        MRB3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB3.setText("0");

        MRA4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRA4.setText("0");

        MRB4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRB4.setText("0");

        MRC1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC1.setText("0");

        MRD1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRD1.setText("0");

        MRC2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC2.setText("0");

        MRD2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRD2.setText("0");

        MRC3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC3.setText("0");

        MRD3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRD3.setText("0");

        MRC4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRC4.setText("0");

        MRD4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MRD4.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B1)
                                            .addComponent(A1))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B2)
                                            .addComponent(A2))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B3)
                                            .addComponent(A3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B4)
                                            .addComponent(A4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(D1)
                                            .addComponent(C1))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(D2)
                                            .addComponent(C2))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(D3)
                                            .addComponent(C3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(D4)
                                            .addComponent(C4))))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RD1)
                                            .addComponent(RC1))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RC2)
                                            .addComponent(RD2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RD3)
                                            .addComponent(RC3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RC4)
                                            .addComponent(RD4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RB1)
                                            .addComponent(RA1))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RA2)
                                            .addComponent(RB2))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(RA3)
                                                .addGap(40, 40, 40)
                                                .addComponent(RA4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(RB3)
                                                .addGap(40, 40, 40)
                                                .addComponent(RB4)))))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MB1)
                                    .addComponent(MA1)
                                    .addComponent(MD1)
                                    .addComponent(MC1))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MB2)
                                    .addComponent(MA2)
                                    .addComponent(MD2)
                                    .addComponent(MC2))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MB3)
                                            .addComponent(MA3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MB4)
                                            .addComponent(MA4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MD3)
                                            .addComponent(MC3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MD4)
                                            .addComponent(MC4))))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MRB1)
                                    .addComponent(MRA1)
                                    .addComponent(MRD1)
                                    .addComponent(MRC1))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MRB2)
                                    .addComponent(MRA2)
                                    .addComponent(MRD2)
                                    .addComponent(MRC2))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MRB3)
                                            .addComponent(MRA3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MRB4)
                                            .addComponent(MRA4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MRD3)
                                            .addComponent(MRC3))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MRD4)
                                            .addComponent(MRC4)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(pivAntLabel)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(pivActLabel)
                                .addGap(177, 177, 177))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(SigPaso)
                                .addGap(124, 124, 124)
                                .addComponent(OmiPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresarButton)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(A3)
                                    .addComponent(A4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B3)
                                    .addComponent(B4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RA1)
                                    .addComponent(RA2)
                                    .addComponent(RA3)
                                    .addComponent(RA4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RB1)
                                    .addComponent(RB2)
                                    .addComponent(RB3)
                                    .addComponent(RB4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C1)
                                    .addComponent(C2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(D1)
                                    .addComponent(D2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C3)
                                    .addComponent(C4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(D3)
                                    .addComponent(D4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RC1)
                                    .addComponent(RC2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RD1)
                                    .addComponent(RD2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RC3)
                                    .addComponent(RC4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RD3)
                                    .addComponent(RD4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(MA3)
                                        .addComponent(MA4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MB3)
                                        .addComponent(MB4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MRA1)
                                        .addComponent(MRA2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(MRB1)
                                        .addComponent(MRB2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MRA3)
                                    .addComponent(MRA4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MRB3)
                                    .addComponent(MRB4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MC3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MD3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MC4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MD4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MD1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MC2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MD2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MRC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MRD1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MRC2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MRD2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MRC3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MRD3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MRC4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MRD4)))))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pivActLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(pivAntLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(instruccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SigPaso)
                    .addComponent(OmiPaso))
                .addGap(18, 18, 18)
                .addComponent(regresarButton)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        // TODO add your handling code here:
        Variables4x4 b = new Variables4x4();
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
            java.util.logging.Logger.getLogger(RVar4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RVar4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RVar4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RVar4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RVar4x4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel MA1;
    private javax.swing.JLabel MA2;
    private javax.swing.JLabel MA3;
    private javax.swing.JLabel MA4;
    private javax.swing.JLabel MB1;
    private javax.swing.JLabel MB2;
    private javax.swing.JLabel MB3;
    private javax.swing.JLabel MB4;
    private javax.swing.JLabel MC1;
    private javax.swing.JLabel MC2;
    private javax.swing.JLabel MC3;
    private javax.swing.JLabel MC4;
    private javax.swing.JLabel MD1;
    private javax.swing.JLabel MD2;
    private javax.swing.JLabel MD3;
    private javax.swing.JLabel MD4;
    private javax.swing.JLabel MRA1;
    private javax.swing.JLabel MRA2;
    private javax.swing.JLabel MRA3;
    private javax.swing.JLabel MRA4;
    private javax.swing.JLabel MRB1;
    private javax.swing.JLabel MRB2;
    private javax.swing.JLabel MRB3;
    private javax.swing.JLabel MRB4;
    private javax.swing.JLabel MRC1;
    private javax.swing.JLabel MRC2;
    private javax.swing.JLabel MRC3;
    private javax.swing.JLabel MRC4;
    private javax.swing.JLabel MRD1;
    private javax.swing.JLabel MRD2;
    private javax.swing.JLabel MRD3;
    private javax.swing.JLabel MRD4;
    private javax.swing.JButton OmiPaso;
    private javax.swing.JLabel RA1;
    private javax.swing.JLabel RA2;
    private javax.swing.JLabel RA3;
    private javax.swing.JLabel RA4;
    private javax.swing.JLabel RB1;
    private javax.swing.JLabel RB2;
    private javax.swing.JLabel RB3;
    private javax.swing.JLabel RB4;
    private javax.swing.JLabel RC1;
    private javax.swing.JLabel RC2;
    private javax.swing.JLabel RC3;
    private javax.swing.JLabel RC4;
    private javax.swing.JLabel RD1;
    private javax.swing.JLabel RD2;
    private javax.swing.JLabel RD3;
    private javax.swing.JLabel RD4;
    private javax.swing.JButton SigPaso;
    private javax.swing.JTextField instruccionText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel pivActLabel;
    private javax.swing.JLabel pivAntLabel;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
