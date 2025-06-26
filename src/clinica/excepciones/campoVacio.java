package clinica.excepciones;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class campoVacio extends Exception {

    public campoVacio(String mensaje) {
        super(mensaje);
    }

    public static void validarCampo(JTextField campo, String nombreCampo) throws campoVacio {
        if (campo.getText().trim().isEmpty()) {
            throw new campoVacio("El campo '" + nombreCampo + "' es obligatorio");
        }
    }

    public static void validarPassword(JPasswordField campo, String nombreCampo) throws campoVacio {
        if (campo.getPassword().length == 0) {
            throw new campoVacio("El campo '" + nombreCampo + "' es obligatorio");
        }
    }

    public static <T> void validarLista(JList<T> lista, String nombreLista) throws campoVacio {
        if (lista.getModel().getSize() == 0) {
            throw new campoVacio("Debe agregar al menos un elemento en '" + nombreLista + "'");
        }
    }

    public static void validarCombo(JComboBox<?> combo, String nombreCombo) throws campoVacio {
        if (combo.getSelectedItem() == null || combo.getSelectedItem().toString().isEmpty()) {
            throw new campoVacio("Debe seleccionar una opción en '" + nombreCombo + "'");
        }
    }
    
    public static void validarCheckbox(JCheckBox checkbox, String mensaje) throws campoVacio {
        if (!checkbox.isSelected()) {
            throw new campoVacio(mensaje);
        }
    }

    public static void validarRegistroUsuario(
        JTextField campoUsuario,
        JCheckBox checkMedico,
        JCheckBox checkPaciente,
        JPasswordField campoContrasena
    ) throws campoVacio {
        List<String> errores = new ArrayList<>();

        if (campoUsuario.getText().trim().isEmpty()) {
            errores.add("✖ El nombre de usuario es obligatorio");
        }

        if (!checkMedico.isSelected() && !checkPaciente.isSelected()) {
            errores.add("✖ Debe seleccionar un tipo de usuario");
        }

        if (checkMedico.isSelected() && campoContrasena.getPassword().length == 0) {
            errores.add("✖ La contraseña es obligatoria para médicos");
        }
        
        if (!errores.isEmpty()) {
            throw new campoVacio(unirErrores(errores));
        }
    }

    public static void validarConsultaMedica(
        JTextField pacienteField,
        JTextField medicoField,
        JPasswordField passwordField,
        JList<String> sintomasList,
        JTextField diagnosticoField,
        JTextField tratamientoField
    ) throws campoVacio {
        List<String> errores = new ArrayList<>();
        
        if (pacienteField.getText().trim().isEmpty()) {
            errores.add("✖ El campo 'Paciente' es obligatorio");
        }
        
        if (medicoField.getText().trim().isEmpty()) {
            errores.add("✖ El campo 'Médico' es obligatorio");
        }
        
        if (passwordField.getPassword().length == 0) {
            errores.add("✖ La contraseña es obligatoria");
        }
        
        if (sintomasList.getModel().getSize() == 0) {
            errores.add("✖ Debe agregar al menos un síntoma");
        }
        
        if (diagnosticoField.getText().trim().isEmpty()) {
            errores.add("✖ El diagnóstico es obligatorio");
        }
        
        if (tratamientoField.getText().trim().isEmpty()) {
            errores.add("✖ El tratamiento es obligatorio");
        }
        
        if (!errores.isEmpty()) {
            throw new campoVacio("Errores encontrados:\n" + unirErrores(errores));
        }
    }
    
    private static String unirErrores(List<String> errores) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < errores.size(); i++) {
            sb.append(errores.get(i));
            if (i < errores.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}