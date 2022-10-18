/**
 * Capítulo 4
 * Ejercicio 18: Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten
 * números de hasta 5 cifras.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos y definimos la variable en la que almacenará la primera cifra
        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        int n = sc.nextInt();
        int cifra = 0;

        // Calculamos la primera cifra según el número de cifras que tenga el número
        if ( n < 10 ) {
            cifra = n;
        } else if (( n >= 10 ) && ( n < 100 )) {
            cifra = n / 10;
        } else if (( n >= 100 ) && ( n < 1000 )) {
            cifra = n / 100;
        } else if (( n >= 1000 ) && ( n < 10000 )) {
            cifra = n / 1000;
        } else if ( n >= 10000 ) {
            cifra = n / 10000;
        } else {
            System.out.println("Error. Por favor introduzca un número positivo de hasta 5 cifras");
        }
        System.out.println("La primera cifra del número introducido es el " + cifra);

        sc.close();
    }
}
