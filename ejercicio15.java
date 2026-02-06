import java.util.Scanner;

class Articulo {
    private String codigo;
    private String descripcion;
    private double precio;
    private int existencia;
    
    public Articulo(String codigo, String desc, double precio, int existencia) {
        this.codigo = codigo;
        this.descripcion = desc;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    public void mostrar() {
        System.out.println("Código: " + codigo + ", Desc: " + descripcion +
                           ", Precio: " + precio + ", Existencia: " + existencia);
    }
    
    public boolean actualizarExistencia(int cantidad) {
        if (existencia + cantidad >= 0) {
            existencia += cantidad;
            return true;
        }
        return false;
    }
    
    public String getCodigo() {
        return codigo;
    }
}

public class Ejercicio15_Inventario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Articulo[] inventario = new Articulo[5];
        int contador = 0;
        int opcion;
        
        do {
            System.out.println("\n1. Agregar artículo");
            System.out.println("2. Mostrar artículos");
            System.out.println("3. Vender");
            System.out.println("4. Reabastecer");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1 && contador < 5) {
                System.out.print("Código: ");
                String cod = sc.nextLine();
                System.out.print("Descripción: ");
                String desc = sc.nextLine();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                System.out.print("Existencia inicial: ");
                int exis = sc.nextInt();
                sc.nextLine();
                
                inventario[contador] = new Articulo(cod, desc, precio, exis);
                contador++;
                System.out.println("Artículo agregado.");
            }
            else if (opcion == 2) {
                for (int i = 0; i < contador; i++) {
                    if (inventario[i] != null) {
                        inventario[i].mostrar();
                    }
                }
            }
            else if (opcion == 3 || opcion == 4) {
                System.out.print("Código: ");
                String cod = sc.nextLine();
                System.out.print("Cantidad: ");
                int cant = sc.nextInt();
                sc.nextLine();
                
                boolean encontrado = false;
                for (int i = 0; i < contador; i++) {
                    if (inventario[i] != null && inventario[i].getCodigo().equals(cod)) {
                        encontrado = true;
                        int cambio = (opcion == 3) ? -cant : cant;
                        if (inventario[i].actualizarExistencia(cambio)) {
                            System.out.println("Operación realizada. Nueva existencia: " + 
                                               inventario[i].existencia); // acceso directo solo para mostrar
                        } else {
                            System.out.println("No hay suficiente existencia");
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Artículo no encontrado");
                }
            }
            else if (opcion != 5) {
                System.out.println("Opción inválida");
            }
            
        } while (opcion != 5);
        
        sc.close();
    }
}