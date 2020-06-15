package com.digital.tnttag.PlayerData;

import java.util.UUID;

import org.bukkit.event.Listener;

public class PlayerManager implements Listener {

	private UUID uuid;
	private boolean inGame;
	private int coinsEarned;
	private boolean isDead;
	
	PlayerManager(UUID uuid, boolean inGame, int coinsEarned, boolean isDead) {
		this.uuid = uuid;
		this.inGame = inGame;
		this.coinsEarned = coinsEarned;
		this.isDead = isDead;
	}
	
}
