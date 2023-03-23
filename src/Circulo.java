import java.util.Scanner;



public class Circulo extends FiguraGeometrica {
    Scanner lectura = new Scanner(System.in);

    @Override
    public double calcularAreaCI() {
        double radio;
        System.out.println("Digite el radio del circulo");
        radio= lectura.nextDouble();
        double resultado = Math.pow(radio, 2);
        double area=3.1416*resultado;
        System.out.println("El area del circulo es"+area);
        return area;


    }

    @Override
    public double calcularAreaC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaC'");
    }

    @Override
    public double calcularAreaT() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaT'");
    }
    
}
