
public class Driver {

	public static void main(String[] args) {
		
		Bicycle declaredBicycle;
		
		Bicycle defaultBicycle = new Bicycle();
		Bicycle bicycle = new Bicycle(2,3,4);
		
		System.out.println("Default: " + defaultBicycle.cadence + " " + defaultBicycle.gear + " " + defaultBicycle.speed);
		System.out.println("Bicycle: " + bicycle.cadence + " " + bicycle.gear + " " + bicycle.speed);

		bicycle.speedUp(20);
		bicycle.gearUp();
		bicycle.setCadence(5);
		
		System.out.println("Bicycle: " + bicycle.cadence + " " + bicycle.gear + " " + bicycle.speed);
		
		
	}

}
