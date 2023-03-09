package ejercicio10;

class npc extends Items{
private int salud;
private String raza;
private int Dialogos;

public int getSalud() {
	return salud;
}
public void setSalud(int salud) {
	this.salud = salud;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}
public int getDialogos() {
	return Dialogos;
}
public void setDialogos(int dialogos) {
	Dialogos = dialogos;
}

public void mostrarDatos() {
	System.out.println("Id: " + getId());
	System.out.println("Salud: " + getSalud());
	System.out.println("Raza" + getRaza());
	System.out.println("Numero de Dialogos" + getDialogos());
}



}
