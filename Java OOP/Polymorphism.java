public class Polymorphism{
	public static void main(String[] args){

		Elephant eli = new Elephant();
		eli.walk();

		System.out.println();

		eli.walk(5);
	}
}


// function overloading and overriding = Polymorphism
class Animal{

		void walk(){
			System.out.print("Animal Walks");
		}

		// func overloading
		void walk(int noOfTimes){
			System.out.print("Walked: "+ noOfTimes);
		}

	}

class Cat extends Animal{

		// func overiding 
		@Override
		void walk(){
			System.out.print("CatWalk :3");
		}		
	}

class Elephant extends Animal{

		void walk(){
			System.out.print("Elphant Triumphant Walk");
		}
	}
