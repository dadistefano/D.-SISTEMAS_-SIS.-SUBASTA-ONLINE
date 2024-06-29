package subasta;

import java.util.Observable;

public class SubastaOnline extends Observable {
    private String articulo;
    private double precioInicial;
    private double precioActual;
    private String mejorOfertante;
    private boolean subastaCerrada = false;

    public SubastaOnline(String articulo, double precioInicial) {
        this.articulo = articulo;
        this.precioInicial = precioInicial;
        this.precioActual = precioInicial;
        this.mejorOfertante = "Nadie";
    }

    public void aceptarOferta(String nombre, double oferta) {
        if (!subastaCerrada) {
            if (oferta > precioActual) {
                precioActual = oferta;
                mejorOfertante = nombre;
                setChanged();
                notifyObservers(nombre + " ha realizado una oferta de " + oferta);
            } else {
                System.out.println("La oferta debe ser mayor que el precio actual.");
            }
        } else {
            System.out.println("La subasta está cerrada. No se pueden realizar ofertas.");
        }
    }

    public void cerrarSubasta() {
        subastaCerrada = true;
        setChanged();
        notifyObservers("La subasta finalizo. El ganador es " + mejorOfertante + " con una oferta de " + precioActual);
    }

}
