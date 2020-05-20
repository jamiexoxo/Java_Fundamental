package java_20200520;

public class SubDemo2 {

	// method로 static만들기
	public static void change(Super sup) { // 매개변수를 super로 하기 == super sup = s1;
		sup.age = 20;
		//sup.playGame();// 할수 없음 
		sup.playBadook();
		sup.work(); // sub work() 호출 - 이유: overriding 메서드는 자식 메서드가 호출됨. 
	}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age); // value = 50 super 값 

		change(s1); //call by reference 한것
		//s1을 super에 넣어달라는 말. 

		System.out.println(s1.age);
	}

}
