import java.util.Scanner;

class Rectangulo {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double calcularArea() {
        return ancho * alto;
    }
    
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}

public class Ejercicio07_Rectangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double ancho = 0;
        double alto = 0;
        
        System.out.print("Ancho: ");
        ancho = sc.nextDouble();
        
        System.out.print("Alto: ");
        alto = sc.nextDouble();
        
        Rectangulo r = new Rectangulo(ancho, alto);
        
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
        
        sc.close();
    }
}