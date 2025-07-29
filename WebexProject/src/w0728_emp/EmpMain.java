package w0728_emp;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("** 모든 사원 출력하기 **");

		List<EmpVo> list = dao.getEmpList();
		for (EmpVo ob : list) {
			System.out.println("이름: " + ob.getEname());
			System.out.println("부서: " + ob.getDept());
			System.out.println("급여: " + ob.getSalary());
			System.out.println();
		}

		// ------------------------------------------------------------
		System.out.println("*** lee 사원 출력하기 ***");
		EmpVo em = dao.getEmp("lee");
		if (em == null) {
			System.out.println("찾는 사원이 없습니다");
		} else {
			System.out.println(em.getEname() + " " + em.getDept() + " " + em.getSalary());
		}

	}
}
/*
 *** 모든 사원 출력하기 *** 이름 : kim 부서 : 영업부 급여 : 1000000
 * 
 * 이름 : lee 부서 : 개발부 급여 : 1500000
 * 
 * 이름 : park 부서 : 관리부 급여 : 3000000 ============================= lee사원 출력하기 ***
 * lee 개발부 1500000
 * 
 * or
 *** 
 * hong사원 출력하기 *** 찾는 사원이 없습니다
 */