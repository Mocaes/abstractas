package ejercicio4;

class Ave extends Animal{
private String tipoPlumaje;


public Ave(String nombre, String tipoPlumaje) {
	super(nombre);
	this.tipoPlumaje = tipoPlumaje;
}


public String getTipoPlumaje() {
	return tipoPlumaje;
}


@Override
public void mostrarDatos() {
	System.out.println("Nombre: " + getNombre());
	 System.out.println("Tipo de plumaje: " + getTipoPlumaje());
}
}

