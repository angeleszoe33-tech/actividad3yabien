import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private int totalEjemplares;
    private int ejemplaresPrestados;
    
    public Libro(String titulo, String autor, int total) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalEjemplares = total;
        this.ejemplaresPrestados = 0;
    }
    
    public boolean prestar() {
        if (ejemplaresPrestados < totalEjemplares) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }
    
    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }
    
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total ejemplares: " + totalEjemplares);
        System.out.println("Prestados: " + ejemplaresPrestados);
        System.out.println("Disponibles: " + (totalEjemplares - ejemplaresPrestados));
    }
}

public class Ejercicio09_Biblioteca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Libro libro = new Libro("Cien años de soledad", "García Márquez", 5);
        
        int opcion;
        
        do {
            System.out.println("\n1. Ver información");
            System.out.println("2. Prestar");
            System.out.println("3. Devolver");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // salto de línea
            
            if (opcion == 1) {
                libro.mostrarInfo();
            }
            else if (opcion == 2) {
                if (libro.prestar()) {
                    System.out.println("Préstamo realizado.");
                } else {
                    System.out.println("No hay ejemplares disponibles.");
                }
            }
            else if (opcion == 3) {
                if (libro.devolver()) {
                    System.out.println("Devolución realizada.");
                } else {
                    System.out.println("No hay préstamos pendientes.");
                }
            }
            else if (opcion != 4) {
                System.out.println("Opción no válida.");
            }
            
        } while (opcion != 4);
        
        sc.close();
    }
}