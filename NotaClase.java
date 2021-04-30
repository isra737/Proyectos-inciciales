import java.util.Scanner;
/**
 * Nota
 */
public class NotaClase {


    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        int nota;// nota ingresada por el profesor
        int suma = 0;//suma entre las notas ingresadas
        int promedio = 0;// promedio de la suma de las notas ingresadas        
    
    System.out.print("Ingrese la cantidad de las notas:");
        nota = leer.nextInt();
    
        for(int i=1; i<= nota; i++){      // Comenzamos con el proceso donde tenemos que infgresar las notas
            System.out.println("ingrese nota"+" "+i+" "+"de"+" "+nota+":"); // damos forma a las notas y a la variables 
            int notas =leer.nextInt();  // se va a ejecutar y va dar las notas
            suma = suma + nota; //el programa va a sumar las notas que hayamos ingresado
        }
            promedio= suma /nota;//despues de que el programa haga la suma de las notas que hayamos ingresados 
            System.out.println("promedio de las notas:"+promedio );//se dara a conocer el promedio de notas que hayamos ingresado
            //FIN del proceso, nos dara el promedio de notas que hayamos ingresado 
    }   
    }


