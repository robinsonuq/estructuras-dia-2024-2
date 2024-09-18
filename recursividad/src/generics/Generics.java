package generics;

import java.util.ArrayList;
import java.util.List;

import anonimo.Estudiante;

public class Generics {

	
	public static void main(String[] args) {
	
		List<?> lista = new ArrayList<>();
		
		obtnerSize(lista);
	}

	private static int obtnerSize(List<?> lista) {
		
		return lista.size();
	}
}
