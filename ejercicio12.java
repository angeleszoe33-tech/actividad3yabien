import java.util.Scanner;

public class Ejercicio12_Palindromo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Frase: ");
        String frase = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        
        boolean esPalindromo = true;
        int izquierda = 0;
        int derecha = frase.length() - 1;
        
        while (izquierda < derecha) {
            if (frase.charAt(izquierda) != frase.charAt(derecha)) {
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        
        if (esPalindromo) {
            System.out.println("La frase es un palíndromo");
        } else {
            System.out.println("La frase NO es un palíndromo");
        }
        
        sc.close();
    }
}