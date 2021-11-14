package InterfazPrincipal;

import Controlador.controlador;
import InterfazCampo.InterCampo;
import InterfazExtras.Extras;
import InterfazLote.InterLote;
import InterfazProyecto.InterProyecto;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame{

    controlador Controlador = new controlador();
    public Principal(controlador Control) {
        this.Controlador = Control;
        initComponents();
        
        ImageIcon imagen = new ImageIcon("src/Imagenes/principal.jpg");
        Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(lblimagen.getWidth(),lblimagen.getHeight() , Image.SCALE_REPLICATE));
        lblimagen.setIcon(imagen);
        
    }

    public Principal() {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        button4 = new java.awt.Button();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button1.setLabel("LOTE");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 134, 50));

        button2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button2.setLabel("PROYECTO");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        panelPrincipal.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 134, 50));

        button3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button3.setLabel("CAMPO");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        panelPrincipal.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 134, 50));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel2.setText("AGRO SRL");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        button4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button4.setLabel("EXTRAS");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        panelPrincipal.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 134, 50));
        panelPrincipal.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
    InterLote interlote = new InterLote(Controlador);
    interlote.setLocationRelativeTo(null);
    interlote.show(true);
    this.show(false);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        InterProyecto interproyecto = new InterProyecto(Controlador);
        interproyecto.setLocationRelativeTo(null);
        interproyecto.show(true);
        this.show(false);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        InterCampo intercampo = new InterCampo(Controlador);
        intercampo.setLocationRelativeTo(null);
        intercampo.show(true);
        this.show(false);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        Extras extras = new Extras(Controlador);
        extras.setLocationRelativeTo(null);
        extras.show(true);
        this.show(false);
    }//GEN-LAST:event_button4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
