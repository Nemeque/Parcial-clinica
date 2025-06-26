package clinica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Clinica implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Persona> personas = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public Clinica() {
        personas = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}