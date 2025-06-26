package clinica.persistencia;

import clinica.model.Clinica;
import clinica.model.IPersistencia;
import java.io.*;

public class persistenciaArchivo implements IPersistencia {
    
    private static final String ARCHIVO = System.getProperty("user.dir") + "/data/datos_clinica.ser";

    @Override
    public void guardarDatos(Clinica clinica) {
        try {
            File archivo = new File(ARCHIVO);
            
            File directorio = archivo.getParentFile();
            if (directorio != null && !directorio.exists()) {
                directorio.mkdirs();
            }
            
            System.out.println("Guardando en: " + archivo.getAbsolutePath());
            
            try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(archivo))) {
                oos.writeObject(clinica);
                System.out.println("¡Archivo creado exitosamente!");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public Clinica cargarDatos() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            System.out.println("No existe archivo previo, creando nueva clínica");
            return new Clinica();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
             new FileInputStream(archivo))) {
            return (Clinica) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar: " + e.getMessage());
            return new Clinica();
        }
    }
}