
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Daytona Grey", 19, 18);
		
		
		myCar.fillUp();
		myCar.printStatus();
		
		
		myCar.drive(200);
		myCar.printStatus();
		
		
		Car myCar2 = new Car();
		myCar2.printStatus();
	
	}

}
