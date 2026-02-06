import java.util.Scanner;

public class Ejercicio03_Tabla {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Un número del 1 al 10 para sacar su tabla.");
        
        boolean valido = false;
        
        while (!valido) {
            try {
                numero = Integer.parseInt(teclado.nextLine());
                if (numero >= 1 && numero <= 10) {
                    valido = true;
                } else {
                    System.out.println("Debe estar entre 1 y 10");
                }
            } catch (Exception e) {
                System.out.println("No es número entero");
            }
        }
        
        System.out.println("Tabla del " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        teclado.close();
    }
}