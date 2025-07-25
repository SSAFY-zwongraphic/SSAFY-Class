package w0131_string;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		//Math 클래스 이용------------------------------------------------------
		System.out.println(Math.random());                // 0 - 0.99999999
        System.out.println((int)(Math.random()*10+1));    // 1 - 10
                    // 0 - 0.99999999
                    // 0 - 9.99999999
                    // 1 - 10.9999999
                    // 1 - 10
        System.out.println((int)(Math.random()*31+50));   // 50 - 80
			        //  0  - 0.999999
			        //  0  - 30.999999
			        //  50  - 80.99999
			        //  50  - 80
        System.out.println((int)(Math.random()*50+41));   // 41 - 90
        
		//Random 클래스 이용----------------------------------------------------
//		Random rd=new Random();
//		int n1=rd.nextInt(101);       // 0  - 100 
//		int n2=rd.nextInt(31) + 50;   // 50 - 80
//		int n3=rd.nextInt(40) + 31;   // 31 - 70
//		System.out.println(n1+"  " + n2 + "  " + n3);
	}
}













