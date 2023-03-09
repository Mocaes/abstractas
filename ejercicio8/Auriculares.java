package ejercicio8;

class Auriculares extends Cascos{
private String Tipo;
private String Cancelacion;

public String getTipo() {
	return Tipo;
}
public void setTipo(String tipo) {
	Tipo = tipo;
}
public String getCancelacion() {
	return Cancelacion;
}
public void setCancelacion(String cancelacion) {
	Cancelacion = cancelacion;
}
public void mostrarDatos() {
	System.out.println("Nombre" + getNombre());
	System.out.println("Precio" + getPrecio());
	System.out.println("Cable" +getCable());
	System.out.println("Mega Hercios" + getMH());
	System.out.println("Tipo de agarre" + getTipo());
	System.out.println("Tipo de cancelacion" + getCancelacion());
}
}
