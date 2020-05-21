package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String ("abc");
		
		System.out.println(s1==s2);   //false
		System.out.println(s1.equals(s2)); //true
		
		Customer c1 = new Customer ("강동원", "서울");
		Customer c2 = new Customer ("강동원", "제주도");
						
				
				System.out.println(c1 == c2);
				System.out.println(c1.equals(c2));
				System.out.println(c1.hashCode());
				System.out.println(c2.hashCode());
				
				System.out.println(c1);
				// reference 찍기 
				//java_20200521.Customer@5898711
				//customer 가서 tostring을 overriding 하면 값 나옴. 
				System.out.println(s1); //abc 
				//tostring은 오버라이딩 했기때문에 안에 있는 답이 나옴. 
				//tostring의 반환값은 string(문자열) 
				
	}

}
