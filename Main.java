/**
 * Clase Principal
 * Punto de entrada de la aplicación para probar la lógica.
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Sistema de Gestión de Estudiantes Iniciado ---\n");

        // 1. Instanciación de Objetos (Crear objetos a partir de la clase Estudiante)
        Estudiante estudiante1 = new Estudiante("Ana López", 101);
        Estudiante estudiante2 = new Estudiante("Carlos Ruiz", 102);

        // 2. Uso de Métodos
        
        // Asignamos calificaciones
        estudiante1.asignarPromedio(95.5);
        estudiante2.asignarPromedio(55.0);

        // Mostramos la información (Prueba de métodos)
        estudiante1.mostrarInfo();
        System.out.println("¿Aprobó?: " + (estudiante1.haAprobado() ? "Sí" : "No"));
        
        System.out.println(); // Salto de línea

        estudiante2.mostrarInfo();
        System.out.println("¿Aprobó?: " + (estudiante2.haAprobado() ? "Sí" : "No"));
    }
}