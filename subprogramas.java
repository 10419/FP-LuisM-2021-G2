

public class subprogramas 
{
    public int factorial(int num)
     {
         int resultf=1; 
         if(num>1){
             for (int i =1; i < num; i++);{
             resultf*=i;
            }

         return resultf;
    }
    public int potencia()
    {
        return 0;
    }
    public void funcionexpo() 
    {
        System.out.println("factorial"+factorial(5));
    }
}