package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import recursividad.Estudiante;

public class CollectionsExample {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>(10);
		lista.add("Robinson");
		lista.add("Rauk");
		lista.add("Raul");
		lista.add("Juan");

		ListIterator<String> listIterator = lista.listIterator();
		
		while(listIterator.hasPrevious()) {
			String element = listIterator.previous();
			if(element.equals("Robinson")) {
				listIterator.remove();
			}
		}
		
		List<String> lista2 = new LinkedList<>();
		lista2.add("Juan");
		String string = lista2.get(5);
		
		
		
	}
}
