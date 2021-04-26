package main
import "fmt"
func main() {
  //declaracion de varibles
  fmt.Println("Ejercicio 01:Area Triangulo")
  var b int
  var h int
  var area float64
  //datos de lectura
  fmt.Println("Ingrese Base:")
  fmt.Scanln(&b)
  fmt.Println("Ingrese Altura:")
  fmt.Scanln(&h)
  //proceso
  area=float64((b*h)/2)
  //datos de salida
  fmt.Println("el area es: ",area) 
}