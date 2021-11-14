package InterfazAgregarCampo;

import Controlador.controlador;
import InterfazCampo.InterCampo;
import ModeloDatos.Campo;
import ModeloDatos.Cultivo;
import ModeloDatos.EstadoCampo;
import ModeloDatos.EstadoProyecto;
import ModeloDatos.Laboreo;
import ModeloDatos.Lote;
import ModeloDatos.Proyecto;
import ModeloDatos.TipoSuelo;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static javassist.CtMethod.ConstParameter.integer;

public class AgregarCampo extends javax.swing.JFrame {
    controlador Controlador = new controlador();
    List <TipoSuelo> tipos = new ArrayList();
    List<Cultivo> cultivos = new ArrayList();
    /**
     * Creates new form AgregarCampo
     */
    public AgregarCampo() {
        initComponents();
    }

    public AgregarCampo(controlador Control) {
        this.Controlador = Control;
        initComponents();
        
        tipos = this.Controlador.ObtenerTodosLosTipoSuelo();
        
        for (TipoSuelo ti: tipos){
            cbbTiposuelo.addItem(String.valueOf(ti.getTipoSuelo())+" - " + ti.getDescripcion());
            System.out.println(ti.getTipoSuelo());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrecampo = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 60), new java.awt.Dimension(0, 60), new java.awt.Dimension(32767, 60));
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dia = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        superficiecampo = new java.awt.TextField();
        superficie = new java.awt.TextField();
        button2 = new java.awt.Button();
        cbbTiposuelo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        mes = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        anio = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        cbbcultivo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("AGREGAR CAMPO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del campo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 82, 135, 27));

        nombrecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecampoActionPerformed(evt);
            }
        });
        jPanel1.add(nombrecampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 119, 230, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Si desea agregar un proyecto complete los siguientes datos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, 27));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 135, 27));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de suelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 258, 135, 27));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 291, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 191, 750, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 357, 750, 10));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Si desea agregar un lote complete los siguientes datos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 207, -1, 27));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Superficie (hectáreas)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 27));

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 35, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Selecciona el cultivo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 406, 144, 27));

        agregar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        agregar.setText("AGREGAR");
        agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 477, 176, 48));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Superficie");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 82, -1, 27));

        superficiecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superficiecampoActionPerformed(evt);
            }
        });
        jPanel1.add(superficiecampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 119, 260, -1));

        superficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superficieActionPerformed(evt);
            }
        });
        jPanel1.add(superficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 303, 240, -1));

        button2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button2.setLabel("Atrás");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 49, -1, -1));

        cbbTiposuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTiposueloActionPerformed(evt);
            }
        });
        jPanel1.add(cbbTiposuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 303, 260, -1));

        jLabel10.setText("dia");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 35, -1));

        jLabel11.setText("mes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioActionPerformed(evt);
            }
        });
        jPanel1.add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 50, -1));

        jLabel12.setText("año");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 30, -1));

        jPanel1.add(cbbcultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 270, -1));

        jButton1.setText("Actualizar cultivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

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

    private void nombrecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrecampoActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        
        if((this.superficie.getText().length()==0)&&(this.nombrecampo.getText().length()!=0)&&(this.superficiecampo.getText().length()!=0)){
        Campo campo = new Campo();
        campo.setNombre(this.nombrecampo.getText());
        campo.setSuperficie(Integer.parseInt(this.superficiecampo.getText()));
        
        List <Lote> lote = new ArrayList();
        campo.setLotes(lote);
        
        EstadoCampo estado = new EstadoCampo();
        estado.setIdEstado(1);
        //estado.setDescripcion("desuso");
        campo.setEstado(estado);
        
        Controlador.AgregarCampo(campo);

        this.nombrecampo.setText("");
        this.superficiecampo.setText("");
        
        }else if((this.superficie.getText().length()!=0)&&(this.nombrecampo.getText().length()!=0)&&(this.superficiecampo.getText().length()!=0)&&(this.dia.getText().length()==0)&&(this.mes.getText().length()==0)&&(this.anio.getText().length()==0)){
        Campo campo = new Campo();
        campo.setNombre(this.nombrecampo.getText());
        campo.setSuperficie(Integer.parseInt(this.superficiecampo.getText()));
        
        List <Lote> lote = new ArrayList();
        //campo.setLotes(lote);
        
        EstadoCampo estado = new EstadoCampo();
        estado.setIdEstado(1);
        campo.setEstado(estado);
        
        Lote nuevolote = new Lote();
        
            nuevolote.setSuperficie(Integer.parseInt(this.superficie.getText()));
        
            TipoSuelo tiposuelo = new TipoSuelo();
            tiposuelo.setIdTipoSuelo((this.cbbTiposuelo.getSelectedIndex()+1));
            nuevolote.setTiposuelo(tiposuelo);
            lote.add(nuevolote);
            
          campo.setLotes(lote);
          Controlador.AgregarCampo(campo);  
        
        this.nombrecampo.setText("");
        this.superficiecampo.setText("");
        this.superficie.setText("");
        
        }else if((this.superficie.getText().length()!=0)&&(this.nombrecampo.getText().length()!=0)&&(this.superficiecampo.getText().length()!=0)&&(this.dia.getText().length()!=0)&&(this.mes.getText().length()!=0)&&(this.anio.getText().length()!=0)){
        Campo campo = new Campo();
        campo.setNombre(this.nombrecampo.getText());
        campo.setSuperficie(Integer.parseInt(this.superficiecampo.getText()));
        
        List <Lote> lote = new ArrayList();
        
        // CUANDO CARGA TODO JUNTO. CAMPO, LOTE Y PROYECTO FALTA AJUSTAR PROYECTO
        
        EstadoCampo estado = new EstadoCampo();
        estado.setIdEstado(2);
        campo.setEstado(estado);
        
        Lote nuevolote = new Lote();
        
            nuevolote.setSuperficie(Integer.parseInt(this.superficie.getText()));
        
            TipoSuelo tiposuelo = new TipoSuelo();
            tiposuelo.setIdTipoSuelo((this.cbbTiposuelo.getSelectedIndex()+1));
            
            nuevolote.setTiposuelo(tiposuelo);
            
            
            //CARGA PROYECTO
            Proyecto proyecto = new Proyecto();

            EstadoProyecto estadoproyecto = new EstadoProyecto();
            estadoproyecto.setIdEstadoProyecto(1);
            proyecto.setEstado(estadoproyecto);
            
            //FALTA INGRESAR BIEN LA FECHA
            /*
            Date fecha = null;
            fecha.setMonth(Integer.parseInt(this.mes.getText()));
            fecha.setYear(Integer.parseInt(this.anio.getText()));
            proyecto.setFecha(fecha);
            */
            
            //CULTIVO
            Cultivo cultivo = new Cultivo();
            int indiceComboBox = 0;
            
            indiceComboBox = this.cbbcultivo.getSelectedIndex();
            this.cbbcultivo.getItemAt(indiceComboBox);
            
            
            //NOMBRE DEL CULTIVO SELECCIONADO -> this.cbbcultivo.getItemAt(indiceComboBox)
            for(Cultivo culti: cultivos){
                if(culti.getNombreCultivo()==this.cbbcultivo.getItemAt(indiceComboBox)){
                    cultivo.setIdCultivo(culti.getIdCultivo());
                }
            }
            proyecto.setCultivo(cultivo);
            Controlador.AgregarProyecto(proyecto);
            
            
            nuevolote.setProyecto(proyecto);
            
            lote.add(nuevolote); 
            campo.setLotes(lote);
          Controlador.AgregarCampo(campo);  
        
        this.nombrecampo.setText("");
        this.superficiecampo.setText("");
        this.superficie.setText("");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void superficiecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superficiecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superficiecampoActionPerformed

    private void superficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superficieActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        InterCampo inicio = new InterCampo(Controlador);
        inicio.show(true);
        this.show(false);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_button2ActionPerformed

    private void cbbTiposueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTiposueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTiposueloActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //List<Cultivo> cultivos = new ArrayList();
        cultivos = Controlador.ObtenerTodosLosCultivos();
        
        for(Cultivo cu: cultivos){
            if((this.cbbTiposuelo.getSelectedIndex()+1)== cu.getTiposuelo().getIdTipoSuelo()){
                cbbcultivo.addItem(cu.getNombreCultivo());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCampo().setVisible(true);
            }
        });
    }
    public void establecerControlador(controlador Control){
        this.Controlador = Control;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private java.awt.TextField anio;
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> cbbTiposuelo;
    private javax.swing.JComboBox<String> cbbcultivo;
    private java.awt.TextField dia;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.TextField mes;
    private java.awt.TextField nombrecampo;
    private java.awt.TextField superficie;
    private java.awt.TextField superficiecampo;
    // End of variables declaration//GEN-END:variables
}
