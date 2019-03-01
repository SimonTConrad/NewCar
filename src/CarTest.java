
public class CarTest 
{

	public static void main(String[] args) 
	{
		NewCar speedMachine = new NewCar(2011, "Ford");
		NewCar japan = new NewCar(2018, "Honda");
		japan.accelerate();
		japan.accelerate();
		System.out.println(japan.getSpeed());
		for(int i= 0; i<4; i++)
			speedMachine.accelerate();
		System.out.print(speedMachine.getSpeed());
		NewCar cuttlefish = new NewCar(2019, "Iceburg");
		cuttlefish.accelerate();
		cuttlefish.brake();
		System.out.println(cuttlefish.getYearModel() + " " + cuttlefish.getMake() + " " + cuttlefish.getSpeed() + "mph");
		
		
		
	}

}
