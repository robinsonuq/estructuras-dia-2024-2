package recursividad;

import java.util.Objects;

public class Estudiante implements Comparable<Estudiante>{

	private String nombre;
	private int edad;
	private int numeroidentifacion;

	public Estudiante(String nombre,int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Estudiante o) {
		return edad - o.getEdad();
	}

	
	
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
