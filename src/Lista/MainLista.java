package Lista;

public class MainLista {

	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();//creamos una nueva lista enlazada
		System.out.println("Esta vacia: "+lista.EstaVacia());//imprimimos haber si la lista esta vacia o no
		
		lista.AddPrimero(6);
		lista.AddPrimero(5);
		lista.AddPrimero(4);
		lista.AddPrimero(3);
		lista.AddPrimero(2);
		lista.AddPrimero(1);
		
		System.out.println("Primero: "+lista.Obtener(0));
		System.out.println("Último: "+lista.Obtener(lista.size()-1));
		System.out.println("Tamaño: "+lista.size());
		System.out.println("Esta vacia: "+lista.EstaVacia());
	}

}
