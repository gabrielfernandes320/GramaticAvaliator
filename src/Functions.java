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
	
	Stack LoadStack (List<Character> Expression, Stack atualStack) {

		for(Character chars : Expression){
			atualStack.push(chars);
		}

		return atualStack;
		
	}
	

	public List<Character> stringToCharArray(String elements) {
		List<Character> list = new ArrayList<Character>();
		String reverse = "";
		for(int i = elements.length()-1; i>=0; i-- )
		{
			reverse = reverse + elements.charAt(i);
		}
		char[] a = reverse.toCharArray();
		for (Character aa : a) {
			list.add(aa);
		}
		return list;
	}

	public boolean isUppercase(char value){
		if(Character.isUpperCase(value)){
			return true;
		}
		return  false;
	}


	public int getRandomElement(int vectorSize)
	{
		Random rand = new Random();
		List<Integer> listOfInt =new ArrayList<Integer>();

		for (int i=0;i< vectorSize;i++){
			listOfInt.add(i);
		}
		return listOfInt.get(rand.nextInt(listOfInt.size()));
	}
	
	public Map<Character, List<String>> loadHash(List<String> ListOfRules) {
		Map<Character,List<String>> derivations = new HashMap<Character, List<String>>();

		for (String poss : ListOfRules) {
			
			for (String string : ListOfRules) {
				derivations.put(string.charAt(0), SeparateRules(RemoveInitialSymbol(string), "/"));
			}

		}
		return derivations;
	}

	public String GetRandomElementOfNonTerminal(Map<Character, List<String>> mappedGramatic, char NonTerminal){
		return mappedGramatic.get(NonTerminal).get(getRandomElement(mappedGramatic.get(NonTerminal).size()));
	}

}
