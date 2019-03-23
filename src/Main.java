import java.util.Stack;

public class Main {

	private static String expression = "S=aSb/ab";
	private static String[] PossList;
	private static Stack pilha;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions func = new Functions();

		expression = func.RemoveInitialSymbol(expression);
		PossList = func.SeparateRules(expression);
		pilha = func.LoadStack(PossList);

		while (!pilha.isEmpty())
		{
			System.err.println(pilha.pop());
		}




	}

	
	
}
