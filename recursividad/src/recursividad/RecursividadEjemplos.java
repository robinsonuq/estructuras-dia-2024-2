package recursividad;

public class RecursividadEjemplos {

	public static void main(String[] args) {
		int arreglo[] = {1,2,3,4,5};
		recorrerarreglo(arreglo);
	}

	public static void recorrerarreglo(int[] arreglo) {
		recorrerarreglo(arreglo, 0);
	}

	private static void recorrerarreglo(int[] arreglo,int i) {
		if(i < arreglo.length) {
			recorrerarreglo(arreglo,i+1);
			System.out.println("Valor "+arreglo[i]);
		}
	}
}
