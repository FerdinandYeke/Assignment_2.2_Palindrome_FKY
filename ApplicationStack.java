/**
 * @author Ferdinand K. Yeke
 *
 */
import java.util.Stack;
import java.util.Scanner;
public class ApplicationStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates an instance of the Stack class
		Stack<Character> PalindromeCheck = new Stack<Character>();
		
		//Creates an Scanner instance
		Scanner scan = new Scanner(System.in);
		
		/*
		 * This checks the String word, and scanning it.
		 */
		System.out.println("Enter a word: ");
		String word = scan.next();
		
		/*
		 * After the String "word" was scanned, it is being put into a 
		 * while loop, where it pushes each character/letter of the word
		 * onto a stack. This does this until the word length has been reached.
		 */
		int i = 0;
		while(i < word.length())
		{
			 
			PalindromeCheck.push(word.charAt(i));
			i++;
		}//While loop ends here

		//Creates a string variable stackOutput
		String stackOutput = "";
		
		/*
		 * With this for loop here, it pops the stack to the String stackOutput variable
		 * until the stack is empty.
		 * 
		 */
		for(i = 0; i < word.length(); i++)
		
			/*
			 * Here each character in the stack is popped to the stackOutput.
			 * In each incrementation of the loop, the stackOutput (which has the pop characters) is 
			 * continuely being reassigned to 
			 * the pop method, which is then reassigned to itself to try to complete the word until the stack is empty.
			 */
			stackOutput = stackOutput+PalindromeCheck.pop();
		
		/*
		 * If the word inputted from the User equals the 
		 * stackOutput, then it is a palindrome, otherwise false.
		 * 
		 * This if statement also ignores case differences (Upper-case/Lower-Case)
		 *  of the words.
		 */
		if(word.equalsIgnoreCase(stackOutput))
		{
			System.out.println("It is a palindrome");
		}
		
		else
		{
			System.out.println("It is not a palindrome");
		}
		
		System.out.println(stackOutput);
	}//Main method ends here

}//Classes ends here
