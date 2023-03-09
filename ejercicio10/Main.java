package ejercicio10;

public class Main {

	public static void main(String[] args) {
		
		Items espada = new Items();
		espada.setId(20);
		espada.setItem("Espada");
		espada.setPrecio(120);
		espada.mostrarDatos();
		
		npc mercader = new npc();
		mercader.setId(28);
		mercader.setDialogos(18);
		mercader.setRaza("Humano");
		mercader.setSalud(10);
		mercader.mostrarDatos();
	}

}
