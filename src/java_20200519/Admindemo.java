package java_20200519;

public class Admindemo {
public static void main(String[] args) {
		
		
		Admin a = new Admin("sjkl050","1111","dsjlsjf@fsd",1);
		//new admin은 생성자라고 봐도 됨 에러가 나면 default 생성자가 없으니까 error남. 
		// a.id = "sjk1050";// id가 private이니까 접근 불가 그래서 setter 해서 변경.
		//a.setId("sjkl050");
		//a.setPwd("1111");
		//a.setEmail("dkjlsjfl@sdljlfs");
		//a.setLevel(1);
		// System.out.println(a.id);); // 값 안됨 이 값을같고 올려면 메서드가 필요. = getter 메서드
		// admin 가서 id에 대한 getter 메서드 필요/

		System.out.println(a.getId()); // -
		// = String id = a.getId();
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	
		Admin a1 = new Admin("shy234","222","sdfsf@tejlw");// 인스턴스변수중 3개만 초기화 하고 싶음.
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());
		
		
	}



	

}
