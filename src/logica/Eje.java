
package logica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Eje {

    public static void main(String[] args) throws IOException {
        int opcion;
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("¿Qué tipo de vehiculo desea crear?:\n"
                + " 1- Camión.\n"
                + " 2- Motocicleta.\n"
                + " 3- Automovil.\n");
        opcion = Integer.parseInt(lector.readLine());
        
        creador luis = new creador();
        vehiculo nuevo = luis.crearv(opcion);
        if(nuevo == null){
            System.out.println("No hay vehiculo creado");
        }
        else{
            System.out.print("Un nuevo "+nuevo.tipo+ " ha sido creado.");
        }
        }
    
}
