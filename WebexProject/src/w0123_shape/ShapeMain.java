package w0123_shape;

public class ShapeMain {
	public static void main(String[] args) {
//		Shape sh=new Rectangle(4,5);
//		System.out.println("사각형의 넓이: " + sh.getSize());
//		
//		sh=new Triangle(3,7);
//		System.out.println("삼각형의 넓이: " + sh.getSize());
		//----------------------------------------------------------		
		Rectangle ob1=new Rectangle(4,5);
		System.out.println("사각형의 넓이: " +ob1.getSize());
		
		Triangle ob2=new Triangle(3,7);
		System.out.println("삼각형의 넓이: " +ob2.getSize());
	}
}
/*
사각형의 넓이: 20
삼각형의 넓이: 10.5
*/