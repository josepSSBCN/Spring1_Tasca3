package MainPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// DEFINICIO VARIABLES
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<Integer>();

		// ACCIONS
		Collections.addAll(intList, 9, 0, 8, 1, 7, 2, 6, 3, 5, 4);
		System.out.println(String.format("Llista original: %s", intList));

		// A la vegada que es copia, s'ordena del reves, pk es comença pel final
		// i s'acaba al principi
		for (ListIterator<Integer> it = intList.listIterator(intList.size()); it.hasPrevious();) {
			int t = it.previous();
			intList2.add(t);
		}

		// SORTIDA
		System.out.println(String.format("Llista copia ordenada del reves: %s", intList2));

	}
}
