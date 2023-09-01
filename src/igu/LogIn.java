package igu;

import static igu.MenuProfesor.labelSaludar;
import static igu.MenuStudent.labelSaludarStudent;
import javax.swing.JOptionPane;
import proyecto1courses.Controladora;
import static proyecto1courses.Controladora.estudiantesArray;
import static proyecto1courses.Controladora.profesoresArray;
import proyecto1courses.Professor;
import proyecto1courses.Student;

public class LogIn extends javax.swing.JFrame {
    
    String admin = "admin";
    String nameProfessor = null;
    String nameStudent = null;
    public static Professor profesorLogged =null;
    public static Student studentLogged = null;
    Controladora control = new Controladora();
    
    public LogIn() {
        initComponents();
        control.loadData(); 
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        txtPassWord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 28, 48));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DTT");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");

        txtCode.setBackground(new java.awt.Color(255, 255, 255));
        txtCode.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtCode.setForeground(new java.awt.Color(0, 0, 0));
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        btnLogIn.setBackground(new java.awt.Color(23, 107, 135));
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Iniciar Sesion");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        txtPassWord.setBackground(new java.awt.Color(255, 255, 255));
        txtPassWord.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtPassWord.setForeground(new java.awt.Color(0, 0, 0));
        txtPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCode)
                    .addComponent(jLabel1)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnLogIn)
                .addContainerGap(93, Short.MAX_VALUE))
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

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
      
        Administracion adminWindow = new Administracion();
        MenuProfesor profesorWindow = new MenuProfesor();
        MenuStudent estudianteWindow = new MenuStudent();
        
        String codigo = txtCode.getText();
        String password = new String(txtPassWord.getPassword());
        boolean isStudentOnArray = false;
        boolean isProfessorOnArray = false;
        
      
         for(Student estudiante : estudiantesArray){
            if(estudiante.getCodeStudet().equals(codigo) && estudiante.getPasswordStudent().equals(password)){
                studentLogged = estudiante;
                isStudentOnArray = true;
                nameStudent = estudiante.getNameStudet() +" " + estudiante.getLastNameStudent();
            }
        }
         
        for(Professor profesor: profesoresArray){
            if(profesor.getCode().equals(codigo) && profesor.getPassWord().equals(password)){
                profesorLogged = profesor;
                isProfessorOnArray = true;
                nameProfessor = profesor.getName() +" " + profesor.getLastName();
            }
        }
         
        if (txtCode.getText().equalsIgnoreCase(admin) && password.equalsIgnoreCase(admin)) {
            adminWindow.setVisible(true);
            adminWindow.setLocationRelativeTo(null);
            dispose();
        }else if(isProfessorOnArray){
            profesorWindow.setVisible(true);
            profesorWindow.setLocationRelativeTo(null);
            
            saludarProfesor(nameProfessor);
            dispose();
            
        }else if(isStudentOnArray){
            estudianteWindow.setVisible(true);
            estudianteWindow.setLocationRelativeTo(null);
            
            saludarStudent(nameStudent);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Ingresar datos correctos");
        }
 
    }//GEN-LAST:event_btnLogInActionPerformed

    public void saludarProfesor(String name){
        labelSaludar.setText("Welcome Professor "+name);
    }
    
    public void saludarStudent(String name){
        labelSaludarStudent.setText("Welcome Student " + name);
    }
    private void txtPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPassWordActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JPasswordField txtPassWord;
    // End of variables declaration//GEN-END:variables

    public void setLocationRelative(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
