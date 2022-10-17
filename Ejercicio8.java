/**
 * Capítulo 4
 * Ejercicio 8: Amplía el programa anterior (Realiza un programa que calcule la media de tres notas.) para
 * que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("Introduzca las 3 notas de las cuales quiere calcular la media");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        sc.close();

        // Nos aseguramos de que el valor introducido esté bien
        if (nota1 < 0 || nota1 > 10  || nota2 < 0 || nota2 > 10  || nota3 < 0 || nota3 > 10  ) {
            System.out.println("Error. La nota debe ser del 1 al 10");
            System.exit(0); // para finalizar el programa si se introduce un valor incorrecto
        }

        // Calculamos la media
        double media = (nota1+nota2+nota3)/3;
        System.out.printf("La media es %.2f. En el boletín aparecerá ", media);

        // Mostramos la nota del boletín
        if (media>=0 && media<=2) {
            System.out.println("insuficiente.");
        } else if (media>2 && media<=4) {
            System.out.println("suficiente.");
        } else if (media>4 && media<=6) {
            System.out.println("bien.");
        }  else if (media>6 && media<=8) {
            System.out.println("notable.");
        } else {
            System.out.println("sobresaliente.");
        }
    }
}
