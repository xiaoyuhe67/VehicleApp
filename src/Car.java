
public class Car {
		
	private String ID;
	private String Color;
	private String Type;
	
	private Driver driver;
	
	public Car()
	{
		setID("0001");
		setColor("Red");
		setType("PorSche");
		driver=new Driver();
		driver.setName("Henry");

	}
	
	public Car(String strID, String strColor, String strType,String strDriName)
	{
		setID(strID);
		setColor(strColor);
		setType(strType);
		driver=new Driver();
		this.driver.setName(strDriName);
		
	}
	
	public String operate()
	{
		return "The "+Color+" "+Type+" is driven by "+this.driver.getName();
	}

	
	
	
	public String start()
	{
		return "The "+Color+" "+Type+" is starting"; 
	}
	
	public String stop( String message)
	{
		
		return "The "+Color+" "+Type+" is stopped "+message; 
		
	}
	public String pass(String message)
	{
		return "The "+Color+" "+Type+" has passed "+message;
	}
	
	public String accelerate()
	{
		return "The "+Color+" "+Type+" is accelerating"; 
		
	}
	public String setSpeed(String speed)
	{
		return  "The "+Color+" "+Type+" is going "+speed+" mph"; 
		
	}

	public  String getID() {
		return ID;
	}

	public  void setID(String iD) {
		this.ID = iD;
	}

	public  String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public  String getType() {
		return Type;
	}

	public  void setType(String type) {
		this.Type = type;
	}
	
}
