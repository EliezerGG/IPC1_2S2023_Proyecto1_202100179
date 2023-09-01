
package igu;

import static igu.LogIn.studentLogged;


public class MenuStudent extends javax.swing.JFrame {

    
    public MenuStudent() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        btnUpdateSutdent = new javax.swing.JButton();
        labelSaludarStudent = new javax.swing.JLabel();
        btnCourse1 = new javax.swing.JButton();
        txtNameProfesor = new javax.swing.JTextField();
        btnCourse2 = new javax.swing.JButton();
        txtNameProfesor2 = new javax.swing.JTextField();
        btnCourse3 = new javax.swing.JButton();
        txtNameProfesor3 = new javax.swing.JTextField();
        btnCourse4 = new javax.swing.JButton();
        txtNameProfesor4 = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(23, 107, 135));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cursos Asignados");

        btnUpdateSutdent.setBackground(new java.awt.Color(0, 28, 48));
        btnUpdateSutdent.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSutdent.setText("Actualizar Datos");
        btnUpdateSutdent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSutdentActionPerformed(evt);
            }
        });

        labelSaludarStudent.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelSaludarStudent.setForeground(new java.awt.Color(255, 255, 255));
        labelSaludarStudent.setText("insertar nombre estudiante");

        btnCourse1.setBackground(new java.awt.Color(0, 28, 48));
        btnCourse1.setForeground(new java.awt.Color(255, 255, 255));
        btnCourse1.setText("Curso 1");
        btnCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourse1ActionPerformed(evt);
            }
        });

        txtNameProfesor.setBackground(new java.awt.Color(100, 204, 197));
        txtNameProfesor.setForeground(new java.awt.Color(0, 0, 0));
        txtNameProfesor.setText("Cant. Students");
        txtNameProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameProfesorActionPerformed(evt);
            }
        });

        btnCourse2.setBackground(new java.awt.Color(0, 28, 48));
        btnCourse2.setForeground(new java.awt.Color(255, 255, 255));
        btnCourse2.setText("Curso 2");

        txtNameProfesor2.setBackground(new java.awt.Color(100, 204, 197));
        txtNameProfesor2.setForeground(new java.awt.Color(0, 0, 0));
        txtNameProfesor2.setText("Cant. Students");
        txtNameProfesor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameProfesor2ActionPerformed(evt);
            }
        });

        btnCourse3.setBackground(new java.awt.Color(0, 28, 48));
        btnCourse3.setForeground(new java.awt.Color(255, 255, 255));
        btnCourse3.setText("Curso 3");

        txtNameProfesor3.setBackground(new java.awt.Color(100, 204, 197));
        txtNameProfesor3.setForeground(new java.awt.Color(0, 0, 0));
        txtNameProfesor3.setText("Cant. Students");
        txtNameProfesor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameProfesor3ActionPerformed(evt);
            }
        });

        btnCourse4.setBackground(new java.awt.Color(0, 28, 48));
        btnCourse4.setForeground(new java.awt.Color(255, 255, 255));
        btnCourse4.setText("Curso 4");

        txtNameProfesor4.setBackground(new java.awt.Color(100, 204, 197));
        txtNameProfesor4.setForeground(new java.awt.Color(0, 0, 0));
        txtNameProfesor4.setText("Cant. Students");
        txtNameProfesor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameProfesor4ActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(23, 107, 135));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(23, 107, 135));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelSaludarStudent)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateSutdent))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNameProfesor3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCourse3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNameProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(btnCourse1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNameProfesor2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCourse2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNameProfesor4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCourse4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(80, 80, 80))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnUpdateSutdent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelSaludarStudent)
                        .addGap(18, 18, 18)
                        .addComponent(btnCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameProfesor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameProfesor3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCourse4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNameProfesor4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateSutdentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSutdentActionPerformed
        // TODO add your handling code here:
        UpdateProfessorLogged updateThisProfessor = new UpdateProfessorLogged();
        updateThisProfessor.setVisible(true);
        updateThisProfessor.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnUpdateSutdentActionPerformed

    private void btnCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourse1ActionPerformed
        // TODO add your handling code here:
        ModuleStudentCourse studentCourseWindow = new ModuleStudentCourse();

        studentCourseWindow.setVisible(true);
        studentCourseWindow.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnCourse1ActionPerformed

    private void txtNameProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProfesorActionPerformed

    private void txtNameProfesor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameProfesor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProfesor2ActionPerformed

    private void txtNameProfesor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameProfesor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProfesor3ActionPerformed

    private void txtNameProfesor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameProfesor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameProfesor4ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        btnCourse1.setText(studentLogged.getCursosEstudiante().get(0).getNameCourse());
        txtNameProfesor.setText(studentLogged.getCursosEstudiante().get(0).getProfesor().getName() + 
                " "+ studentLogged.getCursosEstudiante().get(0).getProfesor().getLastName());
        
        

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
         LogIn logInWindow = new LogIn();
        logInWindow.setVisible(true);
        logInWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse1;
    private javax.swing.JButton btnCourse2;
    private javax.swing.JButton btnCourse3;
    private javax.swing.JButton btnCourse4;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateSutdent;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel labelSaludarStudent;
    private javax.swing.JTextField txtNameProfesor;
    private javax.swing.JTextField txtNameProfesor2;
    private javax.swing.JTextField txtNameProfesor3;
    private javax.swing.JTextField txtNameProfesor4;
    // End of variables declaration//GEN-END:variables
}
