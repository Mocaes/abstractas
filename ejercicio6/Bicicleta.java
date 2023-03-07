package ejercicio6;

class Bicicleta extends Vehiculo {
private String tipo;

@Override
void acelerar() {
	System.out.println("La bicicleta esta acelerando");
}
@Override
void frenar() {
	System.out.println("La bicicleta esta frenando");
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
