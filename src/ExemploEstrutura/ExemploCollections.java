package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Atletico Mineiro");
		arrayList.add("Mirassol");
		arrayList.add("Juventude");
		arrayList.add("Argentino Juniors");
		
		// Ordenar
		Collections.sort(arrayList);
		
		// Desordenar
		Collections.shuffle(arrayList);
		
		System.out.println(arrayList);
	}

}
