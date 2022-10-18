/**
 * Capítulo 4
 * Ejercicio 27: Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El programa preguntará primero
 * de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso
 * de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale
 * 14 euros y la segunda 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; la nata suma 2.50 y la
 * escritura del nombre 2.75.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio27 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos las variables de precio que necesitaremos
        double precioSabor = 0;
        double precioNata = 0;
        double precioNombre = 0;

        // Preguntamos por el sabor
        System.out.println(" -- Este programa calcula presupuestos de tartas. -- \n¿De qué sabor quiere la tarta? \nOpciones: manzana, fresa, chocolate");
        String sabor = sc.next();
        String saborChoc = "";
        if (sabor.toLowerCase().equals("chocolate")) { // Preguntamos por el tipo de chocolate
            System.out.println("¿Chocolate negro o blanco?");
            saborChoc = sc.next();
        }
        // Definimos el precio según el sabor
        switch (sabor.toLowerCase()){
            case "manzana":
                precioSabor = 18;
                break;
            case "fresa":
                precioSabor = 16;
                break;
            case "chocolate":
                if (saborChoc.toLowerCase().equals("negro")) {
                    precioSabor = 15;
                } else if (saborChoc.toLowerCase().equals("blanco")){
                    precioSabor = 14;
                } break;
            default:
                System.out.println("No tenemos ese sabor. Elija una de las opciones anteriores.");
        }

        // Preguntamos por la nata y el nombre
        System.out.println("¿Quiere nata?");
        String conNata = sc.next();
        System.out.println("¿Quiere ponerle un nombre?");
        String conNombre = sc.next();

        // Imprimimos la factura
        System.out.printf("Tarta sabor %s %s: %.2f € \n", sabor.toLowerCase(), saborChoc.toLowerCase(), precioSabor);
        if (conNata.toLowerCase().equals("si")){
            precioNata = 2.5;
            System.out.printf("Con nata : %.2f € \n", precioNata);
        }
        if (conNombre.toLowerCase().equals("si")){
            precioNombre = 2.75;
            System.out.printf("Con nombre : %.2f € \n", precioNombre);
        }

        // Imprimimos el total:
        System.out.printf("Total: %.2f", (precioSabor+precioNata+precioNombre));

        sc.close();
    }
}