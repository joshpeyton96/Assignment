package Assignment;

import java.util.ArrayList;

public class displayResults 
{
	//method to display results
	public displayResults(ArrayList abusive, ArrayList nonAbusive)
	{
		  //Displaying the Abusive Posts
   	    for(int i = 0; i<abusive.size(); i++)
   	    {
   	    	System.out.println(abusive.get(i));
   	    	System.out.println("Is an abusive post");
   	    }
   	//Displaying the Non Abusive Posts
   	    for(int i = 0; i<nonAbusive.size(); i++)
   	    {
   		    System.out.println(nonAbusive.get(i));
   	    	System.out.println("Is a non abusive post");
   	    }
	}
	

}
