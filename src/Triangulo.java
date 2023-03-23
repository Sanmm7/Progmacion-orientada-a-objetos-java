import java.util.Scanner;


public  class Triangulo extends FiguraGeometrica {
    Scanner lectura = new Scanner(System.in);


    @Override
    public double calcularAreaT() {
      double base,altura,area;

        System.out.println("digite la base");
         base= lectura.nextDouble();
         System.out.println("digite la altura");
         altura= lectura.nextDouble();
         area=base*altura/2;
         System.out.println("El area del triangulo es "+area);

         return area;

 

    }


    @Override
    public double calcularAreaC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaC'");
    }


    @Override
    public double calcularAreaCI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaCI'");
    }



   

}
