package java_20200518;

public class MemberVariableRangeDemo {
	String name; // string - 클래스
	int age; // 값 설정한 것.
	double weight;
	boolean isReleased;

	public void method(String id) { // string id = 매개변수
		// 지역 변수에는 접근 한정자를 붙일 수 없다.
		// public int test;
		// 지역 변수는 초기화를 하지 않아도 상관없지만 다른 곳에서 연산하면 에러 발생
		// int a;
		// int b = a+10; // error 발생
		int a = 10;
		int b = a+10; // a는 없는값임. 그래서 error 발생.
		
		//id, a, b의 유효범위는 methodA에서만 사용가능
	}

	public static void main(String[] args) {
		MemberVariableRangeDemo m = new MemberVariableRangeDemo();
		// 멤버변수는 객체를 생성하면 기본값을 갖는다.
		System.out.println(m.name); // 값 null로 나옴.
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.isReleased);

	}

}
