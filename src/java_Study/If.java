package java_Study;

public class If {
	public static void main(String[] args) {

		String season = null;
// string으로 season을 선언.
int month = 0;
// if month가 12,1,2 월이면 겨울

		if (month == 12 || month == 1 || month == 2) {

			season = "겨울";

		} else if (month == 3 || month == 4 || month == 5) {

			season = "봄";

		} else if (month == 6 || month == 7 || month == 8) {

			season = "여름";

		} else if (month == 9 || month == 10 || month == 11) {

			season = "가을";

		} else {

			season = "없는계절";

		}

		System.out.println(month + "월은" + season + "입니다.");
System.out.printf("%d 월은 %s 입니다.", month, season);

		// %d => 정수(byte,int,long,short) %s string 는 문자

		// %f => 실수형. %n = > 개행

		// \n = >개행. 둘다 개힝이다. %n는 printf 일때만 쓰임. print만 쓰면 개행이 안됨.
         // println은 문장을 다쓰고 개행하라.

		// print



	// 0은 포함 되어 있지 않기때문에 없는 계절이라고 한다.



	// switch 문은 이렇게 돌아가는 거구나 만 생각해라

	switch(month){case 12:season="겨울";break;case 1:season="겨울";break;case 2:season="겨울";break;case 3:season="봄";break;case 4:season="봄";break;case 5:season="봄";break;case 6:season="여름";break;case 7:season="여름";break;case 8:season="여름";break;case 9:season="가을";break;case 10:season="가을";break;case 11:season="가을";break;default:season="없는계절";break;}

	System.out.printf("%d 월은 %s 입니다.%n",month,season);

 }

}
