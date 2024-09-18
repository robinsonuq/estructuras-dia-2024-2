package anonimo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Partido {

	public static void main(String[] args) {
		
		
		Estudiante estudiante1 = new Estudiante("Robinson");
		Estudiante estudiante2 = new Estudiante("Fabian");
		Estudiante estudiante3 = new Estudiante("Fose");
		Estudiante estudiante4 = new Estudiante("Diego");
		Estudiante estudiante5 = new Estudiante("Mariana");
		
		ArrayList<Estudiante> list = new ArrayList<>();
		list.add(estudiante1);
		list.add(estudiante2);
		list.add(estudiante3);
		list.add(estudiante4);
		list.add(estudiante5);
		
		ComparatorNombre comparatorNombre = new ComparatorNombre();
		
		list.sort(comparatorNombre);
		
		
		list.sort(new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.getEdad()-o2.getEdad();
			}
		});
		
		
		
		JugadorFutbol cr7 = new JugadorFutbol() {
			
			@Override
			public void hacerGoles() {
				System.out.println("hacer goles CR7 de tiro libre");
				
			}
		};
		JugadorFutbol messi = new JugadorFutbol() {
			
			@Override
			public void hacerGoles() {
				System.out.println("hacer goles messi de tiro libre");
				
			}
		};
		
		list.remove(0);
		
		
		for (JugadorFutbol estudiante : list) {
			estudiante.hacerGoles();
		}
		
//		Optional<JugadorFutbol> findFirst = list.stream().filter(j -> j.hashCode() == 3 ).findFirst();
//		
//		Integer a = 4;
//		Double b = 5;
//		
//		if(findFirst.isPresent()) {
//			JugadorFutbol jugadorFutbol = findFirst.get();
//		}
	}
}
