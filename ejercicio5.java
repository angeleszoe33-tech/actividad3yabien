import java.util.Scanner;

public class Ejercicio05_VocalesConsonantes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame una palabra (sin espacios): ");
        String palabra = sc.nextLine().toLowerCase();
        
        int vocales = 0;
        int consonantes = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
            // se ignoran los que no son letras
        }
        
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        
        sc.close();
    }
}