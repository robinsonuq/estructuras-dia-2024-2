package model;

import java.util.Iterator;
import java.util.LinkedList;

public class Actividad implements Iterable<Tarea>{

	LinkedList<Tarea> listaTareas = new LinkedList<>();

	public Actividad() {
		// TODO Auto-generated constructor stub
	}

	public LinkedList<Tarea> getListaTareas() {
		return listaTareas;
	}

	public void setListaTareas(LinkedList<Tarea> listaTareas) {
		this.listaTareas = listaTareas;
	}

	@Override
	public Iterator<Tarea> iterator() {
		// TODO Auto-generated method stub
		return new CycleIterator();
	}

	private class CycleIterator implements Iterator<Tarea>{


		int index = 0;

		@Override
		public boolean hasNext() {

			if(listaTareas.size() > 0){
				return true;
			}
			return false;
		}

		@Override
		public Tarea next() {
			Tarea tarea = listaTareas.get(index);
//			index++;
//
//			if(index == listaTareas.size()){
//				index = 0;
//			}
			index = (index + 1) % listaTareas.size();

			return tarea;
		}

	}



















	public void add(Tarea tarea) {
		// TODO Auto-generated method stub
		listaTareas.add(tarea);
	}


}
