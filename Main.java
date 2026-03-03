public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestión con Herencia ---\n");

        // 1. Instanciamos un Estudiante Presencial
        EstudiantePresencial alumno1 = new EstudiantePresencial("Juan Pérez", 101, "Edificio A - Sala 3");
        alumno1.asignarPromedio(85.0); // Usamos método heredado de la clase base

        // 2. Instanciamos un Estudiante Virtual
        EstudianteVirtual alumno2 = new EstudianteVirtual("Maria Gomez", 102, "Google Meet");
        alumno2.asignarPromedio(92.5); // Usamos método heredado

        // 3. Demostración de Polimorfismo
        // Al llamar a mostrarInfo(), Java sabe cuál versión usar automáticamente
        System.out.println("Información del Alumno 1:");
        alumno1.mostrarInfo(); 
        System.out.println("\nInformación del Alumno 2:");
        alumno2.mostrarInfo();
    }
}