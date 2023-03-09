package ejercicio8;

public class Main {

	public static void main(String[] args) {
		
		Auriculares auriculares = new Auriculares();
		auriculares.setCable("Sin cable");
		auriculares.setNombre("Airpods");
		auriculares.setCancelacion("Si");
		auriculares.setMH(200);
		auriculares.setTipo("De oreja");
		auriculares.setPrecio(250);
		auriculares.mostrarDatos();
		
		Diadema cascos = new Diadema();
		cascos.setAlmoadilla("Biscolastica");
		cascos.setCable("Con cable");
		cascos.setDiadema("Diadema elastica");
		cascos.setMH(350);
		cascos.setNombre("Corsair");
		cascos.setPrecio(230);
		cascos.mostrarDatos();
		
	}

}
