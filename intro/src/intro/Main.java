package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubeButonu ="İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade =36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düstü resmi");
	    }else if(dolarBugun>dolarDun){
		System.out.println("Dolar yükseldi resmi");
	    }
		else {
		System.out.println("Dolar esittir resmi");
        }
		
		String[] krediler = {
				"Hızlı Kredi",
				"Mutlu Emekli Kredi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür Bakanlığı Kredisi"
				};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0; i<krediler.length; i=i+1) {
			System.out.println(krediler[i]);
		}
		
	
	 }
	
}
