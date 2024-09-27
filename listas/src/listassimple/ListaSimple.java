package listassimple;

import java.util.ArrayList;

public class ListaSimple {

	private int tamanio;
	private Nodo primero;

	public ListaSimple() {
		tamanio = 0;
		primero = null;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Nodo getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public void agregarAlInicio(int valor) {
		Nodo nuevoNodo = new Nodo(valor);

		if(esvacia()) {
			primero = nuevoNodo;
		}else {
			nuevoNodo.setSiguiente(primero);
			primero = nuevoNodo;
		}
		tamanio++;
	}

	public void agregarAlFinal(int valor) {
		Nodo nuevoNodo = new Nodo(valor);
		if(esvacia()) {
			primero = nuevoNodo;
		}else {
			Nodo nodoAux = primero;// int i = 0;
			while(nodoAux.getSiguiente() != null) {// i < tamnio-1
				nodoAux = nodoAux.getSiguiente(); // i++
			}
			nodoAux.setSiguiente(nuevoNodo);
		}
		tamanio++;
	}

	private boolean esvacia() {
		return primero == null;
	}

	public void imprimir() {
		imprimir(primero);
	}

	private void imprimir( Nodo i) {
		if(i == null ) {// lista.size()
			System.out.println("termine");
		}else {
			imprimir(i.getSiguiente());//i+1
			System.out.println(i.getDato());
		}
	}
	private void imprimir3( Nodo i) {
		if(i.getSiguiente() == null ) {// lista.size()
			System.out.println(i.getDato());
		}else {
			imprimir(i.getSiguiente());//i+1
			System.out.println(i.getDato());
		}
	}
	private void imprimir2( Nodo i) {
		if(i.getSiguiente() != null ) {// lista.size()
			imprimir(i.getSiguiente());//i+1
			System.out.println(i.getDato());
		}
	}











}
