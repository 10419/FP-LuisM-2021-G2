import java.util.Scanner;

public class tarea {
    static Scanner teclado=new Scanner(System.in);
    public static void ejer1() {
        int a;
        double ca, totalinvercion=0, interesanual;
        System.out.println("Bienvenido al banco Luchito");
        System.out.println("ingrese los años de ahorro:");
        a=teclado.nextInt();
        for (int i = 1; i<=a; i++){
            System.out.println("ingrese el ahoro mensual del año :"+i);
            ca=teclado.nextInt();
            
            totalinvercion=totalinvercion+(ca*12);
            interesanual=totalinvercion*0.1;
            totalinvercion=totalinvercion+interesanual;
            System.out.println("el año "+i+" ahorro :"+totalinvercion);
        } 
    }
    public static void ejer2() {
        double s=0, d=0;
        String n;
        System.out.println("Facebook ");
        System.out.println("Ingrese su sueldo");
        s=teclado.nextInt();
        System.out.println("ingrese su nombre:");
        n=teclado.next();
        if (s>1){
            d=s-(0.5*s);
        }
        if (s>150){
            d=s-(0.7*s);
        }
        if (s>300){
            d=s-(0.9*s);
        }
        System.out.println("su sueldo es de: "+d+" dolares mi estimado "+n);

    }
    public static void ejer3() {
        int n;
        System.out.println("ingrese un numero");
        n=teclado.nextInt();
        if (n>0){
            System.out.println("el numero "+n+" elevado al cubo es "+Math.pow(n, 3));
        }
    }
    public static void ejer4(){
        double a, b;
            System.out.print("Introduce un ángulo de : ");
            a = teclado.nextDouble();
            b = Math.toRadians(a);
            System.out.println("Seno de " + a + " es: " + Math.sin(b) );
    
    }
    public static void ejer5(){
        int a, b;
        double c;
        System.out.print("Bienvenido a automotris Luicito REY ");
        System.out.print("Ingrese la clave de su vehiculo (1 a 3) :");
           a= teclado.nextInt();
           System.out.print(" Ingrese el precio de su vehiculo: ");
           b= teclado.nextInt();
           c=Math.toRadians(a);
           if (a==1){
               c=(0.10*b)+b;
           }
           if (a==2){
               c=(0.7*b)+b;
           }
           if (a==3){
               c=(0.5*b)+b;
           }
        System.out.print("El precio de su vehiculos es de "+c);
    } 
    public static void ejer6(){
        System.out.println("bienvenido a la tabla de multiplicar hasta 20");
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = teclado.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=n; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
    public static void ejer7(){
        int ar;
        double pre, des=0, total=0;
        System.out.println("tienda Futrman");
        System.out.println("ingrese la cantidad de articulos:");
        ar=teclado.nextInt();
        for(int i=1;i<=ar;i++){
            System.out.println("ingrese el precio del articulo:"+i);
            pre=teclado.nextDouble();
            if (pre>=200){
                des=pre-(pre*0.15);
            }
            if (pre>=100){
                des=pre-(pre*0.12);
            }
            else {
                des=pre-(pre*0.10);
            }  
            total=(des)*i;

            }
            System.out.println("el total a pagar es de "+total);

        }
        public static void ejer8(){
        int si=1500;
        double sr=0;
        System.out.println("Bienvenido a la UPeU");
        for (int i = 1; i<=6; i++){
            sr=si*Math.pow(1.1,i);
            System.out.println("el año "+i+" su sueldo fue:"+sr);
        }
    }
    public static void ejer9() {
        int tra;
        String nom;
        double suel, des=0, ho;
        System.out.println("ingrese la cantidad de trabajadores: ");
        tra=teclado.nextInt();
        for(int i=1; i<=tra; i++){
            System.out.println("Ingrese el nombre del trabjador: "+i);
            nom=teclado.next();
                
                System.out.println("Ingrese el sueldo del trabajador: "+i);
                    suel=teclado.nextDouble();
                System.out.println("ingrese las horas de trabajo: "+i);
                     ho=teclado.nextDouble();                
            if (suel<150){
                des=suel-(0.5*suel);
            }
            if (suel>150&&suel<300){
                des=suel-(0.7*suel);
            }
            if (suel>299&&suel<401) {
                des=suel-(0.9*suel);
            }
            System.out.println("el sueldo de "+nom+" es de "+des+" dolares, por las"+ho+" horas de trabajo; gracias por trabjar con nosotros");
        }
    }
    public static void ejer10(){
        int nFocos, fVerde=0, fBlanco=0, fRojo=0;
        //Datos de entrada
        System.out.println("Ingrese N cantidad de Focos:");
        nFocos=teclado.nextInt();
        //Proceso
        for (int foco = 1; foco <= nFocos; foco++) {
            System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo)"+
            "del foco # "+foco+":");
            String color=teclado.next();
            if(color.toUpperCase().equals("V")){ fVerde++; }
            if(color.toUpperCase().equals("B")){ fBlanco=fBlanco+1; }
            if(color.toUpperCase().equals("R")){ fRojo+=1; }
            System.out.println("");
        }
        //Datos de salida
        System.out.println("Del total de focos:\n"+fVerde+" son Verde(s)\n"+
        fBlanco+" son Blanco(s)\n"+fRojo+" son Rojo(s)\nEn total son:"+nFocos);
    }
    public static void sirvase_profe_XD(){
        String mensaje="selecione lo que quiere ejecutar :"+
        "\n1=Banco Luchito"+
        "\n2=Facebook"+
        "\n3=Cubodromo XD"+
        "\n4=Calculamdo el seno"+
        "\n5=Automotris Luiscito Rey"+
        "\n6=Tabla de multiplicar"+
        "\n7=tienda Futrman"+
        "\n8=Sueldo por 6 años"+
        "\n9=Trabajadores"+
        "\n10=Focos"+
        "\n0=Salir del programa";
        
        System.out.println(mensaje);
        int opcion=0;
        do{
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: ejer1();break;
                case 2: ejer2();;break;
                case 3: ejer3();;break;
                case 4: ejer4();break;
                case 5: ejer5();break;
                case 6: ejer6();break;
                case 7: ejer7();break;
                case 8: ejer8();break;
                case 9: ejer9();break;
                case 10: ejer10();break;
            }
            if(opcion!=0)
            System.out.println("\n Desea seguir probando: "+mensaje);
            
        }while(opcion!=0);        
    }
    
        public static void main(String[] args) {
            sirvase_profe_XD();
        }   
}
