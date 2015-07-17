package ClassicDataStructures;

/*
 * Stack is an abstract data structure
 * It stores all elements of data type objects
 * which is a little inefficient but highly flexible
 */
import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack names = new Stack();
		names.push("Jimmy");
		names.push("Jolly");
		
		System.out.println("Top of stack is " + names.peek());
		
		names.pop();
		System.out.println("Top of stack is " + names.peek());
		
	
		names.push("ozzy");
		System.out.println("Top of stack is " + names.peek());
		
		if(!names.empty()){
			System.out.println("Top of stack is " + names.peek());
			names.pop();
		}
		System.out.println("Top of stack is " + names.peek());
		names.pop();
		

		if(!names.empty()){
			System.out.println("Top of stack is " + names.peek());
		}else
			System.out.println("Stack empty");
	}

}
