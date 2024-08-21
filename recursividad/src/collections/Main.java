package collections;

import recursividad.Estudiante;

public class Main {

	static Universidad universidad = new Universidad();
	
	public static void main(String[] args) {
		calcular(0, 0);
	}
	
	public static void calcular(int a, int b) {
		int r = a + b;
		System.out.println(r);
		Estudiante estudiante = new Estudiante(null);
		estudiante.getNombre();
		universidad.agregarEstudiante(estudiante);
	}
}
