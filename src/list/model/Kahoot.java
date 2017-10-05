package list.model;

// Adds in data members the class. 
public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	
	// We then add default values.
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Wierdo";
		this.isJumble = false;
	}
	
	// Then we add in a string and a question count for the kahoots. 
	public Kahoot(String creator, int questionCount)
	{
		this.creator = creator;
		this.questionCount = questionCount;
	}
	
	// Then we add a string to put things together. 
	public String toString()
	{
		String desc = "This Kahoot was made by " + creator + " and has " + questionCount + " questions.";
		
		return desc;
	}
	
	public String getCreator()
	{
		return creator;
	}
}
