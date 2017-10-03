package list.controller;


// Imported lists and the kahoot class which sits in the model package.
import java.util.List;
import java.util.ArrayList;
import list.model.Kahoot;


// Created a list called myKahoots and added a default kahoot called myFirstKahoot.
public class ListController
{
	private List<Kahoot> myKahoots;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	
	
	// Added objects into the myKahoots list.
	private void FillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot bunnyFactsTackle = new Kahoot("Jeremy", 6);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton", 10);
		Kahoot presidents = new Kahoot("Obama", 44);
		myKahoots.add(fiftyStates);
		myKahoots.add(bunnyFactsTackle);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
