package ejercicio9;

class Raton extends Perifericos{
	private String Marca;
	private String Sensor;
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getSensor() {
		return Sensor;
	}
	public void setSensor(String sensor) {
		Sensor = sensor;
	}
	public void mostrarDatos(){
		System.out.println("Nombre: " + getNombre());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Marca: " + getMarca());
		System.out.println("Sensor: " + getSensor());
	}
}
