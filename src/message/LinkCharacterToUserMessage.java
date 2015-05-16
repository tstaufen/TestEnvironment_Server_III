package message;

import shared.character.PlayerCharacter;

public class LinkCharacterToUserMessage extends Message
{
	private String username;
	private PlayerCharacter playerCharacter;
	
	public LinkCharacterToUserMessage(String paramUsername, PlayerCharacter paramPlayer)
	{
		super(200);
		this.username = paramUsername;
		this.playerCharacter = paramPlayer;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public PlayerCharacter getPlayerCharacter()
	{
		return this.playerCharacter;
	}

}