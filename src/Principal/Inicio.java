package Principal;

import Salud.Persona;

public class Inicio {

    public static void main(String[] args) {
        Persona persona1 = new Persona("cc", "20455798", "Santiago", "Mesa", 0, 0, 0, 'm');
        persona1.pedirDatos();
        persona1.mostrarPersona();
        String imcResultado = persona1.calcularImc();
        if (imcResultado.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal.");
        } else if (imcResultado.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }
persona1.mayorEdad();
    }
    
}
