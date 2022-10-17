/**
 * Capítulo 4
 * Ejercicio 6:Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m²
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio6 {
    // Definimos la variable fuera del main
    final static double g = 9.81;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos y calculamos el tiempo
        System.out.println("Introduce la altura a la que se deja caer");
        double h = sc.nextDouble();
        double t = Math.sqrt(2*h/g);

        // Mostramos los datos por pantalla
        if (h<0) {
            System.out.println("Error. La altura no puede ser negativa");
        } else {
            System.out.printf("El objeto tardará %.2f segundos en caer", t);
        }
        sc.close();
    }
}
