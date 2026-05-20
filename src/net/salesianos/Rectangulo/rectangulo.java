package src.net.salesianos.Rectangulo;

public class rectangulo implements interfazFiguras  {
    
    private double base;
    private double altura;
 
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override 
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    
    @Override
    public String toString() {
        return "Rectangulo => Base: " + base + ", Altura:" + altura;
    }

    
}
