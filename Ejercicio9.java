/**
 * Capítulo 4
 * Ejercicio 9: Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax² + bx + c = 0).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("Este programa resuelve una ecuación de segundo grado (ax² + bx + c = 0).\na = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();
        sc.close();

        if (((a == 0) && (b == 0) && (c == 0))) {  // 0x² + 0x + 0 = 0
            System.out.println("La ecuación tiene infinitas soluciones");
        } else if ((a == 0) && (b == 0) && (c != 0)) { // 0x² + 0x + c = 0
            System.out.println("La ecuación no tiene solución.");
        } else if ((a != 0) && (b != 0) && (c == 0)) { // ax² + bx + 0 = 0 (a y b != 0)
            System.out.println("x1 = 0\nx2 = " + (-b/a));
        } else if  ((a == 0) && (b != 0) && (c != 0)) { // 0x² + bx + c = 0 (b y c != 0)
            System.out.println("x1 = x2 = " + (-c/b));
        } else { // (a, b y c != 0)
            double x1 = (-b + Math.sqrt(4*a*c))/(2 * a);
            double x2 = (-b - Math.sqrt(4*a*c))/(2 * a);
            System.out.printf("x1 = %.2f \nx2 = %.2f", x1, x2);
        }
    }
}
