package subasta;

import java.util.Observable;
import java.util.Observer;

public class Participante implements Observer{
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(nombre + " ha recibido el mensaje: " + arg);
    }


}
