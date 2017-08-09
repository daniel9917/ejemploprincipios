
package logica;

public class carro extends vehiculo {
    public carro(){
        super();
        marca = "Nissan";
        color = "azul";
        placa = "beef-32";
        nllantas = 4;
        nbancas = 2;
        capacidad = 5;
        tipo = "Carro";
    }
    
    @Override
    public void encender() {
        System.out.print("El carro de marca "+marca+", color "+color+" y placas "+placa+". \n"
                + "Con capacidad para "+capacidad+" personas,"+nbancas+" bancas y "+nllantas+" llantas, \n"
                        + "ha sido encendido");
    }

    @Override
    public void apagar() {
        System.out.print("El carro ha sido apagado.");
    }
}
