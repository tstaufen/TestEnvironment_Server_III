package message;

import shared.character.PlayerCharacter;

/**
 * Message used to transfer player data destined for database save operation
 * @author Staufenberg, Thomas, 5820359
 * */
public class SavePlayerDataMessage extends PlayerDataMessage
{
	/**
	 * forwards username, paramPlayer and receiverID to superclass
	 * @author Staufenberg, Thomas, 5820359
	 * */
	public SavePlayerDataMessage(String paramUsername, PlayerCharacter paramPlayer)
	{
		super(200, paramUsername, paramPlayer);
	}
}
