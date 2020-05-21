package java_20200519;


	import java.lang.*;
	public class SuperDemo extends Object {
	  public SuperDemo() { 
		  super();
	  }
	}

	class A extends Object{
		A(int a) { 
			super();
		}
		
		A(){   //무조건 default 만들고 시작. 
			super();
			
		}
	}


	class B extends A {  //b 클래스의 부모가 a니까 
	   B() { 
		  //super(); - 생략됨. 
	   }

	}




	/*
	class A extends Object{ //class접근 한정자 = default  안써도 no error 
	     // A(int a) {  error. 숨겨져 있는거 발견해라
	 A() {
		 super();
	 }
	}
	 //compile가 default 생성자를 만들때 

	class B extends A{
		B()  { 
	  super();	
		}
	}
	*/

