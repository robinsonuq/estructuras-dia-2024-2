package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import recursividad.Estudiante;

public class CollectionsExample {

	public static void main(String[] args) {
		
		Estudiante est1 = new Estudiante("Juan");		
		Estudiante est2 = new Estudiante("Robinson");	
		ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
		lista.add(est2);
		lista.add(est1);
		
		
		Collections.sort(lista);
		
		
//		
//		
//		lista.add(new Estudiante("Juan"));
//		lista.add(new Estudiante("Ana"));
//		lista.add(new Estudiante("Luis"));
//		lista.add(new Estudiante("Robin"));
//
//		Collections.sort(lista);
//		
//		for (Estudiante string : lista) {
//			System.out.println(string);
//		}
	}
}
