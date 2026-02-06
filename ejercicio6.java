import java.util.Scanner;

public class Ejercicio06_Ordenado {
    
    public static boolean estaOrdenado(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuántos números vas a ingresar: ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }
        
        if (estaOrdenado(numeros)) {
            System.out.println("El arreglo está ordenado");
        } else {
            System.out.println("El arreglo NO está ordenado");
        }
        
        sc.close();
    }
}