package ejercicio2;

class Alumno extends Persona {
	
	private double evaluacion;
	private int nota;


public Alumno(String nombre, String apellidos, String asignatura, double evaluacion, int nota) {
    super(nombre, apellidos, asignatura);
	this.evaluacion = evaluacion;
	this.nota = nota;
	}

public double getEvaluacion() {
	return evaluacion;
	}


public int getNota() {
	return nota;
		  }


void mostrarDatos() {
	 System.out.println("Nombre: " + getNombre() + " " + getApellidos());
	 System.out.println("Asignatura: " + getAsignatura());
	 System.out.println("Evaluación: " + getEvaluacion());
	 System.out.println("Nota: " + getNota());
		}
	}

