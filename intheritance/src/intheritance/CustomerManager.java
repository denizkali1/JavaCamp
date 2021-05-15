package intheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");	
	}
	
	//bulk insert
	public void addMultipe(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
		
	}

}

//SOLID - Open Closed Principle