/**
 * Clase Estudiante
 * Representa a un alumno dentro del sistema.
 * Incluye atributos privados para encapsulamiento y métodos públicos para acceder a ellos.
 */
public class Estudiante {

    // 1. Atributos (Estado del objeto)
    private String nombre;
    private int id;
    private double promedio;

    // 2. Constructor (Inicializa el objeto al instanciarlo)
    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.promedio = 0.0; // Valor inicial por defecto
    }

    // 3. Métodos (Comportamiento)

    // Método para asignar una calificación (Setter personalizado)
    public void asignarPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio debe estar entre 0 y 100.");
        }
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("ID: " + this.id + " | Estudiante: " + this.nombre + " | Promedio: " + this.promedio);
    }
    
    // Método que retorna el estado de aprobación
    public boolean haAprobado() {
        return this.promedio >= 60; // Retorna true si pasó, false si no
    }
// --- AGREGAR ESTO EN Estudiante.java ---

    // Getters para permitir que las subclases accedan a los datos privados
    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }

    public double getPromedio() {
        return this.promedio;
    }
}

