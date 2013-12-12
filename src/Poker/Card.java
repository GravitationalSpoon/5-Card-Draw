package Poker;

public class Card 
{
	
	Card(Denomination cardValue, Suit cardSuits)
	{
		CardValue = cardValue;
		CardSuit = cardSuits;
	}
	
	public Denomination getDenomination()
	{
		return CardValue;
	}
	
	public Suit getSuit()
	{
		return CardSuit;
	}
	
	
	private Denomination CardValue;
	private Suit CardSuit;
	
}
