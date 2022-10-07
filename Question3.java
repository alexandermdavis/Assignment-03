
public class Question3 {

	public static void main(String[] args) {
		
		isBalanced("(3*4)+7/2)");
		isBalanced("(((8*8-2) + 9 - (12*5)) - 2 )");		

	}

	public static void isBalanced(String a) {
		
		int count = 0;
		
		for(char equation : a.toCharArray())
		    
			if(equation == '(' ) count++;
		    
		    	else if (equation == ')' ) count--;

		    if(count != 0) {
		    	
		    	System.out.println(a + " --> false");
		    	
		    } else if(count == 0) {
		    	
		    		System.out.println(a + "--> true");
		    		
		    	}
		    	
		}
	
}
