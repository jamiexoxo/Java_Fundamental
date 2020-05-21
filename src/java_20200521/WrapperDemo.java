package java_20200521;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
	int[] temp = {1,2,3,4};

		/*
		 *자바 1.4 version 에서는 primitive data type를 collection에 저장 
		 할수 없 었기 때문에 primitive data type을 객체화 할 수 있는 
		 wrapper class가 필요함. 아래와 같이 1을 추가할 수 없음.
		 collection 에 1을 저장하기 위해서는 primitive data type를 객체화
		 하는 integer 클래스로 변환해야 함. 
		 **/		
		//배열은 모든 자료형을 다 저장함. 

		ArrayList list = new ArrayList(); 
		//collection은 primitive저장 못함= 객체화 하면 됨
		//list.add(1);
		list.add(new Integer(1));
		
		//1. primitive data type => wrapper class (new Integer(1)) 
		Integer i1 = new Integer(10); 
		Integer i2 = new Integer(20);
		
		//2. Wrapper class => primitive data type ( xxxValue() )
		int i3 = i1.intValue() + i2.intValue();
		
		//3. String(문자열) => primitive data type 
		String s1 = "10";
		String s2 = "20"; 
		
		int i4 = Integer.parseInt(s1)+ Integer.parseInt(s2);
		System.out.println(i4);
		
		
		//parseint는 문자열을 primitive로 바꿔 주는 것 
		
		
		//4. primitive data type => String
		String s3 = 10+""; // +는 연결연산자, ""는 모르는것. 
		String s4 = String.valueOf(10);
		
		//primiive data type 자동으로 wrapper class 변환하는 것을 
		//auto boxing 하는 것 
		Integer i5 = 10;
		Integer i6 = 20; 
		
		int i7 = i5 + i6;
		System.out.println(i7);
		//wrapper class가 자동으로 primitive data type 으로 바뀐것
		// auto un-boxing. 
		//primitive 가 변환된다? coudln't imagine 
		
	}

}














