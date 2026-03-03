/**
 * Clase Derivada: EstudiantePresencial
 * Hereda todos los atributos y métodos de Estudiante.
 * Agrega funcionalidad específica para alumnos que van al campus.
 */
public class EstudiantePresencial extends Estudiante { // 'extends' activa la herencia
    
    // Atributo exclusivo de esta subclase
    private String aula;

    // Constructor
    public EstudiantePresencial(String nombre, int id, String aula) {
        // 'super' llama al constructor de la clase padre (Estudiante)
        // Esto reutiliza el código de asignación de nombre e id.
        super(nombre, id); 
        this.aula = aula;
    }

    // Sobrescritura de método (Polimorfismo)
    // Modificamos mostrarInfo para que TAMBIÉN muestre el aula
    @Override
    public void mostrarInfo() {
        // Llamamos al método original de la clase padre para no reescribirlo
        super.mostrarInfo(); 
        // Agregamos lo nuevo
        System.out.println("   -> Modalidad: Presencial | Aula: " + this.aula);
    }
}