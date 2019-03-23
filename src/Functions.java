import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Functions {
	
	String RemoveInitialSymbol(String Gramatica) {
	
		String[] data = Gramatica.split("=", 2);

		return data[1];
		
	}
	
	String[] SeparateRules(String Expression) {
		
		String[] data = Expression.split("/", CountNumberOfRules(Expression)+1);
		
		return data;
		
	}
	
	private int CountNumberOfRules (String Expression) {
		
		int count = Expression.length() - Expression.replace("/", "").length();
			
		return count;
		
	}
	
	String[] LoadStack (String Expression) {
		
		Stack pilha = new Stack();
		
		pilha.push(Expression[]);
		
		return null;
		
	}
	
}
