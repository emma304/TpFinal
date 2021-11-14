/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazEditarCampo;

import Controlador.controlador;
import ModeloDatos.Campo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauro
 */
public class EditarCampo extends javax.swing.JFrame {
    int ide;
controlador Controlador = new controlador();
    /**
     * Creates new form EditarCampo
     */
    public EditarCampo() {
       
    }

    public EditarCampo(controlador control, int indicedetabla) {
      ide = indicedetabla;
      Controlador = control;
      initComponents();
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombrecampo = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        superficie = new java.awt.TextField();
        editar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("EDITAR CAMPO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 27));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 25));

        nombrecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecampoActionPerformed(evt);
            }
        });
        jPanel1.add(nombrecampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 152, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Superficie");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        superficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superficieActionPerformed(evt);
            }
        });
        jPanel1.add(superficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 159, -1));

        editar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        editar.setText("EDITAR");
        editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 176, 48));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Escriba los datos que necesita cambiar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 27));

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

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
        if((this.nombrecampo.getText().length()!=0)&&(this.superficie.getText().length()!=0)){
            Campo campo = new Campo();
            campo = Controlador.ObtenerCampo(Long.valueOf(ide));

            campo.setNombre(this.nombrecampo.getText());
            campo.setSuperficie(Integer.parseInt(this.superficie.getText()));

            Controlador.EditarCampo(campo);
            this.nombrecampo.setText("");
            this.superficie.setText("");

        } else if((this.nombrecampo.getText().length()!=0)&&(this.superficie.getText().length()==0)){
            Campo campo = new Campo();
            campo = Controlador.ObtenerCampo(Long.valueOf(ide));

            campo.setNombre(this.nombrecampo.getText());

            Controlador.EditarCampo(campo);
            this.nombrecampo.setText("");
            this.superficie.setText("");

        } else if((this.nombrecampo.getText().length()==0)&&(this.superficie.getText().length()!=0)){
            Campo campo = new Campo();
            campo = Controlador.ObtenerCampo(Long.valueOf(ide));

            campo.setSuperficie(Integer.parseInt(this.superficie.getText()));

            Controlador.EditarCampo(campo);
            this.nombrecampo.setText("");
            this.superficie.setText("");
        }
    }//GEN-LAST:event_editarActionPerformed

    private void superficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superficieActionPerformed

    private void nombrecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrecampoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCampo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField nombrecampo;
    private java.awt.TextField superficie;
    // End of variables declaration//GEN-END:variables
}
