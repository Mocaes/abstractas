package ejercicio8;

class Diadema extends Cascos {
private String Diadema;
private String almoadilla;

public String getDiadema() {
	return Diadema;
}
public void setDiadema(String diadema) {
	Diadema = diadema;
}
public String getAlmoadilla() {
	return almoadilla;
}
public void setAlmoadilla(String almoadilla) {
	this.almoadilla = almoadilla;
}
public void mostrarDatos() {
	System.out.println("Nombre" + getNombre());
	System.out.println("Precio" + getPrecio());
	System.out.println("Cable" +getCable());
	System.out.println("Mega Hercios" + getMH());
	System.out.println("Diadema" + getDiadema());
	System.out.println("Tipo de almohadilla" + getAlmoadilla());
}
}
