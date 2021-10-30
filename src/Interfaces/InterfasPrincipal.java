/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Vector;
import javax.swing.DefaultListModel;
import regresion.lineal.Administrador;

/**
 *
 * @author Asiel
 */
public class InterfasPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfasPrincipal
     */
    Vector valoresX = new Vector();
    Vector valoresY = new Vector();
    Administrador admin;
    public InterfasPrincipal() {
       
        initComponents();
        botonPredecir.setVisible(false);
        textoEcuacion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        campoY = new javax.swing.JTextField();
        campoX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonObtenerEcuacion = new javax.swing.JButton();
        campoEcuacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCov = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDesvX = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoDesvY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoError = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCDR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoA = new javax.swing.JTextField();
        botonDatosDef = new javax.swing.JButton();
        botonPredecir = new javax.swing.JButton();
        textoEcuacion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaNumeros = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingresa todos los datos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        campoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoYActionPerformed(evt);
            }
        });
        getContentPane().add(campoY, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 61, 61, -1));

        campoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoXActionPerformed(evt);
            }
        });
        getContentPane().add(campoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 61, 61, -1));

        jLabel2.setText("X");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 41, 24, -1));

        jLabel3.setText("Y");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 41, 36, -1));

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 109, 140, -1));

        botonObtenerEcuacion.setText("Obtener Ecuacion");
        botonObtenerEcuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonObtenerEcuacionActionPerformed(evt);
            }
        });
        getContentPane().add(botonObtenerEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 285, 140, -1));

        campoEcuacion.setEditable(false);
        campoEcuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEcuacionActionPerformed(evt);
            }
        });
        getContentPane().add(campoEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 314, 140, -1));

        jLabel4.setText("Covarianza");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 41, -1, -1));

        campoCov.setEditable(false);
        campoCov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCovActionPerformed(evt);
            }
        });
        getContentPane().add(campoCov, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 61, 170, -1));

        jLabel5.setText("Desv Estandar X");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 87, -1, -1));

        campoDesvX.setEditable(false);
        getContentPane().add(campoDesvX, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 110, 170, -1));

        jLabel6.setText("Desv Estandar Y");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 142, -1, -1));

        campoDesvY.setEditable(false);
        getContentPane().add(campoDesvY, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 167, 170, -1));

        jLabel7.setText("Porcentaje de Acierto");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 193, -1, -1));

        campoError.setEditable(false);
        getContentPane().add(campoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 213, 170, -1));

        jLabel8.setText("Coeficiente de regresion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 239, 401, -1));

        campoCDR.setEditable(false);
        campoCDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCDRActionPerformed(evt);
            }
        });
        getContentPane().add(campoCDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 259, 170, -1));

        jLabel9.setText("A");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 289, -1, -1));

        campoA.setEditable(false);
        getContentPane().add(campoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 314, 170, -1));

        botonDatosDef.setText("Usar Datos Default");
        botonDatosDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosDefActionPerformed(evt);
            }
        });
        getContentPane().add(botonDatosDef, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 238, -1));

        botonPredecir.setText("Predecir");
        botonPredecir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPredecirActionPerformed(evt);
            }
        });
        getContentPane().add(botonPredecir, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 138, 140, -1));

        textoEcuacion.setText("Ecuacion:");
        getContentPane().add(textoEcuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 265, 140, -1));

        tablaNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "X", "Y"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaNumeros);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 240, 291));

        jLabel10.setText("V0.1 Asiel");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoYActionPerformed

    private void campoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoXActionPerformed

    private void campoEcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEcuacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEcuacionActionPerformed

    private void campoCDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCDRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCDRActionPerformed

    private void campoCovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCovActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
       String datoX, datoY;
       datoX = campoX.getText();
       datoY= campoY.getText();
       valoresX.add((float) Integer.parseInt(datoX));
       valoresY.add((float) Integer.parseInt(datoY));
       campoX.setText("");
       campoY.setText("");
       mostrarValores();
       System.out.println("Valor "+valoresX.size());
  
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonObtenerEcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonObtenerEcuacionActionPerformed
        admin = new Administrador(valoresX, valoresY);
        campoCov.setText(String.valueOf(admin.dameCovarianza()));
        campoDesvX.setText(String.valueOf(admin.dameDesvX()));
        campoDesvY.setText(String.valueOf(admin.dameDesvY()));
        campoError.setText(String.valueOf(admin.dameError()*100)+"%");
        campoCDR.setText(String.valueOf(admin.dameCoefRegresion()));
        campoA.setText(String.valueOf(admin.dameA()));
        campoX.enable(false);
        botonAgregar.setVisible(false);
        botonPredecir.setVisible(true);
        campoEcuacion.setText(admin.dameformula());
        botonObtenerEcuacion.setVisible(false);
        textoEcuacion.setVisible(true);
        botonDatosDef.setVisible(false);
    }//GEN-LAST:event_botonObtenerEcuacionActionPerformed

    private void botonDatosDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosDefActionPerformed
        Vector datosX = new Vector();
        Vector datosY = new Vector();
        String matriz[][] = new String[9][9];
        valoresX.add((float) 651);
        valoresX.add((float) 762);
        valoresX.add((float) 856);
        valoresX.add((float) 1063);
        valoresX.add((float) 1190);
        valoresX.add((float) 1298);
        valoresX.add((float) 1421);
        valoresX.add((float) 1440);
        valoresX.add((float) 1518);
        valoresY.add((float) 23);
        valoresY.add((float) 26);
        valoresY.add((float) 30);
        valoresY.add((float) 34);
        valoresY.add((float) 43);
        valoresY.add((float) 48);
        valoresY.add((float) 52);
        valoresY.add((float) 57);
        valoresY.add((float) 58);
        admin = new Administrador(valoresX, valoresY);
        campoCov.setText(String.valueOf(admin.dameCovarianza()));
        campoDesvX.setText(String.valueOf(admin.dameDesvX()));
        campoDesvY.setText(String.valueOf(admin.dameDesvY()));
        campoError.setText(String.valueOf(admin.dameError()*100)+"%");
        campoCDR.setText(String.valueOf(admin.dameCoefRegresion()));
        campoA.setText(String.valueOf(admin.dameA()));
        campoX.enable(false);
        botonAgregar.setVisible(false);
        botonPredecir.setVisible(true);
        campoEcuacion.setText(admin.dameformula());
        botonObtenerEcuacion.setVisible(false);
        textoEcuacion.setVisible(true);
        botonDatosDef.setVisible(false);
        mostrarValores();
        
       
        
    }//GEN-LAST:event_botonDatosDefActionPerformed

    private void botonPredecirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPredecirActionPerformed
        String datoY="0";
        float prediccionX=0;
        datoY=campoY.getText();
        if(datoY.isEmpty()){
            datoY="0";
        }
        prediccionX = admin.predecir((float) Integer.parseInt(datoY));
        valoresY.add((float) Integer.parseInt(datoY));
        valoresX.add(prediccionX);
        campoY.setText("");
        mostrarValores();
        
    }//GEN-LAST:event_botonPredecirActionPerformed

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
            java.util.logging.Logger.getLogger(InterfasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfasPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfasPrincipal().setVisible(true);
            }
        });
    }
    
   
   public void mostrarValores(){
       String matriz[][] = new String[valoresX.size()][2];
       
       
        for(int i = 0; i<valoresX.size(); i++){
            matriz[i][0] = String.valueOf(valoresX.get(i));
            matriz[i][1] = String.valueOf(valoresY.get(i));
        }   
       
        
        tablaNumeros.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "X", "Y"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonDatosDef;
    private javax.swing.JButton botonObtenerEcuacion;
    private javax.swing.JButton botonPredecir;
    private javax.swing.JTextField campoA;
    private javax.swing.JTextField campoCDR;
    private javax.swing.JTextField campoCov;
    private javax.swing.JTextField campoDesvX;
    private javax.swing.JTextField campoDesvY;
    private javax.swing.JTextField campoEcuacion;
    private javax.swing.JTextField campoError;
    private javax.swing.JTextField campoX;
    private javax.swing.JTextField campoY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable tablaNumeros;
    private javax.swing.JLabel textoEcuacion;
    // End of variables declaration//GEN-END:variables
}
