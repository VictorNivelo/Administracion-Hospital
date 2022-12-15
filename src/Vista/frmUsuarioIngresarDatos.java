/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Utilidades.Utilidades;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class frmUsuarioIngresarDatos extends javax.swing.JFrame {

    /**
     * Creates new form frmAgendacionCita
     */
    public frmUsuarioIngresarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarCombo();
    }

    
    //Llamar al combo boxGernero declarado en la clase generocombobox
    private void cargarCombo(){
        Utilidades.cargarComboGenero(cbxGeneroPaciente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNumeroCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoPaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxGeneroPaciente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtEdadPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMolestias = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESAR DATOS DEL PACIENTE");
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR DATOS DEL PACIENTE");

        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        txtNumeroCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroCedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCedulaKeyTyped(evt);
            }
        });

        jLabel4.setText("Apellidos");

        txtNombrePaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombrePaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombrePacienteKeyPressed(evt);
            }
        });

        jLabel3.setText("Nombres");

        jLabel2.setText("Cedula");

        txtApellidoPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoPacienteKeyPressed(evt);
            }
        });

        jLabel5.setText("Genero");

        jLabel6.setText("Edad");

        txtEdadPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdadPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEdadPacienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadPacienteKeyTyped(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("*Ingresar solo numeros*");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("*Ingresar solo numeros*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidoPaciente)
                    .addComponent(txtNombrePaciente)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroCedula)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxGeneroPaciente, 0, 324, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEdadPaciente)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxGeneroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel8.setText("Molestias");

        txaMolestias.setColumns(20);
        txaMolestias.setRows(5);
        jScrollPane1.setViewportView(txaMolestias);

        jLabel9.setText("Numero celular");

        txtNumeroTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroTelefonoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("*Ingresar solo numeros*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroTelefono)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosGraficosFondos/IngresarDatosIcono.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(15, 15, 15))
        );

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnConfirmar)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        String cedula = txtNumeroCedula.getText();
        String telefono = txtNumeroTelefono.getText();
        
        if(txaMolestias.getText().isEmpty() || txtNombrePaciente.getText().isEmpty() || txtApellidoPaciente.getText().isEmpty() || txtEdadPaciente.getText().isEmpty() || cbxGeneroPaciente.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(telefono.length()<10){
            JOptionPane.showMessageDialog(null, "La numero de telefono tiene menos de 10 digitos","CEDULA MAL ESTABLECIDA",JOptionPane.ERROR_MESSAGE);
        }
        else if(cedula.length()<10){
            JOptionPane.showMessageDialog(null, "La cedula tiene menos de 10 digitos","CEDULA MAL ESTABLECIDA",JOptionPane.ERROR_MESSAGE);
        }
        else{
            frmUsuarioSeleccionarFecha abrir = new frmUsuarioSeleccionarFecha();
            abrir.setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtNumeroCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCedulaKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(txtNumeroCedula.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroCedulaKeyTyped

    private void txtEdadPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadPacienteKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadPacienteKeyTyped

    private void txtNumeroTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        if(txtNumeroTelefono.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroTelefonoKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmUsuarioSelecionarUso abrir = new frmUsuarioSelecionarUso();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNumeroCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCedulaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtNombrePaciente.requestFocus();
        }
    }//GEN-LAST:event_txtNumeroCedulaKeyPressed

    private void txtNombrePacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePacienteKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtApellidoPaciente.requestFocus();
        }
    }//GEN-LAST:event_txtNombrePacienteKeyPressed

    private void txtApellidoPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPacienteKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtEdadPaciente.requestFocus();
        }
    }//GEN-LAST:event_txtApellidoPacienteKeyPressed

    private void txtEdadPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadPacienteKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            txtNumeroTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtEdadPacienteKeyPressed

    private void txtNumeroTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            txaMolestias.requestFocus();
        }
    }//GEN-LAST:event_txtNumeroTelefonoKeyPressed

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
            java.util.logging.Logger.getLogger(frmUsuarioIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarioIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarioIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarioIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuarioIngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    public static javax.swing.JComboBox<String> cbxGeneroPaciente;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea txaMolestias;
    public static javax.swing.JTextField txtApellidoPaciente;
    public static javax.swing.JTextField txtEdadPaciente;
    public static javax.swing.JTextField txtNombrePaciente;
    public static javax.swing.JTextField txtNumeroCedula;
    public static javax.swing.JTextField txtNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
