package ejercicio3;

class Mamifero extends Animal{
private String tipoPelo;


public Mamifero(String nombre, String tipoPelo) {
	super(nombre);
	this.tipoPelo = tipoPelo;
}


public String getTipoPelo() {
	 return tipoPelo;
}


@Override
public void mostrarDatos() {
	 System.out.println("Nombre: " + getNombre());
	 System.out.println("Tipo de pelo: " + getTipoPelo());
}
}


