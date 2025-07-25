package w0206_awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowEx1 extends Frame implements WindowListener{
	public WindowEx1() {
		super.setTitle("내가 만든 윈도우1");
		super.setBounds(200, 200, 300, 300);
		super.setVisible(true);
		
		//발생하는 이벤트와 해당 메서드를 연결
		super.addWindowListener(this);
	}
	
	//paint의 호출시점:윈도우를 처음 실행할때/가려졌다가 드러날때/repaint()메서드에 의해
	@Override
	public void paint(Graphics g) {
		g.setFont(new Font("맑은고딕", Font.BOLD, 25));
		g.drawString("도형그리기", 55, 80);
		g.setColor(Color.BLUE);
		g.drawLine(50, 50, 250, 250);
		g.drawRect(50, 120, 80, 80);
		g.drawOval(100,200, 80, 80);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
}
public class AwtEx1 {
	public static void main(String[] args) {
		new WindowEx1();
	}
}
