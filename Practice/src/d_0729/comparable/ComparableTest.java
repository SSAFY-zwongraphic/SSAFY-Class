package d_0729.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �÷��� �����ӿ�ũ �����ϱ�
 * 
 * �ּ��� �����Ͽ� ____ �κ��� ä��� ���α׷��� �ϼ��� ���ô�.
 * 
 * �÷��� �����ӿ�ũ�� �����͸� ���� ȿ�������� �����ϰ� ����� �� �ִ� ǥ��ȭ�� ����� �����ϴ� ����Դϴ�.
 * 
 * �÷��� �����ӿ�ũ�� �����ϱ� ���� '������'�� '�������̽�'�� �ݵ�� ������ �н��ϴ� ���� �����ϴ�. 
 * 
 * 
 * Comparable�� �������̽��� �ݵ�� �����Ǿ�߸� �մϴ�.
 * �񱳴� �׻� 2���� ��ü�� �񱳵Ǿ���մϴ�.
 * Comparable�� Ŭ���� ��ü�� �ϳ��� �� ����̸�, compareTo() �޼ҵ忡 �ٸ� �� ����� ���޹޾� ���ϰԵ˴ϴ�.
 * 
 */

// Q. �̸��� Ű�� ������ �� �ִ� Person ��ü�� �����ϰ�, Comparable�� ������ ���ô�.
class Person implements Comparable<Person> {
	String name;
	int height;
	
	// Q. �̸��� Ű�� ���޹޾� ��ü�� ������ �� �ֵ��� �Ķ���� �����ڸ� ������ ���ô�.
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	// Q. compareTo �޼ҵ带 Override �� ���ô�.
	@Override
	public int compareTo(Person p) {
		
		// Q. ���� �� Ŭ������ �Ķ���ͷ� ���޹��� ��ü�� height�� ���� ���ô�.
		int result = this.height - p.height;
		
		// Q. result ���� ����� ��� ���� Ŭ������ �� ũ�ٴ� ���� �ǹ��մϴ�.
		//    ���� Ŭ������ �� ũ�� ������ return 1;�� �ۼ��մϴ�.
		if(result > 0) {
			return 1;
		}
		
		// Q. result ���� ������ ��� ���� Ŭ������ �� �۴ٴ� ���� �ǹ��մϴ�.
		//    ���� Ŭ������ �� �۱� ������ return -1;�� �ۼ��մϴ�.
		else if(result < 0) {
			return -1;
		}
		
		// Q. ���� Ŭ������ �Ķ���ͷ� ���޹��� ��ü�� ������ ��� ũ�Ⱑ ������ �ǹ��մϴ�.
		//    return 0;�� �ۼ��մϴ�.
		return 0;
	}
	
	@Override
	public String toString() {
		return "�̸�:" + name + "/Ű:" + height;
	}
}

public class ComparableTest {
	
	public static void main(String[] args) {
		
		// Q. Ÿ������ List, ������ ������ Ÿ���� Person, ���� �̸����� personList, ����ü�� ArrayList�� ������ ���ô�.
		List<Person> personList = new ArrayList<Person>();
		
		// Q. personList�� �Ʒ� ������ ������ ���ô�.
		personList.add(new Person("������ ���̾�", 193));
		personList.add(new Person("�ظ� ����", 188));
		personList.add(new Person("���ĸ�ī��", 186));
		personList.add(new Person("�����", 190));
		
		// Q. personList�� ����� �����͸� ����� ���ô�.
		for (Person p : personList) {
			System.out.println(p);
		}
		
		// Q. Collections.sort �޼ҵ带 �̿��Ͽ� personList�� ������ ���ô�.
		Collections.sort(personList);
		
		// Q. �ٽ� personList�� ����� �����͸� ����� ���ô�.
		for (Person p : personList) {
			System.out.println(p);
		}
		
		// �����غ���. �̸� ������ �����ϴ� ��쿡�� compareTo() �޼ҵ带 ��� �������� ������ ���ô�.
		//         ���������� �ִٸ� �� ��� ������ �� ������ ������ ���ô�.
		
	}
}
