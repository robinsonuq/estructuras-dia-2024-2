package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import recursividad.Estudiante;

public class Main2 {

	public static void main(String[] args) {
		
		Producto producto = new Producto("Arroz");
		Producto producto2 = new Producto("Arroz2");
		Producto producto3 = new Producto("Arroz3");
		Producto producto4 = new Producto("Arroz4");
		Producto producto5 = new Producto("Arroz5");

		ArrayList<Producto> lista = new ArrayList<>();
		
		lista.sort(new Comparator<Producto>() {

			@Override
			public int compare(Producto o1, Producto o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		
//		
//		Set<Producto> lista = new LinkedHashSet<>();
//		
//		lista.add(producto);
//		lista.add(producto2);
//		lista.add(producto3);
//		lista.add(producto4);
//		lista.add(producto5);
//		
//		Iterator<Producto> iterator = lista.iterator();
//		
//		while(iterator.hasNext()) {
//			Producto next = iterator.next();
//			System.out.println(next.getNombre());
//		}
//		
//		Set<Producto> lista3 = new TreeSet<>();
//		lista3.add(producto5);
//		lista3.add(producto4);
//		
		
	}
}
