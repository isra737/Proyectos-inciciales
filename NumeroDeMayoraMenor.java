
import java.util.Scanner;

public class NumeroDeMayoraMenor {
    


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int cant,numAux,i,j;
    System.out.print("Ingrese la cantidad de numeros que quiera: ");//aqui vamos a ingresar los numeros que queramos 2, 3 10 y el programa te los a ordenar 
    cant = sc.nextInt();
    int[] numeros = new int[cant + 1];//empezamos a darle forma a las variables 
    for(i = 1; i <= cant; i++)
    {
     System.out.print("Ingrese el numero (" + i + ") : ");// el usuario va a ingresar los numeros y la cantidad que el quiera, con el orden que quiera
     numeros[i] = sc.nextInt();//seguimos con el procedimiento de la sintaxis para poder ordenar los numeros de mayor a menor 
    }
    for(i = 1; i <= cant; i++)
    {
    for(j = i; j <= cant; j++)
    {
    if(numeros[i] < numeros[j])
    {
    numAux = numeros[i];
    numeros[i] = numeros[j];
    numeros[j] = numAux;
    }
}//Cuando el usuario termine de ingresar la cantidad de numeros, el programa se los a ordenar de mayor a menor por ejemplo: 1000, 600, 489, 388...
    
}
    System.out.println("\nLos números de mayor a menor son:"); //el programa le va a lanzar los numeros de mayor a menor 
    for(i = 1; i <= cant; i++)
    {
    System.out.println(numeros[i]);
    }//Fin del proceso
  }
}