
public class Pilot extends Person{

	private  String name;
	
	public String operate()
	{
		return ("Pilot "+this.name+" is driving the plane!");
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

}
