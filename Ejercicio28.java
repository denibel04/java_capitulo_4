/**
 * Capítulo 4
 * Ejercicio 28:Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2.
 * Si alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio28 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos que cada uno juegue su turno
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada1 = sc.next();
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugada2 = sc.next();

        // Calculamos el ganador
        if (jugada1.toLowerCase().equals(jugada2.toLowerCase())) {
            System.out.println("Empate");
        } else {
            int ganador = 2;
            switch(jugada1.toLowerCase()) {
                case "piedra":
                    if (jugada2.equals("tijera")) {
                        ganador = 1;
                    }
                    break;
                case "papel":
                    if (jugada2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijera":
                    if (jugada2.equals("papel")) {
                        ganador = 1;
                    }
                    break;
            }
            System.out.println("Gana el jugador " + ganador);
        }
        sc.close();
    }
}