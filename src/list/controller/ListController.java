package list.controller;


// Imported lists and the kahoot class which sits in the model package.
import java.util.List;
import java.util.ArrayList;
import list.model.Kahoot;
import list.view.DisplayPopup;


// Created a list called myKahoots and added a default kahoot called myFirstKahoot.
public class ListController
{
	private List<Kahoot> myKahoots;
	
	private DisplayPopup popup;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new DisplayPopup();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if(currentCreator.equals("Somprasong"))
			{
				for (int loop = 0; loop < 2; loop += 1)
				{
					if (loop == 0) {
						popup.displayText("RAWR. You haz defaultness.");
					}
					else
					{
						popup.displayText("GOOBY BYE");
					}
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
		}
	}
	
	// Added objects into the myKahoots list.
	private void fillTheList()
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
