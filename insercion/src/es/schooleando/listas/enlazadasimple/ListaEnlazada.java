package es.schooleando.listas.enlazadasimple;

public class ListaEnlazada {
	private Nodo primero;
	private Nodo ultimo;
	
	public ListaEnlazada() {
		this.primero = null;
		this.ultimo = null;
	}

	public Nodo obtenerPrimero() {
		return primero;
	}
	
	public Nodo obtenerUltimo() {
		return ultimo;
	}
	
	public void insertar(int valor) {
		Nodo nuevo = new Nodo(valor, this.primero);
		if (this.primero == null) {
			this.primero = nuevo;
			this.ultimo = nuevo;
		}
		else {
			nuevo.siguiente = this.primero;
			this.primero = nuevo;
		}
		
	}
	
	public void insertarFinal(int valor) {
		Nodo nuevo = new Nodo(valor, null);
		if (this.primero == null) {
			this.primero = nuevo;
			this.ultimo = nuevo;
		}
		else {
			this.ultimo.setSiguiente(nuevo);
			this.ultimo = nuevo;	
		}
	}
	
	public void insertarPosicion(int posicion, int valor) throws Exception {
		Nodo actual = this.primero;
		
		for(int i=0; i<posicion; i++) {
			if (actual == null) {
				throw new Exception("te has salido de la lista!");
			}
			actual = actual.siguiente;
		}
		
		Nodo nuevo = new Nodo(valor, actual.siguiente);
		actual.siguiente = nuevo;
	}
	
	public int buscarValor(int valor) throws Exception {
		Nodo nodo;
		int posicion = 0;
		
		nodo = this.primero;
		while ( nodo != null ) {
			if (nodo.valor == valor) {
				return posicion;
			}
			posicion++;
		}
		
		throw new Exception("Valor " + valor + " no encontrado en la lista!");
	}
	
	public int obtenerValor(int posicion) throws Exception {
		Nodo actual = this.primero;
		
		for(int i=0; i<posicion; i++) {
			if (actual == null) {
				throw new Exception("te has salido de la lista!");
			}
			
			actual = actual.siguiente;
			
		}
		
		if (actual == null) {
			throw new Exception("te has salido de la lista!");
		}
		
		return actual.valor;
	}
	
	public void eliminarValor(int valor) throws Exception {
		Nodo actual = this.primero;
		Nodo anterior = null;
		
		if (actual == null) {
			throw new Exception("La lista está vacía!");
		}
		
		do {	
			if (actual.valor == valor) {
				if (this.primero == actual) {
					this.primero = actual.siguiente;
				}
				else {
					anterior.siguiente = actual.siguiente;
				}
				actual.siguiente = null;
				return;
			}
			actual = actual.siguiente;
			anterior = actual;
		} while (actual != null);
			
		throw new Exception("No se ha encontrado el valor!");
	}
	
	public void eliminarPosicion(int posicion) throws Exception {
		Nodo actual = this.primero;
		Nodo anterior = null;
		int i = 0;
		
		for(i=0; i<posicion; i++) {
			if (actual == null) {
				throw new Exception("te has salido de la lista!");
			} 
			anterior = actual;
			actual = actual.siguiente;
			
		}
		

		if (i == 0) {
			this.primero = this.primero.siguiente;
		}
		else {
			anterior.siguiente = actual.siguiente;
		}
		actual.siguiente = null;
		
	}

	@Override
	public String toString() {
		Nodo actual = this.primero;
		
		String output = "LISTA:";
		while (actual != null) {	
			output += actual.valor + "/";
			actual = actual.siguiente;
		}
		
		return output;
	}
	
	
	
	
}
