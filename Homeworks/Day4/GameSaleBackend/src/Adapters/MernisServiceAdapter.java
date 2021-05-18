package Adapters;

import java.util.Locale;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(new Locale("tr")), 
					player.getLastName().toUpperCase(new Locale("tr")),player.getYearOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
