package ejercicio2;

public class main {
	public static void main (String[]args) {
		Alumno[] alumnos= {
				new Alumno("Alberto","Alba","Programacion",7.5,9),
				new Alumno("Juan","Perez","Base de datos",8.5,10)
		};
	   
		Profesor[] profesores = {
	    	     new Profesor("Alberto", "Ruiz", "Programación", 3000, "Enero"),
	    	     new Profesor("Bernardo", "Castillo", "Sistemas", 3000, "Febrero")
	    };
		Trabajador[] trabajadores = {
				new Trabajador ("Javier","Martinez","",1800,"Barrendero"),
				new Trabajador ("Alberto","Palomares","",2000,"Director")
		};

		
		System.out.println("Datos de los alumnos: ");
	    for (Alumno alumno : alumnos) {
	      alumno.mostrarDatos();
	      System.out.println();
	    }
	    
	    System.out.println("Datos de los profesores: ");
	    for (Profesor profesor : profesores) {
	      profesor.mostrarDatos();
	      System.out.println();
	    }
	    System.out.println("Datos empleados");
	    for(Trabajador trabajador : trabajadores ) {
	    	trabajador.mostrarDatos();
	    	System.out.println();
	    }
	    
}
}
