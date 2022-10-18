/**
 * Capítulo 4
 * Ejercicio 24:Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los días que ha estado de
 * viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog. senior o un jefe
 * de proyecto respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto hay que restarle el
 * IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Primero pedimos los datos
        System.out.println("¿Cuál es su cargo?\n1. Programador junior\n2. Programador senior\n3. Jefe de proyecto");
        int cargo = sc.nextInt();
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
        int viajes = sc.nextInt();
        System.out.println("¿Cuál es su estado civil?\n1. Soltero\n2. Casado");
        int estCivil = sc.nextInt();
        sc.close();

        // Definimos el sueldo base
        double sueldoBase = 0;
        switch (cargo) {
            case 1: // Programador junior
                sueldoBase = 950;
                break;
            case 2: // Programador senior
                sueldoBase = 1200;
                break;
            case 3: // Jefe de proyecto
                sueldoBase = 1600;
                break;
            default:
                System.out.println("No ha introducido correctamente su cargo");
                break;
        }

        // Calculamos el extra de los viajes y calculamos el sueldo bruto
        double sueldoDietas = viajes*30;
        double sueldoBruto = sueldoBase + sueldoDietas;
        double irpf = 0;
        double cuantiaIrpf = 0;

        // Ahora le restamos el IRPF dependiendo de su estado civil
        if (estCivil == 1) { // soltero/a
            irpf = 25;
            cuantiaIrpf = sueldoBruto*(irpf/100);
        } else if (estCivil == 2) { // casado/a
            irpf = 20;
            cuantiaIrpf = sueldoBruto*(irpf/100);
        } else {
            System.out.println("No ha introducido su estado civil correctamente");
        }

        // Mostramos la nómina como una tabla:
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.printf("┃ Sueldo base            %7.2f ┃\n", sueldoBase);
        System.out.printf("┃ Dietas (%2d viajes)     %7.2f ┃\n", viajes, sueldoDietas);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ Sueldo bruto           %7.2f ┃\n", sueldoBruto);
        System.out.printf("┃ Retención IRPF (%.0f%%)   %7.2f ┃\n", irpf, cuantiaIrpf);
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.printf("┃ Sueldo neto            %7.2f ┃\n", (sueldoBruto-cuantiaIrpf));
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
}
