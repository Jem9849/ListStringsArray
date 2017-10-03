package list.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Wierdo";
		this.isJumble = false;
	}
	
	public Kahoot(String creator, int questionCount)
	{
		this.creator = creator;
		this.questionCount = questionCount;
	}
}
