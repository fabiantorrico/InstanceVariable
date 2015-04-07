public class CarClass {
	
	private String color;
	private double horsePower;
	private double engineSize;
	private String make;
	
	public CarClass(){
		this.color= "yellow";
		this.horsePower = 0;
		this.engineSize = 0;
		this.make = "Honda";
	}
	public CarClass(String color, double horsePower, double engineSize,String make){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize= engineSize;
		this.make = make;
	}
	public String setcarColor(){
		return color;
		} 
	public void getcarColor(String color){
		this.color = color;
		}
	public double setcarhorsePower(){
		return horsePower;
		} 
	public void getcarhorsePower(double horsePower){
		this.horsePower = horsePower;
		}
	public double setcarengineSize(){
		return engineSize;
		} 
	public void getcarengineSize(double engineSize){
		this.engineSize = engineSize;
		}
	public String setcarmake(){
		return make;
		} 
	public void getcarmake(String make){
		this.make = make;
		}
	public String toString(){
		return "Color: " + this.color + ", Horse Power: " +this.horsePower + " Engine Size: " + this.engineSize +" Make: " + this.make ;
	}

}