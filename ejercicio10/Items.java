package ejercicio10;

public class Items extends Objetos{
private int precio;
private String Item;

public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public String getItem() {
	return Item;
}
public void setItem(String item) {
	Item = item;
}

public void mostrarDatos(){
System.out.println("Id: " + getId());
System.out.println("Nombre: " + getItem());
System.out.println("Precio: " + getPrecio());

}
}
