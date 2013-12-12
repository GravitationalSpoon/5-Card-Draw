package Poker;

public class Card 
{
	
	Card(Denomination cardValue, Suit cardSuits)
	{
		this.CardValue = cardValue;
		this.CardSuit = cardSuits;
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
