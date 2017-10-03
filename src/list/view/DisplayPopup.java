package list.view;

import javax.swing.JOptionPane;
/**
 * GUI class using JOptionPane.
 * @author Jeremy The Super Awesome Guy Ever Of Supremeness And Awesomeness That Is Also Awesome.
 * @version 1.0 10.03.2017
 */
public class DisplayPopup
{
	/**
	 * 
	 * Displays popups to show the String supplied.
	 * @param textToDisplay for the text to be displayed.
	 */
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	
	/**
	 * @return The users response to the question.
	 * Uses a popup to display a question to the user and returns their response as a String. 
	 * @param fromQuestion The question being asked.
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer; 
	}
}
