    import java.util.Scanner;
    public class Cuadrado {
public static void main(String[] args) {
    Scanner Sca = new Scanner(System.in);
    
    System.out.print("Programa que calcula el cuadrado de un Numero\n\n");//en este ejercicio no voy  a colocar tantos comentarios 
    
    System.out.print("Ingresar el numero a elevar al cuadrado: ");
    int n1 = Sca.nextInt();
    
    int Resultado = n1 * n1;
    
    System.out.print( n1 + " elevado al cuadrado es: " + Resultado);
    
    
    }
    
    }