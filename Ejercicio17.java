/**
 * Capítulo 4
 * Ejercicio 17: Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("Por favor, introduzca un número entero: ");
        int n = sc.nextInt();
        // Mostramos el resultado por pantalla
        System.out.println("La última cifra del número introducido es " + n%10);

        sc.close();
    }
}
