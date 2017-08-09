package logica;

public abstract class vehiculo {
    
    protected String marca;   
    protected String color;
    protected String placa;
    protected int nllantas;
    protected int nbancas;
    protected int capacidad;
    protected String tipo;
    
    protected abstract void encender();
    protected abstract void apagar();
}
