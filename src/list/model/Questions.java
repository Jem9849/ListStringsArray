package list.model;

import java.util.List;
import java.util.ArrayList;

public class Questions
{
	private String owner;
	private List<String> questions;
	questions = new ArrayList<String>();
	
	public Questions()
	{
		this.owner = "Somprasong";
		
		questions.add (new questions("What is a cat?", "What is a dog?", "What is a octogonapus?")); 
	}
	
	public questions(string owner, List questions)
	{
		this();
		
	}
}
