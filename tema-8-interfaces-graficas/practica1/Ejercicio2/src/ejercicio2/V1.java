
package ejercicio2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class V1 extends javax.swing.JFrame {

    
    

    /**
     * Creates new form V1
     */
    public V1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfDNI = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("DNI:");

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });

        tfApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfApellidosFocusLost(evt);
            }
        });

        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDNIFocusLost(evt);
            }
        });
        tfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDNIActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel4.setText("Inserta Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfDNI))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNombre)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(bSalir))
                    .addComponent(jLabel4))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAceptar)
                            .addComponent(bSalir))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        validacionNombre();
        validacionApellidos();
        validacionDNI();
        Ejercicio2.guardar(tfNombre.getText(), tfApellidos.getText(), tfDNI.getText());
        JOptionPane.showMessageDialog(null, "Se ha introducido. Todo okey");
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDNI.setText("");
        
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
    
        Ejercicio2.salirV1();
    }//GEN-LAST:event_bSalirActionPerformed

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        if (!tfNombre.getText().isEmpty()) {
            validacionNombre();
        }
    }//GEN-LAST:event_tfNombreFocusLost

    private void tfApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfApellidosFocusLost
        if (!tfApellidos.getText().isEmpty()) {
            validacionApellidos();
        }
    }//GEN-LAST:event_tfApellidosFocusLost

    private void tfDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusLost
        if (!tfDNI.getText().isEmpty()) {
            validacionDNI();
        }
    }//GEN-LAST:event_tfDNIFocusLost

    private void tfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDNIActionPerformed

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
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    private void validacionDNI() {
        try {
            Pattern pat = Pattern.compile("[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]");
            Matcher mat = pat.matcher(tfDNI.getText());
            if(!mat.matches()) {
                throw new DatoNoValido();
            }else{
                String comprobacionNumero= "";
                for (int i = 0; i < (tfDNI.getText().length()-1); i++) {
                    String cadena = Character.toString(tfDNI.getText().charAt(i));
                    comprobacionNumero = comprobacionNumero + cadena; 
                }  
                char letraDNI = tfDNI.getText().charAt(8);
                int numeroDNI = Integer.parseInt(comprobacionNumero);
                char arrayLetrasDNI[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                int division = numeroDNI % 23;
                if(letraDNI != arrayLetrasDNI[division]){
                    throw new DatoNoValido();
                } 
  
            } 
        }catch(DatoNoValido e){
            JOptionPane.showMessageDialog(null, "DNI mal");
        }
        
    }

    private void validacionApellidos() {
        try {
            Pattern pat = Pattern.compile("^([A-z]+[ ]?){1,2}$");
            Matcher mat = pat.matcher(tfApellidos.getText());
            if(!mat.matches()) {
                throw new DatoNoValido();
            }
        }catch(DatoNoValido e){
            JOptionPane.showMessageDialog(null, "Apellido mal");
        }
    }

    private void validacionNombre() {               //([ ]? [A-z]+)*
        try {
            Pattern pat = Pattern.compile("^([A-z]+[ ]?){1,2}$");
            Matcher mat = pat.matcher(tfNombre.getText());
            if(!mat.matches()) {
                throw new DatoNoValido();
            }
        }catch(DatoNoValido e){
            JOptionPane.showMessageDialog(null, "Nombre mal");
        }
    }
    
   
}