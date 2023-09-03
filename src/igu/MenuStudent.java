
package igu;

import static igu.LogIn.studentLogged;
import javax.swing.JOptionPane;
import proyecto1courses.Course;


public class MenuStudent extends javax.swing.JFrame {
    
    public static int fCindex = 0; //Find Course Index
    
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
        btnExit = new javax.swing.JButton();
        cboCursosEstudiante = new javax.swing.JComboBox<>();
        btnGoToCourseStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        btnExit.setBackground(new java.awt.Color(23, 107, 135));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnGoToCourseStudent.setBackground(new java.awt.Color(0, 28, 48));
        btnGoToCourseStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnGoToCourseStudent.setText("Ir a Curso");
        btnGoToCourseStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToCourseStudentActionPerformed(evt);
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateSutdent))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cboCursosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGoToCourseStudent)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 81, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnUpdateSutdent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSaludarStudent)
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCursosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoToCourseStudent)
                    .addComponent(btnExit))
                .addContainerGap(161, Short.MAX_VALUE))
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

          UpdateStudentLogged updateThisStudent = new UpdateStudentLogged();
          updateThisStudent.setVisible(true);
          updateThisStudent.setLocationRelativeTo(null);

            
    }//GEN-LAST:event_btnUpdateSutdentActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
         LogIn logInWindow = new LogIn();
        logInWindow.setVisible(true);
        logInWindow.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for(Course curso: studentLogged.getCursosEstudiante()){
            cboCursosEstudiante.addItem(curso.getNameCourse() +" "+ 
                    curso.getProfesor().getName()+ " "+ 
                    curso.getProfesor().getLastName());
        }

        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnGoToCourseStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToCourseStudentActionPerformed
        // TODO add your handling code here:
        ModuleStudentCourse studentCourseWindow = new ModuleStudentCourse();
        
        if (cboCursosEstudiante.getSelectedIndex() != -1) {
        studentCourseWindow.setVisible(true);
        studentCourseWindow.setLocationRelativeTo(null);
        
        fCindex = cboCursosEstudiante.getSelectedIndex();           
        }else{
            JOptionPane.showMessageDialog(null, "seleccione un curso");
        }
        
    }//GEN-LAST:event_btnGoToCourseStudentActionPerformed

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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGoToCourseStudent;
    private javax.swing.JButton btnUpdateSutdent;
    private javax.swing.JComboBox<String> cboCursosEstudiante;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel labelSaludarStudent;
    // End of variables declaration//GEN-END:variables
}
