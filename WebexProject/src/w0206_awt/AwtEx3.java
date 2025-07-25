package w0206_awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowEx3 extends Frame implements ActionListener{
	
	Button bt1, bt2,bt3,bt4,bt5;
	
	public WindowEx3(String title) {
		super(title);
		init();
		super.setBounds(150, 150, 400, 300);
		super.setVisible(true);	
		
		super.addWindowListener(new WinHandlerEx());
	}
	
	public void init() {
		bt1=new Button("East");
		bt2=new Button("West");
		bt3=new Button("South");
		bt4=new Button("North");
		bt5=new Button("Center");
		
		super.add(bt1, "East");
		super.add(bt2, "West");
		super.add(bt3, "South");
		super.add(bt4, "North");
		super.add(bt5, "Center");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			System.out.println("동쪽 버튼을 누름");
		}
		if(e.getSource()==bt2) {
			System.out.println("서쪽 버튼을 누름");
		}
		if(e.getSource()==bt3) {
			System.out.println("남쪽 버튼을 누름");
		}
		if(e.getSource()==bt4) {
			System.out.println("북쪽 버튼을 누름");
		}
		if(e.getSource()==bt5) {
			System.out.println("중앙 버튼을 누름");
		}
	}	
	
	class WinHandlerEx extends WindowAdapter{
		public void	windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
public class AwtEx3 {
	public static void main(String[] args) {
		new WindowEx3("내가 만든 윈도우3");
	}
}
