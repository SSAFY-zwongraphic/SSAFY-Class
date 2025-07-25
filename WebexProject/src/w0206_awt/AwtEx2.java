package w0206_awt;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowEx2 extends Frame{
	public WindowEx2(String title) {
		super.setTitle(title);
		super.setBounds(150,150,400,300);
		super.setVisible(true);
		
		
		super.addWindowListener(new WinHandlerEx());
	}
	
	@Override
	public void paint(Graphics g) {
		Toolkit t=Toolkit.getDefaultToolkit();
		Image img=t.getImage("src/w0206_awt/conan.jpg");
		g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);  /*이미지 출력*/
	}
	
	//사용자 정의 클래스(중첩클래스):클래스 안에서 또 다른 클래스를 정의 하는것
	class WinHandlerEx extends WindowAdapter{
		public void	windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
}
public class AwtEx2 {
	public static void main(String[] args) {
		new WindowEx2("내가 만든 윈도우2");
	}
}
