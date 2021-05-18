package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Game added to the database: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated in database: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted from database: " + game.getGameName());
		
	}

}
