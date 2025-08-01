package d_0729.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
 * Comparator�� �������̽��� �ݵ�� �����Ǿ�߸� �մϴ�.
 * �񱳴� �׻� 2���� ��ü�� �񱳵Ǿ���մϴ�.
 * Comparator�� Comparable�� �ٸ��� 2���� ��ü�� compare �޼ҵ带 ���� ���մϴ�.
 * 
 */

//Q. �̸��� Ű�� ������ �� �ִ� Person ��ü�� ������ ���ô�.
class Person {
	String name;
	int height;
	
	// Q. �̸��� Ű�� ���޹޾� ��ü�� ������ �� �ֵ��� �Ķ���� �����ڸ� ������ ���ô�.
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	@Override
	public String toString() {
	    return "�̸�:" + name + "/Ű:" + height;
	}
}

public class ComparatorTest {
	
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
		//    Comparator�� �̿��մϴ�.
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				// Q. person1�� person2�� height�� ���� ���ô�.
				int result = p1.height - p2.height;
				
				// Q. result ���� ����� ��� person1 ��ü�� �� ũ�ٴ� ���� �ǹ��մϴ�.
				//    person1 ��ü�� �� ũ�� ������ return 1;�� �ۼ��մϴ�.
				if(result > 0) {
					return 1;
				}
				// Q. result ���� ������ ��� person1 ��ü�� �� �۴ٴ� ���� �ǹ��մϴ�.
				//    person1 ��ü�� �� �۱� ������ return -1;�� �ۼ��մϴ�.
				else if(result < 0) {
					return -1;
				}
				
				// Q. person1 ��ü�� person2 ��ü�� ������ ��� ũ�Ⱑ ������ �ǹ��մϴ�.
				//    return 0;�� �ۼ��մϴ�.
				return 0;
			}
		});
		
		// Q. �ٽ� personList�� ����� �����͸� ����� ���ô�.
		for (Person p : personList) {
			System.out.println(p);
		}
	}
}
