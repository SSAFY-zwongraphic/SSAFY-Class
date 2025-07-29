package w0728_emp;

import java.util.ArrayList;
import java.util.List;

//데이타베이스에서 자원을 가져올 용도로 사용됨(DAO: Data Access Object)
public class EmpDao {
	List<EmpVo> list = null;

	public EmpDao() {
		list = new ArrayList<>();
		list.add(new EmpVo("kim", "영업부", 100));
		list.add(new EmpVo("lee", "개발부", 150));
		list.add(new EmpVo("park", "관리부", 300));
	}

	// 모든 사원 출력하기
	public List<EmpVo> getEmpList() {
		return list;
	}

	// 특정 사원 출력하기
	public EmpVo getEmp(String name) {
		for (EmpVo ob : list) {
			if (ob.getEname().equals(name)) {
				return ob;
			}
		}
		return null;
	}
}
