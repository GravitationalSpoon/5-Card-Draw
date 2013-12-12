package Poker;

public enum Denomination 
{
	TWO(2)
	{
		public Denomination next()
		{
			return THREE;
		}
	},
		
	THREE(3)
	{
		public Denomination next()
		{
			return FOUR;
		}
	},
	FOUR(4)
	{
		public Denomination next()
		{
			return FIVE;
		}
	},
	FIVE(5)
	{
		public Denomination next()
		{
			return SIX;
		}
	},
	SIX(6)
	{
		public Denomination next()
		{
			return SEVEN;
		}
	},
	SEVEN(7)
	{
		public Denomination next()
		{
			return EIGHT;
		}
	},
	EIGHT(8)
	{
		public Denomination next()
		{
			return NINE;
		}
	},
	NINE(8)
	{
		public Denomination next()
		{
			return TEN;
		}
	},
	TEN(10)
	{
		public Denomination next()
		{
			return JACK;
		}
	},
	JACK(11)
	{
		public Denomination next()
		{
			return QUEEN;
		}
	},
	QUEEN(12)
	{
		public Denomination next()
		{
			return KING;
		}
	},
	KING(13)
	{
		public Denomination next()
		{
			return ACE;
		}
	},
	ACE(14)
	{
		public Denomination next()
		{
			return TWO;
		}
	};
	
	private Denomination(int value)
	{
		this.Value = value;
	}
	
	private int Value;
	public abstract Denomination next();
}
