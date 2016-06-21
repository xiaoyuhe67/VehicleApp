
public class Driver extends Person{
	
	private  String name;
	
	public String operate()
	{
		return ("Driver "+this.name+" is driving the car!");
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

}
