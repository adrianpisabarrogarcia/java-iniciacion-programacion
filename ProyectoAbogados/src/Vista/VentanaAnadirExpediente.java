/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Expediente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author adrianpisabarrogarcia
 */
public class VentanaAnadirExpediente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAnadirExpediente
     */
    public VentanaAnadirExpediente() {
        initComponents();
        //titulo jframe
        this.setTitle("M&C - Añadir Expedientes");
        //centrar jframe
        setLocationRelativeTo(null);
        numeroFilas();
        //visibility a false
        bBuscarExpediente.setVisible(false);
        bEliminar.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton4 = new javax.swing.JButton();
        bAnadir = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfNumExpediente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfFechaInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFechaFin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tfAsunto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bBuscarExpediente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        bAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        bAnadir.setText("Añadir Expediente");
        bAnadir.setFocusable(false);
        bAnadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAnadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnadirActionPerformed(evt);
            }
        });
        jToolBar1.add(bAnadir);

        bBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelera.png"))); // NOI18N
        bBorrar.setText("Borrar todos los campos");
        bBorrar.setFocusable(false);
        bBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBorrar);

        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        bBuscar.setText("Buscar Expediente");
        bBuscar.setFocusable(false);
        bBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBuscar);

        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelera.png"))); // NOI18N
        bEliminar.setText("Eliminar Expediente");
        bEliminar.setFocusable(false);
        bEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(bEliminar);

        jLabel1.setText("Número de Expediente: ");

        tfNumExpediente.setEditable(false);

        jLabel2.setText("Fecha de Inicio:");

        tfFechaInicio.setText("ej:) 17/03/2020");
        tfFechaInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFechaInicioFocusGained(evt);
            }
        });
        tfFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaInicioActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Fin:");

        tfFechaFin.setText("ej:) 17/03/2020");
        tfFechaFin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFechaFinFocusGained(evt);
            }
        });
        tfFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaFinActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado de Expediente:");

        cCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "LABORAL", "PENAL", "CIVIL", "FAMILIAR", "MERCANTIL", "ADMINISTRATIVO", "FISCAL" }));

        jLabel5.setText("Asunto:");

        tfAsunto.setText("Escribe aquí la descripción del asunto.");
        tfAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsuntoActionPerformed(evt);
            }
        });

        jLabel6.setText("Categoría:");

        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "EN LETRA", "A DESPACHO", "EN VISTA", "EN FISCALIA", "PREPARALIZADO", "PARALIZADO", "ARCHIVADO" }));
        cEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Asigna el expediente a la persona");

        jLabel8.setText("Inserta DNI de la persona:");

        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDNIFocusGained(evt);
            }
        });
        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        jButton1.setText("Ver datos de la persona");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bBuscarExpediente.setText("Buscar");
        bBuscarExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarExpedienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                            .addComponent(tfFechaFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                            .addComponent(cCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfNumExpediente, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(bBuscarExpediente)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNumExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarExpediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Controlador.ProyectoAbogados.salirVae();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        // TODO add your handling code here:
        try {
            LocalDate dateInicio = LocalDate.parse(tfFechaInicio.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dateFin = LocalDate.parse(tfFechaFin.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String estado= cEstado.getSelectedItem().toString();
            String categoria= cCategoria.getSelectedItem().toString();
            int numExpediente = Integer.parseInt(tfNumExpediente.getText());
            Controlador.ProyectoAbogados.insertarExpediente(numExpediente, dateInicio, dateFin, estado, tfAsunto.getText(), categoria, tfDNI.getText());
            JOptionPane.showMessageDialog(null, "Expediente añadido");
            borrarCampos();
            numeroFilas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Expediente ya existe");
        }
        
    }//GEN-LAST:event_bAnadirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        borrarCampos();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void cEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstadoActionPerformed

    private void tfAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsuntoActionPerformed
        // TODO add your handling code here:
        tfAsunto.setText("");
    }//GEN-LAST:event_tfAsuntoActionPerformed

    private void tfFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaInicioActionPerformed

    private void tfFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaFinActionPerformed
        // TODO add your handling code here:
        tfFechaFin.setText("");
    }//GEN-LAST:event_tfFechaFinActionPerformed

    private void tfFechaInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFechaInicioFocusGained
        tfFechaInicio.setText("");
    }//GEN-LAST:event_tfFechaInicioFocusGained

    private void tfFechaFinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFechaFinFocusGained
        // TODO add your handling code here:
        tfFechaFin.setText("");

    }//GEN-LAST:event_tfFechaFinFocusGained

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String datos="";
        datos=Controlador.ProyectoAbogados.mostrarDatosPersonaAsociada(tfDNI.getText());
        JOptionPane.showMessageDialog(null, datos);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        
        bBuscarExpediente.setVisible(true);
        tfNumExpediente.setEditable(true);
        bEliminar.setVisible(true);
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bBuscarExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarExpedienteActionPerformed
        // TODO add your handling code here:
        
        try {


            Expediente ex = new Expediente();

            ex= Controlador.ProyectoAbogados.mostrarExpediente(tfNumExpediente.getText());
            tfFechaInicio.setText(ex.getFechaInicio().toString());
            tfFechaFin.setText(ex.getFechaFIn().toString());
            String arrayEstado[] = new String[8];
            arrayEstado[0] = " ";
            arrayEstado[1] = "EN LETRA";
            arrayEstado[2] = "A DESPACHO";
            arrayEstado[3] = "EN VISTA";
            arrayEstado[4] = "EN FISCALIA";
            arrayEstado[5] = "PREPARALIZADO";
            arrayEstado[6] = "PARALIZADO";
            arrayEstado[7] = "ARCHIVADO";
            int posicion=0;
            for (int i = 0; i < arrayEstado.length; i++) {
                String array = arrayEstado[i].toString();
                if (ex.getEstado().equalsIgnoreCase(array)) {
                    posicion = i;
                }
            }

            cEstado.setSelectedIndex(posicion);
            tfAsunto.setText(ex.getAsunto());

            String arrayCategoria[] = new String[8];
            arrayCategoria[0] = " ";
            arrayCategoria[1] = "LABORAL";
            arrayCategoria[2] = "PENAL";
            arrayCategoria[3] = "CIVIL";
            arrayCategoria[4] = "FAMILIAR";
            arrayCategoria[5] = "MERCANTIL";
            arrayCategoria[6] = "ADMINISTRATIVO";
            arrayCategoria[7] = "FISCAL";
            int posicion2=0;
            for (int i = 0; i < arrayCategoria.length; i++) {
                String array2 = arrayCategoria[i];
                if (ex.getCategoria().equalsIgnoreCase(array2)) {
                    posicion2 = i;
                }
            }
            cCategoria.setSelectedIndex(posicion2);
            tfDNI.setText(ex.getDNICliente());

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error encontrando el expediente");
        }
        
    }//GEN-LAST:event_bBuscarExpedienteActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Controlador.ProyectoAbogados.eliminarExpediente(tfNumExpediente.getText());
            JOptionPane.showMessageDialog(null, "Expediente Nº"+tfNumExpediente.getText()+ " correctamente eliminado.");
            borrarCampos();
        } catch (Exception e) {
            System.out.println("Error eliminando expediente bEliminarActionPerformed: "+e.getMessage());
        }
    }//GEN-LAST:event_bEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAnadirExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAnadirExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAnadirExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAnadirExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnadirExpediente().setVisible(true);
            }
        });
    }
    
    private void borrarCampos(){
        tfNumExpediente.setText("");//falta por averiguar
        tfAsunto.setText("Escribe aquí la descripción del asunto.");
        tfFechaInicio.setText("ej:) 17/03/2020");
        tfFechaFin.setText("ej:) 17/03/2020");
        cCategoria.setSelectedIndex(0);
        cEstado.setSelectedIndex(0);
        tfDNI.setText("");
    }
    
    private void numeroFilas(){
        int numeroFilas = Controlador.ProyectoAbogados.obtenerNumeroFilasExpediente()+1;
        String stringNumeroFilas = String.valueOf(numeroFilas);
        tfNumExpediente.setText(stringNumeroFilas);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnadir;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bBuscarExpediente;
    private javax.swing.JButton bEliminar;
    private javax.swing.JComboBox<String> cCategoria;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfAsunto;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfFechaFin;
    private javax.swing.JTextField tfFechaInicio;
    private javax.swing.JTextField tfNumExpediente;
    // End of variables declaration//GEN-END:variables
}
