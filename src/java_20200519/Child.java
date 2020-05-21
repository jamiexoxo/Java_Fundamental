package java_20200519;

public class Child extends Parent {
	String Chicken;
	int money;
	//int money 쓰면 출력값에 부모꺼는 나오지 않음. 
	public void gotoschool () {
		System.out.println("child gotoschool()");
	}
   public void play(String starCraft) { 
	  // super.play(starCraft);  // 쓰면 부모가 노는것도 놀고 내가 노는것도 하겟다. 
	   System.out.println("child play()");
   }
	
	//@Override  //play + art+space
   // public void play(String baduk) {
    	// TODO Auto-generated method stub
    	//super.play(baduk);
    //}
   
	
	public void setParentMoney(int money) { 
		super.money = money; //parent의 머니를 쓰는 것.  
		//this.money = money; //자식꺼 . 
	}
	
	public int getParentMoney() { 
		return super.money; // parent머니 쓰는것. 
	}
	//하나는 부모에 있는 생성자 호출 
	//자식과 부모와 인스턴스 변수가 충돌이 날 경우 this.money 자기자신 객체, super.money는 부모 객체. 
	
}
