package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.2);
		System.out.println(d1);

		d1 = Math.floor(4.9);
		System.out.println(d1);

		long l1 = Math.round(42.5);
		System.out.println(l1);
		// 매개변수가 double이면 long으로 받아들인다.

		// 소수점 두번째 짜리 반올림해서 45.7 / 소수점 첫번째 자리로 표현하기
		d1 = 45.67;
		// d1에 10을 곱하기
		d1 = d1 * 10;

		// 반올림 하면.
		l1 = Math.round(d1);
		d1 = (double) l1 / 10; // d1 = l1/10; //정수값 나오니까
		System.out.println(d1);
		
		int a1 = (int)Math.round(43.5);
		
		a1 = Math.abs(-123);
		System.out.println(a1);
		
		d1 = Math.sqrt(3);
		System.out.println(d1);
		
		a1 = (int)Math.pow(2, 3); 
		System.out.println(d1); // int로 캐스팅 할때. 

		d1 = Math.random()*45;
		System.out.println(d1); //실행할 때마다 다름
		
	
	
	}

}

