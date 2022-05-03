package carRental;

import java.util.Scanner;

public class demoRental extends menus
{

	public static void main(String[] args) 
	{
		Client[] arrClient= new Client[100]; //array of clients as an example
		Client clientA= new Client();
		int choice=0;//menu option selector
		Scanner key=new Scanner(System.in); //Scanner for input
		
		
		//Menu Navigator
		System.out.println("Welcome to the main menu. Please choose: ");
		do
		{
			//Main Menu options:
			menuMain();
			choice= key.nextInt();
		}
		while (choice!=-1);
		
		//
		//for(int i=0; i<SIZE; i++) 
		//{
		//	arrClient[i] = new Client;
		//}
		
		//String name;

	}

}