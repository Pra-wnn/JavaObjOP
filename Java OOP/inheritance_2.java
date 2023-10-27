class parent{
	String parent_data;

	public parent(String parent_data){
		this.parent_data = parent_data;
	}
	
	void display(){
		System.out.println("Parent Class Display:"+parent_data);

	}
}

// inheritance
class child extends parent{
	String child_data;

	public child(String parent_data,String child_data){
		super(parent_data);
		this.child_data = child_data;
	}

	@Override
	void display(){
		super.display();

		System.out.print("Child Class Display:"+child_data);
	}
}








public class inheritance_2{
	public static void main(String[] args){


		child child_obj = new child("Parent Class","Child Class");
		child_obj.display();

	}
}




