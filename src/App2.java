package src;
import src.net.salesianos.CocheCombustion.cocheCombustion;
import src.net.salesianos.Vehiculo.vehiculo;

public class App2 {
    public static void main(String[] args) {

        cocheCombustion coche1 = new cocheCombustion("Rojo", 4, 4, "Seat Ibiza", "1234 ABC", 20);

        System.out.println("Intentando arrancar el coche...");
        coche1.arrancar();

        System.out.println("Arrancando...");
        coche1.arrancar();

        System.out.println("Moviendo el coche varias veces...");
        coche1.mover();
        coche1.mover();
        coche1.mover();

        System.out.println("Combustible restante: " + coche1.litrosCombustible);

        System.out.println("Cambiando combustible a 2 litros...");
        coche1.litrosCombustible = 2;

        System.out.println("Moviendo el coche 3 veces con 2 litros...");
        coche1.mover();
        coche1.mover();
        coche1.mover();



    }   
}
