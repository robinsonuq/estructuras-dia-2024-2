package recursividad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class Calculadora {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Juan");
		lista.add("Jose");
		lista.add("Julian");
		lista.add("Robinson");
		lista.add("Josue");
		eliminarEstudinatesJ(lista);
	}
	private static void eliminarEstudinatesJ(ArrayList<String> lista) {
		
		Optional<String> findFirst = lista.stream().
				filter(e -> e.startsWith("J")).findFirst();
		
		System.out.println(findFirst.get());
	}
	
}
