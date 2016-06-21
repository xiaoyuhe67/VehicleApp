
public class VehicleApp {

	public static void main(String[] args)
	{
		
		Boat boat=new Boat();
		boat.run();
		boat.stop();
		boat.accelerate();
		boat.floating();
		
		Plane plane=new Plane();
		plane.run();
		plane.stop();
		plane.accelerate();
		plane.fly();
		
		Car car1=new Car("0001","red","Porsche","Bob");

		Car car2=new Car("0002","blue","Jetta","Henry");
		
		Boat boat1=new Boat("0001","White","Titanic","Jack");
		
		Plane plane1=new Plane("0001","red","Boeing","Park");
		
		System.out.println(car1.start());
		System.out.println(car2.start());
		
		System.out.println(car1.accelerate());
		
		System.out.println(car2.accelerate());
		
		System.out.println(car2.stop("to have its emissions checked"));
		
		System.out.println(car2.pass("its emission test"));
		
		System.out.println(car1.setSpeed("50"));
		
		System.out.println(car1.stop(""));
		
		System.out.println(car2.pass("the"+car1.getColor()+" "+car1.getType()));
		
		System.out.println(car1.operate());
		
		System.out.println(boat1.operate());
		
		System.out.println(plane1.operate());
		
		
		
	}
}
