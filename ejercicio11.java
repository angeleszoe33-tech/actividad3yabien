import java.util.Scanner;

class Producto {
    private String nombre;
    private double costo;
    private double impuesto; // porcentaje
    
    public Producto(String nombre, double costo, double impuesto) {
        this.nombre = nombre;
        this.costo = costo;
        this.impuesto = impuesto;
    }
    
    public double calcularPrecioFinal(double utilidadPorc) {
        double utilidad = costo * (utilidadPorc / 100);
        double imp = costo * (impuesto / 100);
        return costo + utilidad + imp;
    }
    
    public void mostrar(double utilidad) {
        System.out.printf("%-15s | Costo: %-8.1f | Imp: %-6.1f | Final: %.1f\n",
                nombre, costo, impuesto, calcularPrecioFinal(utilidad));
    }
}

public class Ejercicio11_Productos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuántos productos (máx 5): ");
        int n = sc.nextInt();
        sc.nextLine();
        
        if (n > 5) n = 5;
        if (n < 1) n = 1;
        
        Producto[] productos = new Producto[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i+1));
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            System.out.print("Costo: ");
            double costo = sc.nextDouble();
            System.out.print("Impuesto (%): ");
            double imp = sc.nextDouble();
            sc.nextLine();
            
            productos[i] = new Producto(nom, costo, imp);
        }
        
        System.out.print("Porcentaje de utilidad: ");
        double util = sc.nextDouble();
        
        System.out.println("\nResultados:");
        for (int i = 0; i < n; i++) {
            productos[i].mostrar(util);
        }
        
        sc.close();
    }
}