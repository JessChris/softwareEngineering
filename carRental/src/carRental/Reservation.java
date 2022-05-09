package carRental;

public class Reservation extends Client
{
	protected String cc;//Car Category
	protected String comm;//comments
	static boolean fdw_cdw;
	static boolean gps;
	static boolean babyseat;
	static boolean highbooster;
	static boolean booster;
	
	//constructors
	public Reservation() 
	{
		cc="";
		comm="";
		setFdw_cdw(false);
		gps=false;
		babyseat=false;
		highbooster=false;
		booster=false;
	}
	
	public Reservation(String cc,String comm,boolean fdw_cdw,boolean gps,boolean babyseat,boolean highbooster,boolean booster) 
	{
		this.cc=cc;
		this.comm=comm;
		Reservation.setFdw_cdw(fdw_cdw);
		Reservation.gps=gps;
		Reservation.babyseat=babyseat;
		Reservation.highbooster=highbooster;
		Reservation.booster=booster;
	}
	
//set methods
	public void setcc(String cc) {
		this.cc=cc;
	}
	public void setcomm(String comm) {
		this.comm=comm;
	}
	public void setfdw_cdw(boolean fdw_cdw) {
		Reservation.setFdw_cdw(fdw_cdw);
	}
	public void setgps(boolean gps) {
		Reservation.gps=gps;
	}
	public void setbabyseat(boolean babyseat) {
		Reservation.babyseat=babyseat;
	}
	public void sethighbooster(boolean highbooster) {
		Reservation.highbooster=highbooster;
	}
	
//get methods
	public String getcc() {
		return cc;
	}
	public String getcomm() {
		return comm;
	}
	public boolean getfdw_cdw() {
		return isFdw_cdw();
	}
	public boolean getgps() {
		return gps;
	}
	public boolean getbabyseat() {
		return babyseat;
	}
	public boolean getbooster() {
		return booster;
	}
	public boolean gethighbooster() {
		return highbooster;
	}
	public static boolean isFdw_cdw() {
		return fdw_cdw;
	}
	public static void setFdw_cdw(boolean fdw_cdw) {
		Reservation.fdw_cdw = fdw_cdw;
	}
	
	
	
	
	
}
