package anonimo;

public class Estudiante implements JugadorFutbol,Comparable<Estudiante>{

	private String nombre;
	
	private int edad;
	
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

	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}



	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String toString() {
		return nombre+","+edad;
	}

}
