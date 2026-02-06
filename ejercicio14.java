import java.util.Scanner;

public class Ejercicio14_Login {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String usuarioCorrecto = "admin";
        String passCorrecta = "1234";
        int intentos = 0;
        boolean acceso = false;
        
        while (intentos < 3 && !acceso) {
            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();
            
            if (user.equals(usuarioCorrecto) && pass.equals(passCorrecta)) {
                acceso = true;
                System.out.println("Acceso concedido");
            } else {
                intentos++;
                System.out.println("Datos incorrectos. Te quedan " + (3 - intentos) + " intentos");
            }
        }
        
        if (!acceso) {
            System.out.println("Cuenta bloqueada");
        }
        
        sc.close();
    }
}