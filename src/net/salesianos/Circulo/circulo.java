package src.net.salesianos.Circulo;
import src.net.salesianos.InterfazFiguras.interfazFiguras;

public class circulo implements interfazFiguras {
    
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    //Añado 
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

