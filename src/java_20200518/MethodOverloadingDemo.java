package java_20200518;

public class MethodOverloadingDemo {
	//MethodOverloadingDemo 클래스에서는 print 메서드를 4가지로 오버로딩 
		//오버로딩 작성규칙
		//1. 같은 클래스 내에서 
		//2. 메서드 이름은 같아야 한다. or 같아도 상관 없다.   
		//3. 매개변수 갯수가 같으면 자료형이 달라야 한다.
		//4. 매개변수 갯수가 달라야 한다.
		//5. 반환형과 접근 한정자는 같아도 되고 달라도 된다. 
		public void print(String str) { //print하는게 main purpose printString() - (possible)
			// 목적어|매개변수(string str)를 출력(print) 한다.  Ex) idsearch(x) searchname(0) 순서는 영어식으로 
			System.out.println(str); 
		}
		
		public void print(int i) { 
			System.out.println(i);
			
		}
		
		public void print(double d) {
			System.out.println(d);
		}
		
		public void print(boolean b) { 
			System.out.println(b);
		}
		
		
		public static void main(String[] args) {
			MethodOverloadingDemo m = new MethodOverloadingDemo();
			m.print("Hello"); //m.printString("Hello"); 출력할때 마다 다 변경해야 함. 
			m.print(100);
			m.print(10.34);
			m.print(true);
			
		}
		
}
