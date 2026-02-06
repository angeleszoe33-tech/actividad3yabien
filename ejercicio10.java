import java.util.Scanner;

public class Ejercicio10_Calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Número 1: ");
                double a = sc.nextDouble();
                System.out.print("Número 2: ");
                double b = sc.nextDouble();
                
                if (opcion == 1) {
                    System.out.println("Resultado: " + (a + b));
                }
                else if (opcion == 2) {
                    System.out.println("Resultado: " + (a - b));
                }
                else if (opcion == 3) {
                    System.out.println("Resultado: " + (a * b));
                }
                else if (opcion == 4) {
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                }
            }
            else if (opcion != 5) {
                System.out.println("Opción inválida");
            }
            
        } while (opcion != 5);
        
        sc.close();
    }
}