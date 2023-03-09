package ejercicio8;

abstract class Cascos {
private int MH;
private String nombre;
private String Cable;
private int precio;

public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public int getMH() {
	return MH;
}
public void setMH(int MH) {
	this.MH=MH;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCable() {
	return Cable;
}
public void setCable(String cable) {
	Cable = cable;
}
abstract void mostrarDatos() ;

}
