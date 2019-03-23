import java.util.Stack;
import java.util.ArrayList;
import java.util.List;;

public class Main {

	private static String expression = "S=aSb/ab/s/wasd/weq/asd/qwe/asd";
	private static String[] PossList;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions func = new Functions();
		
		
		expression = func.RemoveInitialSymbol(expression);
		PossList = func.SeparateRules(expression);
		
		
		for(String string : PossList){
			System.out.println(string);    
		}

	}

	
	
}
