package package2;

public class Quadcopter extends Helicopter{
	public int maxFlyingSpeed;

	Quadcopter(int maxFlyingSpeed){
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	Quadcopter(Quadcopter quadcopter){
		this(quadcopter.maxFlyingSpeed);
	}
	
	Quadcopter() {
		
		
		this.cylinders = 0;
		this.creationYear = 0; 
		this.passengerCapacity = 0;
	}
}
