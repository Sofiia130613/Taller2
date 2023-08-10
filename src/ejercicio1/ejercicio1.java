package ejercicio1;
public class ejercicio1 {
    
 //1. Registro de Alumnos:
//Crea una clase Alumno con propiedades como nombre, edad y calificaciones.
// Luego, crea una clase SistemaAlumnos que permite agregar alumnos,asignar calificaciones , calcular el promedio de sus calificaciones y mostrar la información de cada alumno.
   
    public static void main(String[] args){

        alumno a1=new alumno("Juan",12,3.5,true);
        System.out.println("El nombre del estudiante es: " +a1.devuelveNombre());
        System.out.println("La edad del estudiante es: " +a1.devuelveEdad());
        System.out.println("La calificación del estudiante es: " +a1.devuelveCalificacion());
        System.out.println("La aprobación del estudiante es: " +a1.devuelveAprobacion());
       
    }
}
