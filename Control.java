package Assignment;

import java.util.Scanner;

import AssignmentTest2.abusive;

public class Control
{
	public static void main(String[] args)  //throws FileNotFoundException
	{
		//This is an option which allows the user to input an abusive word
		//Scanner is used to allow user to input
		//Scanner is the class name, userInput is the name of object and System.in is the input stream
		//User is asked if they would like to enter an abusive word
		Scanner userInput = new Scanner(System.in);
		//User given option of Yes or No
		System.out.print("Would you like to enter an abusive word?(Yes/No): ");
		String  Answer = userInput.nextLine();
		//If statement used to check if User entered Yes or No
		//If the User enter Yes then the following statement will execute allowing user to enter abusive word
		if(Answer.equals("Yes"))
		{
			//Scanner used again for user input
			//Allow user to add their own abusive word(rule)
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an abusive word: ");
			String abusiveword = input.nextLine();
			//the abusive word string entered by the user is added to list of abusive words
			abusive Words = new abusive("shut up", "stupid", "kill", "dumb", "what", "get away", abusiveword);
		}//end if 
		else
			//if the user enters No then the following statement will execute
			if(Answer.equals("No"))
			{
				//list of abusive words to be search in the posts
				abusive Words = new abusive("shut up", "stupid", "kill", "dumb", "what", "get away", "no");
			}//end if-else
			else
				//if statement for error-checking used when neither Yes or No is entered
				if(!Answer.equals("Yes")||!Answer.equals("No"))
				{
					//Warning to user that the wrong input was entered
					System.out.print("WRONG INPUT!\n");
					//List of abusive words to be search in the posts
					abusive Words = new abusive("shut up", "stupid", "kill", "dumb", "what", "get away", "no");
				}//end if-else
		}//end main
}//end class


	
