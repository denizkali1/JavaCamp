package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService{
	
	private IPlayerCheckService playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(this.playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Player added to the database: " + player.getFirstName() + " " + player.getLastName());
		}else {
			System.out.println("Not a valid person!");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Player updated in database: " + player.getFirstName() + " " + player.getLastName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Player deleted from database: " + player.getFirstName() + " " + player.getLastName());
		
	}
	
	

}
