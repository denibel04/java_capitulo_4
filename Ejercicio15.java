/**
 * Capítulo 4
 * Ejercicio 15: Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá
 * ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú
 * elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa imprimirá una pirámide. Elija el símbolo, letra o número");
        String s = sc.next();
        System.out.println("¿Hacia dónde quiere que apunte el vértice?\n1. arriba\n2. abajo\n3. izquierda\n4. derecha");
        int orientacion = sc.nextInt();
        sc.close();
        switch(orientacion) {
            case 1:
                System.out.println(" " + s);
                System.out.println(" " + s + s + s);
                System.out.println(s + s + s + s + s);
                break;
            case 2:
                System.out.println(s + s + s + s + s);
                System.out.println(" " + s + s + s);
                System.out.println(" " + s);
                break;
            case 3:
                System.out.println("  " + s);
                System.out.println(" " + s + s);
                System.out.println(s + s + s);
                System.out.println(" " + s + s);
                System.out.println("  " + s);
                break;
            case 4:
                System.out.println(s);
                System.out.println(s + s);
                System.out.println(s + s + s);
                System.out.println(s + s);
                System.out.println(s);
                break;
            default:
                System.out.println("Error. Introduzca una opción válida.");
        }
    }
}
