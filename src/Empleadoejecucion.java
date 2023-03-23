import java.util.Scanner;

import reto3.Empleado;

public class Empleadoejecucion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el tipo de documento (CC, CE, TI, etc.):");
            String tipoDocumento = scanner.nextLine();

            System.out.println("Ingrese el número de documento:");
            String numeroDocumento = scanner.nextLine();

            System.out.println("Ingrese los nombres:");
            String nombres = scanner.nextLine();

            System.out.println("Ingrese los apellidos:");
            String apellidos = scanner.nextLine();

            System.out.println("Ingrese el cargo:");
            String cargo = scanner.nextLine();

            System.out.println("Ingrese el valor por hora:");
            double valorHora = scanner.nextDouble();

            System.out.println("Ingrese las horas trabajadas:");
            double horasTrabajadas = scanner.nextDouble();

            System.out.println("Ingrese el departamento:");
            String departamento = scanner.next();

            Empleado empleado = new Empleado(tipoDocumento, numeroDocumento, nombres, apellidos, cargo, valorHora, horasTrabajadas, departamento);
            empleado.imprimirInformacion();
        }
    }
}


