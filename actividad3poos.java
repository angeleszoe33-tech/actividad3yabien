import java.util.Scanner;

public class Producto {

    // Atributos privados (como pide el ejercicio)
    private String codigo;
    private String tipo;
    private double costo;
    private double impuesto;

    // Métodos get (accesores) - uno por cada atributo
    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    // Métodos set (establecedores) - uno por cada atributo
    public void setCodigo(String cod) {
        codigo = cod;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void setCosto(double c) {
        costo = c;
    }

    public void setImpuesto(double imp) {
        impuesto = imp;
    }

    // Método que muestra todos los datos del producto
    public void muestraProducto() {
        System.out.println("Producto:");
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo);
        System.out.println("Impuesto: " + impuesto + " %");
        System.out.println("---------------------");
    }

    // Método que calcula el precio de venta
    // Recibe la utilidad en porcentaje (ejemplo: 20.0 para 20%)
    public double calcularPrecio(double utilidad) {
        double precioSinImpuesto = costo + (costo * utilidad / 100);
        double precioFinal = precioSinImpuesto + (precioSinImpuesto * impuesto / 100);
        return precioFinal;
    }

    // Método estático que compara dos productos y dice cuál tiene mayor precio
    public static String compararProductos(Producto p1, Producto p2, double utilidad) {
        
        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);
        
        if (precio1 > precio2) {
            return "El producto con mayor precio es: " + p1.getTipo() + 
                   " (código " + p1.getCodigo() + ") → $" + precio1;
        }
        else if (precio2 > precio1) {
            return "El producto con mayor precio es: " + p2.getTipo() + 
                   " (código " + p2.getCodigo() + ") → $" + precio2;
        }
        else {
            return "Ambos productos tienen el mismo precio de venta";
        }
    }

    // Aquí empieza el main (la parte principal del programa)
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Creamos el primer producto
        Producto producto1 = new Producto();
        
        System.out.println("=== Producto 1 ===");
        
        System.out.print("Código: ");
        try {
            producto1.setCodigo(entrada.nextLine());
        } catch (Exception e) {
            System.out.println("Error en código, se deja vacío");
        }

        System.out.print("Tipo / nombre: ");
        try {
            producto1.setTipo(entrada.nextLine());
        } catch (Exception e) {
            System.out.println("Error en tipo, se deja vacío.");
        }

        System.out.print("Costo: ");
        try {
            producto1.setCosto(entrada.nextDouble());
        } catch (Exception e) {
            System.out.println("Error en costo, se pone 0.");
            producto1.setCosto(0);
        }

        System.out.print("Impuesto (%): ");
        try {
            producto1.setImpuesto(entrada.nextDouble());
        } catch (Exception e) {
            System.out.println("Error en impuesto, se pone 0");
            producto1.setImpuesto(0);
        }

        // Limpiamos el salto de línea que queda
        entrada.nextLine();

        // Creamos el segundo producto (casi igual)
        Producto producto2 = new Producto();
        
        System.out.println("\n=== Producto 2 ===");
        
        System.out.print("Código: ");
        try {
            producto2.setCodigo(entrada.nextLine());
        } catch (Exception e) {
            System.out.println("Error en código, se deja vacío");
        }

        System.out.print("Tipo / nombre: ");
        try {
            producto2.setTipo(entrada.nextLine());
        } catch (Exception e) {
            System.out.println("Error en tipo, se deja vacío");
        }

        System.out.print("Costo: ");
        try {
            producto2.setCosto(entrada.nextDouble());
        } catch (Exception e) {
            System.out.println("Error en costo, se pone 0");
            producto2.setCosto(0);
        }

        System.out.print("Impuesto (%): ");
        try {
            producto2.setImpuesto(entrada.nextDouble());
        } catch (Exception e) {
            System.out.println("Error en impuesto, se pone 0");
            producto2.setImpuesto(0);
        }

        // Mostramos los dos productos
        System.out.println("\n=== Datos capturados ===");
        producto1.muestraProducto();
        producto2.muestraProducto();

        // Pedimos el porcentaje de utilidad (una sola vez para comparar)
        System.out.print("\nPorcentaje de utilidad para comparar ambos: ");
        double utilidad = 0;
        try {
            utilidad = entrada.nextDouble();
        } catch (Exception e) {
            System.out.println("Error, se usa 0% de utilidad");
            utilidad = 0;
        }

        // Comparamos y mostramos resultado
        String resultado = compararProductos(producto1, producto2, utilidad);
        System.out.println("\nResultado de la comparación:");
        System.out.println(resultado);

        entrada.close();
    }
}