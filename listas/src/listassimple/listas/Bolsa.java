package listassimple.listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {

	ArrayList<T>lista;

	@Override
	public Iterator<T> iterator() {
		return new MiIterador<>(lista,0);
	}

	public void add(T valor) {
		lista.add(valor);

	}

}
