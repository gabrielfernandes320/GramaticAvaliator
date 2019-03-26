import java.util.Stack;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	private static String expression = "S=aSb/Ab/Ba;A=ab/aC;C=ab";
	private static List<String> ListOfRules;
	private static Stack pilha;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions func = new Functions();
		
		ListOfRules = func.SeparateRules(expression);
		
		
			for (String string : ListOfRules) {
				System.out.println(string);
			}
			
		

	}

	
	
}
