package tools.controller;

// Imported lists and the kahoot class which sits in the model package.
import java.util.List;
import java.util.ArrayList;
import tools.model.Kahoot;
import tools.view.PopupDisplay;


// Created a list called myKahoots and added a default kahoot called myFirstKahoot.
public class Controller
{
	private List<String> fiftyStatesQuestions;
	private List<Kahoot> myKahoots;
	private PopupDisplay popup;
	
	public Controller()
	{
		fiftyStatesQuestions = new ArrayList<String>();
		myKahoots = new ArrayList<Kahoot>();
		popup = new PopupDisplay();
	}
	// This is a kahoot project using ArrayLists and Lists. It tries to emulate a Kahoot.
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
		changeTheList();
	}
	
	// Here we show the creator, the number of questions, and the topic. We also have a default. 
	private void showTheList()
	{
		String currentCreator = "";
		for (int index = 0; index < myKahoots.size(); index++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			String currentTopic = myKahoots.get(index).getTopic();
			
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
			// This here is how we print out the creator. We print it by single chars. We also print the topic the same way but backwards. We accomplish this with for loops and the substring function.
			for (int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			
			for (int letter = currentTopic.length() - 1; letter >= 0; letter-= 1)
			{
				popup.displayText(currentTopic.substring(letter, letter + 1));
			}
		}
		
		
	}
	
	/*private void fillQuestionStates()
	{
		String utah = new String("What is the size of Utah?");
		String texas = new String("What do people think when they think of Texas?");
		String all = new String("How many states are there?");
		fiftyStatesQuestions.add(utah);
		fiftyStatesQuestions.add(texas);
		fiftyStatesQuestions.add(all);
	}
	*/
	// Here we can add objects in the kahoot list. Just like the comment below says.
	// Added objects into the myKahoots list.
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The fifty United States");
		//Kahoot bunnyFactsTackle = new Kahoot("Jeremy", 6, "Bunnies are carniverous.");
		//Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything - literally");
		//Kahoot animalColor = new Kahoot("Branton", 10, "MURRRR COLORS");
		//Kahoot presidents = new Kahoot("Obama", 44, "The 44th president of US");
		myKahoots.add(fiftyStates);
		//myKahoots.add(bunnyFactsTackle);
		//myKahoots.add(bigQuiz);
		//myKahoots.add(animalColor);
		//myKahoots.add(presidents);
	}
	// We can also change the list by removing things from the list and reducing the size or items inside.
	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed the life of a Kahoot that was made by " + removed.getCreator());
		popup.displayText("The list is now at: " + myKahoots.size() + " in size." );
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " items big.");
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with by the Kahoot from: " + myKahoots.get(2).getCreator());
	}
	// This here finds the minimum length of a value in the ArrayList.
	public int findMinLength(ArrayList<String> myList)
	{
		int min = Integer.MAX_VALUE;
		
		for(int index = 0; index < myList.size(); index++)
		{
			if (myList.get(index).length() < min)
			{
				min = myList.get(index).length();
			}
		}
		return min;
	}
	
	public PopupDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>) myKahoots; 
	}
}
