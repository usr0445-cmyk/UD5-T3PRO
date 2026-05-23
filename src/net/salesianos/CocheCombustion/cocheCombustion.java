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


    @Override
    public void arrancar(){
        if (litrosCombustible > 0){
            litrosCombustible--;
            motorEncendido = true;
            System.out.println("El coche ha arrancado. Combustible restante: " + litrosCombustible);
        } else {
            motorEncendido = false;
            System.out.println("No se puede arrancar el coche. No hay combustible.");    
        }
    }


}
