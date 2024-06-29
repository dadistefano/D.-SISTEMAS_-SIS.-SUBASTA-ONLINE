package subasta;

public class Main {

	public static void main(String[] args) {
		
        SubastaOnline subasta = new SubastaOnline("SmartTV 65", 100000);

        Participante participante1 = new Participante("Gonzalo");
        Participante participante2 = new Participante("Maria");
        Participante participante3 = new Participante("Luis");

        // Se registra a los participantes como observadores de la subasta
        subasta.addObserver(participante1);
        subasta.addObserver(participante2);
        subasta.addObserver(participante3);

        subasta.aceptarOferta("Gonzalo", 120000);
        subasta.aceptarOferta("Maria", 150000);
        subasta.aceptarOferta("Luis", 130000);

        subasta.cerrarSubasta();
    }

}


