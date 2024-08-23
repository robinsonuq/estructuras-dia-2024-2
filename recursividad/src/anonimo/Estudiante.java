package anonimo;

public class Estudiante implements JugadorFutbol,Comparable<Estudiante>{

	private String nombre;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}



	@Override
	public void hacerGoles() {

		System.out.println("Hacer goles "+nombre);
		
	}

}
