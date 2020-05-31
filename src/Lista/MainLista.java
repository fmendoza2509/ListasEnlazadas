package Lista;

public class MainLista {

	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();//creamos una nueva lista enlazada
		System.out.println("Esta vacia: "+lista.EstaVacia());//imprimimos haber si la lista esta vacia o no
		lista.AddPrimero("Franklin");//A�adimos el primer elemento al principio de la lista
		lista.AddPrimero(20);
		lista.AddPrimero("Hola que tal");
		lista.AddPrimero(3);
		
		System.out.println("Primer elemento: "+lista.Obtener(0));
		System.out.println("�ltimo: "+lista.Obtener(lista.size()-1));
		System.out.println("Index 2: "+lista.Obtener(2));
		
		System.out.println("Esta vacia: "+lista.EstaVacia());
		System.out.println("Tama�o: "+lista.size());
	}

}
