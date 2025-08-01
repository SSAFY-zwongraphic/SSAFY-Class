package w0731_weather;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WeatherMain3 {
	JFrame f = new JFrame("Weather Info");
	JButton b = new JButton("call Weather");
    JTable table = null;
	WeatherDAO dao;
	 // table의 데이터를 관리하는 객체
    DefaultTableModel model = null;
	public WeatherMain3() {
		dao = new WeatherDAO();
		createGUI();
		addEvent();
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
	}

	protected void showList() {
		List<Weather> datas = dao.getWeatherList("http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1135061200");

		model.setRowCount(0);
		for (Weather info : datas) {
            model.addRow(new Object[] {info.getHour(), info.getTemp(), info.getWfKor(), info.getReh()});
        }
		model.fireTableDataChanged();
	}

	private void createGUI() {
		// 테이블 구성
        table = new JTable();
        String[] header = {"시간", "온도", "구름양", "습도"};
        model = (DefaultTableModel) table.getModel();
        model.setColumnIdentifiers(header);
		f.add(b, BorderLayout.SOUTH);
		f.add(new JScrollPane(table), BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x버튼누르면 닫히도록함
		f.setSize(400, 500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new WeatherMain3();
	}
}
