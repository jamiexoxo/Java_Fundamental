package java_20200518;

public class MethodDemo {
	// 8 -16 라인 까지 메서드를 정의
		// boolean 메서드에 반환값
		// instance 메서드
		// int year => 매개변수(parameter)
		public boolean isLeafYear(int year) { // 매개변수에 year를 넣으면 윤년인지 아닌지
			// year에 2012년 들어올수 있음. ture or false만 하면 됨.
			// 메서드의 반환값이 boolean이기 때문에 return value의
			// value도 boolean 이어야 한다.

			boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
			return isLeaf;
			// 4로나눈 나머지가 0이면 leafyear 모르면 memorizing!
			// 100으로 나눈 나머지가 0이 아니면 윤년. year%100 != 0 ||
			// 그 중 4로 나눈 나머지가 0이면 윤년 year%400==0;
		}

		public long plus(int first, int second) { // long 으로 잡아주면
			return (long) first + (long) second;
			// return(long) (first + second);- X 음수가 나오기 때문에.
		}

		public double divide(int first, int second) {
			// 소수점 표현할려면 double.
			return (double) first / (double) second;
		}

		public void println(String message) {
			System.out.println(message); // 반환값 없어
		}

		public int[] ascending(int[] array) { // 이 기능은 ascending 해주는 것.
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; i < array.length - (i + 1); j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j + 1];
						array[j + 1] = array[j];
						array[j] = temp;
					}
				}
			}
			return array;
		}

		public static void main(String[] args) {
			MethodDemo m = new MethodDemo(); // 객체생성. static변수에서 instance변수 호출할려면  객체생성이
			//필요.
			// m이라는 레퍼런스 없으면 사용할 수 없음.
			boolean test = m.isLeafYear(2400); // 2400/(Argument)
			if (test) {
				m.println("윤년입니다."); // System.out.println("윤년입니다");도 okay
				// 반환값 없으면 m. println 써도 됨.
			} else {
				System.out.println("윤년이 아닙니다");
			}

			long result = m.plus(1000000, 12313421);

			System.out.println(result); // m.println(result); x - 문자열 집어너야 되기 때문에.

			double result2 = m.divide(12, 5);
			System.out.println(result2);

			int[] temp = { 1, 34, 9, 2, 40, 5, 45 };

			int[] result3 = m.ascending(temp); // ascending의 매게변수는 int

			for(int value :result3) {
				System.out.println(value + "\t");
			}

		}
}
