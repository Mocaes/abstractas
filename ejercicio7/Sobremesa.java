package ejercicio7;

 class Sobremesa extends Ordenadores{
private int medidas;
private String caja;
public int getMedidas() {
	return medidas;
}
public void setMedidas(int medidas) {
	this.medidas = medidas;
}
public String getCaja() {
	return caja;
}
public void setCaja(String caja) {
	this.caja = caja;
}

public void mostrarDatos() {
	System.out.println("CPU: " + getCpu());
	System.out.println("Precio: " + getPrecio());
	System.out.println("Que tamaño tiene: " + getMedidas());
	System.out.println("Que caja es: " + getCaja());
}
}
