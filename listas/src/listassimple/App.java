package listassimple;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ListaSimple listaSimple = new ListaSimple();
		listaSimple.agregarAlInicio(3);
		listaSimple.agregarAlInicio(4);
		listaSimple.agregarAlInicio(5);
		listaSimple.agregarAlInicio(6);
		listaSimple.agregarAlInicio(7);
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		imprimir(lista);
		
	}

	public static void imprimir(ArrayList<Integer> lista) {
		
		imprimir(lista,0);
	}

	private static void imprimir(ArrayList<Integer> lista, int i) {
		if(i == lista.size()) {
			System.out.println("termine");
		}else {
			imprimir(lista,i+1);
			System.out.println(lista.get(i));
		}
	}
}
