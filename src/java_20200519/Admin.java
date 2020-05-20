package java_20200519;

public class Admin {
	private String id; // id(변수) 통해서
	private String pwd;
	private String email; // 인스턴스 변수 email
	private int level;

	// 디폴트 생성자(default constructor)
	//art + shift + s => c (english)
	public Admin() { // 클래스 내에 생성자가 없으면 만들어야 딤. 만약 생성자 만들면 자동으로 만들어지지 않음.
		super(); // 부모 클래스의 디폴트 생성자를 호출
	}

	// 생성자(constructor)
	// 생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	// 생성자의 역할은 인스턴스 변수 초기화
	// void 쓰면 admin이라는 하무됨
	// setter에 대한거 다 넣어둔거?
	//art shift s => o
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
  //생성자의 오버로딩
	public Admin(String id,String pwd,String email) { 
		//super();    // 그냥 super가 숨어있다. 
		//this.id = id;  //this. 는 자기자신 호출 
		//this.pwd = pwd;
		//this.email = email;
		this(id, pwd, email, 0) ;  //this는 다른생성자를 호출할때 this(), 반드시 생성자에서만 호출 가능  
		//매개변수 4개 id,pwd,email,0 . 
		//this는 두가지 용법. 
		//1. 자기자신 객체 => this.
		//2. 다른 생성자를 호출 => this ( ~,~,,,,)
	}
	
	
	// id에 대한 setter 메서드
	public void setId(String id) {
		this.id = id;
	}

	// id에 대한 getter 메서드

	public String getId() {
		return id;
	}

	// pw에 대한 setter 메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// pw에 대한 getter 메서드
	public String getPwd() {
		return pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	// level에 대한 setter
	public void setLevel(int level) {
		this.level = level;
	}

	// level에 대한 getter
	public int getLevel() {
		return level;
	}

}
