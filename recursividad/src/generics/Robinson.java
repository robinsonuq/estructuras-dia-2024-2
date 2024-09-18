package generics;

import java.util.ArrayList;

public class Robinson<O, D> {

	private ArrayList<O> pertenencias = new ArrayList<>();
	private ArrayList<D> pertenenciasEsposa = new ArrayList<>();
	
	public void comprar(O o) {
		pertenencias.add(o);
	}
	public void comprarD(D o) {
		pertenenciasEsposa.add(o);
	}

	public O usar(int indice) {
		return pertenencias.get(indice);
	}

}
