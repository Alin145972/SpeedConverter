package speedConverter;

public class SpeedConverter {
	//today we are going to make a speed converter app
	// it is gonna convert speed value from kilometers per hour to miles per hour
	
	//oggi facciamo un applicazione per convertire la velocità da kilometri orari a miglia orari
	
	public static long ConvertToMilesPerHour(double kilometersPerHour) {
		/*This is our method that is gonna convert our speed value from km/h to mi/h*/
		/*Questo è la funzione che convertirà la nostra velocità da km/h in mi/h*/
		
		//Lets add a control for negative values
		// aggiungiamo un controllo per i valori negativi
		if(kilometersPerHour <0) return -1;
		
		else if(kilometersPerHour>0){
			double ConversionFactor = 0.621371;
			double milesPerHour = kilometersPerHour*ConversionFactor;
			
			return  (long)(Math.round(milesPerHour));
		}
		
		else return 0; 
		
	}
	
	
	
	public static String printConversion(double kilometersPerHour) {
		String str;
		if(kilometersPerHour >=0) {
			long s;
			s= ConvertToMilesPerHour(kilometersPerHour);
			
			str = kilometersPerHour + " km/h = " + s + " mi/h.";
			return str;
		}
		else {
			str = "Inalid Value!";
			return str;
		}
	}
	
	//Now we'll make a GUI for it
	//adesso facciamo un interfaccia grafica
	
	//Thats it for today :) bye!!!
}

  

	