interface CarPlan 
{ 
	public void setChasis(String chasString); 

	public void setEngine(String engineString); 

	public void setRoof(String roof); 

	public void setInterior(String interior); 
} 

class Car implements CarPlan 
{ 

	String chasString; 
	String engineString; 
	String roof; 
	String interior; 

	public void setChasis(String chasString) 
	{ 
		this.chasString = chasString; 
	} 

	public void setEngine(String engineString) 
	{ 
		this.engineString = engineString; 
	} 

	public void setRoof(String roof) 
	{ 
		this.roof = roof; 
	} 

	public void setInterior(String interior) 
	{ 
		this.interior = interior; 
	} 

} 


interface CarBuilder 
{ 

	public void buildEngine(); 

	public void buildChasis(); 

	public void buildRoof(); 

	public void buildInterior(); 

	public Car getCar(); 
} 

class SedanBuilder implements CarBuilder 
{ 
	Car car; 

	public SedanBuilder() 
	{ 
		this.car = new Car(); 
	} 

	public void buildEngine() 
	{ 
		car.setEngine("Small Engine"); 
	} 

	public void buildChasis() 
	{ 
		car.setChasis("Strong Chasis"); 
	} 

	public void buildInterior() 
	{ 
		car.setInterior("Comfort Interior"); 
	} 

	public void buildRoof() 
	{ 
		car.setRoof("Cenamitc Roof"); 
	} 

	public Car getCar() 
	{ 
		return this.car; 
	} 
} 

class SUVBuilder implements CarBuilder 
{ 
	Car car; 

	public SUVBuilder() 
	{ 
		this.car = new Car(); 
	} 

	public void buildEngine() 
	{ 
		car.setEngine("Big Engine"); 
	} 

	public void buildChasis() 
	{ 
		car.setChasis("Strong Chasis"); 
	} 

	public void buildInterior() 
	{ 
		car.setInterior("Sturdy Interior"); 
	} 

	public void buildRoof() 
	{ 
		car.setRoof("Panaromic Roof"); 
	} 

	public Car getCar() 
	{ 
		return this.car; 
	} 
} 

class AutomEngineer 
{ 

	CarBuilder carBuilder; 

	public AutomEngineer(CarBuilder carBuilder) 
	{ 
		this.carBuilder = carBuilder; 
	} 

	public Car getCar() 
	{ 
		return this.carBuilder.getCar(); 
	} 

	public void constructCar() 
	{ 
		this.carBuilder.buildChasis(); 
		this.carBuilder.buildEngine(); 
		this.carBuilder.buildRoof(); 
		this.carBuilder.buildInterior(); 
	} 
} 

class BuilderDesign2
{ 
	public static void main(String[] args) 
	{ 
		CarBuilder sedanBuilder = new SedanBuilder(); 
		AutomEngineer engineer = new AutomEngineer(sedanBuilder); 

		engineer.constructCar(); 

		Car car = engineer.getCar(); 

		System.out.println("Builder constructed: "+ car); 
	} 
} 
