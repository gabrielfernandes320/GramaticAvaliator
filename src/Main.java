import java.util.*;


public class Main {

	private static String expression = "S=aSb/Ab/Ba;A=ab/aC;C=ab";
	private static List<String> listOfRules;
	private static Stack pilha = new Stack();
	private static Map<Character, List<String>> mappedGramatic;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions func = new Functions();

		listOfRules = func.SeparateRules(expression,";");
		mappedGramatic = func.loadHash(listOfRules);

		//pilha.push(mappedGramatic.get(0).get(func.getRandomElement(mappedGramatic.get(0).size())));
		List<Integer> teste = null;
		Character sas = 's';


		mappedGramatic.get('S').forEach(System.out::println);


	}


			
		

	}

	
	

