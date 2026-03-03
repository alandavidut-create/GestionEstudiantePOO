/**
 * Clase Derivada: EstudianteVirtual
 * Representa a los alumnos que toman clases en línea.
 */
public class EstudianteVirtual extends Estudiante {
    
    // Atributo exclusivo
    private String plataforma; // ej: "Zoom", "Teams"

    public EstudianteVirtual(String nombre, int id, String plataforma) {
        super(nombre, id); // Reutilizamos la lógica del padre
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Reutilizamos el mostrado de ID, Nombre y Promedio
        System.out.println("   -> Modalidad: Virtual | Plataforma: " + this.plataforma);
    }
}