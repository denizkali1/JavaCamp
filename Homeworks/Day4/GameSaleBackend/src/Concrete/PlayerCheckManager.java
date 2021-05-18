package Concrete;

import Abstract.IPlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements IPlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		return false;
	}

}
