public class encapsulation{
	public static void main(String[] args){

		Car car = new Car("Lexus","Rx990",2022);
		System.out.print( car.getManufacturer() );
		car.setYear(2023);
		System.out.print(car.getYear());


	}
}

// Encapsulation use of private and getter and setter to for access

class Car{
	private String manufacturer;
	private String model;
	private int year;


	//constructor
	Car(String manufacturer,String model,int year){


		//Call in setter within the constructor
		this.setManufacturer(manufacturer);
		this.setmodel(model);
		this.setYear(year);
		
	}


	//Getter constructor methods
	public String getManufacturer(){
		return manufacturer;
	}


	public String getModel(){
		return model;
	}

	public int getYear(){
		return year;
	}


	//Setter cnostructor methods
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}


	public void setmodel(String model){
		this.model=model;
	}


	public void setYear(int year){
		this.year = year;
	}

}