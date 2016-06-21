
public final class Boat extends Vehicle{
	
	private String ID;
	private String Color;
	private String Type;
	
	private Captain captain;
	
	public Boat()
	{
		setID("0001");
		setColor("Red");
		setType("PorSche");
		captain=new Captain();
		this.captain.setName("Henry");

	}
	
	public Boat(String strID, String strColor, String strType,String strCapName)
	{
		setID(strID);
		setColor(strColor);
		setType(strType);
		captain=new Captain();
		this.captain.setName(strCapName);
		
	}
	
	
	public String floating()
	{
		return "The "+Color+" "+Type+" is floating"; 
	}
	
	
	public String operate()
	{
		return "The "+Color+" "+Type+" is driven by "+this.captain.getName();
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
