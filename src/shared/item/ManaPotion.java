package shared.item;

import javax.swing.JOptionPane;

import shared.character.Mage;
import shared.character.PlayerCharacter;

/**
 * implementation of a ManaPotion</br>extends ConsumableModel
 * @author Staufenberg, Thomas, 5820359
 * */
public class ManaPotion extends ConsumableModel
{

	/**
	 * sets itemID, itemGoldValue, itemName, itemImagePath, valueModificator, stackSize and forwards these values to the super constructor
	 * @author Staufenberg, Thomas, 5820359
	 * */
	public ManaPotion(int paramStackSize)
	{
		//TODO set final values
		super(3, 5, "Manatrank", "manaTrank.png", 40, paramStackSize);
	}

	/**
	 * overrides abstract method from superclass</br>decreases stackSize by 1, increases the players mana by super.valueModificator percent
	 * @param paramPlayer PlayerCharakter model of the player consuming the item
	 * @author Staufenberg, Thomas, 5820359
	 * */
	@Override
	public void consume(PlayerCharacter paramPlayer)
	{
		if(paramPlayer instanceof Mage)
		{
			Mage currentPlayer = (Mage) paramPlayer;
			if(currentPlayer.setCurrentMana((currentPlayer.getCurrentMana() + (int)((double)(currentPlayer.getMaximumMana()) * (double)((double)super.valueModificator / (double)100)))))
				if((--super.stackSize) == 0)
					currentPlayer.getInventory().removeItemFromInventory(this);
		}
		else
			JOptionPane.showMessageDialog(null, "Ihr Charakter kann diesen Gegenstand nicht benutzen!", "Achtung!", JOptionPane.WARNING_MESSAGE);
	}
}