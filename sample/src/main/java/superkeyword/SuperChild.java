package superkeyword;

public class SuperChild extends SuperVariable {
	String color = "yellow";
	public void display() {
		System.out.println(color);
		System.out.println(super.color);
		
	}
	
	

	public static void main(String[] args) {
		SuperChild superchild = new SuperChild();
		superchild.display() ;

	}

}
