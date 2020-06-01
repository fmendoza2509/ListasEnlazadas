package Lista;

public class MainLista {

	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();//creamos una nueva lista enlazada
		System.out.println("Esta vacia: "+lista.EstaVacia());//imprimimos haber si la lista esta vacia o no
		//Agregamos elementos a la lista
		lista.AddPrimero(6);
		lista.AddPrimero(5);
		lista.AddPrimero(4);
		lista.AddPrimero(3);
		lista.AddPrimero(2);
		lista.AddPrimero(1);
		
		lista.EliminarPrimero();//Eliminamos el primer elemento de la lista
		
		//Imprimimos los datos de la lista
		System.out.println("Primero: "+lista.Obtener(0));
		System.out.println("�ltimo: "+lista.Obtener(lista.size()-1));
		System.out.println("Tama�o: "+lista.size());
		System.out.println("Esta vacia: "+lista.EstaVacia());
	}

}
