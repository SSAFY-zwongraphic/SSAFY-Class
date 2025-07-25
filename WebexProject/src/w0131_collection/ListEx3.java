package w0131_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
	public static void main(String[] args) {
		Book ob1=new Book("java","kim",100);
		Book ob2=new Book("c++","lee",250);
		Book ob3=new Book("oracle","park",300);
		
		//List객체에 ob1, ob2, ob3를 담기
		List<Book> list=new ArrayList<>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		
		//forEach를 이용해서 출력하기
		for(Book ob :list) {
			System.out.print("책이름:" + ob.getTitle()+"\t");
			System.out.print("책저자:" + ob.getAuthor()+"\t");
			System.out.print("페이지:" + ob.getPage()+"\n");
		}
		//-----------------------------------------------------
		//Iterator를 이용해서 출력
		Iterator<Book> iter=list.iterator();
		while(iter.hasNext()) {
			Book ob=iter.next();
			System.out.print("책이름:" + ob.getTitle()+"\t");
			System.out.print("책저자:" + ob.getAuthor()+"\t");
			System.out.print("페이지:" + ob.getPage()+"\n");
		}	
		//-----------------------------------------------------
		Scanner sc=new Scanner(System.in);
		System.out.print("찾는 도서명: ");
		String str=sc.next();
		boolean notFound=true;
		
		for(Book b:list) {
			if(b.getTitle().contains(str)) {
				notFound=false;
				System.out.printf("제목: %-10s저자: %-10s페이지: %-10d\n", 
		                   b.getTitle(), b.getAuthor(), b.getPage());
			}
		}
		
		if(notFound) {
			System.out.println("찾는 도서 없음");
		}
	}
}
/*
책이름:java   책저자:kim    페이지:100
책이름:c++    책저자:lee    페이지:250
책이름:oracle 책저자:park   페이지:300

찾는 도서명: java
java kim 100

찾는 도서명: php
찾는 도서가 없습니다
*/







