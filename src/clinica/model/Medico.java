package clinica.model;

public class Medico extends Persona {
    private String contrasena;

    public Medico(String usuario, String contrasena) {
        super(usuario);
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}