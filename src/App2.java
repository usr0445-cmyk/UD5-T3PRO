package src;
import src.net.salesianos.CocheCombustion.cocheCombustion;
import src.net.salesianos.Vehiculo.vehiculo;

public class App2 {
    public static void main(String[] args) {

        //Creamos un objeto cocheCombustion con los datos necesarios para el constructor
        cocheCombustion coche1 = new cocheCombustion("Rojo", 4, 4, "Seat Ibiza", "1234 ABC", 20);

        //Mostramos la informacion del coche usando el metodo toString heredado de la clase vehiculo
        System.out.println("Intentando arrancar el coche...");
        coche1.arrancar();

        System.out.println("Arrancando...");
        coche1.arrancar();

        //Mostramos el combustible restante despues de arrancar el coche
        System.out.println("Moviendo el coche varias veces...");
        coche1.mover();
        coche1.mover();
        coche1.mover();

        //Mostramos el combustible restante despues de mover el coche varias veces
        System.out.println("Combustible restante: " + coche1.litrosCombustible);

        //Intentamos mover el coche con el combustible agotado para ver el mensaje de error
        System.out.println("Cambiando combustible a 2 litros...");
        coche1.litrosCombustible = 2;

        System.out.println("Moviendo el coche 3 veces con 2 litros...");
        coche1.mover();
        coche1.mover();
        coche1.mover();

    }   
}
