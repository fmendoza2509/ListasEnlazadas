package Lista;

public class ListaEnlazada {
	Nodo cabeza;
	int size;//tama�o de la lista enlazada
	public ListaEnlazada() {
		cabeza = null;
		size = 0;
	}
	//M�todo para a�adir el primer elemento de la lista
	public void AddPrimero(Object obj) {
		/*
		 * Verificamos si la cabeza es nula y si lo es
		 * a�adimos dicho elemento a la cabeza
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
	//M�todo para saber si la cabeza esta vacia
	public boolean EstaVacia() {
		return (cabeza == null)?true:false;//Expresion que evalua
	}
	//M�todo para saber el tama�o de la lista
	public int size() {
		return size;
	}
	//M�todo para obtener un valor de la lista enlazada
	public Object Obtener(int i) {
		int contador = 0;
		Nodo temp = cabeza;
		while(contador<i) {
			temp = temp.ObtenerSiguiente();
			contador++;
		}
		return temp.ObtenerValor();
	}
	//M�todo para eliminar primero
	public void EliminarPrimero() {
		cabeza = cabeza.ObtenerSiguiente();
		size--;
	}
	//M�todo para eliminar un elemento en un indice en especifico
	public void Eliminar(int i) {
		int contador = 0;
		Nodo temp = cabeza;
		if(i==0) {
			cabeza = cabeza.ObtenerSiguiente();
		}else {
			while(contador<i-1) {
				temp = temp.ObtenerSiguiente();
				contador++;
			}
			temp.EnlazarSiguiente(temp.ObtenerSiguiente().ObtenerSiguiente());
		}
		size--;
	}
	//M�todo para cortar la lista enlazada
	public void Cortar(int i) {
		//1 -> 2 -> 3 -> 4 -> 5-> 6
		//1 -> 2 -> 3 ...
		int contador =0;
		Nodo temp = cabeza;
		while(contador<i-1) {
			temp = temp.ObtenerSiguiente();
			contador++;
		}
		temp.EnlazarSiguiente(null);//con esto le decimos que llega hasta ah�
		size = i;//redimencionamos la lista
	}
}

