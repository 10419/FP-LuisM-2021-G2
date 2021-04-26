#include }<iostream>
int main () {
  //definir variables 
  printf("ejercicio 01");
  int b=0, h=0, area=0;
  //Datos de Entrada
     printf("Ingrese Base:");
     scanf("%i", &b);
     printf("Ingrese Altura:");
     scanf("%i", &h);
     //Proceso
     area=(b*h)/2;
    //Datos de Salida
    printf("Area de Triangulo es:%i %s", area, "\n");
    return 0;
}