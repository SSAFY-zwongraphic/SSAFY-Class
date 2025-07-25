package w0121_object;

/*   
클래스명 : User
+name:String              
+k:int
+e:int
+m:int

+setUser(name:String, k:int, e:int, m:int):void
+getTotal():int     --총점
+getUser():String   --"나의 이름은~~~"를 리턴
*/
public class User {
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setUser(String name, int k, int e, int m) {
		this.name=name;
		this.k=k;
		this.e=e;
		this.m=m;
	}
	
	public int getTotal() {
		return k+e+m;
	}
	
	public String getUser() {
		//return "나의 이름은 " + name +"이고 총점은 " + getTotal() +"점 입니다";
		return String.format("나의 이름은 %s이고 총점은 %d점 입니다.", name, getTotal());
	}
}




