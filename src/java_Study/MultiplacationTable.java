package java_Study;

public class MultiplacationTable {
	public static void main(String[] args) {

		// 2X1 2 구하기
				for (int i = 2; i <= 9; i++) { // i는 2단부터 9단까지 니까
		// 2x1 의 1
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d%n", i, j, i * j);
					}
				}
		// while 문으로 바꾸기// 1 부터 10까지 더하기 
		//while문은 ()안에 true false
		//while은 초기값 설정할 수 없다. 초기값 설정할려면 바깥에 

				int i = 1;
				int sum = 0;
				while (i <= 10) {
					sum = sum + i; // 다 더하고 난다음에
					i++; // 더하기 //for문처럼 다 쓸수가 없어서 따로따로 해야한다.
				}
				System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum);
		        
				
				
				
				// 어쩔수 없이 쓰는거지 이렇게 안씀
				i = 2; // i 초기화 시킨것임
				while (i <= 9) { // 조건
					int j = 1; // 초기값 선언
					while (j <= 9) { // 조건
						System.out.printf("%d * %d =  %d%n", i, j, i * j);
						j++;
					}
					i++; // 증감은 while 값 안에서.

				}

			}

			/*
			 * 
			 * i = 2, j = 1 i = 2, j = 2 i = 2, j = 3
			 * 
			 */

}
