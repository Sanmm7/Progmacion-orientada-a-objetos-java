import java.util.Scanner;

public class Cuadrado  extends FiguraGeometrica{
    Scanner lectura = new Scanner(System.in);

    @Override
    public double calcularAreaC() {

        double lado;
        System.out.println("Digite el lado del cuadrado");
        lado= lectura.nextDouble();
        double areac=lado*lado;
        System.out.println("El area del cuadrado es "+areac);
        return areac;

    }

    @Override
    public double calcularAreaT() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaT'");
    }

    @Override
    public double calcularAreaCI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaCI'");
    }

  
    
    
}
