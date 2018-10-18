package es.schooleando.listas.enlazadasimple;

public class Main {

	public static void main(String[] args) throws Exception {
		ListaEnlazada lista = new ListaEnlazada();
		
		System.out.println(lista);
		
		lista.insertar(90);
		System.out.println(lista);
		lista.insertar(45);
		System.out.println(lista);
		lista.insertarFinal(200);
		System.out.println(lista);
		lista.insertar(20);
		System.out.println(lista);
		lista.eliminarPosicion(0);
		System.out.println(lista);
		lista.eliminarPosicion(1);
		System.out.println(lista);
		lista.eliminarValor(200);
		System.out.println(lista);
	}
	

}
