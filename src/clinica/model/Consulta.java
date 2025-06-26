package clinica.model;

import java.io.Serializable;
import java.util.List;

public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;
    private Paciente paciente;
    private Medico medico;
    private List<String> sintomas;
    private String diagnostico;
    private String tratamiento;
    
    public Consulta(Paciente paciente, 
                Medico medico, 
                List<String> sintomas, 
                String diagnostico, 
                String tratamiento) {
    this.paciente = paciente;
    this.medico = medico;
    this.sintomas = sintomas;
    this.diagnostico = diagnostico;
    this.tratamiento = tratamiento;
}
    
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public List<String> getSintomas() { return sintomas; }
    public String getDiagnostico() { return diagnostico; }
    public String getTratamiento() { return tratamiento; }

    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }
}