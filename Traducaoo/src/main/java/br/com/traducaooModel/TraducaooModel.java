package br.com.traducaooModel;

import java.util.HashMap;

public class TraducaooModel {
	private static final HashMap<String, String> hash = new HashMap<>();
	
		static {
			hash.put("maca", "apple");
			hash.put("livro", "book");
			hash.put("arma", "weapon");
			hash.put("comida", "food");
			hash.put("hambúrguer", "hamburger");
			hash.put("frango", "chinken");
			hash.put("galo", "roster");
		}
		
		public String traduzirString (String palavra) {
			if (hash.containsKey(palavra)) {
				return hash.get(palavra);
			}
			
			else {
				return palavra;
			}
			
			
			
		}

}
