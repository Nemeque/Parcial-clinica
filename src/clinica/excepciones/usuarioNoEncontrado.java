package clinica.excepciones;

import clinica.model.Paciente;
import clinica.model.Medico;
import clinica.viewmodel.clinicaViewModel;

public class usuarioNoEncontrado extends Exception {
    
    public static Paciente validarPaciente(clinicaViewModel viewModel, String usuario) 
        throws usuarioNoEncontrado {
        Paciente paciente = viewModel.obtenerPaciente(usuario);
        if (paciente == null) {
            throw new usuarioNoEncontrado("Paciente no registrado");
        }
        return paciente;
    }
    
    public static Medico validarMedico(clinicaViewModel viewModel, String usuario) 
        throws usuarioNoEncontrado {
        Medico medico = viewModel.obtenerMedico(usuario);
        if (medico == null) {
            throw new usuarioNoEncontrado("Médico no registrado");
        }
        return medico;
    }
    
    public usuarioNoEncontrado(String mensaje) {
        super(mensaje);
    }
}