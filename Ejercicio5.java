/**
 * Capítulo 4
 * Ejercicio 5: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b=0).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("Este programa resuelve una ecuación de primer grado (del tipo ax+b=0)\nIntroduzca el valor de a");
        double a = sc.nextDouble();
        System.out.println("Introduzca el valor de b");
        double b = sc.nextDouble();

        // Mostramos por pantalla el resultado
        if (a==0) {
            System.out.println("Esta ecuación no tiene solución real");
        } else {
            System.out.println("x = " + (-b/a));
        }

        sc.close();
    }
}
