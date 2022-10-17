/**
 * Capítulo 4
 * Ejercicio 3: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el número
        System.out.println("Introduzca un número del 1 al 7");
        int dia = sc.nextInt();

        // Mostramos el día de la semana según corresponda
        switch (dia) {
            case 1:
                System.out.println("El número introducido corresponde al lunes");
                break;
            case 2:
                System.out.println("El número introducido corresponde al martes");
                break;
            case 3:
                System.out.println("El número introducido corresponde al miércoles");
                break;
            case 4:
                System.out.println("El número introducido corresponde al jueves");
                break;
            case 5:
                System.out.println("El número introducido corresponde al viernes");
                break;
            case 6:
                System.out.println("El número introducido corresponde al sábado");
                break;
            case 7:
                System.out.println("El número introducido corresponde al domingo");
                break;
            default:
                System.out.println("El número introducido es incorrecto");
        }
        sc.close();
    }
}
