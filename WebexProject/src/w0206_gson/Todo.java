package w0206_gson;

//기본생성자, 인자 4개받는 생성자, toString 추가
public class Todo {
	private String userId;
    private String id;
    private String title;
    private boolean completed;
    
    public Todo() {
		super();
	}
	public Todo(String userId, String id, String title, boolean completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	@Override
	public String toString() {
		return userId+ " " + id +" " + title + " " + completed;
	}
}
