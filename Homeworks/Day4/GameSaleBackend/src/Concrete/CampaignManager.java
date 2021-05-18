package Concrete;
import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added to the database: " + campaign.getCampaingName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated in database: " + campaign.getCampaingName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted from database: " + campaign.getCampaingName());
		
	}


}
