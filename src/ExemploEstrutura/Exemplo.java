package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
		
		System.out.println(new String ("Pedro") == new String ("Pedro")); //Imprime falso
		
		System.out.println(new String ("Pedro").equals(new String("Pedro"))); //Imprime true

		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("Moto");
		
		System.out.println("Elementos no HashSet");
		for(String veiculo : hashSet) {
			System.out.println(veiculo);
		}
		
		Iterator<String> iterator = hashSet.iterator();
		
		LinkedHashSet<String> lkHash = new LinkedHashSet<String>();
		Iterator<String> iteratorlkHash = lkHash.iterator();
		
		Set<String> setMap = new TreeSet<String>();
		Iterator<String> setMapIterator = setMap.iterator();
		
		System.out.println("Listando elementos com iterator");
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		LinkedHashSet<String> hashSet2 = new LinkedHashSet<String>();
		
		hashSet.add("Moto2");
		
		System.out.println("Elementos no HashSet");
		for(String veiculo : hashSet2) {
			System.out.println(veiculo);
		}
		
		System.out.println("=============================================");
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		numeros.add(14);
		numeros.add(15);
		numeros.add(16);
		numeros.add(17);
		numeros.add(18);
		numeros.add(19);
		numeros.add(20);
		
		System.out.println("Números em ordem:");
		for(Integer lista : numeros) {
			System.out.println(lista);
		}
		
		
		
		
		
	}

}
