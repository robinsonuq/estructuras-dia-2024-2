package model;

import java.util.Iterator;

public class App {


	public static void main(String[] args) {
			Actividad actividad = new Actividad();
			actividad.add(new Tarea("Tarea 1"));
			actividad.add(new Tarea("Tarea 2"));
			actividad.add(new Tarea("Tarea 3"));

			Iterator<Tarea> iterator = actividad.iterator();

			System.out.println(iterator.next().getNombre());
			System.out.println(iterator.next().getNombre());
			System.out.println(iterator.next().getNombre());
			System.out.println(iterator.next().getNombre());






//			while(iterator.hasNext()){
//				System.out.println(iterator.next().getNombre());
//			}
	}
}
