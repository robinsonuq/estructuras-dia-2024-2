package generics;

import java.util.ArrayList;

public class Caja<C extends Electrico> {

	private ArrayList<C> cosas = new ArrayList<>();
	
	public C sacarCosa(int indice) {
		return cosas.get(indice);
	}
	public void guardarCosa(C c) {
		cosas.add(c);
	}
}
