package clinica.viewmodel;

import clinica.model.Clinica;
import clinica.model.Consulta;
import clinica.model.IPersistencia;
import clinica.model.Medico;
import clinica.model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class clinicaViewModel {
    private Clinica clinica;
    private IPersistencia persistencia;
    
    public clinicaViewModel(IPersistencia persistencia) {
        this.persistencia = persistencia;
        this.clinica = persistencia.cargarDatos();
    }
    
    public void registrarMedico(String usuario, String contrasena) {
        clinica.agregarPersona(new Medico(usuario, contrasena));
        persistencia.guardarDatos(clinica);
    }
    
    public void registrarPaciente(String usuario) {
        clinica.agregarPersona(new Paciente(usuario));
        persistencia.guardarDatos(clinica);
    }
    public Paciente obtenerPaciente(String usuario) {
    return clinica.getPersonas().stream()
        .filter(p -> p instanceof Paciente)
        .map(p -> (Paciente)p)
        .filter(p -> p.getUsuario().equals(usuario))
        .findFirst()
        .orElse(null);
}

public Medico obtenerMedico(String usuario) {
    return clinica.getPersonas().stream()
        .filter(p -> p instanceof Medico)
        .map(p -> (Medico)p)
        .filter(p -> p.getUsuario().equals(usuario))
        .findFirst()
        .orElse(null);
}
public void agregarConsulta(Consulta consulta) {
    clinica.agregarConsulta(consulta);
    persistencia.guardarDatos(clinica);
}
public List<String> obtenerHistorial(String usuario) {
    List<String> historial = new ArrayList<>();
    
    for(Consulta consulta : clinica.getConsultas()) {
        if(consulta.getPaciente().getUsuario().equals(usuario) || 
           consulta.getMedico().getUsuario().equals(usuario)) {
            
            String entrada = String.format("Paciente: %s | Médico: %s | Síntomas: %s | Diagnóstico: %s | Tratamiento: %s",
                consulta.getPaciente().getUsuario(),
                consulta.getMedico().getUsuario(),
                String.join(", ", consulta.getSintomas()),
                consulta.getDiagnostico(),
                consulta.getTratamiento());
                
            historial.add(entrada);
        }
    }
    return historial;
}
}