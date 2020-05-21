package java_20200518;

public class Calendar {
	private int year; // 멤버변수에도 널수 있음.
	private int month;
	private int day; // 이런 public 을 감추라고. 설정은 오로지 set.

	

	// year에 대한 setter 메서드
	// setter 메서드를 이용하여 year를 변경한다.
	public void setYear(int year) { 
	this.year = year;
	}

	// year에 대한 getter 메서드
	// getter 메서드를 이용하여 year를 가져온다.
	public int getYear() {
		return year; // 그냥 year값 가져옴.
	}
	// this. : 자기 자신 객체
	// 로컬 변수와 멤버변수와 구분 할 때 사용한다. 예) this.year=year; 앞에꺼는 멤버변수 뒤어=
	// set이라는 함수를 이용해서 만듬 . 그러나 생성자를 쓰면 set 할 필요없음.
	// 년월일 setting 할려면 public 필요.
	public void set(int year, int month, int day) { // 2020년5월18일을 함수로.
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {
		// year,month,day만 넣어주면 total count 계산.
		int totalCount = 0; // 총 날짜수 계산
		// int rest = 0; 필요없음. total count만 구하니까 //나머지

		int preYear = year - 1; // 전년도에서 4의배수, 빼고 400의 몫은
		// 2019년 총일 수
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// monthArray배열에서 year이 윤년인지 아닌지를 판단하여 윤년이면
		// monthArray의 두번째 방의 값을 29로 변경해야 한다.

		// 4의 배수는 윤년이고, 100의 배수는 윤년이 아니고, 400배수는 윤년이다.
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i]; // 월 구하고
		}

		// 2019년 1월 ~ 4월까지 총일 수
		// totalCount += 31 + 29 + 31 + 30;

		// 2019년 5월 12일의 12일 까지 총일 수
		totalCount += day; // day 더하기

		return totalCount;
	}

	public void print() {

		int totalCount = getCount();
		int rest = totalCount % 7; // totoalcount를 7로 나눈게 1이면
		// int rest에서 int 선언.
		String message = null;
		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else if (rest == 0) {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + " 일은 " + message + " 입니다.");
	}


	
}
