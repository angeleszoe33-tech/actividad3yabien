import java.util.Scanner;

public class Ejercicio08_Buscar {
    
    public static int buscarElemento(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuántos números: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Número a buscar: ");
        int x = sc.nextInt();
        
        int indice = buscarElemento(arr, x);
        
        if (indice != -1) {
            System.out.println("El número " + x + " se encontró en el índice: " + indice);
        } else {
            System.out.println("El número " + x + " no se encontró.");
        }
        
        sc.close();
    }
}