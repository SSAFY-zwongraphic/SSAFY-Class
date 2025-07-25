package w0131_tv1;

//결합도가 높다
//$java TvMain lg
public class TvMain {
	public static void main(String[] args) {
		String in=args[0];
		
		if(in.equals("lg")) {
			LgTv tv=new LgTv();
			tv.turnOn();
			tv.turnOff();
			tv.soundUp();
			tv.soundDown();
		}else if(in.equals("samsung")) {
			SamsungTv tv=new SamsungTv();
			tv.powerOn();
			tv.powerOff();
			tv.volumeUp();
			tv.volumeDown();
		}else {
			System.out.println("error");
		}
	}
}
