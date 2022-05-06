package carRental;

import java.util.Scanner;

public class demoRental extends Reservation {

	public static void main(String[] args) 
	{
		 //array of clients as an example
		Reservation clientA=new Reservation();
		int choice=0;//menu option selector
		try (Scanner key = new Scanner(System.in)) {
			//Menu Navigator
			System.out.println("Welcome to the main menu. Please choose: ");
			do
			{
				//Main Menu options:
				System.out.println("1. Show Client");
				System.out.println("2. New Client");
				System.out.println("-1. Exit (choices will NOT be saved)");
				choice= key.nextInt();
				if (choice==1){
					//Show client details
					for(int i=0;i<100;i++)
					System.out.println(clientA);
				}
				if(choice==2) {
					//New reservation + new client
					System.out.println("Enter Surename: ");
					clientA.surname=key.nextLine();
					System.out.println("Enter name: ");
					clientA.name=key.nextLine();
					System.out.println("Enter flight number: ");
					clientA.FlightNumber=key.nextLine();
					System.out.println("Enter ID: ");
					clientA.setID(key.nextLine());		
					System.out.println("Enter phone number: ");
					clientA.tel=key.nextLine();
					System.out.println("Enter your mail: ");
					clientA.tel=key.nextLine();
					System.out.println("Choose your Car Category:");//Button
					System.out.println("Other comments: ");
					clientA.comm=key.nextLine();
					System.out.println("Extras: \nFDW orCDW: \nGPS: \nBabyseat: \nHighbooster: \nBooster: \n");
					clientA.setFdw_cdw(key.nextBoolean());
					clientA.gps=key.nextBoolean();
					clientA.babyseat=key.nextBoolean();
					clientA.highbooster=key.nextBoolean();
					clientA.booster=key.nextBoolean();
					
				}
			}
			while (choice!=-1);
		}
		
		//
		//for(int i=0; i<SIZE; i++) 
		//{
		//	arrClient[i] = new Client;
		//}
		
		//String name;

	}

}