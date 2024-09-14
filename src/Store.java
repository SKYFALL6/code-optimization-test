import java.util.Scanner;
public class Store {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            //colocamos los precios en una matriz
            int [] prices = {15,10,5};

            //se coloca un menu
            System.out.println("Pantalon     15$");
            System.out.println("Camisa       10$");
            System.out.println("Ropa interior 5$");
            //se coloca el algoritmo que lleva a cabo el ingreso por teclado de la cantidad que desea llevar el usuario
            //
            System.out.println("¿Cuantos pantalones desea llevar?");
            int cantidadPantalon = scan.nextInt();
            int ventaPantalon = cantidadPantalon * prices [0];
            System.out.println("precio a pagar pantalon es: " + ventaPantalon + "$");

            System.out.println("¿Cuantos camisas desea llevar?");
            int cantidadCamisas = scan.nextInt();
            int ventaCamisas = cantidadCamisas * prices [1];
            System.out.println("precio a pagar camisas es: " + ventaCamisas + "$");

            System.out.println("¿Cuanta ropa interior desea llevar?");
            int cantidaRopaInterior = scan.nextInt();
            int ventaRopaInterior = cantidaRopaInterior * prices [2];
            System.out.println("precio a pagar pantalon es: " + ventaRopaInterior + "$");
            //colocamos el proceso que le dara el valor a la variable ventaTotal
            int ventaTotal = ventaRopaInterior + ventaCamisas + ventaPantalon;
      
            
            if (ventaTotal > 50) {
                System.out.println("El total vendido del dia de hoy es: " + ventaTotal + "$");
                System.out.println("Han sido buenas ventas");

            } else {
                System.out.println("El total vendido del dia de hoy es: " + ventaTotal + "$");
                System.out.println("Han sido malas ventas");}
        }




        
        }
       
    }

