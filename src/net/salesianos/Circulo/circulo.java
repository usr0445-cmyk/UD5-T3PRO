package src.net.salesianos.Circulo;
import src.net.salesianos.InterfazFiguras.interfazFiguras;

public class circulo implements interfazFiguras {
    
    //Añado el atributo radio para el circulo
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    //Añado los metodos para calcular el area y el perimetro del circulo
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    //Ponemos MathPI para calcular el perimetro del circulo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    //y el metodo toString para mostrar la informacion del circulo
    @Override
    public String toString() {
        return "Circulo => Radio: " + radio;
    }

}

