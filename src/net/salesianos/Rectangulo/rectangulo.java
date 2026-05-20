package src.net.salesianos.Rectangulo;
import src.net.salesianos.InterfazFiguras.interfazFiguras;

//Añadimos implements porque la clase rectangulo implementa la interfazFiguras
public class rectangulo implements interfazFiguras  {
    
    private double base;
    private double altura;
 
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Ponemos estos metodos para calcular el area y el perimetro del rectangulo
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override 
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    //Y aqui sobrescribimos el metodo toString para mostrar la informacion del rectangulo
    @Override
    public String toString() {
        return "Rectangulo => Base: " + base + ", Altura:" + altura;
    }

    
    
}
