package clinica.view;

import clinica.model.Consulta;
import clinica.view.ventanaPrincipal;
import clinica.excepciones.campoVacio;
import clinica.excepciones.usuarioNoEncontrado;
import clinica.model.*;
import clinica.viewmodel.clinicaViewModel;
import javax.swing.*;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.List;

public class panelConsulta extends javax.swing.JFrame {
    private clinicaViewModel viewModel;
    private DefaultListModel<String> sintomasModel;

    public panelConsulta(clinicaViewModel viewModel) {
        this.viewModel = viewModel;
        this.sintomasModel = new DefaultListModel<>();
        initComponents();
        symptomsList.setModel(sintomasModel);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patientField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        doctorField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        symptomsField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        symptomsList = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        diagnosisField = new javax.swing.JTextField();
        botonSintomas = new javax.swing.JButton();
        treatmentField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel1.setText("Paciente");
        jLabel1.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(45, 15));

        patientField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel2.setText("Medico");
        jLabel2.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel2.setMinimumSize(new java.awt.Dimension(45, 15));

        doctorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel5.setText("Contraseña");
        jLabel5.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(45, 15));

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel6.setText("Sintomas");
        jLabel6.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(45, 15));

        symptomsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsFieldActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(symptomsList);

        jLabel7.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel7.setText("Diagnostico");
        jLabel7.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(45, 15));

        diagnosisField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisFieldActionPerformed(evt);
            }
        });

        botonSintomas.setText("Registrar Sintoma");
        botonSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSintomasActionPerformed(evt);
            }
        });

        treatmentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel8.setText("Tratamiento");
        jLabel8.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel8.setMinimumSize(new java.awt.Dimension(45, 15));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(symptomsField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patientField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doctorField)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(diagnosisField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(treatmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(botonSintomas))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symptomsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(treatmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSintomas))
                .addGap(123, 123, 123))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Aceptar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegistrar)
                .addGap(18, 18, 18)
                .addComponent(botonRegresar)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonRegresar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientFieldActionPerformed
    }//GEN-LAST:event_patientFieldActionPerformed

    private void doctorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorFieldActionPerformed
    }//GEN-LAST:event_doctorFieldActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        ventanaPrincipal newframe = new ventanaPrincipal(viewModel);
        newframe.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void symptomsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsFieldActionPerformed
    }//GEN-LAST:event_symptomsFieldActionPerformed

    private void diagnosisFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisFieldActionPerformed
    }//GEN-LAST:event_diagnosisFieldActionPerformed

    private void treatmentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentFieldActionPerformed
    }//GEN-LAST:event_treatmentFieldActionPerformed

    private void botonSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSintomasActionPerformed
        try {
            campoVacio.validarCampo(symptomsField, "Síntoma");
            sintomasModel.addElement(symptomsField.getText().trim());
            symptomsField.setText("");
        } catch (campoVacio e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_botonSintomasActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        try {

            campoVacio.validarConsultaMedica(
                patientField, 
                doctorField, 
                jPasswordField1, 
                symptomsList, 
                diagnosisField, 
                treatmentField
            );
            
            String usuarioPaciente = patientField.getText().trim();
            String usuarioMedico = doctorField.getText().trim();
            String contrasenaMedico = new String(jPasswordField1.getPassword());
            
            Paciente paciente = usuarioNoEncontrado.validarPaciente(viewModel, usuarioPaciente);
            Medico medico = usuarioNoEncontrado.validarMedico(viewModel, usuarioMedico);
            
            if (!medico.getContrasena().equals(contrasenaMedico)) {
                throw new usuarioNoEncontrado("Contraseña incorrecta para el médico");
            }
            
            List<String> sintomas = new ArrayList<>();
            for (int i = 0; i < sintomasModel.getSize(); i++) {
                sintomas.add(sintomasModel.getElementAt(i));
            }
            
            Consulta consulta = new Consulta(
                paciente,
                medico,
                sintomas,
                diagnosisField.getText().trim(),
                treatmentField.getText().trim()
            );
            
            viewModel.agregarConsulta(consulta);
            JOptionPane.showMessageDialog(this, "Consulta registrada exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            limpiarCampos();
            
        } catch (campoVacio | usuarioNoEncontrado e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void limpiarCampos() {
        patientField.setText("");
        doctorField.setText("");
        jPasswordField1.setText("");
        symptomsField.setText("");
        diagnosisField.setText("");
        treatmentField.setText("");
        sintomasModel.clear();

    }//GEN-LAST:event_botonRegistrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    clinica.persistencia.persistenciaArchivo persistencia = 
                        new clinica.persistencia.persistenciaArchivo();
                    clinica.viewmodel.clinicaViewModel viewModel = 
                        new clinica.viewmodel.clinicaViewModel(persistencia);
                    
                    new panelConsulta(viewModel).setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, 
                        "Error al iniciar la aplicación: " + e.getMessage(), 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSintomas;
    private javax.swing.JTextField diagnosisField;
    private javax.swing.JTextField doctorField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientField;
    private javax.swing.JTextField symptomsField;
    private javax.swing.JList<String> symptomsList;
    private javax.swing.JTextField treatmentField;
    // End of variables declaration//GEN-END:variables
}