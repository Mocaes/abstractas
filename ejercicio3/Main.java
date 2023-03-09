package ejercicio3;

public class Main {

public static void main(String[] args) {
	Mamifero lobo = new Mamifero("Lobo", "Gris");
	Ave aguila = new Ave("Águila", "Negro y Blanco");

	System.out.println("Datos del lobo: ");
	lobo.mostrarDatos();
	System.out.println();


	System.out.println("Datos del águila: ");
	    aguila.mostrarDatos();
	System.out.println(); 

}

}
