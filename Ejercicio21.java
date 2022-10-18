/**
 * Capítulo 4
 * Ejercicio 21: Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno
 * en los dos primeros controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará
 * la media. En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica
 * como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.print("Nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota del segundo examen: ");
        double nota2 = sc.nextDouble();

        // Calculamos la media
        double media = (nota1 + nota2) / 2;

        // Si la media es suspensa, preguntará por la recuperación. Si es apto, la media será de 5.
        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = sc.next();
            if (recuperacion.equals("apto")) {
                media = 5;
            }
        }
        System.out.print("Tu nota de Programación es " + media);
        sc.close();
    }
}
