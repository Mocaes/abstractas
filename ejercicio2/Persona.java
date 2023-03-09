package ejercicio2;

abstract class Persona {
	private String nombre;
	private String apellidos;
	private String asignatura;
	
	public Persona (String nombre, String apellidos,String asignatura) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.asignatura=asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getAsignatura() {
		return asignatura;
	}


	
	abstract void mostrarDatos();
}
