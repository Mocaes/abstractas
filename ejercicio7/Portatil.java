package ejercicio7;

 class Portatil extends Ordenadores {
	private int Pantalla;
	private int Bateria;
	public int getPantalla() {
		return Pantalla;
	}
	public void setPantalla(int pantalla) {
		Pantalla = pantalla;
	}
	public int getBateria() {
		return Bateria;
	}
	public void setBateria(int bateria) {
		Bateria = bateria;
	}
	@Override
	public void mostrarDatos() {
		System.out.println("CPU: " + getCpu());
		System.out.println("Precio: " + getPrecio());
		System.out.println("HZ de la pantalla: " + getPantalla());
		System.out.println("Tamaño de bateria: " + getBateria());
	}

}
