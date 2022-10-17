/**
 * Capítulo 4
 * Ejercicio 11: Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos los datos
        System.out.println("Introduzca la hora y después los minutos");
        int hora = sc.nextInt();
        int minutos = sc.nextInt();
        sc.close();

        // Nos aseguramos de que los datos introducidos sean correctos
        if (hora<=0 || hora>24 || minutos<=0 || minutos>60){
            System.out.println("Error. Introduzca la hora correctamente");
            System.exit(0); // para finalizar el programa si se introduce un valor incorrecto
        }

        // Los pasamos a segundos y calculamos los que faltan hasta media noche
        int segundos = (hora * 3600) + (minutos * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundos;

        // Mostramos los segundos restantes
        System.out.printf("Desde las %d:%d hasta la medianoche faltan %d segundos", hora, minutos, segundosHastaMedianoche);

    }
}
