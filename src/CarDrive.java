
public class CarDrive {
	
	public static void main(String[] args) {
		CarClass FabianCar = new CarClass();
		System.out.println(FabianCar);
		
		CarClass HondaCar=new CarClass ("yellow", 1, 1, "Honda");
		System.out.println(HondaCar);
		
		CarClass Lamborghini=new CarClass ("White", 2, 2, "Lamborghini");
		System.out.println(Lamborghini);
	}

}
