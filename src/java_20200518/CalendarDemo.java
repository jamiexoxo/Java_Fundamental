package Java_20200518;

public class CalendarDemo {
	
		public static void main(String[] args) {
			Calendar c = new Calendar();
			c.set(2020, 5, 25);
			c.setYear(2025);
			c.print();
		
		
		//Calendar c = new Calendar(2020,5,25);
		//c.set(2020,  5 , 25); // year 이 private 되어 있어서
		//c.setYear(2025); // 변경은 메서드 통해서만. 
		//c.print();  
	}

}
