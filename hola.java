import java.util.Scanner;

public class hola {
    static Scanner tecla=new Scanner(System.in);
    public static void foco() {
        //variables 
        int nfcos, fverdes=0, fblancos=0, frojos=0;
        //datos entrada 
        System.out.println("ingrese la cantidad de focos ");
        nfcos=tecla.nextInt();
        //proceso
        for(int foco = 1; foco <= nfcos; foco++){
            System.out.println("ingrese el color de foco(V=verde, B=blanco y R=rojo)"+"del foco # "+foco+": ");
            String color=tecla.next();
            if(color.toUpperCase().equals("V")){ fverdes++;}
            if(color.toUpperCase().equals("B")){ fblancos++;}
            if(color.toUpperCase().equals("R")){ frojos+=1;}
            System.out.println("");
        }
        System.out.println("del totalde focos:\n"+fverdes+"son verde(s)\n"+
        fblancos+"son blanco(s)\n"+frojos+"son rojo(s)\nEn total son:"+nfcos);
    }
    public static void main(String[] args) {
     foco();   
    }
}
