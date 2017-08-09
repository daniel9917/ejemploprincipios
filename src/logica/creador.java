package logica;

public class creador {
    
    public vehiculo crearv(int a){
        if(a==1){
            return new camión();
        }
        if(a==2){
            return new moto();
        }
        if(a==3){
            return new carro();
        }
        else{
            return null;
        }
    }
    
    
}
