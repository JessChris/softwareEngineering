package carRental;

public class Client 
{
	private String surname;
	private String name;
	private String FlightNumber;
	private String ID;
	private String tel;
	private String email; //(save for later)

	
	//constructors
	public Client()
	{
		surname="";
		name="";
		FlightNumber="";
		ID="";
		tel="";
		email="";
	}
	
	public Client(String surname, String name, String FlightNumber,
			String ID, String tel, String email)
	{
		this.surname=surname;
		this.name=name;
		this.FlightNumber=FlightNumber;
		this.ID=ID;
		this.tel=tel;
		this.email=email;
	}
	
	//set methods
	public void getSurname(String surname)
	{
		this.surname=surname;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setFlight(String FlightNumber)
	{
		this.FlightNumber=FlightNumber;
	}
	
	public void setID(String ID)
	{
		this.ID=ID;
	}
	
	public void setTel(String tel)
	{
		this.tel=tel;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	
	//get Methods
	public String getSurname()
	{
		return surname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getFlight()
	{
		return FlightNumber;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public String getTel()
	{
		return tel;
	}
	
	public String getEmail()
	{
		return email;
	}
}
