import java.util.Scanner;

public class Ejercicio04_Calificaciones {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("¿Cuántas calificaciones vas a capturar? (máx 10): ");
        
        int cantidad = 0;
        boolean ok = false;
        
        while (!ok) {
            try {
                cantidad = Integer.parseInt(lector.nextLine());
                if (cantidad > 0 && cantidad <= 10) {
                    ok = true;
                } else {
                    System.out.println("Entre 1 y 10");
                }
            } catch (Exception e) {
                System.out.println("No es número válido");
            }
        }
        
        double[] califs = new double[cantidad];
        double suma = 0;
        int aprob = 0;
        int reprob = 0;
        
        System.out.println("Captura las calificaciones:");
        
        for (int i = 0; i < cantidad; i++) {
            boolean valida = false;
            while (!valida) {
                try {
                    System.out.print("Calif " + (i+1) + ": ");
                    califs[i] = Double.parseDouble(lector.nextLine());
                    valida = true;
                    
                    suma += califs[i];
                    
                    if (califs[i] >= 70) {
                        aprob++;
                    } else {
                        reprob++;
                    }
                } catch (Exception e) {
                    System.out.println("No se entiende. Usa número con punto decimal si es necesario.");
                }
            }
        }
        
        double promedio = suma / cantidad;
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobadas: " + aprob);
        System.out.println("Reprobadas: " + reprob);
        
        lector.close();
    }
}