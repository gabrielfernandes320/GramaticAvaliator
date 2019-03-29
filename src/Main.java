import java.util.*;


public class Main {

	private static String expression = "S=Aa/Aa;A=Cb/Cb;C=c/c";
	private static List<String> listOfRules;
	private static Stack pilha = new Stack();
	private static Map<Character, List<String>> mappedGramatic;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions func = new Functions();

		System.out.println("Entre com uma regra para derivacao no formato '=' após os não terminais, '/' separando as possibilidades de derivação e ':' para separar nao terminais, ex: S=Aa/Aa;A=Cb/Cb;C=c/c :");
		Scanner read = new Scanner(System.in);
		expression = read.nextLine();

		listOfRules = func.SeparateRules(expression,";");

		mappedGramatic = func.loadHash(listOfRules);



		String firtElement = func.GetRandomElementOfNonTerminal(mappedGramatic, 'S');
		List<Character> terminalsList = new ArrayList<Character>();
		terminalsList =	func.stringToCharArray(firtElement);
		pilha = func.LoadStack(terminalsList, pilha);
		while (!pilha.isEmpty()) {
		if(func.isUppercase((Character) pilha.peek())){
			firtElement = func.GetRandomElementOfNonTerminal(mappedGramatic,(Character)pilha.peek());
			terminalsList =	func.stringToCharArray(firtElement);
			pilha.pop();
			pilha = func.LoadStack(terminalsList, pilha);
		}
		else {
			System.out.println(pilha.pop());
		}


		}
	}






	}



	
	

