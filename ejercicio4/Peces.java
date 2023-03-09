package ejercicio4;
class Peces extends Animal {
	private String agua;
	
	public Peces(String nombre,String agua) {
		super(nombre);
		this.agua=agua;
	}

	public String getAgua() {
		return agua;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Tipo de agua: " + getAgua());
	}
}
