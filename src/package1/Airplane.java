package package1;

public class Airplane {
	public String band;
	public double price;
	public int horsepower;

	public Airplane(String band, double price, int horsepower){
		this.band = band;
		this.price = price;
		this.horsepower = horsepower;
	}

	public Airplane(Airplane airplane){
		this(airplane.band, airplane.price, airplane.horsepower);
	}
	
	public Airplane() {
		this("", 0.0, 0);
	}
	
	@Override
	public String toString() {
		 return "Airplane => Band : "+band + "    Price : " + price + "    Horsepower : " + horsepower;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof Airplane) {
			Airplane a = (Airplane) o;
			if(a.band == this.band && a.price == this.price && a.horsepower == this.horsepower ) {
				return true;
			}
		}
		
		return false;
	}
}
