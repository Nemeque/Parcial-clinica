package clinica.model;
import java.io.Serializable;

public abstract class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String usuario;

    public Persona(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}