//Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve y diez.
import java.util.Scanner;

public class NotaEstudiante {
   
    static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
       
int nota;
       
        System.out.println("Escribe una nota del numero 0 al 10");
        nota=sc.nextInt();//Explicamos que primero tenemos que ingresar una nota del 0 al 10
       
        switch (nota) { 
        case 0:
            System.out.println("Cero");//Si la persona escribe el numero 0 le va a parecer en Letras
            break;
        case 1:
            System.out.println("Uno");//Si la persona escribe el numero 1 le va a parecer en Letras
            break;
        case 2:
            System.out.println("Dos");//Si la persona escribe el numero 2 le va a parecer en Letras
            break;
        case 3:
            System.out.println("Tres");//Si la persona escribe el numero 3 le va a parecer en Letras
            break;
        case 4:
            System.out.println("Cuatro");//Si la persona escribe el numero 4 le va a parecer en Letras
            break;
        case 5:
            System.out.println("Cinco");//Si la persona escribe el numero 5 le va a parecer en Letras
            break;
        case 6:
            System.out.println("Seis");//Si la persona escribe el numero 6 le va a parecer en Letras
            break;
        case 7:
            System.out.println("Siete");//Si la persona escribe el numero 7 le va a parecer en Letras
            break;
        case 8:
            System.out.println("Ocho");//Si la persona escribe el numero 8 le va a parecer en Letras
            break;
        case 9:
            System.out.println("Nueve");//Si la persona escribe el numero 9 le va a parecer en Letras
            break;
        case 10:
            System.out.println("Diez");//Si la persona escribe el numero 10 le va a parecer en Letras
            break;
        default:
            System.out.println("No valido");// si la persona coloca un numero negativo (ejemplo:-1) o un numero mayor a 10, entonces le va a dar un error y le va a salir no valido
            break;
        }
    }
}

