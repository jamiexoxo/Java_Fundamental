package java_Study;

public class For {
	public static void main(String[] args) {

		// 1. 1뷰터 10까지 합. //2. 짝수의 합을 구하시오.
//처음에는 표를 구하시오. 
//처음 입문하면 구구단만 찍으시오 오름차순 하지말고 
//for문만 돌리시오. 
//자연스럽게 할때까지 반복하시오. 
//calender 어려우면 하지말고 지금은 외울게 너무 많으니까 앞에 있는거 정확히 아는게 중요. 

		int sum = 0;

		// int i = 1; 를 뺄수 있음.
		// int 1 = 1; 가 for 범위에 있으면 for 범위 안에만 있음 즉 sysout할수 없음.
// 그러나 for 바깥에 있으면 system.printf(i)값 출력 가능 
//털모양 누르고 하면 위에 노란 화살표 누르면 답 나옴 

		for (int i = 1; i <= 10; i++) {

//2로 나눈 나머지가 0이면 짝수 
			// 2로 나눈 나머지가 1이면 홀수
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다. %n", sum);

		// ,sum은 %d 의 값.

		/*
		 * i=1, sum = 1
		 * 
		 * i = 2, sum = 3
		 * 
		 * i = 3, sum = 4
		 * 
		 * i= 4; sum = 10
		 * 
		 * i = 5, sum = 15
		 * 
		 * i=6 sum = 21
		 * 
		 * i = 7 sum = 28
		 * 
		 * i = 8, sum = 36
		 * 
		 * i = 9, sum = 45,
		 * 
		 * i = 10 , sum = 55;
		 * 
		 * i = 11 i = 55. break돼서 나오지 않음.
		 * 
		 */

	}

}
