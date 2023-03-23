import java.util.Scanner;

public abstract class FiguraGeometrica {

    public abstract double calcularAreaC();
    public abstract double calcularAreaT();
    public abstract double calcularAreaCI();


    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int eleccion,op;
        System.out.println("Cuantas veces desea ejectura ");
        op= lectura.nextInt();
        while(op>=1){
 
            System.out.println("Digite 1 para calcular el area del cuadrado, 2 para el area del circulo,3 para el area del triangulo");
        eleccion= lectura.nextInt();
        if(eleccion==1){
            
          Cuadrado cuadrado = new Cuadrado();
         cuadrado.calcularAreaC();
     


        }
        if(eleccion==2){
            
            Circulo circulo = new Circulo();
           circulo.calcularAreaCI();
       
  
  
          }
          if(eleccion==3){
            
            Triangulo triangulo = new Triangulo();
            triangulo.calcularAreaT();
       
  
  
          }
        op=op-1;

    }
    lectura.close();

}
    

}
