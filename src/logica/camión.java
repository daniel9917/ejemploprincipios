
package logica;


public class camión extends vehiculo{
   
    public camión(){
        super();
        marca = "hyno-dutro";
        color = "gris";
        placa = "beef-323";
        nllantas = 16;
        nbancas = 1;
        capacidad = 4;
        tipo = "camión";
    }
    
    @Override
    public void encender() {
        System.out.print("El camión de marca "+marca+", color "+color+" y placas "+placa+". \n"
                + "Con capacidad para "+capacidad+" personas,"+nbancas+" bancas y "+nllantas+" llantas, \n"
                        + "ha sido encendido");
    }

    @Override
    public void apagar() {
        System.out.print("El camión ha sido apagado.");
    }
    
}
