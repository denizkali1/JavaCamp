package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer)  {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result=true;
		try {		
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(new Locale("tr")),
				customer.getLastName().toUpperCase(new Locale("tr")),customer.getDateOfBirth());
		}catch (RemoteException e) {
		
			e.printStackTrace();
		}
		//System.out.println(result);
	return result;
		
		
		
	}


}
