package ejercicio9;

 abstract class Perifericos{
private String Nombre;
private int Precio;

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public int getPrecio() {
	return Precio;
}

public void setPrecio(int precio) {
	Precio = precio;
}

abstract void mostrarDatos();
}
