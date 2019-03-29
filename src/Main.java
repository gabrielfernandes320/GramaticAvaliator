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


		String firtElement = func.GetRandomElementOfNonTerminal(mappedGramatic, 'S');
		List<Character> terminalsList = new ArrayList<Character>();
		terminalsList =	func.stringToCharArray(firtElement);
		pilha = func.LoadStack(terminalsList);
		while (!pilha.isEmpty()) {
		if(func.isUppercase((Character) pilha.peek())){
			firtElement = func.GetRandomElementOfNonTerminal(mappedGramatic,(Character)pilha.peek());
			terminalsList =	func.stringToCharArray(firtElement);
			pilha = func.LoadStack(terminalsList);
		}
		else {
			System.out.println(pilha.pop());
		}


		}
	}






	}



	
	

