package inheritance;

public class HierarchialChild2 extends HierarchialParentA {
	public void display2() {
		System.out.println("hierarchial child B");
		super.display();
	}

	public static void main(String[] args) {
		HierarchialChild2 hierarchialchild2 = new HierarchialChild2();
		hierarchialchild2.display2();
		hierarchialchild2.display();
		

	}

}

