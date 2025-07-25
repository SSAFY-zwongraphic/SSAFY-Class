package w0123_arrayobject;

//오브젝트
public class UserMain1 {
	public static void main(String[] args) {
		User ob1=new User("kim","010-1111-1111");
		User ob2=new User("lee","010-2222-2222");
		User ob3=new User("park","010-3333-3333");
		
		System.out.println(ob1.getName() +"\t" + ob1.getPhone());
		System.out.println(ob2.getName()+"\t"+ob2.getPhone());
		System.out.println(ob3.getName()+"\t"+ob3.getPhone());
	}
}
