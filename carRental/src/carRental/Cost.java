//The costs for the extras was taken from the Extras tab in
//the excel file. According to the file, gps is cost *20, etc..
package carRental;

public class Cost extends Reservation 
{
	double totalCost;//total cost
	double cost;//car category cost
	
	double costTemp=0; //placeholder
	
	public void classCosts()
	{
		if(Reservation.isFdw_cdw()==true)
		{
			//totalCost==+ 
		}
		
		if(Reservation.gps==true) 
		{
			costTemp=20*cost;
			totalCost+=costTemp;
			costTemp=0;
		}
		
		if(Reservation.babyseat==true) 
		{
			costTemp=15*cost;
			totalCost+=costTemp;
			costTemp=0;
		}
		
		if(Reservation.highbooster==true) 
		{
			costTemp=15*cost;
			totalCost+=costTemp;
			costTemp=0;
		}
		
		if(Reservation.booster==true) 
		{
			costTemp=15*cost;
			totalCost+=costTemp;
			costTemp=0;
		}
				
	}

}