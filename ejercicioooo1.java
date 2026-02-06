import java.util.Scanner;

public class Ejercicio01_SumaSegura {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Vamos a sumar dos numeritos");
        System.out.println("Tienen que ser enteros");
        
        int numero1 = 0;
        int numero2 = 0;
        boolean datosCorrectos = false;
        
        // Pedimos el primer número (con reintento si sale mal)
        while (!datosCorrectos) {
            System.out.print("Primer número: ");
            try {
                numero1 = Integer.parseInt(entrada.nextLine());
                datosCorrectos = true;
            } catch (Exception e) {
                System.out.println("Eso no es un número entero);
            }
        }
        
        // Reiniciamos la bandera para el segundo número
        datosCorrectos = false;
        
        while (!datosCorrectos) {
            System.out.print("Segundo número: ");
            try {
                numero2 = Integer.parseInt(entrada.nextLine());
                datosCorrectos = true;
            } catch (Exception e) {
                System.out.println("Nooo, ese tampoco es entero");
            }
        }
        
        int suma = numero1 + numero2;
        
        System.out.println("------------------------------------------------");
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("Sumas seguras");
        
        entrada.close();
    }
}