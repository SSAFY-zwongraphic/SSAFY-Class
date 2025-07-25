package w0123_arrayobject;

//오브젝트배열-2
public class UserMain3 {
	public static void main(String[] args) {
		User[] ob=new User[] {new User("kim","010-1111-1111"),
		                      new User("lee","010-2222-2222"),
		                      new User("park","010-3333-3333")};
		
		for(User m: ob) {
			System.out.println(m.getName() +"\t" + m.getPhone());
		}
	}
}
