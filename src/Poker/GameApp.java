package Poker;

import java.util.Vector;

public class GameApp {
		
	//TODO: MAKE SINGLETON & CHANGE DECK TO PRIVATE
	public static void main(String[] args) 
	{
		Hand playerHand = new Hand();
		Hands.add(0, playerHand);
		
		GameDeck.Deal(Hands);
		
		view.initiateGuiView();
	}
	
	public static Vector<Hand> Hands = new Vector<Hand>();
	public static GuiView view = new GuiView();
	public static Deck GameDeck = new Deck();
	public final static int DENOMINATIONS = 13;
	public final static int SUITS = 4;
	public final static int FULL_DECK_SIZE = 52;

}
