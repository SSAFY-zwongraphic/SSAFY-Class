package w0203_lambda;

@FunctionalInterface
interface Item{
	public String getItem();
}
public class LambdaEx3 {
	public static void main(String[] args) {
		Item ob=() -> "Computer";        // or Item ob=() -> { return "Computer";};
		System.out.println(ob.getItem());
	}
}
//익명함수-------------------------------------------------
/*
interface Item{
	public String getItem();
	public String getItem2();
}
public class LambdaEx3 {
	public static void main(String[] args) {
		Item ob=new Item() {
			
			@Override
			public String getItem2() {
				return null;
			}
			
			@Override
			public String getItem() {
				return "Computer";
			}
		};
		System.out.println(ob.getItem());
	}
}
*/
//일반메서드----------------------------------------------
/*
interface Item{
	public String getItem();
}
public class LambdaEx3 implements Item{
	@Override
	public String getItem() {
		return "Computer";
	}
	public static void main(String[] args) {
		LambdaEx3 ob=new LambdaEx3();
		System.out.println(ob.getItem());
	}
}
*/