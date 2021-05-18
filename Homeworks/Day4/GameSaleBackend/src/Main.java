
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1, "Deniz", "Kalı", 2001, "11111111111");
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player1);
		
		System.out.println("**********************************************************");
		
		Game game1 = new Game(1, "Cyberpunk", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		System.out.println("**********************************************************");
		
		Campaign campaign1 = new Campaign(1, "Bahar Kampanyası", 30, LocalDate.of(2021, 4, 30), LocalDate.of(2021, 6, 30)); 
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		System.out.println("**********************************************************");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game1, player1);
		
		System.out.println("**********************************************************");
		
		SaleManager saleManager2 = new SaleManager(new CampaignManager());
		saleManager2.saleWithCampaign(game1, player1, campaign1);

	}

}
