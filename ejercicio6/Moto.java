package ejercicio6;

class Moto extends Vehiculo {
private String tipo;

void acelerar(){
	System.out.println("la moto esta acelerando");
}
void frenar() {
	System.out.println("La moto esta frenando");
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}

}
