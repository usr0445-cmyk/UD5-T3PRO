package src.net.salesianos.CocheCombustion;
import src.net.salesianos.Vehiculo.vehiculo;

//Aplicamos el extends y el import de la clase Vehiculo
public class cocheCombustion extends vehiculo {
    
    //Ponemos atributos para el coche de combustion, como el estado del motor y los litros de combustible
    protected boolean motorEncendido;
    protected int litrosCombustible;

    //Contructor para inicializar los atributos del coche de combustion, incluyendo los atributos heredados de la clase vehiculo
    public cocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula, int litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);

        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
    }

    //Aqui ponemos los metodos para arrancar, parar el motor y mover el coche implementando los metodos abstractos de la clase vehiculo
    @Override
    public void arrancar(){
        if (litrosCombustible > 0){
            //Esto para restar un litro de combustible cada vez que se arranca el coche
            litrosCombustible--;
            motorEncendido = true;
            System.out.println("El coche ha arrancado. Combustible restante: " + litrosCombustible);
        } else {
            motorEncendido = false;
            System.out.println("No se puede arrancar el coche. No hay combustible.");    
        }
    }

    //Igual aqui pero para parar el motor, comprobando si el motor esta encendido o no  
    @Override
    public void pararMotor() {
        if (motorEncendido) {
            motorEncendido = false;
            System.out.println("El coche se ha apagado.");
        } else {
            System.out.println("El coche ya está apagado.");
        }
    }

    //Y aqui el metodo para mover el coche, comprobando si el motor esta encendido y si hay combustible suficiente para moverse
    @Override
    public void mover() {
        if (!motorEncendido) {
            System.out.println("No se puede mover el coche. El motor esta apagado.");
            return;
        }

        if (litrosCombustible <= 0) {
            System.out.println("No se puede mover el coche. No hay combustible.");
            motorEncendido = false;
            System.out.println("El coche se ha apagado por falta de combustible.");
            return;
        }
        litrosCombustible--;
        System.out.println("El coche se ha movido. Combustible restante: " + litrosCombustible);

        }
    }

