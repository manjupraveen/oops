package inheritance;

public class HierarchialChild1 extends HierarchialParentA {
	public void display1() {
		System.out.println("Hierarchial child 1");
	}

	public static void main(String[] args) {
		HierarchialChild1 hierarchialchild1 = new HierarchialChild1() ;
		hierarchialchild1.display();
		hierarchialchild1.display1();

	}

}
