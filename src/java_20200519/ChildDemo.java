package java_20200519;


public class ChildDemo{  //extends object단군. 즉 이건 부모 없음.
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		
		System.out.println(p.money);
		
		
		Child c = new Child();
		c.money = 1_000_000_000; //자기자신객체 
		c.setParentMoney(1_000_000); // 이건 자기자신 돈. 
		c.Chicken = "교촌통닭";
		c.gotoschool();
		c.makeMoney();  //자식은 없지만 부모가 있기때문에 상속 
		//자식의 reference로 해도 자식이 없어서 부모의 돈이 나옴 
		c.play("omok");  //부모가 있어서 상속. 
		
		System.out.println(c.money); 
		System.out.println(c.getParentMoney());
		System.out.println(c.Chicken);   
		
		
	}
	

}
