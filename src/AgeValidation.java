import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        //creamos las constantes
        final int AGE_LIMIT = 18;
        System.out.println("¿Cual es tu edad?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if ( age >= AGE_LIMIT) {
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }
        
       
    }
}
