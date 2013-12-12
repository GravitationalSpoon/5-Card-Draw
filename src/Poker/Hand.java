package Poker;

import java.util.Vector;

public class Hand 
{
	public void DrawHand()
	{
		while(CardsInHand.size() < MAX_CARDS_IN_HAND)
		{
			CardsInHand.add(GameApp.GameDeck.drawCard());
		}
	}
	
	//public void AddHandWatcher(x implements HandWatcher)
	private void NotifyHandWatchers()
	{
		
	}
	
	public void DiscardHand()
	{
		while(!CardsInHand.isEmpty())
		{
			RemoveCard(CardsInHand.firstElement());
		}
	}
	
	private void RemoveCard(Card removalCard)
	{
		CardsInHand.remove(removalCard);
	}
	
	public Card getCardAt(int index)
	{
		return CardsInHand.elementAt(index);
	}
	
	public int NumberOfCards()
	{
		return CardsInHand.size();
	}
	
	private Vector<Card> CardsInHand = new Vector<Card>();
	//private Vector<? implements HandWatcher> HandWatchers = new Vector<? implements HandWatcher>();
	public final int MAX_CARDS_IN_HAND = 5;
}
