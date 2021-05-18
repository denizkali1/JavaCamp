package Concrete;

import java.time.LocalDate;
import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements ISaleService{
	
	public SaleManager() {
		
	}
	
	public SaleManager(CampaignManager campaignManager) {
		
	}

	//public void SalaManager(ICampaignService campaignService) {}

	@Override
	public void sale(Game game, Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " bought the game: " +
		game.getGameName() + " - " + game.getUnitPrice() + " TL");
		
	}

	@Override
	public void saleWithCampaign(Game game, Player player, Campaign campaign) {
		double reducedUnitPrice = game.getUnitPrice() * ((100-campaign.getDiscountRate())/100);
		
		LocalDate start = campaign.getStartDate();
		LocalDate end = campaign.getExpirationDate();
		LocalDate today = LocalDate.now();
		
		if (start.getDayOfYear() <= today.getDayOfYear() && today.getDayOfYear() <= end.getDayOfYear()) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " bought the game with %" +
		campaign.getDiscountRate() + " discount with the " + campaign.getCampaingName() + " : "+ 
		game.getGameName() +  " - " + reducedUnitPrice + " TL");
		}else {
			System.out.println("Not a valid campaign!");
		}
		
	}

}
