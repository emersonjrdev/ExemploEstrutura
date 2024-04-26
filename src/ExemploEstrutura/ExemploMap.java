package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(22, "São Paulo");
		map.put(26, "Palmeiras");
		map.put(30, "Corinthians");
		
		map.forEach((key, valor) ->{
			System.out.println("Titulos Paulistas : " + key);
			System.out.println("Nome: " + valor);
		});
		System.out.println("==================================================");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Libertadores: " + entry.getKey() + "| Nome: " + entry.getValue());
		}
		
		System.out.println("==================================================");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		
		System.out.println("==================================================");
		
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		});
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(22, "São Paulo");
		table.put(26, "Palmeiras");
		table.put(30, "Corinthians");
		
		System.out.println("==================================================");
		
		Enumeration<Integer> keys = table.keys();
		while(keys.hasMoreElements()) {
			int key = keys.nextElement();
			String value = table.get(key);
			System.out.println(key + " = " + value);
		}
		
		System.out.println("==================================================");
		
		for(Map.Entry<Integer, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("==================================================");
		
		table.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		
		map2.put("São Paulo" , 22);
		map2.put("Palmeiras", 26);
		map2.put("Corinthians", 30);
		
		System.out.println("==================================================");
		
		TreeMap<String, Integer> map3 = new TreeMap<>();
		
		map3.put("São Paulo" , 22);
		map3.put("Palmeiras", 26);
		map3.put("Corinthians", 30);
		
	}

}
