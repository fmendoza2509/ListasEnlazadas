package Lista;

public class Nodo {
	/******************************************
	 * Se declara una variable de tipo Object *
	 * que puede guardar cualquier cosa       *
	 ******************************************/
	Object valor; 
	/*****************************************
	 * se declara una variable del tipo Nodo *
	 * por que es un puntero hacia el si-    *
	 * guiente nodo                          *
	 *****************************************/
	Nodo siguiente;
	//Creamos un constructor sobrecargado
	public Nodo(Object valor) {
		this.valor = valor;
		this.siguiente = null;
	}
	/*
	 * Creamos un método para enlazar el nodo
	 */
	public void EnlazarSiguiente(Nodo n) {
		siguiente = n;
	}
	/*
	 * Método para que nos retorne el valor del 
	 * siguiente nodo
	 */
	public Nodo ObtenerSiguiente() {
		return siguiente;
	}
	/*
	 * Método para obtener valor
	 */
	public Object ObtenerValor() {
		return valor;
	}
}
