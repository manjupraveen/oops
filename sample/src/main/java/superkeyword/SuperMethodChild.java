package superkeyword;

public class SuperMethodChild extends SuperMethod{
	public void display1 () {
		
		System.out.println("super method child");
		super.display();
		
	}

	public static void main(String[] args) {
		SuperMethodChild supermethodchild = new SuperMethodChild();
		supermethodchild.display1();

	}

}
