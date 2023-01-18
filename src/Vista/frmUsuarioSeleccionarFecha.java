/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Paciente;
import static Utilidades.UtilidadesFechas.validarFecha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Victor
 */
public class frmUsuarioSeleccionarFecha extends javax.swing.JFrame {
        
    public static LinkedList contenedor = new LinkedList();

    /**
     * Creates new form frmAgendarCita
     */
    public frmUsuarioSeleccionarFecha() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public boolean ExisteEnTabla(JTable tabla, String cedula, int col) {
        boolean Existe = false;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            if (tabla.getValueAt(i, col).equals(cedula)) {
                Existe = true;
            }
        }
        return Existe;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxHorarioAtencion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAgendarCita = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INGRESAR LA FECHA PARA LA CITA");

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Fecha de la cita");

        txtFechaCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaCita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaCitaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaCitaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Horarios de atencion");

        cbxHorarioAtencion.setMaximumRowCount(9);
        cbxHorarioAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00 - 08:00", "08:00 - 09:00", "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "13:00 - 14:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00" }));
        cbxHorarioAtencion.setSelectedItem(null);
        cbxHorarioAtencion.setToolTipText("");
        cbxHorarioAtencion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxHorarioAtencionKeyPressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*Ingresar en formato dd/mm/aaaa*");

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAgendarCita.setText("AGENDAR CITA");
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosGraficosFondos/CalendarioIcono.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seleccionar fecha para la cita");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgendarCita))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFechaCita, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxHorarioAtencion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxHorarioAtencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAgendarCita))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        // TODO add your handling code here:
        try {
            if (txtFechaCita.getText().isEmpty() || cbxHorarioAtencion.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos", "VALORES VACIOS", JOptionPane.WARNING_MESSAGE);
            } else {
                String fecha1;
                boolean resultado = true;
                fecha1 = txtFechaCita.getText();
                resultado = validarFecha(fecha1);
                String CbxHoraAtencion = cbxHorarioAtencion.getSelectedItem().toString();
                String cedula = Vista.frmUsuarioIngresarDatos.txtNumeroCedula.getText();

                SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
                Calendar calendario = GregorianCalendar.getInstance();
                Date fechaHoy = calendario.getTime();
                String Fe = txtFechaCita.getText();
                Date fechaSeleccionada = formatoDeFecha.parse(Fe);
                Date fechaLimite = formatoDeFecha.parse("30/12/2040");

                if (resultado == true) {
                    frmPersonalCitasPorAtender abrir = new frmPersonalCitasPorAtender();
                    abrir.setVisible(false);
                    

                    if (fechaSeleccionada.before(fechaHoy)) {
                        JOptionPane.showMessageDialog(null, "La fecha seleccionada ya ha pasado", "FECHA PASADO", JOptionPane.INFORMATION_MESSAGE);
                    } else if (ExisteEnTabla(Vista.frmPersonalCitasPorAtender.tblCitasSinAtender, fecha1, 7) == true & ExisteEnTabla(Vista.frmPersonalCitasPorAtender.tblCitasSinAtender, CbxHoraAtencion, 8)) {
                        JOptionPane.showMessageDialog(null, "La hora de atencion ya no esta disponible", "NO DISPONIBLE", JOptionPane.INFORMATION_MESSAGE);
                    } else if (ExisteEnTabla(Vista.frmPersonalCitasPorAtender.tblCitasSinAtender, cedula, 0) == true) {
                        JOptionPane.showMessageDialog(null, "El usuario con numero de cedula " + cedula + " ya tiene una cita agendada ", "YA CUENTA CON CITA", JOptionPane.INFORMATION_MESSAGE);
                    } else if (fechaSeleccionada.after(fechaLimite)) {
                        JOptionPane.showMessageDialog(null, "La fecha seleccionada es muy lejana", "FECHA DEMASIADO LEJANA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        
                        String NumeroCedula = Vista.frmUsuarioIngresarDatos.txtNumeroCedula.getText();
                        String NombrePaciente = Vista.frmUsuarioIngresarDatos.txtNombrePaciente.getText();
                        String ApellidoPaciente = Vista.frmUsuarioIngresarDatos.txtApellidoPaciente.getText();
                        String EdadPaciente = Vista.frmUsuarioIngresarDatos.txtEdadPaciente.getText();
                        String GeneroPaciente = Vista.frmUsuarioIngresarDatos.cbxGeneroPaciente.getSelectedItem().toString();
                        String TelefonoPaciente = Vista.frmUsuarioIngresarDatos.txtNumeroTelefono.getText();
                        String MolestiaPaciente = Vista.frmUsuarioIngresarDatos.txaMolestias.getText();
                        String FechaAtencion = txtFechaCita.getText();
                        String HoraAtencion = cbxHorarioAtencion.getSelectedItem().toString();
                        
                        Date miFecha = new SimpleDateFormat("dd/MM/yyyy").parse(txtFechaCita.getText());
                        calendario.setTime(miFecha);
                        int anio = calendario.get(Calendar.YEAR);
                        int mes = calendario.get(Calendar.MONTH);
                        int dia = calendario.get(Calendar.DAY_OF_MONTH);

                        String Dia = String.valueOf(dia);
                        String Mes = String.valueOf(mes);
                        String Anio = String.valueOf(anio);
                
                        Paciente claseauto = new Paciente(NumeroCedula, NombrePaciente, ApellidoPaciente, EdadPaciente, GeneroPaciente, TelefonoPaciente, MolestiaPaciente, FechaAtencion, HoraAtencion, Dia, Mes, Anio);
                        contenedor.add(claseauto);
                                                
                        JOptionPane.showMessageDialog(null, "CITA AGENDADA CON EXITO");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El formato de la fecha esta mal, tiene que ser dia/mes/año, con limites de dias 30 o 31 y mes maximo 12 ,Por favor revisar", "FORMATO DE FECHA MAL ESTABLECIDO", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (ParseException ex) {
        }
        Collections.sort(contenedor, (Paciente g, Paciente h) -> g.getHoraAtencion().compareTo(h.getHoraAtencion()));
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtFechaCitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaCitaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean slash = key == 47;
        Character c = evt.getKeyChar();

        if (!(Character.isDigit(c) || slash)) {
            evt.consume();
        }
        if (txtFechaCita.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaCitaKeyTyped

    private void txtFechaCitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaCitaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            cbxHorarioAtencion.requestFocus();
        }
    }//GEN-LAST:event_txtFechaCitaKeyPressed

    private void cbxHorarioAtencionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxHorarioAtencionKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            btnAgendarCita.requestFocus();
        }
    }//GEN-LAST:event_cbxHorarioAtencionKeyPressed

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
            java.util.logging.Logger.getLogger(frmUsuarioSeleccionarFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarioSeleccionarFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarioSeleccionarFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarioSeleccionarFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuarioSeleccionarFecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnRegresar;
    public static javax.swing.JComboBox<String> cbxHorarioAtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txtFechaCita;
    // End of variables declaration//GEN-END:variables
}
