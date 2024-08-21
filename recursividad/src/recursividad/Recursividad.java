package recursividad;

public class Recursividad {

	
	public static void main(String[] args) {
		
		abrirMatriuska(5);
	}

	private static void abrirMatriuska(int numero) {
		if(numero == 0) {
			return;
		}
		System.out.println("Se abrio la matriuska "+numero);
		abrirMatriuska(--numero);
		System.out.println("Se cerro la matriuska "+numero);
	}
}
