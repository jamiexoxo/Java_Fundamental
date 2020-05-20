package java_20200520;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super(); // age,work. 부모꺼 접근 가능
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		
		System.out.println("===============");
		Sub s2 = new Sub();  //자식꺼 부모꺼 다 접근 가능 
		System.out.println(s2.height);
		s2.playGame();
		s2.work(); //?    overriding한거는 호출 불가능. 
		//위 3개는 자식꺼 
		
		s2.age = 20;  // 이렇게 나이 바꾸면 쓸수 있음 
		System.out.println(s2.age);
		s2.playBadook();
		System.out.println("===============");
		
		Super s3 = new Sub(); //System.out.println(s3.age); 하면 값이 50
		// 이런 경우는 super가 추상 클래스 일때, 추상 클래스는 객체 생성가능.
		//
		//Super s3 = s2; //s3가 가르키는걸 s2가 가르켜라  
		System.out.println(s3.age);  //값 20 
		s3.playBadook();   //reference가 age와 playbadook 가르킴. 
		s3.work(); // 자식께 호출됨. 
		
		//s3.height = 20; // 자식꺼는 같다 쓸수 없음 
		//s3.playGame(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
