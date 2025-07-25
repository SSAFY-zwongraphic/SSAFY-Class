package w0131_emp;

import java.util.ArrayList;
import java.util.List;

import w0122_inher.Emp;

//데이타베이스에서 자원을 가져올 용도로 사용됨(DAO: Data Access Object)
public class EmpDao {
	List<EmpVo> list=null;
	
	public EmpDao() {
		list=new ArrayList<>();
		list.add(new EmpVo("kim","영업부", 1000000));
		list.add(new EmpVo("lee","개발부", 1500000));
		list.add(new EmpVo("park","관리부", 3000000));
	}
	
	//모든 사원 출력하기
	public List<EmpVo> getEmpList(){
		return list;
	}
	
	//특정사원 출력하기
	public EmpVo  getEmp(String name) {
		for(EmpVo ob:list) {
			if(ob.getEname().equals(name)) {
				return ob;
			}
		}
		return null;
	}
}









