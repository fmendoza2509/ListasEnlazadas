package Lista;

public class ListaEnlazada {
	Nodo cabeza;
	int size;//tamaño de la lista enlazada
	public ListaEnlazada() {
		cabeza = null;
		size = 0;
	}
	//Método para añadir el primer elemento de la lista
	public void AddPrimero(Object obj) {
		/*
		 * Verificamos si la cabeza es nula y si lo es
		 * añadimos dicho elemento a la cabeza
		 */
		if(cabeza==null) {
			cabeza = new Nodo(obj);
		}else {
			/*
			 * Caso contrario, es decir, no esta vacia
			 */
			Nodo temp = cabeza;//creamos un nodo temporal
			Nodo nuevo = new Nodo(obj);//creamos un nuevo nodo
			nuevo.EnlazarSiguiente(temp);//enlazamos el nodo temporal
			cabeza = nuevo;//hacemos el cambio de valores para que el nuevo sea la cabeza
		}
		size++;
	}
	//Método para saber si la cabeza esta vacia
	public boolean EstaVacia() {
		return (cabeza == null)?true:false;//Expresion que evalua
	}
	//Método para saber el tamaño de la lista
	public int size() {
		return size;
	}
	//Método para obtener un valor de la lista enlazada
	public Object Obtener(int i) {
		int contador = 0;
		Nodo temp = cabeza;
		while(contador<i) {
			temp = temp.ObtenerSiguiente();
			contador++;
		}
		return temp.ObtenerValor();
	}
}

