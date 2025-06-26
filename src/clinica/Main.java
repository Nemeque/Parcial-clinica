package clinica;

import clinica.view.ventanaPrincipal;
import clinica.persistencia.persistenciaArchivo;
import clinica.viewmodel.clinicaViewModel;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        persistenciaArchivo persistencia = new persistenciaArchivo();
        clinicaViewModel viewModel = new clinicaViewModel(persistencia);
        
        SwingUtilities.invokeLater(() -> {
            ventanaPrincipal ventana = new ventanaPrincipal();
            ventana.setVisible(true);
        });
    }
}