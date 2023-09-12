package igu;

import static igu.LogIn.studentLogged;
import static igu.MenuStudent.fCindex;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import proyecto1courses.HomeWork;

public class ModuleStudentCourse extends javax.swing.JFrame {

    DefaultTableModel modeloTarea = new DefaultTableModel();
    int totalNotas = 0;
    int totalCurso = 0;
    
    public ModuleStudentCourse() {
        initComponents();
        
        if (modeloTarea.getColumnCount() == 0) {
            modeloTarea.addColumn("Nombre");
            modeloTarea.addColumn("Descripcion");
            modeloTarea.addColumn("Ponderacion");
            modeloTarea.addColumn("Nota obtenida");           
        }
        
        refreshTable();
    }

     private void refreshTable() {
       tblHomeWork.setModel(modeloTarea);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNameCourse = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomeWork = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        panelGraficoTarea = new javax.swing.JPanel();
        labelPonderacionCourse = new javax.swing.JLabel();
        labelTotalNotas = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(23, 107, 135));

        labelNameCourse.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelNameCourse.setForeground(new java.awt.Color(255, 255, 255));
        labelNameCourse.setText("Nombre Curso");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Actividades");

        tblHomeWork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHomeWork);

        btnSalir.setBackground(new java.awt.Color(0, 28, 48));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        panelGraficoTarea.setBackground(new java.awt.Color(218, 255, 251));

        javax.swing.GroupLayout panelGraficoTareaLayout = new javax.swing.GroupLayout(panelGraficoTarea);
        panelGraficoTarea.setLayout(panelGraficoTareaLayout);
        panelGraficoTareaLayout.setHorizontalGroup(
            panelGraficoTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        panelGraficoTareaLayout.setVerticalGroup(
            panelGraficoTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        labelPonderacionCourse.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelPonderacionCourse.setForeground(new java.awt.Color(255, 255, 255));
        labelPonderacionCourse.setText("Ponderacion");

        labelTotalNotas.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelTotalNotas.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalNotas.setText("totalnotas");

        label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Tu nota:");

        label2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Curso: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(labelNameCourse)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalir)
                                .addGap(31, 31, 31)
                                .addComponent(panelGraficoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTotalNotas)
                                    .addComponent(labelPonderacionCourse)
                                    .addComponent(label2)
                                    .addComponent(label)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelNameCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnSalir))
                            .addComponent(panelGraficoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPonderacionCourse)
                        .addGap(60, 60, 60)
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotalNotas)))
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here
        showGraph();
        loadTableStudent();
        labelNameCourse.setText(studentLogged.getCursosEstudiante().get(fCindex).getNameCourse());
        
//        labelPonderacionCourse.setText(studentLogged.getCursosEstudiante().get(fCindex).get);
        int sumaNotas = 0;
        int sumaPonderacion = 0;
        for(HomeWork tarea: studentLogged.getCursosEstudiante().get(fCindex).getTareasArrayEstudiante()){
            sumaNotas += (int) (tarea.getPonderacionHW() * (tarea.getNotaTarea(studentLogged)/100));
            if (tarea.getEstudiante() == studentLogged) {
                sumaPonderacion += tarea.getPonderacionHW();               
            }
        }
        totalNotas += sumaNotas;
        totalCurso += sumaPonderacion;
        
        labelTotalNotas.setText(String.valueOf(totalNotas));
        labelPonderacionCourse.setText(String.valueOf(totalCurso));

    }//GEN-LAST:event_formWindowOpened
    
    public void showGraph(){
            panelGraficoTarea.removeAll();
        panelGraficoTarea.revalidate();
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        for (HomeWork tarea: studentLogged.getCursosEstudiante().get(fCindex).getTareasArrayEstudiante()) {
            if (tarea.getEstudiante() == studentLogged) {
                datos.setValue(tarea.getNotaTarea(studentLogged), tarea.getNameHW(), tarea.getNameHW());
            }
        }
   
             JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                "Nota obtenida por actividad",
                "Tareas",
                "Nota",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,300));
        
        panelGraficoTarea.setLayout(new BorderLayout());
        panelGraficoTarea.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
    
    }
    public void loadTableStudent(){
        while (modeloTarea.getRowCount() > 0) { 
            modeloTarea.removeRow(0);
        }
        
        for (HomeWork tarea: studentLogged.getCursosEstudiante().get(fCindex).getTareasArrayEstudiante()) {
            if (tarea != null & tarea.getEstudiante() == studentLogged) {
                Object a[]= new Object[4];
                a[0] = tarea.getNameHW();
                a[1] = tarea.getDescripHW();
                a[2] = tarea.getPonderacionHW();
                a[3] = tarea.getNotaTarea(studentLogged);

                modeloTarea.addRow(a);
            }
        }
    
    }
    
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
            java.util.logging.Logger.getLogger(ModuleStudentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuleStudentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuleStudentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuleStudentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuleStudentCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelNameCourse;
    private javax.swing.JLabel labelPonderacionCourse;
    private javax.swing.JLabel labelTotalNotas;
    private javax.swing.JPanel panelGraficoTarea;
    private javax.swing.JTable tblHomeWork;
    // End of variables declaration//GEN-END:variables

   
}
