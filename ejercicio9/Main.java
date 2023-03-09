package ejercicio9;

public class Main {

	public static void main(String[] args) {
	
		Raton raton = new Raton();
		raton.setNombre("Logitech g30");
		raton.setPrecio(70);
		raton.setMarca("Logitech");
		raton.setSensor("Sensor por laser");
		raton.mostrarDatos();
		System.out.println();
		
		Teclado teclado= new Teclado();
		teclado.setNombre("Draken");
		teclado.setPrecio(60);
		teclado.setIdioma("Español");
		teclado.setTipo("Mecanico");
		teclado.mostrarDatos();

	}

}
