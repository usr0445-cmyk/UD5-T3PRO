package src.net.salesianos.CocheCombustion;
import src.net.salesianos.Vehiculo.vehiculo;

public class cocheCombustion extends vehiculo {
    
    protected boolean motorEncendido;
    protected int litrosCombustible;

    public cocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula, int litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);

        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
    }


}
