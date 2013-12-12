package Poker;

import java.awt.*;
import java.awt.event.*;

public class CardButton extends Button
{
	private static final long serialVersionUID = 1L;
	
	CardButton(Card card)
	{
		super(card.getDenomination().toString() + " of " + card.getSuit().toString());
		ButtonCard = card;
		addActionListener(new CardButtonActionListener(this));
		setBackground(Color.WHITE);
	}
	
	public Card GetCard()
	{
		return ButtonCard;
	}
	
	private static class CardButtonActionListener implements ActionListener
	{
		CardButtonActionListener(CardButton thisButton)
		{
			super();
			button = thisButton;
			
		}
		@Override
		public void actionPerformed(ActionEvent ev) 
		{
			if(this.button.isSelected)
			{
				this.button.setBackground(Color.WHITE);
			}
			else
			{
				this.button.setBackground(Color.GRAY);
			}
			this.button.isSelected = !this.button.isSelected;
		}
		private CardButton button;
	}
	
	
	
	private Card ButtonCard;
	private Boolean isSelected = false;
}
