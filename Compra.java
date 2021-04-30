import java.util.Scanner;

public class Compra{



    public static void main(String[] args) {
        //A=PI*r2
        //Entrada: producto, cantidad 
        //Salida: costo
  int opcion=0;
  System.out.println("Lista de alimentos disponibles\n1.Pan=1000$ v/u\n2.Jamon=12000$ v/u\n3.Manzana=500 v/u\n4.Agua=1200$ v/u\n Seleccione lo que desea comprar\nSalir");
  while (opcion != 5) {
      Scanner sc = new Scanner(System.in);
      opcion=sc.nextInt();
      switch (opcion) {
          case 1:
                System.out.println("pan");
              break;
           case 2:
               System.out.println("jamon");
            break;

            case 3:
            System.out.println("manzana");
            break;

            case 4:
               System.out.println("agua");
            break;

            case 5:
          default:
           System.out.println("Numero no valido");
              break;
      }
  }
    }
}

