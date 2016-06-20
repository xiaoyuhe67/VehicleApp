
public final class Boat extends Vehicle{

	public void floating()
	{
		System.out.println("The boat floats");
	}
	
	@Override
	public void run()
	{
		System.out.println("The boat runs");
	}
	
	public void stop()
	{
		
		System.out.println("The boat stops.");
		
	}
	
	public void accelerate()
	{
		System.out.println("The boat accelerates.");
	}
}
