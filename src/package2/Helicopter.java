package package2;
import package1.Airplane;
public class Helicopter extends Airplane {
	public int cylinders;
	public int creationYear;
	public int passengerCapacity;

	Helicopter(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity){
		super(band, price, horsepower);
		this.cylinders = cylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	Helicopter(int cylinders, int creationYear, int passengerCapacity){
		super();
		this.cylinders = cylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	Helicopter(Helicopter helicopter){
		this(helicopter.band, helicopter.price, helicopter.horsepower, 
				helicopter.cylinders, helicopter.creationYear, helicopter.passengerCapacity);
	}
	
	Helicopter() {
		this(0,0,0);
	}
	
	@Override
	public String toString() {
		 return "Helicopter => Band : "+super.band + "    Price : " + super.price + "    Horsepower : " + super.horsepower + "\n"
				 + "\tCylinders : " + cylinders + "    Creation Year : " + creationYear + "    Passenger Capacity : " + passengerCapacity;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof Helicopter) {
			Helicopter h = (Helicopter) o;
			if(super.equals(h) && h.cylinders == this.cylinders && h.creationYear == this.creationYear && h.passengerCapacity == this.passengerCapacity ) {
				return true;
			}
		}
		
		return false;
	}
}
