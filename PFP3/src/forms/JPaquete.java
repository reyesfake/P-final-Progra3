/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;


import java.util.LinkedList;
import java.util.Queue;
import pfp3.ColaPaquetes;
import pfp3.Fardo;
import pfp3.Paquete;
import pfp3.Reg;


/**
 *
 * @author ProcesosE
 */
public class JPaquete extends javax.swing.JFrame {

    ColaPaquetes cp;
    Fardo fr;
    
//    private Queue<Reg> cccp = new LinkedList<>();
    
    /**
     * Creates new form FRegistro
     */
    public JPaquete() {
        initComponents();
    }
    
    


//    public void obtenerDatosPaquete() {
//        String numeroSeguimiento = numeroSeguimientoTextField.getText();
//        String remitente = remitenteTextField.getText();
//        String destinatario = destinatarioTextField.getText();
//        String departamentoRecepcion = departamentoRecepcionTextField.getText();
//        String departamentoDestino = departamentoDestinoTextField.getText();
//        String descripcion = descripcionPaqueteTextField.getText();
//        double peso = Double.parseDouble(pesoTextField.getText());
//        String estado = (String) estadoComboBox.getSelectedItem();
//        String clasificacion = (String) clasificacionComboBox.getSelectedItem();
//        
//        Reg reg = new Reg(numeroSeguimiento, remitente, destinatario, departamentoRecepcion, departamentoDestino, descripcion, peso, estado, clasificacion);
//        fr.agregarRegs(reg);
//        System.out.println(reg);
//        System.out.println("Agregadukys");
//
//    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeroSeguimientoTextField = new javax.swing.JTextField();
        remitenteTextField = new javax.swing.JTextField();
        destinatarioTextField = new javax.swing.JTextField();
        departamentoRecepcionTextField = new javax.swing.JTextField();
        departamentoDestinoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descripcionPaqueteTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pesoTextField = new javax.swing.JTextField();
        estadoComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        clasificacionComboBox = new javax.swing.JComboBox<>();
        ButtonRegistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No. Seguimiento:");

        jLabel2.setText("Remitente:");

        jLabel3.setText("Destinatario:");

        jLabel4.setText("Dep. Recepcion:");

        jLabel5.setText("Dep. Destinatario:");

        jLabel6.setText("Descripcion:");

        jLabel7.setText("Peso de Paquete:");

        estadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Claficar", "Recibido", "En Transito", "Entregado", " " }));

        jLabel8.setText("Estado:");

        jLabel9.setText("Clasificacion:");

        clasificacionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Clasificar", "Sobre", "Bolsa", "Paquete Mediano", "Paquete Grande" }));

        ButtonRegistar.setText("Registrar");
        ButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonRegistar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(departamentoDestinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numeroSeguimientoTextField)
                                    .addComponent(remitenteTextField)
                                    .addComponent(destinatarioTextField)
                                    .addComponent(departamentoRecepcionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcionPaqueteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pesoTextField)
                                    .addComponent(estadoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clasificacionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numeroSeguimientoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(remitenteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(descripcionPaqueteTextField))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(destinatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(departamentoRecepcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(departamentoDestinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(clasificacionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(ButtonRegistar)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistarActionPerformed
        // TODO add your handling code here:
        Paquete pack = new Paquete();
        
    
        String numeroSeguimiento = numeroSeguimientoTextField.getText();
        String remitente = remitenteTextField.getText();
        String destinatario = destinatarioTextField.getText();
        String departamentoRecepcion = departamentoRecepcionTextField.getText();
        String departamentoDestino = departamentoDestinoTextField.getText();
        String descripcionPaquete = descripcionPaqueteTextField.getText();
        double peso = Double.parseDouble(pesoTextField.getText());
        String estado =  estadoComboBox.getSelectedItem().toString();
        String clasificacion =  clasificacionComboBox.getSelectedItem().toString();
        
        pack.setNumeroSeguimiento(numeroSeguimiento);
        pack.setRemitente(remitente);
        pack.setDestinatario(destinatario);
        pack.setDepartamentoRecepcion(departamentoRecepcion);
        pack.setDepartamentoDestino(departamentoDestino);
        pack.setDescripcionPaquete(descripcionPaquete);
        pack.setPeso(peso);
        pack.setEstado(estado);
        pack.setClasificacion(clasificacion);
        

         ColaPaquetes colaPaquetes = new ColaPaquetes(pack);

         cp.shucada();
        
//    obtenerDatosPaquete();
//    fr.mostrarRegs();

    }//GEN-LAST:event_ButtonRegistarActionPerformed

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
            java.util.logging.Logger.getLogger(JPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new JPaquete().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegistar;
    private javax.swing.JComboBox<String> clasificacionComboBox;
    private javax.swing.JTextField departamentoDestinoTextField;
    private javax.swing.JTextField departamentoRecepcionTextField;
    private javax.swing.JTextField descripcionPaqueteTextField;
    private javax.swing.JTextField destinatarioTextField;
    private javax.swing.JComboBox<String> estadoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numeroSeguimientoTextField;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JTextField remitenteTextField;
    // End of variables declaration//GEN-END:variables
}
