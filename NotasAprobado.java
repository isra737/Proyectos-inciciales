
import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;





public class NotasAprobado {



    
    public static void main(String[] args) {
        
        System.out.println("Ingrese las 5 Calificaciones");// aqui le vamos a pedir al usuario que ingrese 5 calificaciones del estudiante
        int [] MC = new int [5];//aqui enpezamos a darle las definiciones a las variables 
        int suma = 0;
        float pro = 0;
        
        for (int i = 0; i < 5; i++) {
            Scanner lee= new Scanner(System.in);
            MC[i]= lee.nextInt();
            suma = MC[i]+suma;
            
        }
        pro= suma/5;
        System.out.println("El promedio es: "+pro);//en esta parte le va a decir el promedio de las notas que obtuvo el estudiante 
        System.out.println("5 a 7= APROBADO\n0 a 5 = REPROBADO\n 7 a 9 =Notable\09 a 10 = Excelente");//aqui ya le damos un valor a cada nota  si es aprobado, reprobado, notable o excelente 
        if (pro>=7) {
            System.out.println("Estudiante APROBADO");//si el estudiante saca una nota mayor que 5 y menor que 7 va a estar aprobado
        }
        if (pro<=5) {
            System.out.println("Estudinate Repobrado");//si un estudiante saca un promedio menor a cinco(5) entonces va a estar reprobado
        }
        if (pro<=7) {
            System.out.println("Estudiante Notable");//si un estudiante saca un promedio de nota de 7 a 9 entonces va a ser notable.
        }
        if (pro<=10) {
            System.out.println("Estudinate Excelente");
            
        }
    }
}

