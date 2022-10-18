/**
 * Capítulo 4
 * Ejercicio 20: Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa.
 * Se permiten números de hasta 5 cifras.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el número y definimos el booleano
        System.out.println("Por favor, introduzca el número entero que quiera saber si es capicúo. Se admiten números de hasta 5 cifras");
        int n = sc.nextInt();
        boolean capicua = false;

        // Para 1 cifra:
        if (n < 10) {
            capicua = true;
        } else if ((n >= 10) && (n < 100)) { // para 2 cifras
            if ((n / 10) == (n % 10)) {
                capicua = true;
            }
        } else if  ((n >= 100) && (n < 1000)) { // para 3 cifras
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        } else if  ((n >= 1000) && (n < 10000)) { // para 4 cifras
            if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
                capicua = true;
            }
        } else if  ((n >= 10000) && (n<100000)) { // para 5 cifras
            if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                capicua = true;
            }
        }

        // Mostramos por pantalla el resultado
        if (capicua) {
            System.out.println("El número introducido es capicúo.");
        } else {
            System.out.println("El número introducido no es capicúo."); }

        sc.close();
    }
}