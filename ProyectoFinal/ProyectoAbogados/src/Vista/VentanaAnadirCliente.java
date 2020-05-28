/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author adrianpisabarrogarcia
 */
public class VentanaAnadirCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAnadirExpediente
     */
    public VentanaAnadirCliente() {
        initComponents();
        //titulo jframe
        this.setTitle("M&C - Añadir Cliente");
        //centrar jframe
        setLocationRelativeTo(null);
        //
        errorDNI.setVisible(false);
        errorDireccion.setVisible(false);
        errorNombre.setVisible(false);
        errorTelefono1.setVisible(false);
        errorTelefono2.setVisible(false);
        botonBuscar.setVisible(false);
        bEliminarCliente.setVisible(false);
        bModificarCliente.setVisible(false);
        bExpedientesAsociados.setVisible(false);
        
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
        bEliminarCliente = new javax.swing.JButton();
        bModificarCliente = new javax.swing.JButton();
        bExpedientesAsociados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfTelefono1 = new javax.swing.JTextField();
        tfTelefono2 = new javax.swing.JTextField();
        errorDNI = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();
        errorDireccion = new javax.swing.JLabel();
        errorTelefono1 = new javax.swing.JLabel();
        errorTelefono2 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JToggleButton();

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
        bAnadir.setText("Añadir Cliente");
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
        bBuscar.setText("Buscar Cliente");
        bBuscar.setFocusable(false);
        bBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(bBuscar);

        bEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelera.png"))); // NOI18N
        bEliminarCliente.setText("Eliminar Cliente");
        bEliminarCliente.setFocusable(false);
        bEliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEliminarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(bEliminarCliente);

        bModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papelera.png"))); // NOI18N
        bModificarCliente.setText("Modificar Cliente");
        bModificarCliente.setFocusable(false);
        bModificarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(bModificarCliente);

        bExpedientesAsociados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        bExpedientesAsociados.setText("Expedientes asociados");
        bExpedientesAsociados.setFocusable(false);
        bExpedientesAsociados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bExpedientesAsociados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bExpedientesAsociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExpedientesAsociadosActionPerformed(evt);
            }
        });
        jToolBar1.add(bExpedientesAsociados);

        jLabel1.setText("Inserta DNI:");

        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDNIFocusLost(evt);
            }
        });

        jLabel2.setText("Nombres y Apellidos:");

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Dirección Postal:");

        tfDireccion.setText("ej:) Monasterio de Iratxe, N5, 3Dcha/Izq/Centro, Vitoria-Gasteiz");
        tfDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDireccionFocusLost(evt);
            }
        });
        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono 1:");

        jLabel5.setText("Teléfono 2:");

        tfTelefono1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTelefono1FocusLost(evt);
            }
        });

        tfTelefono2.setText("no obligatorio");
        tfTelefono2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTelefono2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTelefono2FocusLost(evt);
            }
        });
        tfTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefono2ActionPerformed(evt);
            }
        });

        errorDNI.setForeground(new java.awt.Color(255, 51, 51));
        errorDNI.setText("*vuelve a revisar el DNI");

        errorNombre.setForeground(new java.awt.Color(255, 51, 51));
        errorNombre.setText("*vuelve a revisar el campo");

        errorDireccion.setForeground(new java.awt.Color(255, 51, 51));
        errorDireccion.setText("*vuelve a revisar la dirección");

        errorTelefono1.setForeground(new java.awt.Color(255, 51, 51));
        errorTelefono1.setText("*vuelve a revisar el teléfono");

        errorTelefono2.setForeground(new java.awt.Color(255, 51, 51));
        errorTelefono2.setText("*vuelve a revisar el teléfono");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(tfDNI)
                            .addComponent(tfTelefono1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfTelefono2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(errorTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addComponent(errorTelefono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(errorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonBuscar)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorDNI)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(errorDireccion))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorTelefono1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorTelefono2))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Controlador.ProyectoAbogados.salirVac();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnadirActionPerformed
        // TODO add your handling code here:
        
        boolean dni, nombre, direccion, telefono1, telefono2;
        dni=Controlador.ProyectoAbogados.comprobacionDNI(tfDNI.getText());
        nombre=Controlador.ProyectoAbogados.comprobacionNombre(tfNombre.getText());
        direccion=Controlador.ProyectoAbogados.comprobacionDireccion(tfDireccion.getText());
        telefono1=Controlador.ProyectoAbogados.comprobacionTelefono(tfTelefono1.getText());
        telefono2=Controlador.ProyectoAbogados.comprobacionTelefono2(tfTelefono2.getText());

        if (dni ==false || nombre ==false || direccion ==false || telefono1 == false || telefono2 == false) {
            JOptionPane.showMessageDialog(null, "Revisa bien los campos");
        }else{
            Controlador.ProyectoAbogados.insertarCliente(tfDNI.getText(),tfNombre.getText(),tfDireccion.getText(), tfTelefono1.getText(), tfTelefono2.getText());
            JOptionPane.showMessageDialog(null, "Cliente "+tfNombre.getText()+" insertado.");           
        }
        
        
        
        
        
    }//GEN-LAST:event_bAnadirActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        borrarDatos();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed
        // TODO add your handling code here:
        tfDireccion.setText("");
    }//GEN-LAST:event_tfDireccionActionPerformed

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        tfNombre.setText("");
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusGained
        // TODO add your handling code here:
        tfDireccion.setText("");

    }//GEN-LAST:event_tfDireccionFocusGained

    private void tfTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefono2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfTelefono2ActionPerformed

    private void tfTelefono2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefono2FocusGained
        // TODO add your handling code here:
        tfTelefono2.setText("");
    }//GEN-LAST:event_tfTelefono2FocusGained

    private void tfDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusLost
        // TODO add your handling code here:
        boolean bien;
        bien = Controlador.ProyectoAbogados.comprobacionDNI(tfDNI.getText());
        
        if (bien == false) {
            errorDNI.setVisible(true);
        }else{
            errorDNI.setVisible(false);
        }
    }//GEN-LAST:event_tfDNIFocusLost

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        // TODO add your handling code here:
        boolean bien;
        bien = Controlador.ProyectoAbogados.comprobacionNombre(tfNombre.getText());
        if (bien == false) {
            errorNombre.setVisible(true);
        }else{
            errorNombre.setVisible(false);
        }
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDireccionFocusLost
        // TODO add your handling code here:
        boolean bien;
        bien = Controlador.ProyectoAbogados.comprobacionDireccion(tfDireccion.getText());
        if (bien == false) {
            errorDireccion.setVisible(true);
        }else{
            errorDireccion.setVisible(false);
        }
    }//GEN-LAST:event_tfDireccionFocusLost

    private void tfTelefono1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefono1FocusLost
        // TODO add your handling code here:
        boolean bien;
        bien = Controlador.ProyectoAbogados.comprobacionTelefono(tfTelefono1.getText());
        if (bien == false) {
            errorTelefono1.setVisible(true);
        }else{
            errorTelefono1.setVisible(false);
        }
    }//GEN-LAST:event_tfTelefono1FocusLost

    private void tfTelefono2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefono2FocusLost
        // TODO add your handling code here:
        boolean bien;
        bien = Controlador.ProyectoAbogados.comprobacionTelefono2(tfTelefono2.getText());
        if (bien == false) {
            errorTelefono2.setVisible(true);
        }else{
            errorTelefono2.setVisible(false);
        }
    }//GEN-LAST:event_tfTelefono2FocusLost

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        botonBuscar.setVisible(true);
        bEliminarCliente.setVisible(true);
        bModificarCliente.setVisible(true);
        bExpedientesAsociados.setVisible(true);
    }//GEN-LAST:event_bBuscarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        Cliente c = new Cliente();
        
        c= Controlador.ProyectoAbogados.mostrarCliente(tfDNI.getText());
        tfDireccion.setText(c.getDireccion());
        tfNombre.setText(c.getNombre());
        tfTelefono1.setText(c.getTelefono1());
        tfTelefono2.setText(c.getTelefono2());
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void bEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarClienteActionPerformed
        // TODO add your handling code here:
        Controlador.ProyectoAbogados.eliminarCliente(tfDNI.getText());
        JOptionPane.showMessageDialog(null, "Cliente borrado");
        borrarDatos();
    }//GEN-LAST:event_bEliminarClienteActionPerformed

    private void bModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarClienteActionPerformed
        // TODO add your handling code here:
        try {
            Controlador.ProyectoAbogados.modificarCliente(tfDNI.getText(), tfNombre.getText(), tfDireccion.getText(), tfTelefono1.getText(), tfTelefono2.getText());
            JOptionPane.showMessageDialog(null, "Cliente "+tfNombre.getText()+" modificado.");
            borrarDatos();
        } catch (Exception e) {
            System.out.println("Errores modificando cliente: "+e.getMessage());
        }
        
    }//GEN-LAST:event_bModificarClienteActionPerformed

    private void bExpedientesAsociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExpedientesAsociadosActionPerformed
        // TODO add your handling code here:
        String datos="arriba";
        datos=Controlador.ProyectoAbogados.mostrarDatosExpedienteAsociado(tfDNI.getText());
        JOptionPane.showMessageDialog(null, datos);
    }//GEN-LAST:event_bExpedientesAsociadosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAnadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAnadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAnadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAnadirCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAnadirCliente().setVisible(true);
            }
        });
    }
    
    private void borrarDatos(){
        tfDNI.setText("");
        tfDireccion.setText("ej:) Monasterio de Iratxe, Nº5, 3ºDcha/Izq/Centro, Vitoria-Gasteiz");
        tfNombre.setText("");
        tfTelefono1.setText("");
        tfTelefono2.setText("no obligatorio");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnadir;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminarCliente;
    private javax.swing.JButton bExpedientesAsociados;
    private javax.swing.JButton bModificarCliente;
    private javax.swing.JToggleButton botonBuscar;
    private javax.swing.JLabel errorDNI;
    private javax.swing.JLabel errorDireccion;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel errorTelefono1;
    private javax.swing.JLabel errorTelefono2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono1;
    private javax.swing.JTextField tfTelefono2;
    // End of variables declaration//GEN-END:variables
}