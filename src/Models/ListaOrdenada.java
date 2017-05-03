package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import excepciones.ElementNotAllowedException;
import excepciones.ListSizeOverflownException;

public class ListaOrdenada<E> extends ArrayList<E> {

	byte Lim_Max = 100;
	TreeSet<E> Lista = new TreeSet<E>();

	public ListaOrdenada(Comparator<E> comp) {
		super();
	}




	public boolean Aniadir(E element) throws ElementNotAllowedException, NullPointerException {//Comprueba y añade los elementos
		if (element != null) {
			if (this.size() <= Lim_Max) {
				return Lista.add(element);
			} else {
				throw new ListSizeOverflownException("Ya no hay mas espacio en la cola");//Si no hay mas espacio en la lista, salta esto
			}
		} else {
			throw new ElementNotAllowedException("No se admiten valores nulos");//Si añades un nulo, al no estar permitido, salta esto
		}
	}

	public void reverse(Comparator<? extends E> comp) {//Sirve para mostrar al revez el orden natural

		Lista.tailSet((E) comp);
	}

	public void min(Collection<? extends E> coll, Comparator<? super E> comp) {//Muestra el mas chico, que sera el primero

		Lista.first();
	}

	public void max(Collection<? extends E> coll, Comparator<? super E> comp) {//Muestra el mas grande, que sera el ultimo
		Lista.last();

	}
}
