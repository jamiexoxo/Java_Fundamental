package java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String ("abc");
		
		System.out.println(s1==s2);   //false
		System.out.println(s1.equals(s2)); //true
	}

}
