package igu;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import static igu.UpdateCourse.txtCodigoCourse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
 ///// Librerias pdf///////

import static igu.UpdateProfessor.txtCodeUpdateProf;
import java.awt.BorderLayout;
import java.awt.Dimension;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import proyecto1courses.Controladora;
import static proyecto1courses.Controladora.cursosArray;
import static proyecto1courses.Controladora.estudiantesArray;
import static proyecto1courses.Controladora.profesoresArray;
import proyecto1courses.Course;

import proyecto1courses.Professor;
import proyecto1courses.Student;

public class Administracion extends javax.swing.JFrame {
    
    Controladora control = new Controladora();
    public static int index;
    int countMale= 0;
    int countFemale= 0;
    int countMaleStudent = 0;
    int countFemaleStudent =0;
    

  static DefaultTableModel modelo = new DefaultTableModel();
  static DefaultTableModel modeloCourse = new DefaultTableModel();
  static DefaultTableModel modeloStudent = new DefaultTableModel();
  
    public Administracion() {
        initComponents();
        this.setTitle("Administracion");
        this.setLocationRelativeTo(null);
        
        if (modelo.getColumnCount() == 0) {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Correo");
        modelo.addColumn("Genero");        
        }
        
        if (modeloCourse.getColumnCount() ==0) {
        modeloCourse.addColumn("Codigo");
        modeloCourse.addColumn("Nombre");
        modeloCourse.addColumn("Creditos");
        modeloCourse.addColumn("Alumnos");
        modeloCourse.addColumn("Profesor");            
        }
        
        if (modeloStudent.getColumnCount()==0) {
        modeloStudent.addColumn("Codigo");
        modeloStudent.addColumn("Nombre");
        modeloStudent.addColumn("Apellido");
        modeloStudent.addColumn("Correo");
        modeloStudent.addColumn("Genero");            
        }
        
        refreshTable();
               
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCreateProfesor = new javax.swing.JButton();
        btnCargaMasivaProf = new javax.swing.JButton();
        btnDeleteProf = new javax.swing.JButton();
        btnExportPDF = new javax.swing.JButton();
        btnUpdateProf = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProfesores = new javax.swing.JTable();
        panelGrafico = new javax.swing.JPanel();
        btnShowGraph = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAddCourse = new javax.swing.JButton();
        btnUpdateCourse = new javax.swing.JButton();
        btnDeleteCourse = new javax.swing.JButton();
        btnCargaMasivaCursos = new javax.swing.JButton();
        btnExportCoursePDF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCargaMasivaStudent = new javax.swing.JButton();
        btnExportStudentPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        panelGraficoStudent = new javax.swing.JPanel();
        btnShowGraphicAlumnos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(0, 28, 48));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(23, 107, 135));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado Oficial");

        btnCreateProfesor.setBackground(new java.awt.Color(0, 28, 48));
        btnCreateProfesor.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateProfesor.setText("Crear");
        btnCreateProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateProfesorMouseExited(evt);
            }
        });
        btnCreateProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfesorActionPerformed(evt);
            }
        });

        btnCargaMasivaProf.setBackground(new java.awt.Color(0, 28, 48));
        btnCargaMasivaProf.setForeground(new java.awt.Color(255, 255, 255));
        btnCargaMasivaProf.setText("Carga Masiva");
        btnCargaMasivaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaProfActionPerformed(evt);
            }
        });

        btnDeleteProf.setBackground(new java.awt.Color(0, 28, 48));
        btnDeleteProf.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteProf.setText("Eliminar");
        btnDeleteProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProfActionPerformed(evt);
            }
        });

        btnExportPDF.setBackground(new java.awt.Color(0, 28, 48));
        btnExportPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnExportPDF.setText("Exportar Listado a PDF");
        btnExportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportPDFActionPerformed(evt);
            }
        });

        btnUpdateProf.setBackground(new java.awt.Color(0, 28, 48));
        btnUpdateProf.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateProf.setText("Actualizar");
        btnUpdateProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfActionPerformed(evt);
            }
        });

        tblProfesores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblProfesores);

        panelGrafico.setBackground(new java.awt.Color(218, 255, 251));

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        btnShowGraph.setBackground(new java.awt.Color(23, 107, 135));
        btnShowGraph.setForeground(new java.awt.Color(255, 255, 255));
        btnShowGraph.setText("Show Graph");
        btnShowGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGraphActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(23, 107, 135));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 75, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnShowGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateProf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCreateProfesor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargaMasivaProf, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDeleteProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnExportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnShowGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargaMasivaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteProf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateProf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profesores", jPanel1);

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Listado Oficial");

        btnAddCourse.setBackground(new java.awt.Color(0, 28, 48));
        btnAddCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCourse.setText("Crear");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnUpdateCourse.setBackground(new java.awt.Color(0, 28, 48));
        btnUpdateCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCourse.setText("Actualizar");
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });

        btnDeleteCourse.setBackground(new java.awt.Color(0, 28, 48));
        btnDeleteCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCourse.setText("Eliminar");
        btnDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCourseActionPerformed(evt);
            }
        });

        btnCargaMasivaCursos.setBackground(new java.awt.Color(0, 28, 48));
        btnCargaMasivaCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnCargaMasivaCursos.setText("Carga Masiva");
        btnCargaMasivaCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaCursosActionPerformed(evt);
            }
        });

        btnExportCoursePDF.setBackground(new java.awt.Color(0, 28, 48));
        btnExportCoursePDF.setForeground(new java.awt.Color(255, 255, 255));
        btnExportCoursePDF.setText("Exportar Listado a PDF");
        btnExportCoursePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportCoursePDFActionPerformed(evt);
            }
        });

        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCursos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCargaMasivaCursos))
                            .addComponent(btnExportCoursePDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargaMasivaCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportCoursePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cursos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(23, 107, 135));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Listado Oficial");

        btnCargaMasivaStudent.setBackground(new java.awt.Color(0, 28, 48));
        btnCargaMasivaStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnCargaMasivaStudent.setText("Carga Masiva");
        btnCargaMasivaStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaStudentActionPerformed(evt);
            }
        });

        btnExportStudentPDF.setBackground(new java.awt.Color(0, 28, 48));
        btnExportStudentPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnExportStudentPDF.setText("Exportar Listado a PDF");
        btnExportStudentPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportStudentPDFActionPerformed(evt);
            }
        });

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStudent);

        panelGraficoStudent.setBackground(new java.awt.Color(218, 255, 251));

        javax.swing.GroupLayout panelGraficoStudentLayout = new javax.swing.GroupLayout(panelGraficoStudent);
        panelGraficoStudent.setLayout(panelGraficoStudentLayout);
        panelGraficoStudentLayout.setHorizontalGroup(
            panelGraficoStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        panelGraficoStudentLayout.setVerticalGroup(
            panelGraficoStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        btnShowGraphicAlumnos.setBackground(new java.awt.Color(23, 107, 135));
        btnShowGraphicAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnShowGraphicAlumnos.setText("Show Graph");
        btnShowGraphicAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGraphicAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnShowGraphicAlumnos)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargaMasivaStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExportStudentPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(panelGraficoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCargaMasivaStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportStudentPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelGraficoStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowGraphicAlumnos)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alumnos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void refreshTable(){
      
        tblProfesores.setModel(modelo);
        tblCursos.setModel(modeloCourse);
        tblStudent.setModel(modeloStudent);
    }
    
    private void btnCreateProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfesorActionPerformed
        // TODO add your handling code here:
        AddProfessor addProf = new AddProfessor();
        addProf.setVisible(true);
        addProf.setLocationRelativeTo(null);
        showGraphicPie();

    }//GEN-LAST:event_btnCreateProfesorActionPerformed

    private void btnCargaMasivaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaProfActionPerformed
        // TODO add your handling code here:
        JFileChooser javaChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos csv", "csv");
        
        javaChooser.setFileFilter(filter);
        int select = javaChooser.showOpenDialog(this);
        
        javaChooser.setMultiSelectionEnabled(false);
        
        if (select == JFileChooser.APPROVE_OPTION) {
            File selectedFile = javaChooser.getSelectedFile();
            
           loadFile(selectedFile);
        
        }
      
        
    }//GEN-LAST:event_btnCargaMasivaProfActionPerformed

    public void loadFile(File archivo){
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String line;
            
            while((line = br.readLine()) != null){
                String [] arreglo = line.split(",");
                if (arreglo.length >=4) {
                    control.addProfessor(arreglo[0], arreglo[1], arreglo[2], arreglo[3], "1234", arreglo[4]);
                }
            }
            loadTable();
        } catch (Exception e) {
        }
    }
  
     public void loadTable(){
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
    
    private void btnDeleteProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProfActionPerformed
        // TODO add your handling code here:
        int selectedRowProfessor = tblProfesores.getSelectedRow();
        
        if (selectedRowProfessor != -1) {
            modelo.removeRow(selectedRowProfessor);
            control.deleteProfessor(selectedRowProfessor);
                    
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
        
        
    }//GEN-LAST:event_btnDeleteProfActionPerformed

    private void btnExportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportPDFActionPerformed
        // TODO add your handling code here:
        
        try {
           File file = new File("Profesores.pdf");
           PdfWriter pdfWriter = new PdfWriter(file);
           
           PdfDocument pdfDocument = new PdfDocument(pdfWriter);
           
           Document document = new Document(pdfDocument);
           
            Table table = new Table(5);  // 5 columnas para code, name, lastName, email y gender
            table.addCell("Codigo");
            table.addCell("Nombre");
            table.addCell("Apellido");
            table.addCell("Email");
            table.addCell("Genero");

           for (Professor profesor: profesoresArray){
                table.addCell(profesor.getCode());
                table.addCell(profesor.getName());
                table.addCell(profesor.getLastName());
                table.addCell(profesor.getEmail());
                table.addCell(profesor.getGender());
           }
          
          document.add(table);
          document.close();
          
          pdfWriter.close();
          
            System.out.println("PDF Creado");
            JOptionPane.showMessageDialog(null, "PDF Creado");
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnExportPDFActionPerformed

    private void btnUpdateProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfActionPerformed
        // TODO add your handling code here:
        UpdateProfessor updateProf = new UpdateProfessor();
        
        int selectedRowProfessor = tblProfesores.getSelectedRow();
       
        
        if (selectedRowProfessor != -1) {
            txtCodeUpdateProf.setText(control.getProfessorCode(selectedRowProfessor));
            updateProf.setVisible(true);
            updateProf.setLocationRelativeTo(null);
           
            index =selectedRowProfessor;
            
        }else{
        JOptionPane.showMessageDialog(null, "Seleccione una fila");}
        
        
    }//GEN-LAST:event_btnUpdateProfActionPerformed

    private void btnCargaMasivaStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaStudentActionPerformed
        // TODO add your handling code here:
         JFileChooser javaChooserStudent = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos csv", "csv");
        
        javaChooserStudent.setFileFilter(filter);
        int select = javaChooserStudent.showOpenDialog(this);
        
        javaChooserStudent.setMultiSelectionEnabled(false);
        
        if (select == JFileChooser.APPROVE_OPTION) {
            File selectedFile = javaChooserStudent.getSelectedFile();
            
           loadFileEstudiante(selectedFile);
          
        } 
    }//GEN-LAST:event_btnCargaMasivaStudentActionPerformed

    public void loadFileEstudiante(File archivo){
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String line;
            
            while((line = br.readLine()) != null){
                String [] arreglo = line.split(",");
                if (arreglo.length >=5) {
                    control.addStudent(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4],"1234");                   
                }
            }
            loadTableEstudiante();
        } catch (Exception e) {
        }
    }
    
    public void loadTableEstudiante(){
        while (modeloStudent.getRowCount() > 0) { 
            modeloStudent.removeRow(0);
        }
        
        for (Student estudiante: estudiantesArray) {
            if (estudiante != null) {
                Object a[]= new Object[5];
                a[0] = estudiante.getCodeStudet();
                a[1] = estudiante.getNameStudet();
                a[2] = estudiante.getLastNameStudent();
                a[3] = estudiante.getEmailStudent();
                a[4] = estudiante.getGender();

                modeloStudent.addRow(a);
            }
        }    
    }
    private void btnExportStudentPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportStudentPDFActionPerformed
        // TODO add your handling code here:
        try {
           File file = new File("Estudiantes.pdf");
           PdfWriter pdfWriter = new PdfWriter(file);
           
           PdfDocument pdfDocument = new PdfDocument(pdfWriter);
           
           Document document = new Document(pdfDocument);
           
            Table table = new Table(5);  // 5 columnas para code, name, lastName, email y gender
            table.addCell("Codigo");
            table.addCell("Nombre");
            table.addCell("Apellido");
            table.addCell("Correro");
            table.addCell("Genero");

           for (Student estudiante: estudiantesArray){
                table.addCell(estudiante.getCodeStudet());
                table.addCell(estudiante.getNameStudet());
                table.addCell(estudiante.getLastNameStudent());
                table.addCell(estudiante.getEmailStudent());
                table.addCell(estudiante.getGender());
           }
          
          document.add(table);
          document.close();
          
          pdfWriter.close();
          
            System.out.println("PDF Creado");
            JOptionPane.showMessageDialog(null, "PDF Creado");
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
  
    }//GEN-LAST:event_btnExportStudentPDFActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
       AddCourse windowCourse = new AddCourse();
       
       windowCourse.setVisible(true);
       windowCourse.setLocationRelativeTo(null);
        
        
        
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        // TODO add your handling code here:
          
           UpdateCourse updateCourse = new UpdateCourse();
        
        int selectedRowCourse = tblCursos.getSelectedRow();
       
        
        if (selectedRowCourse != -1) {
            txtCodigoCourse.setText(control.getCourseCode(selectedRowCourse));
            updateCourse.setVisible(true);
            updateCourse.setLocationRelativeTo(null);
           
            index =selectedRowCourse;
            
        }else{
        JOptionPane.showMessageDialog(null, "Seleccione una fila");}
        
        
        
        
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void btnDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCourseActionPerformed
        // TODO add your handling code here:
        int selectedRowCourse = tblCursos.getSelectedRow();
        Course courseToDelete = cursosArray.get(selectedRowCourse);
        if (selectedRowCourse != -1) {
            modeloCourse.removeRow(selectedRowCourse);
            control.deleteCourse(selectedRowCourse);
            for(Professor profesor: profesoresArray){
                if (profesor.getCursosProfArray().contains(courseToDelete)) {
                    profesor.deleteCourseToProf(courseToDelete);
                }
            }
        
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
        
        
        
    }//GEN-LAST:event_btnDeleteCourseActionPerformed

    private void btnCargaMasivaCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaCursosActionPerformed
        // TODO add your handling code here:
        JFileChooser javaChooserCurso = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos csv", "csv");
        
        javaChooserCurso.setFileFilter(filter);
        int select = javaChooserCurso.showOpenDialog(this);
        
        javaChooserCurso.setMultiSelectionEnabled(false);
        
        if (select == JFileChooser.APPROVE_OPTION) {
            File selectedFile = javaChooserCurso.getSelectedFile();
            
           loadFileCursos(selectedFile);
          
        }
      
    }//GEN-LAST:event_btnCargaMasivaCursosActionPerformed

    public void loadFileCursos(File archivo){
        
        FileReader fr = null;
        BufferedReader br = null;
        Course cursoAssign = null;
        
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String line;
            
            while((line = br.readLine()) != null){
                String [] arreglo = line.split(",");
                
                if (arreglo.length >=3) {
                    
                    for(Professor profesor : profesoresArray){
                        if (profesor.getCode().equals(arreglo[3])) {
                            control.addCourse(arreglo[0], 
                                    arreglo[1],
                              Integer.parseInt(arreglo[2]) ,
                                    profesor);                            
                            for(Course curso: cursosArray){
                                if(curso.getProfesor() == profesor){
                                    cursoAssign = curso;
                                }
                            }
                            profesor.addCoursetoProf(cursoAssign);
                        }
                    }
                    
                }
                
            }
            loadTableCursos();
        } catch (Exception e) {
        }
    }
    
     public void loadTableCursos(){
        while (modeloCourse.getRowCount() > 0) { 
            modeloCourse.removeRow(0);
        }
        
        for (Course curso: cursosArray) {
            if (curso != null) {
                Object a[]= new Object[5];
                a[0] = curso.getCodeCourse();
                a[1] = curso.getNameCourse();
                a[2] = curso.getCredits();
                a[3] = curso.getStudentsArray().size();
                a[4] = curso.getProfesor().getName() + " " + curso.getProfesor().getLastName();

                modeloCourse.addRow(a);
            }
        }    
    }
    private void btnExportCoursePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportCoursePDFActionPerformed
        // TODO add your handling code here:
         try {
           File file = new File("Cursos.pdf");
           PdfWriter pdfWriter = new PdfWriter(file);
           
           PdfDocument pdfDocument = new PdfDocument(pdfWriter);
           
           Document document = new Document(pdfDocument);
           
            Table table = new Table(5);  // 5 columnas para code, name, lastName, email y gender
            table.addCell("Code");
            table.addCell("Name");
            table.addCell("Creditos");
            table.addCell("Cant.Alumnos");
            table.addCell("Profesor");

           for (Course curso: cursosArray){
                table.addCell(curso.getCodeCourse());
                table.addCell(curso.getNameCourse());
                table.addCell(String.valueOf(curso.getCredits()));
                table.addCell(String.valueOf(curso.getStudentsArray().size()));
                table.addCell(curso.getProfesor().getName() + " " + curso.getProfesor().getLastName());
           }
          
          document.add(table);
          document.close();
          
          pdfWriter.close();
          
            System.out.println("PDF Creado");
            JOptionPane.showMessageDialog(null, "PDF Creado");
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnExportCoursePDFActionPerformed

    private void btnCreateProfesorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateProfesorMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCreateProfesorMouseExited

    private void btnShowGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGraphActionPerformed
        // TODO add your handling code here:
        showGraphicPie();
    }//GEN-LAST:event_btnShowGraphActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        control.saveData();
        dispose();
        LogIn logInWindow = new LogIn();
        logInWindow.setVisible(true);
        logInWindow.setLocationRelativeTo(null);
                
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnShowGraphicAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGraphicAlumnosActionPerformed
        // TODO add your handling code here:
        panelGraficoStudent.removeAll();
        panelGraficoStudent.revalidate();
        
        DefaultPieDataset datos = new DefaultPieDataset();
        
        
        
        for(Student estudiante: estudiantesArray){
            if (estudiante.getGender().equals("Masculino") || estudiante.getGender().equals("m")) {
                countMaleStudent++;
            }else if(estudiante.getGender().equals("Femenino") || estudiante.getGender().equals("f")){
                countFemaleStudent++;
            }
        }
        
        datos.setValue("Hombres", countMaleStudent);
        datos.setValue("Mujeres", countFemaleStudent);
        
        JFreeChart graficoPie = ChartFactory.createPieChart(
        "Genero de Estudiantes",
                datos,
                true,
                true,
                false
        );
        
        ChartPanel panel = new ChartPanel(graficoPie);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(300,300));
        
        panelGraficoStudent.setLayout(new BorderLayout());
        panelGraficoStudent.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
        
    }//GEN-LAST:event_btnShowGraphicAlumnosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        control.saveData();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        control.loadData(); 
        loadTable(); 
        loadTableCursos();
        loadTableEstudiante();
    }//GEN-LAST:event_formWindowOpened

    public void showGraphicPie(){
        panelGrafico.removeAll();
        panelGrafico.revalidate();
        
        DefaultPieDataset datos = new DefaultPieDataset();
        
        
        
        for(Professor profesor: profesoresArray){
            if (profesor.getGender().equals("Masculino") || profesor.getGender().equals("m")) {
                countMale++;
            }else if(profesor.getGender().equals("Femenino") || profesor.getGender().equals("f")){
                countFemale++;
            }
        }
        
        datos.setValue("Hombres", countMale);
        datos.setValue("Mujeres", countFemale);
        
        JFreeChart graficoPie = ChartFactory.createPieChart(
        "Genero de Profesores",
                datos,
                true,
                true,
                false
        );
        
        ChartPanel panel = new ChartPanel(graficoPie);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(300,300));
        
        panelGrafico.setLayout(new BorderLayout());
        panelGrafico.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnCargaMasivaCursos;
    private javax.swing.JButton btnCargaMasivaProf;
    private javax.swing.JButton btnCargaMasivaStudent;
    private javax.swing.JButton btnCreateProfesor;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JButton btnDeleteProf;
    private javax.swing.JButton btnExportCoursePDF;
    private javax.swing.JButton btnExportPDF;
    private javax.swing.JButton btnExportStudentPDF;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnShowGraph;
    private javax.swing.JButton btnShowGraphicAlumnos;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JButton btnUpdateProf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JPanel panelGraficoStudent;
    public static javax.swing.JTable tblCursos;
    public static javax.swing.JTable tblProfesores;
    public static javax.swing.JTable tblStudent;
    // End of variables declaration//GEN-END:variables
}
