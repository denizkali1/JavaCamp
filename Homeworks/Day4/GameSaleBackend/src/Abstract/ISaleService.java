package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface ISaleService {
	void sale(Game game, Player player);
	void saleWithCampaign(Game game, Player player, Campaign campaign);
}
