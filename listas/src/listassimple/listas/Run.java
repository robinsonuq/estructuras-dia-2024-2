package listassimple.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Run {


	public static void main(String[] args) {

			List<String> list = new ArrayList<>();

			ListIterator<String> listIterator = list.listIterator();

			while(listIterator.hasPrevious()){
				listIterator.previous();
			}

 	}
}
