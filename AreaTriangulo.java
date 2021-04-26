import java.util.Scanner;

class AreaTriangulo{
  static Scanner teclado=new Scanner(System.in);

  public static void main(String[] arg){
    //defeinir variables 
    System.out.println("ejercicio 01:n area triangulo");
    int b=0, h=0, area=0;
    //datos de entrada por dispositivos 
    System.out.println("ingrese base:");
    b=teclado.nextInt();
    System.out.println("ingrese altura");
    h=teclado.nextInt();
    //proceso
    area=(b*h)/2;
    //datos de salida
    System.out.println("el area del triangulo es:"+area);
  }
}