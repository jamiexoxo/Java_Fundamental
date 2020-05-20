package java_study0519;

public class Java1 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 식별자 - 클래스명,변수명,메서드명, 패키지 이름

		int a1 = 10;
		int a_1 = 10; // 식별자로 사용
		int $1 = 10;

		// 다른 문자임. 이중 선언했기 때문에. age/Age
		int fatherAge = 50;
		int fatherage = 50;

		// 숫자로 시작하면 안됨
		// int 1a = 10;
		// 특수문자는 식별자로 사용불가능 (예외 $,_)
		// int a# = 20;

		// 공백 허용 안됨
		// int father age = 10;

		// 예약어는 사용할 수 없음.
		// int break = 10;

		// 10진수 표현법 주로 씀. 8,2,16 진수 안씀.
		byte b1 = 10;

		// 8진수 표현법 앞에 0들어간것.
		byte b2 = 012;
		// 2진수 표현법
		byte b3 = 0b1010;
		// 16진수 표현법 0123456789
		short b4 = 0x12a2; // a=11 f=15임
		// 뒤에 l을 붙임
		long l1 = 1000l;
		// long 11 = 127; //byte인데 자동으로 캐스팅.
// int a = 2200_000_000 // 에러, int범위 넘어가니까
		long l2 = 2_200_000_000l;
		long l4 = 100l; // 8bite공간에 100만 저장한것임. error
		long l5 = 100; // 가능 = automatically 자동 캐스팅.

		int a2 = 100; // byte가 int로 캐스팅

		float f1 = 12.45f; // 실수는 뒤에 f나 F붙임/ - literal공부

		double d1 = 12.45d; // d는 생략 가능

		boolean isSuccess = false;

		// 문자 표현법
		char c1 = 'a'; // 일반적인 것. 두글자는 안됨
		// 아스키코드 표현법
		char c2 = 97; // 문자에 숫자를 넣어도 인식
		// 유니코드 - 코딩테스트 할때 필요
		char c3 = '\u0061';
// char c5 = '\'; 인식안됨
		char c5 = '\\';
		char c6 = '\'';
		System.out.println("aaa" + '\r' + "bbb");
//byte e1 = 128; //범위를 넘으면 casting=변환 해야 함. 

		byte e1 = (byte) 129; // -128 ~ 127 //
		System.out.println(e1);
//circuit 현상 생기며 그럴바엔 그냥 자료형을 바꿔서 쓰는게 좋다. 
//casting 했을 경우 cut 발생 
		int e2 = (int) 1234.58;
		System.out.println(e2);
		int t1 = 10;
		int t2 = t1++; // 대입한다음 증가
		System.out.println(t2);
		System.out.println(t1);
		int t3 = ++t1; // 증가한 다음 대입.
		System.out.println(t1);
		System.out.println(t3);
//단독으로 쓰일때는 상관없다 . 그러나 같이 쓰면 값이 달라짐. 
		int y1 = 10;
		double k2 = 10.0;
		System.out.println(y1 == k2);
//a && b => a => false일때 short circuit 발생
// a|| b => a가 true 이면  뒤에 볼필요 없음. 
		System.out.println(1 + 2 + 3 + "abcd");
// +는  앞뒤가 primitive면 다 더함. 
//그러나 primitive + 문자열 에서 +는 연결연산자 
		System.out.println("abcd" + 1 + 2 + 3);
// 6abcd할려면 
		System.out.println("abcd" + (1 + 2 + 3));

	}
}
