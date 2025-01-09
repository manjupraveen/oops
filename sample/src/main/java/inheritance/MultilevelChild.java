package inheritance;

public class MultilevelChild extends MultilevelParentB {
	public void display() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		MultilevelChild multilevelchild = new MultilevelChild();
		multilevelchild.dispaly2();
		multilevelchild.display3();
		multilevelchild.display();

	}

}
