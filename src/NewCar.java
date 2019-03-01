
public class NewCar 
{
	private int yearModel;
	private String make;
	private int speed;
	
	
	public NewCar(int y, String m)
	{
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	public NewCar(String m)
	{
		yearModel = 2019;
		make = m;
		speed = 0;
	}
	public NewCar(String m, int s)
	{
		
	}
	
	public int getYearModel()
	{
		return yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void accelerate()
	{
		speed += 5;
	}
	public void brake()
	{
		speed -= 5;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
