package Salud;

import java.util.Scanner;

public class Persona {
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    public Persona(String string, String string2, String string3, String string4, int i, int j, int k, char c) {
        // Constructor vacío
    }

    public Persona(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de documento: ");
        tipoDoc = sc.nextLine();

        System.out.print("Documento: ");
        documento = sc.nextLine();

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Apellido: ");
        apellido = sc.nextLine();

        System.out.print("Peso (en kg): ");
        peso = sc.nextDouble();

        System.out.print("Estatura (en m): ");
        estatura = sc.nextDouble();

        System.out.print("Edad: ");
        edad = sc.nextInt();

        System.out.print("Sexo: ");
        sexo = sc.next();
        sc.close();

    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso (en kg): " + peso);
        System.out.println("Estatura (en m): " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public String calcularImc() {
        double imc = this.peso / (this.estatura * this.estatura);
    
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc >= 20 && imc <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    

    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

}
