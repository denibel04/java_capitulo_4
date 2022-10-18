/**
 * Capítulo 4
 * Ejercicio 22: Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos
 * minutos faltan para el fin de semana. Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da por hecho que el
 * usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el día de la semana
        System.out.println("¿Qué día de la semana es?");
        String dia = sc.next();
        int numDia = 0;

        // Asignamos un número a cada día para calcular los minutos de semana que ya han pasado.
        switch (dia.toLowerCase()) {
            case "lunes":
                numDia = 0;
                break;
            case "martes":
                numDia = 1;
                break;
            case "miercoles", "miércoles":
                numDia = 2;
                break;
            case "jueves":
                numDia = 3;
                break;
            case "viernes":
                numDia = 4;
                break;
            default: // sabado o domingo
                System.out.println("Ya es fin de semana!");
        }

        // Ahora pedimos la hora
        System.out.print("¿Qué hora es?\nDebe introducir primero la hora: ");
        int hora = sc.nextInt();
        System.out.print("y ahora los minutos: ");
        int minutos = sc.nextInt();
        sc.close();

        // Calculamos los minutos transcurridos hasta que llega el fin de semana y los que han pasado hasta ahora
        int minutosFinde = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (numDia * 24 * 60) + (hora*60) + minutos;

        // Mostramos por pantalla los minutos que faltan para el fin de semana
        System.out.println("Para el fin de semana quedan " + (minutosFinde - minutosActuales) + " minutos");

    }
}
