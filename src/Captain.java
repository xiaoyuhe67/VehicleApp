
public class Captain extends Person{
	
	private String name;
	
	public String operate()
	{
		return ("Captain "+this.name+" is driving the boat!");
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

}
