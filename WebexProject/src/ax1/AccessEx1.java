package ax1;

import ax2.AccessEx3;
import ax2.AccessEx4;

public class AccessEx1 extends AccessEx4{
	private int x=10;
	private int y=20;
	
	public static void main(String[] args) {
		AccessEx1 ob1=new AccessEx1();
		System.out.println(ob1.x +"  " +ob1.y);
		System.out.println(ob1.a +"  " +ob1.b);
		
		AccessEx2 ob2=new AccessEx2();
		System.out.println(ob2.x +"  " +ob2.y);
		
		AccessEx3 ob3=new AccessEx3();
		System.out.println(ob3.x +"  " +ob3.y);
	}
}
