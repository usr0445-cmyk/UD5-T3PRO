import java.util.Scanner;
import src.net.salesianos.Rectangulo.rectangulo;
import src.net.salesianos.Circulo.circulo;


public class App {
    public static void main(String[] args){

        //Usamos el Scanner para pedir al usuario los datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base del rectangulo:");
        double base = scanner.nextDouble();

        System.out.println("Introduce la altura del rectangulo:");
        double altura = scanner.nextDouble();

        //Creamos un objeto rectangulo con los datos introducidos por el usuario
        rectangulo rectangulo1 = new rectangulo(base, altura);

        //Mostramos la informacion del rectangulo y el area y perimetro calculados
        System.out.println(rectangulo1.toString());
        System.out.println("Area del rectangulo: " + rectangulo1.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo1.calcularPerimetro());


        //Lo mismo para el circulo, lo unico que cambia es el radio 
        System.out.println("Introduce el radio del circulo: ");
        double radio = scanner.nextDouble();

        circulo circulo1 = new circulo(radio);

        System.out.println(circulo1.toString());
        System.out.println("Area del circulo: " + circulo1.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo1.calcularPerimetro());

        scanner.close();
    }
}
