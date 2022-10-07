import java.util.Stack;

public class Question2 {

	public static void main(String[] args) {
		
	    String word = "verisimilitude";
	    Stack<Character> wordInStack = new Stack<Character>();
	    boolean isPalindrome = true;

	    for(int i = 0; i<word.length(); i++) {
	        wordInStack.push(word.charAt(i));
	        
	    }

	    for(int i = 0; i  < word.length(); i++) {
	        
	    	if(word.charAt(i) != wordInStack.pop()){
	            isPalindrome = false;
	            
	        }
	    	
	    }
	    
	        System.out.println(isPalindrome);
	        
	}

}
