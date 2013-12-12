package Poker;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class GuiView 
{
	public void initiateGuiView()
	{
		Frame gameFrame = new Frame("Poker Game v0.1");
		gameFrame.setSize(800,600);
		gameFrame.setResizable(false);
		gameFrame.setLocation(200,100);
		gameFrame.addWindowListener(new XButtonListener());
		
		Panel backgroundPanel = new Panel(new BorderLayout());
		gameFrame.add(backgroundPanel);
		
		backgroundPanel.add(handPanel, BorderLayout.SOUTH);
		GridLayout handCardLayout = new GridLayout(1,5);
		handPanel.setLayout(handCardLayout);
		handCardLayout.setHgap(5);
		handPanel.setSize(handPanel.getWidth(), 100);
		
		handButtons.clear();
		for(int i = 0; i < GameApp.Hands.elementAt(0).NumberOfCards(); i++)
		{
			addCardButtonToHandButtons(GameApp.Hands.elementAt(0).getCardAt(i));
		}
		addHandButtonsToHandPanel();
		
		gameFrame.setVisible(true);
		
	}
	
	private void removeAllFromHandPanel()
	{
		handPanel.removeAll();
	}
	
	private void addHandButtonsToHandPanel()
	{
		for(int i = 0; i < handButtons.size(); i++)
		{
			handPanel.add(handButtons.elementAt(i));
		}
	}
	
	
	public void addCardButtonToHandButtons(Card cardToAdd)
	{
		CardButton temp = new CardButton(cardToAdd);
		handButtons.add(temp);
	}
	
	
	private class XButtonListener extends WindowAdapter
	{

		@Override
		public void windowClosing(WindowEvent ev) 
		{
			ev.getComponent().setVisible(false);
			System.exit(0);
		}
		
	}
	
	private static Panel handPanel = new Panel();
	
	private static Vector<CardButton> handButtons = new Vector<CardButton>();
	
}
