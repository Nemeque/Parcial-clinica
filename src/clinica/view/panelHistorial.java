package clinica.view;

import clinica.excepciones.campoVacio;
import clinica.viewmodel.clinicaViewModel;
import javax.swing.*;
import javax.swing.DefaultListModel;
import java.util.List;

public class panelHistorial extends javax.swing.JFrame {
    private clinicaViewModel viewModel;
    private DefaultListModel<String> historialModel;

    public panelHistorial(clinicaViewModel viewModel) {
        this.viewModel = viewModel;
        this.historialModel = new DefaultListModel<>();
        initComponents();
        symptomsList.setModel(historialModel);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonlimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        symptomsList = new javax.swing.JList<>();
        botonhistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonlimpiar.setText("Limpiar listado");
        botonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonlimpiar)
                .addGap(18, 18, 18)
                .addComponent(botonRegresar)
                .addGap(66, 66, 66))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegresar)
                    .addComponent(botonlimpiar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel1.setText("Usuario");
        jLabel1.setMaximumSize(new java.awt.Dimension(45, 15));
        jLabel1.setMinimumSize(new java.awt.Dimension(45, 15));

        UserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFieldActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(symptomsList);

        botonhistorial.setText("mostrar historial");
        botonhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonhistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botonhistorial)
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonhistorial))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        ventanaPrincipal newframe = new ventanaPrincipal(viewModel);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void UserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFieldActionPerformed
    }//GEN-LAST:event_UserFieldActionPerformed

    private void botonhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonhistorialActionPerformed
        try {
            campoVacio.validarCampo(UserField, "Usuario");
            
            historialModel.clear();
            String usuario = UserField.getText().trim();
            List<String> historial = viewModel.obtenerHistorial(usuario);
            
            if(historial.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontró historial para: " + usuario, 
                    "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                for(String entrada : historial) {
                    historialModel.addElement(entrada);
                }
            }
        } catch (campoVacio e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener historial: " + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_botonhistorialActionPerformed

    private void botonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlimpiarActionPerformed
        historialModel.clear();
        UserField.setText("");
    }//GEN-LAST:event_botonlimpiarActionPerformed

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            clinica.persistencia.persistenciaArchivo persistencia = 
                new clinica.persistencia.persistenciaArchivo();
            clinica.viewmodel.clinicaViewModel viewModel = 
                new clinica.viewmodel.clinicaViewModel(persistencia);
            
            new panelHistorial(viewModel).setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserField;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonhistorial;
    private javax.swing.JButton botonlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> symptomsList;
    // End of variables declaration//GEN-END:variables
}
