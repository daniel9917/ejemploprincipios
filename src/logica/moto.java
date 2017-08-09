
package logica;

public class moto extends vehiculo{
    public moto(){
        super();
        marca = "AKT";
        color = "negra";
        placa = "urw-34";
        nllantas = 2;
        nbancas = 1;
        capacidad = 2;
        tipo = "Moto";
    }
    
    @Override
    public void encender() {
        System.out.print("La moto camión de marca "+marca+", color "+color+" y placas "+placa+". \n"
                + "Con capacidad para "+capacidad+" personas,"+nbancas+" bancas y "+nllantas+" llantas, \n"
                        + "ha sido encendida");
    }

    @Override
    public void apagar() {
        System.out.print("La moto ha sido apagada.");
    }
}
