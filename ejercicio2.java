import java.util.Scanner;

public class Ejercicio02_QueEres {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = lector.nextLine();
        
        System.out.print("Edad: ");
        
        int edad = -1;
        
        while (edad < 0) {
            try {
                edad = Integer.parseInt(lector.nextLine());
                if (edad < 0) {
                    System.out.println("Edad no puede ser negativa");
                }
            } catch (Exception e) {
                System.out.println("No es número válido");
            }
        }
        
        System.out.print("Hola " + nombre + ", ");
        
        if (edad < 13) {
            System.out.println("eres niño.");
        } else if (edad <= 17) {
            System.out.println("eres adolescente.");
        } else if (edad <= 64) {
            System.out.println("eres adulto.");
        } else {
            System.out.println("eres adulto mayor.");
        }
        
        lector.close();
    }
}