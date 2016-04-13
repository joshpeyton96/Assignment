package Assignment;

import java.util.Scanner;      // Required for the scanner   
import java.io.File;               // Needed for File and IOException 
import java.io.FileNotFoundException; //Required for exception throw
import java.util.ArrayList;// Required for ArrayLists


public class AbusiveWords
{
	//File is equal to the text file abusive.txt
	//Directory or location of abusive.text
	File file = new File("C:/Users/joshp/Desktop/Computer Science/Year 2/abusive.txt");
	//Encapsulating variables as private
	private String word1, word2, word3, word4, word5, word6, word7;
	
    //Constructor
	public AbusiveWords(String word1, String word2, String word3, String word4, String word5, String word6, String word7) 
	{
	   	this.word1 = word1;
	   	this.word2 = word2;
	   	this.word3 = word3;
	   	this.word4 = word4;
	   	this.word5 = word5;
	   	this.word6 = word6;
	   	this.word7 = word7;
	   	
	   	//Exception handlier
	   	try 
	   	{
	   		//Scan the file so it can be read line by line
	   	    Scanner scanner = new Scanner(file);
	   	    //Creating array list to store the contents of abusive words from control
	   	    ArrayList<String> abusiveWord = new ArrayList<String>();
	   	    //Array list to store abusive posts
	   	    ArrayList<String> abusivePosts = new ArrayList<String>();
	   	    //Array list to store non abusive posts
	   	    ArrayList<String> nonAbusive = new ArrayList<String>();
	   	    
	   	    //Adding each abusive word to an arrayList
	    	abusiveWord.add(word1);
	    	abusiveWord.add(word2);
	    	abusiveWord.add(word3);
	    	abusiveWord.add(word4);
	    	abusiveWord.add(word5);
	    	abusiveWord.add(word6);
	    	abusiveWord.add(word7);
	    		
	   	    //Reading file line by line
	   	    while (scanner.hasNextLine()) 
	   	    {
	   	    	//String line in file is equal to next line
	   	    	 String line = scanner.nextLine();
	   	
	   	        //If statement to check if the line in file(post) contains any of the abusive words
	   	        if(line.contains(abusiveWord.get(0))||line.contains(abusiveWord.get(1))||
	   	           line.contains(abusiveWord.get(2))||line.contains(abusiveWord.get(3))||
	   	           line.contains(abusiveWord.get(4))||line.contains(abusiveWord.get(5))||
	   	           line.contains(abusiveWord.get(6))) 
	   	        {
	   	          //If the line in the file contains one of the abusive words 
	   	          //then this line will be printed as an abusive post 
	   	          abusivePosts.add(line);
  	        	  //System.out.println("The post - " + line);
    	    	  //System.out.println("Is an abusive post");
	   	        }//end if
	   	        else
	   	        	//This else-if statement is used to check if the line(post) in the file
	   	        	//contains one of the abusive words in Capital Letters(Rule)
	   	        	if(line.contains(abusiveWord.get(0).toUpperCase())||
	   	        	   line.contains(abusiveWord.get(1).toUpperCase())||
	   	        	   line.contains(abusiveWord.get(2).toUpperCase())||
	   	        	   line.contains(abusiveWord.get(3).toUpperCase())||
	   	        	   line.contains(abusiveWord.get(4).toUpperCase())||
	   	        	   line.contains(abusiveWord.get(5).toUpperCase())||
	   	               line.contains(abusiveWord.get(6).toUpperCase()))
	   	               {
	   	        	     //If the line in the file contains one of the abusive words in Capital letter
	  	   	             //then this line will be printed as an abusive post 
	   	        		 abusivePosts.add(line);
	   	        		 //System.out.println("The post - " + line);
	   	        		 //System.out.println("Is an abusive post");
	   	               }//end if
	   	        //Else statement to display the lines(posts) in the file which do not contain
	   	        //an abusive word therefore are non abusive
	   	        else
	   	        {
	   	        	nonAbusive.add(line);
	   	        	//System.out.println("The post - " + line);
	    	    	//System.out.println("Is a non abusive post");
	   	        }//end else
	   	        
	   	       
	   	    }//end while
	   	    
	   	    //Passing arrayList abusivePosts and nonAbusive to class displayResults
	   	    displayResults results = new displayResults(abusivePosts, nonAbusive);
	   	    
    
	   	    } //end try
	    	
        //If an exception occurs within the try block, that exception 
	   	//is handled by an exception handler associated with it
	   	catch(FileNotFoundException e)
	   	{
	   	}//end catch
	   	
	 }//end constructor
	
	// getter setters word1
    public String getWord1() 
    {
        return word1;
    }
    public void setWord1(String word1)
    {
        this.word1 = word1;
    }
    // getter setters word2
    public String getWord2() 
    {
        return word2;
    }
    public void setWord2(String word2)
    {
        this.word2 = word2;
    }
    // getter setters word3
    public String getWord3() 
    {
        return word3;
    }
    public void setWord3(String word3)
    {
        this.word3 = word3;
    }
    // getter setters 4
    public String getWord4() 
    {
        return word4;
    }
    public void setWord4(String word4)
    {
        this.word4 = word4;
    }
    // getter setters 5
    public String getWord5() 
    {
        return word5;
    }
    public void setWord5(String word5)
    {
        this.word5 = word5;
    }
    // getter setters 6
    public String getWord6() 
    {
        return word6;
    }
    public void setWord6(String word6)
    {
        this.word6 = word6;
    }
    // getter setters 7
    public String getWord7() 
    {
        return word7;
    }
    public void setWord7(String word7)
    {
        this.word7 = word7;
    }
 }


