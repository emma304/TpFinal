package InterfazCampo;

import Controlador.controlador;
import InterfazAgregarCampo.AgregarCampo;
import InterfazEditarCampo.EditarCampo;
import InterfazPrincipal.Principal;
import ModeloDatos.Campo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InterCampo extends javax.swing.JFrame {
    int ide;
    controlador Controlador = new controlador();
    DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form InterCampo
     */
    public InterCampo(controlador Control) {
        this.Controlador = Control;
        initComponents();
        
        
        
        List <Campo> lista = new ArrayList();
      String [] titulo = new String []  {"Id","Hectareas","Nombre del Campo","Estado del Campo"};
        dtm.setColumnIdentifiers(titulo);
        tabla.setModel(dtm);
        lista=Controlador.ObtenerTodosLosCampos();
           lista.stream().map((obj) -> new String []{Long.toString(obj.getNroCampo()),Long.toString(obj.getSuperficie()),obj.getNombre(),obj.getEstado().getDescripcion().toString()}).forEachOrdered((campos) -> {
           dtm.addRow(campos);
        });  
        
       if(this.tabla.getSelectedRow()==-1){
            this.botonborrar.setEnabled(false);
            this.botoneditar.setEnabled(false);
        }  
       
    }

    public InterCampo() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCampo = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        botoneditar = new java.awt.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        botonborrar = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button1.setLabel("Agregar nuevo campo");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button2.setLabel("Atrás");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        botoneditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botoneditar.setLabel("Editar campo");
        botoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setText("CAMPO");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        botonborrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonborrar.setLabel("Borrar campo");
        botonborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonborrarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número", "Nombre de campo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panelCampoLayout = new javax.swing.GroupLayout(panelCampo);
        panelCampo.setLayout(panelCampoLayout);
        panelCampoLayout.setHorizontalGroup(
            panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelCampoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(botoneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(panelCampoLayout.createSequentialGroup()
                .addGroup(panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCampoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jLabel2))
                    .addGroup(panelCampoLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCampoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        panelCampoLayout.setVerticalGroup(
            panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampoLayout.createSequentialGroup()
                .addGroup(panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCampoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelCampoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        AgregarCampo agregarcampo = new AgregarCampo(Controlador);
        agregarcampo.setLocationRelativeTo(null);
        agregarcampo.show(true);
        this.show(false);
    }//GEN-LAST:event_button1ActionPerformed

    private void botoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditarActionPerformed

        int indice, ide;
        indice=tabla.getSelectedRow();
        ide=Integer.parseInt((String)dtm.getValueAt(indice,0));
        
        EditarCampo editarcampo = new EditarCampo(Controlador,ide);
        editarcampo.setLocationRelativeTo(null);
        //this.show(false);
        editarcampo.show(true);
    }//GEN-LAST:event_botoneditarActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        Principal inicio = new Principal(Controlador);
        inicio.show(true);
        this.show(false);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_button2ActionPerformed

    private void botonborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonborrarActionPerformed
        
        int indice, ide;
        indice=tabla.getSelectedRow();
        ide=Integer.parseInt((String)dtm.getValueAt(indice,0));
        
        
        Campo campo = new Campo();
        campo = Controlador.ObtenerCampo(Long.valueOf(ide));
        
        Controlador.BorrarCampo(campo);
    }//GEN-LAST:event_botonborrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        this.botonborrar.setEnabled(true);
        this.botoneditar.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(InterCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterCampo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonborrar;
    private java.awt.Button botoneditar;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelCampo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
