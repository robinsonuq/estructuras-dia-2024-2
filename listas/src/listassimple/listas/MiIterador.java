package listassimple.listas;

import java.util.ArrayList;
import java.util.Iterator;

public class MiIterador<T> implements Iterator<T> {


	private ArrayList<T> lista;
	private int indice;

	public MiIterador(ArrayList<T> lista,int indice) {
	   this.lista = lista;
	   this.indice = indice;
	}

	@Override
	public boolean hasNext() {
		return indice < lista.size();
	}

	@Override
	public T next() {
		T valor = lista.get(indice);
		indice++;
		return valor;
	}

}
