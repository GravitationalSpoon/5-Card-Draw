package Poker;
import java.util.Vector;

public class Deck 
{
	
	Deck()
	{
		ResetDeck();
	}
	
	public void Deal(Vector<Hand> hands)
	{
		ResetDeck();
		
		for(int i = 0; i < hands.size(); i++)
		{
			if(hands.elementAt(i) != null)
				hands.elementAt(i).DiscardHand();
			hands.elementAt(i).DrawHand();
		}
	}
	
	/**
	 * Sets the Vector Cards back to 52 cards then shuffles them for a fresh deck
	 */
	public void ResetDeck()
	{
		Cards = new Vector<Card>();
		Denomination startingDenomination = Denomination.TWO;
		for(int i = 0; i < GameApp.DENOMINATIONS; i++)
		{
			Suit startingSuit = Suit.HEARTS;
			for(int j = 0; j < GameApp.SUITS; j++)
			{
				Cards.add(new Card(startingDenomination,startingSuit));
				startingSuit = startingSuit.next();				
			}
			startingDenomination = startingDenomination.next();
		}
		
		ShuffleDeck();
	}
	
	/**
	 * Rearranges the vector Cards so that it has a new order based on 
	 * random numbers
	 */
	private void ShuffleDeck()
	{
		Vector<Card> ShuffledDeck = new Vector<Card>();
		int deckSize = Cards.size();
		for(int i = 0; i < deckSize; i++)
		{
			int randomNumber =(int) ((deckSize-1-i)*Math.random());
			
			ShuffledDeck.add(Cards.elementAt(randomNumber));
			Cards.remove(randomNumber); 
		}
		
		Cards = ShuffledDeck;		
	}
	
	
	/**
	 * Returns the first card from Cards and removes it from the vector
	 * @return card at index 0 of Cards
	 */
	public Card drawCard()
	{
		Card returnCard = Cards.firstElement();
		removeCardFromCards(returnCard);
		return returnCard;
	}
	
	/**
	 * Removes a specific Card from Cards
	 * @param cardToRemove - card to remove from vector Cards
	 */
	private void removeCardFromCards(Card cardToRemove)
	{
		Cards.remove(cardToRemove);
	}
	
	
	private Vector<Card> Cards;
	public static final int HAND_SIZE = 5;
	
}
