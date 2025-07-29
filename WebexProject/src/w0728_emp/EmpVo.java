package w0728_emp;

//VO(Value Object), Entity, DTO(Data Transfer Object), Bean
//데이타를 객체화 시켜서 전송할 목적으로 만든 클래스

//디폴트생성자, 인자3개받는 생성자, getter&setter
public class EmpVo {
	private String ename;
	private String dept;
	private int salary;
	
	public EmpVo() {
		super();
	}
	public EmpVo(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
