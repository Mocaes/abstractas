package ejercicio2;

class Trabajador extends Persona {
	private String puesto;
	private int Salario;
	
	public Trabajador (String nombre, String apellidos,String asignaturas, int Salario, String puesto) {
		super (nombre,apellidos,asignaturas);
		this.puesto=puesto;
		this.Salario=Salario;
	}

	public String getPuesto() {
		return puesto;
	}
	public int getSalario() {
		return Salario;
	}
	void mostrarDatos() {
		 System.out.println("Nombre: " + getNombre() + " " + getApellidos());
		 System.out.println("Puesto: " +getPuesto());
		 System.out.println("Salario: " +getSalario());
	}

}
