package w0122_inher;

class Branch{
	public Branch() {
		System.out.println("default Branch Constructor");
	}
	
	public Branch(String str, int n) {
		this();
		System.out.println(str+" " + n+ " Branch Constructor");
	}
}
class Leaf extends Branch{
	public Leaf() {
		this("ABC");
		System.out.println("default Leaf Constructor");
	}
	
	public Leaf(String str) {
		super(str, 10);
		System.out.println(str + " Leaf Constructor");
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf();
	}
}
/*
default Branch Constructor
ABC 10 Branch Constructor
ABC Leaf Constructor
default Leaf Constructor
*/

//---------------------------------------------------------
/*
class Branch{
	public Branch() {
		System.out.println("default Branch constructor");
	}
	
	public Branch(String str) {
		this();
		System.out.println(str + " Branch constructor");
	}
}
class Leaf extends Branch{
	public Leaf(String str) {
		super(str);
		System.out.println(str + " Leaf constructor");
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf("가나다");
	}
} */
/*
default Branch constructor
가나다 Branch constructor
가나다 Leaf constructor
*/