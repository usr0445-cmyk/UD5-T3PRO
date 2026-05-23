package src.net.salesianos.Vehiculo;

public abstract class vehiculo {
    
    //Añado los atributos comunes a todos los vehiculos
    protected String color;
    protected int numeroPuertas;
    protected int numeroRuedas;
    protected String modelo;
    protected String matricula;

    //Constructor para inicializar los atributos del vehiculo
    public vehiculo(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    //Aqui añado los metodos abstractos para que las clases hijas los implementen
    public abstract void arrancar();
    public abstract void pararMotor();
    public abstract void mover();


    //Añado los Getters necesarios
    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }   
    public String getMatricula() {
        return matricula;
    }

}
