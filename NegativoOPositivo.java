import java.util.Scanner;

public class NegativoOPositivo {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número (0 para acabar): ");//aqui le indicamos al usuario que si quiere acabar el juego podemos indicar el numero 0
        numero = sc.nextInt();
//en esta parte ya le estamos dando forma a sentido a las variables 
        while (numero != 0) {
                                       
            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }
//tambien le inticamos al usuario si el numero que ha ingresado en positivo o negativo y si es par o impar
            System.out.print("Introduce un número (0 para acabar): ");                                  
            numero = sc.nextInt();
        }
    } 
}