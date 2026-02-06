import java.util.Scanner;

public class Ejercicio13_MatrizNotas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número de estudiantes: ");
        int f = sc.nextInt();
        System.out.print("Número de materias: ");
        int c = sc.nextInt();
        
        double[][] notas = new double[f][c];
        
        for (int i = 0; i < f; i++) {
            System.out.println("Estudiante " + i + ":");
            for (int j = 0; j < c; j++) {
                System.out.print("Materia " + j + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
        
        // Promedio por estudiante
        System.out.println("\nPromedios por estudiante:");
        for (int i = 0; i < f; i++) {
            double suma = 0;
            for (int j = 0; j < c; j++) {
                suma += notas[i][j];
            }
            System.out.println("Estudiante " + i + ": " + (suma / c));
        }
        
        // Promedio por materia
        System.out.println("\nPromedios por materia:");
        for (int j = 0; j < c; j++) {
            double suma = 0;
            for (int i = 0; i < f; i++) {
                suma += notas[i][j];
            }
            System.out.println("Materia " + j + ": " + (suma / f));
        }
        
        sc.close();
    }
}