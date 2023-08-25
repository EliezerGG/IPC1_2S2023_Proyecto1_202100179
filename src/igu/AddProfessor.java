package igu;

import javax.swing.JOptionPane;
import proyecto1courses.Controladora;
import static proyecto1courses.Controladora.profesores;
import proyecto1courses.Professor;
import igu.Administracion.*;
import static igu.Administracion.modelo;
import static igu.Administracion.tblProfesores;
import static proyecto1courses.Controladora.profesoresArray;
public class AddProfessor extends javax.swing.JFrame {

   Controladora control = new Controladora();
   
    
    public AddProfessor() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodeProf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassWProf = new javax.swing.JTextField();
        txtEmailProf = new javax.swing.JTextField();
        txtNameProf = new javax.swing.JTextField();
        txtLastNameProf = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox<>();
        btnAddProfessor = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 28, 48));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar nuevo Profesor");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña:");

        txtCodeProf.setBackground(new java.awt.Color(255, 255, 255));
        txtCodeProf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCodeProf.setForeground(new java.awt.Color(0, 0, 0));
        txtCodeProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeProfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Género:");

        txtPassWProf.setBackground(new java.awt.Color(255, 255, 255));
        txtPassWProf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPassWProf.setForeground(new java.awt.Color(0, 0, 0));
        txtPassWProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWProfActionPerformed(evt);
            }
        });

        txtEmailProf.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailProf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEmailProf.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailProfActionPerformed(evt);
            }
        });

        txtNameProf.setBackground(new java.awt.Color(255, 255, 255));
        txtNameProf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNameProf.setForeground(new java.awt.Color(0, 0, 0));
        txtNameProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameProfActionPerformed(evt);
            }
        });

        txtLastNameProf.setBackground(new java.awt.Color(255, 255, 255));
        txtLastNameProf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtLastNameProf.setForeground(new java.awt.Color(0, 0, 0));
        txtLastNameProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameProfActionPerformed(evt);
            }
        });

        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        btnAddProfessor.setText("Agregar");
        btnAddProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfessorActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNameProf, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtLastNameProf)
                                .addComponent(txtEmailProf)
                                .addComponent(txtPassWProf))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLastNameProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassWProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProfessor)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

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

    private void txtCodeProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeProfActionPerformed

    private void txtPassWProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWProfActionPerformed

    private void txtEmailProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailProfActionPerformed

    private void txtNameProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProfActionPerformed

    private void txtLastNameProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameProfActionPerformed

    private void btnAddProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfessorActionPerformed
        // TODO add your handling code here:
        
        try {
        String code = txtCodeProf.getText();
        String name = txtNameProf.getText();
        String lastName = txtLastNameProf.getText();
        String email = txtEmailProf.getText();
        String passWord = txtPassWProf.getText();
        String gender = cboGender.getSelectedItem().toString();    

        control.addProfessor(code, name, lastName, email, passWord, gender);
        
        refreshTable();
        dispose();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar profesor");
        }
        
        
                
        

    }//GEN-LAST:event_btnAddProfessorActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed
   
     public void refreshTable(){
        while (modelo.getRowCount() > 0) { 
            modelo.removeRow(0);
        }
        
        for (Professor profesor: profesoresArray) {
            if (profesor != null) {
                Object a[]= new Object[5];
                a[0] = profesor.getCode();
                a[1] = profesor.getName();
                a[2] = profesor.getLastName();
                a[3] = profesor.getEmail();
                a[4] = profesor.getGender();

                modelo.addRow(a);
            }
        }
    
    }
   
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
            java.util.logging.Logger.getLogger(AddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProfessor().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProfessor;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodeProf;
    private javax.swing.JTextField txtEmailProf;
    private javax.swing.JTextField txtLastNameProf;
    private javax.swing.JTextField txtNameProf;
    private javax.swing.JTextField txtPassWProf;
    // End of variables declaration//GEN-END:variables
}
