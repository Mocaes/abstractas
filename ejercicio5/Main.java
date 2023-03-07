package ejercicio5;

public class Main {

	public static void main(String[] args) {
	
	Coche Renault = new Coche();
	Renault.setColor("Rojo");
	Renault.setRuedas(4);
	Renault.setCilindrada(120);
	Renault.setModelo("Renault clio");
	Renault.acelerar();
	Renault.frenar();
	
	Bicicleta MountainBike = new Bicicleta();
	MountainBike.setColor("Azul");
	MountainBike.setRuedas(2);
	MountainBike.setModelo("Mountain Bike");
	MountainBike.setTipo("De montaña");
	
	
	}

}
