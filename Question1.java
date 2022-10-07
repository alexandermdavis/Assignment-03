import java.util.LinkedList;
import java.util.Queue;

public class Question1 {

	public static void main(String[] args) {
				 
		Queue<Integer> myQ = new LinkedList<Integer>();
		
		myQ.add(6);
		myQ.add(23);
		myQ.add(-61);
		myQ.add(36);
		myQ.add(81);
		myQ.add(-42);
		
		minValue(myQ);
        
	}

	
	public static void minValue(Queue<Integer> myQ) {
		
		int min = 0;
		
        for (Integer item: myQ) {
            
            if(item < min) {
            	min = item;
            	
            }
            
        }
		
        System.out.println(myQ);
        System.out.println();
    	System.out.println("The min value of the queue is: " + min);
        
	}

}
