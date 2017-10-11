package tools.model;

import java.util.List;
import java.util.ArrayList;

// Adds in data members the class. 
public class Kahoot
{
	private int questionCount;
	//private int level;
	private String creator;
	//private boolean isJumble;
	private String topic;
	// We then add default values.
	public Kahoot()
	{
		this.questionCount = 0;
		//this.level = 1;
		this.creator = "Somprasong";
		//this.isJumble = false;
		this.topic = "some topic";
	}
	
	// Then we add in a string and a question count for the kahoots. 
	public Kahoot(String creator, int questionCount, String topic)
	{
		this();
		this.creator = creator;
		this.questionCount = questionCount;
		this.topic = topic;
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
	
	public String getTopic()
	{
		return topic;
	}
}
