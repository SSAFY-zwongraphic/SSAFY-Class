package d_0731;

public class TitleNotFoundException extends Exception {
	
	private String title;
	
	public TitleNotFoundException(String title) {
		super(title + " ������ �����ϴ� ��ȭ�� �������� �ʽ��ϴ�.");
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

}