import java.util.Scanner;
import src.net.salesianos.Rectangulo.rectangulo;
import src.net.salesianos.Circulo.circulo;


public class App {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base del rectangulo:");
        double base = scanner.nextDouble();

        System.out.println("Introduce la altura del rectangulo:");
        double altura = scanner.nextDouble();

        rectangulo rectangulo1 = new rectangulo(base, altura);




    }
}
