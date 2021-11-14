package InterfazAgregarLote;

import Controlador.HibernateSession;
import Controlador.controlador;
import InterfazLote.InterLote;
import ModeloDatos.Campo;
import ModeloDatos.Cultivo;
import ModeloDatos.EstadoCampo;
import ModeloDatos.EstadoProyecto;
import ModeloDatos.Lote;
import ModeloDatos.Proyecto;
import ModeloDatos.TipoSuelo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import org.hibernate.Session;

public class AgregarLote extends javax.swing.JFrame {
    controlador Controlador = new controlador();
    List <TipoSuelo> tipos = new ArrayList();
    List<Cultivo> cultivos = new ArrayList();
    int ide;
    
    //private Session session;
    //static List <Campo> campos;
    DefaultListModel <Campo> lista= new DefaultListModel<Campo>();
     
    public AgregarLote(controlador Control,int indicetabla) {
        ide = indicetabla;
        this.Controlador = Control;
        initComponents();
        
        
        
        tipos = this.Controlador.ObtenerTodosLosTipoSuelo();
        
        for (TipoSuelo ti: tipos){
            cbbTiposuelo.addItem(String.valueOf(ti.getTipoSuelo())+" - " + ti.getDescripcion());
            System.out.println(ti.getTipoSuelo());
        }
    }

    public AgregarLote() {
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        superficie = new java.awt.TextField();
        agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        button2 = new java.awt.Button();
        cbbTiposuelo = new javax.swing.JComboBox<>();
        anio = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mes = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        dia = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        cbbcultivo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("AGREGAR LOTE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de suelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 101, 27));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Superficie (hectáreas)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 129, -1, 27));

        superficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superficieActionPerformed(evt);
            }
        });
        jPanel1.add(superficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 166, 221, -1));

        agregar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        agregar.setText("AGREGAR");
        agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 423, 176, 48));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Si desea agregar un proyecto en este lote complete los siguientes datos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 300, -1, 27));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Selecciona el cultivo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, 730, -1));

        button2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button2.setLabel("Atrás");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 64, -1, -1));

        jPanel1.add(cbbTiposuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 165, 229, -1));

        anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioActionPerformed(evt);
            }
        });
        jPanel1.add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 50, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 135, 27));

        jLabel11.setText("mes");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel12.setText("año");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 30, -1));

        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 35, -1));

        jLabel10.setText("dia");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 35, -1));

        jButton1.setText("Actualizar cultivos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jPanel1.add(cbbcultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 270, -1));

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

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        List <Campo> listacampos = new ArrayList();
        listacampos = Controlador.ObtenerTodosLosCampos();
        int bandera=0,definitivo=0;

        //CASO QUE SOLO QUIERA CARGAR EL LOTE
        if((this.superficie.getText().length()!=0)&&(this.dia.getText().length()==0)&&(this.mes.getText().length()==0)&&(this.anio.getText().length()==0)){
            
            
            for(Campo ca: listacampos){
                if(ca.getNroCampo()==ide){
                    List <Lote> aux = new ArrayList();

                    Lote nuevo = new Lote();
                    nuevo.setSuperficie(Integer.parseInt(superficie.getText()));


                    TipoSuelo tiposuelo = new TipoSuelo();
                    tiposuelo.setIdTipoSuelo((this.cbbTiposuelo.getSelectedIndex()+1));
                    nuevo.setTiposuelo(tiposuelo);

                    

                    for (Lote lo: aux){
                        if(lo.getProyecto()==null){
                            definitivo=1;
                        }
                        if(lo.getProyecto()!=null){
                            bandera++;
                        }
                    }
                    if((definitivo==1)&&(bandera>0)){
                        EstadoCampo estado = new EstadoCampo();
                        estado.setIdEstado(3);
                        ca.setEstado(estado);
                    } else if((definitivo==0)&&(bandera>0)){
                        EstadoCampo estado = new EstadoCampo();
                        estado.setIdEstado(2);
                        ca.setEstado(estado);
                    }
                    
                    aux = ca.getLotes();
                    aux.add(nuevo);
                    ca.setLotes(aux);
                    Controlador.EditarCampo(ca);
                }

            }
        }else if((this.superficie.getText().length()!=0)&&(this.dia.getText().length()!=0)&&(this.mes.getText().length()!=0)&&(this.anio.getText().length()!=0)){
            
            //AGREGA UN LOTE CON UN PROYECTO
            
            for(Campo ca: listacampos){
                if(ca.getNroCampo()==ide){
                    List <Lote> aux = new ArrayList();
                    
                    Lote nuevo = new Lote();
                    nuevo.setSuperficie(Integer.parseInt(superficie.getText()));

                    TipoSuelo tiposuelo = new TipoSuelo();
                    tiposuelo.setIdTipoSuelo((this.cbbTiposuelo.getSelectedIndex()+1));
                    nuevo.setTiposuelo(tiposuelo);

                    
                    //PROYECTO
                    Proyecto proyecto = new Proyecto();
                    
                    //FALTA SETEAR LA FECHA
                    
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
                    
                    //ESTADO PROYECTO
                    EstadoProyecto estadoproyecto = new EstadoProyecto();
                    estadoproyecto.setIdEstadoProyecto(1);
                    proyecto.setEstado(estadoproyecto);
                    
                    Controlador.AgregarProyecto(proyecto);
                    nuevo.setProyecto(proyecto);
                    
                    //ACTUALIZA ESTADO DEL CAMPO
                    for (Lote lo: aux){
                        if(lo.getProyecto()==null){
                            definitivo=1;
                        }
                        if(lo.getProyecto()!=null){
                            bandera++;
                        }
                    }
                    if((definitivo==1)&&(bandera>0)){
                        EstadoCampo estado = new EstadoCampo();
                        estado.setIdEstado(3);
                        ca.setEstado(estado);
                    } else if((definitivo==0)&&(bandera>0)){
                        EstadoCampo estado = new EstadoCampo();
                        estado.setIdEstado(2);
                        ca.setEstado(estado);
                    }
                    
                    aux = ca.getLotes();
                    aux.add(nuevo);
                    ca.setLotes(aux);
                    Controlador.EditarCampo(ca);
                }

            }
        }
        
        

    }//GEN-LAST:event_agregarActionPerformed

    private void superficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superficieActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        InterLote inicio = new InterLote(Controlador);
        inicio.show(true);
        this.show(false);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_button2ActionPerformed

    private void anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private java.awt.TextField anio;
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> cbbTiposuelo;
    private javax.swing.JComboBox<String> cbbcultivo;
    private java.awt.TextField dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.TextField mes;
    private java.awt.TextField superficie;
    // End of variables declaration//GEN-END:variables
}
