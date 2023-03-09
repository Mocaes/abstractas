package ejercicio2;

class Profesor extends Persona {
	private int salario;
	private String mes;
	
	public Profesor(String nombre, String apellidos,String asignaturas, int salario, String mes) {
		super(nombre,apellidos,asignaturas);
		this.salario=salario;
		this.mes=mes;
	}

	public int getSalario() {
		return salario;
	}

	public String getMes() {
		return mes;
	}
	void mostrarDatos() {
		System.out.println("Nombre:" + getNombre()+" " + getApellidos());
		System.out.println("Asignaturas: " + getAsignatura());
		System.out.println("salario:" + getSalario() + "en el mes de " + getMes());
	}
}
