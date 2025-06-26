package clinica.model;

public interface IPersistencia {
    void guardarDatos(Clinica clinica);
    Clinica cargarDatos();
}