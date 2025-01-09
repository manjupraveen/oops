package inheritance;

public class ChildClass extends SingleParent {
	
	public void display1(){
		System.out.println("child class");
		
	}
	

	public static void main(String[] args) {
		ChildClass childclass = new ChildClass();
		childclass.display();
		childclass.display1();
		

	}

}
