package Poker;

public enum Suit 
{
	HEARTS
	{
		public Suit next()
		{
			return DIAMONDS;
		}
	},
	DIAMONDS
	{
		public Suit next()
		{
			return CLUBS;
		}
	},
	CLUBS
	{
		public Suit next()
		{
			return SPADES;
		}
	},
	SPADES
	{
		public Suit next()
		{
			return HEARTS;
		}
	};
	
	public abstract Suit next();
}
