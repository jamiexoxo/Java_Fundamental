package java_20200518;
//art+shift+s + r / tab+enter 5times 
public class Member {
	private String name;
	private String zipcode;
	private String addr1;
	private String addr2;
	private String ssn1;
	private String ssn2;
	private int age;
	private String regdate;

	//name에 대한 setter
	public void setAge(int age) {
		this.age = age;
	}
     //name에 대한 getter
	public int getAge() {
		return age;
	}
   //zipcode에 대한 setter
	public void setName(String name) {
		this.name = name;
	}
    //zipcode에 대한 getter
	public String getName() {
		return name;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr2(String addr2) {
		this.addr1 = addr2;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
	}

	public String getSsn1() {
		return ssn1;
	}
	public void setSsn2(String ssn2) {
		this.ssn2 = ssn2;
	}

	public String getSsn2() {
		return ssn2;
	}
	public void setRegdate(String regdate) {
       this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
	}
}
	
	
	
