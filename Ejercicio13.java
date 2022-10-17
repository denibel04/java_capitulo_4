/**
 * Capítulo 4
 * Ejercicio 13:  Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los fao
        System.out.println("Introduce tres números para ordenarlos de menor a mayor");
        Integer n1 = sc.nextInt();
        Integer n2 = sc.nextInt();
        Integer n3 = sc.nextInt();
        sc.close();

        if (n1<=n2 && n1<=n3) {
            if(n2 <= n3) {
                System.out.print(n1 + " <= " + n2 + " <= " + n3);
            } else{
                System.out.print(n1 + " <= " + n3 + " <= " + n2); }
        } else if (n2<=n1 && n2<=n3) {
            if(n1 <= n3) {
                System.out.print(n2 + " <= " + n1 + " <= " + n3);
            } else{
                System.out.print(n2 + " <= " + n3 + " <= " + n1); }
        } else if (n3<=n1 && n3<=n2) {
            if(n1 <= n2) {
                System.out.print(n3 + " <= " + n1 + " <= " + n2);
            } else{
                System.out.print(n3 + " <= " + n2 + " <= " + n1); }
        }
    }
}
