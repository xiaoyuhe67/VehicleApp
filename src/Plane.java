
public final class Plane extends Vehicle{
	
	private String ID;
	private String Color;
	private String Type;
	
	private Pilot pilot;
	
	public Plane()
	{
		setID("0001");
		setColor("Red");
		setType("Jet");
		pilot=new Pilot();
		pilot.setName("Henry");

	}
	
	public Plane(String strID, String strColor, String strType,String strPilName)
	{
		setID(strID);
		setColor(strColor);
		setType(strType);
		pilot=new Pilot();
		this.pilot.setName(strPilName);
		
	}
	
	
	public String fly()
	{
		return ("The "+Color+" "+Type+" is flying");
	}
	
	public String operate()
	{
		return "The "+Color+" "+Type+" is driven by "+this.pilot.getName();
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
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	


}
