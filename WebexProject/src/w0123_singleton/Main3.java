package w0123_singleton;

public class Main3 {
	public static void main(String[] args) {
		Speaker3 s1 = Speaker3.getInstance();
		Speaker3 s2 = Speaker3.getInstance();
		Speaker3 s3 = Speaker3.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.getVolume());
		System.out.println(s2.getVolume());
		System.out.println(s2.getVolume());
		
		s1.setVolume(10);
		System.out.println(s1.getVolume());
		System.out.println(s2.getVolume());
		System.out.println(s3.getVolume());
		
		s2.setVolume(20);
		System.out.println(s1.getVolume());
		System.out.println(s2.getVolume());
		System.out.println(s3.getVolume());
	}
}
