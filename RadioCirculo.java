import java.util.Scanner;

class RadioCirculo 

{
    
    public static void main( String[] args )
    {
        int radio; // En esta libreria se va a almacenar el radio del circulo
        
        Scanner entrada = new Scanner( System.in );
        

        System.out.print( "Digite el radio del círculo: "); //aqui el programa le va a decir a la persona que digite el radio del circulo  
        radio = entrada.nextInt();
        
        
        //En la actividad solo dice que calculemos el area del circulo, pero yo quiero ir un poco mas alla, e investigando consegui la sintaxis para poder calcular el diametro y la circunferencia, me parecio muy importante en este punto, asi que lo desarrolle 

        // Área
        System.out.printf( "\nEl área del círculo es: %f.\n", ( Math.PI * radio * radio ) );

        // Se calculara el diametro del circulo
        //Diámetro
        System.out.printf("\nEl diametro del círculo es: %d.", ( 2 * radio ) );
        
        //En este punto se calculara la circunferencia del circulo
        // Circunferencia
        System.out.printf( "\nLa circunferencia del círculo es: %f.", ( 2 * Math.PI * radio ) );
        
        
        
        // Salida normal
        System.exit(0);
        //espero que les haya gustado, me parecio muy interesante el poder realizar este programa
    } // fin del proceso 
}