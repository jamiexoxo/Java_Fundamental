package java_20200521;

public class Customer {
	private String name;
	private String addr;

	// 생성자 만들기
	public Customer (String name, String addr) {
	

	this.name = name;
	this.addr = addr;
	}

  //setter getter 만들기
    //art+shift+s 

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//art + sht + s /generate tostring 
	//tostring의 반환값은 string(문자열) 
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + "]";
	}
	
	
	
	
	
}
