package Poker;

public class Entity 
{
	public void setEntityHand(Hand newHand)
	{
		this.entityHand = newHand;
	}
	
	public Hand getEntityHand()
	{
		return entityHand;
	}
	
	private Hand entityHand;
}
