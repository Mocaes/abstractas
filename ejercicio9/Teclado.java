package ejercicio9;

class Teclado extends Perifericos{
private String Tipo;
private String Idioma;

public String getTipo() {
	return Tipo;
}
public void setTipo(String tipo) {
	Tipo = tipo;
}
public String getIdioma() {
	return Idioma;
}
public void setIdioma(String idioma) {
	Idioma = idioma;
}

public void mostrarDatos() {
	System.out.println("Nombre: " + getNombre());
	System.out.println("Precio: " + getPrecio());
	System.out.println("Tipo: " + getTipo());
	System.out.println("Idioma: " + getIdioma());
}

}
