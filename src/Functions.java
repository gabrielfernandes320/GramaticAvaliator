import java.util.Random;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.lang.Character;

public class Functions {
	
	String RemoveInitialSymbol(String Gramatica) {
	
		String[] data = Gramatica.split("=", 2);

		return data[1];
		
	}
	
	List<String>  SeparateRules(String Expression, String separator) {
		
		List<String> ListOfRules = new ArrayList<String>();
		String[] strings = Expression.split(separator, CountNumberOfRules(Expression)+1);
				
		for (String rule : strings) {
			ListOfRules.add(rule);
		}
		return ListOfRules;
		
	}
	
	private int CountNumberOfRules (String Expression) {
		
		int count = Expression.length() - Expression.replace("/", "").length();
			
		return count;
		
	}
	
	Stack LoadStack (String[] Expression) {
		
		Stack pilha = new Stack();

		for(String string : Expression){
			pilha.push(string);
		}

		return pilha;
		
	}
	
	

	public int getRandomElement(List<Integer> list)
	{
		Random rand = new Random();
		return list.get(rand.nextInt(list.size()));
	}
	
	public Map<Character, List<String>> loadHash(List<String> ListOfRules) {
		Map<Character,List<String>> derivations = new HashMap<Character, List<String>>();
		
		
		
		
		for (String poss : ListOfRules) {
			
			for (String string : ListOfRules) {
				derivations.put(string.charAt(0), SeparateRules(RemoveInitialSymbol(string), "/"));
			}
			/*for (char p: poss.toCharArray()) {
				if (Character.isUpperCase(p)) {
					rules.put(p, poss);
				}
				
			}*/
		
		}
		
		return derivations;
	}

}
