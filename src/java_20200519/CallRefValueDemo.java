package java_20200519;

public class CallRefValueDemo {
	public static void change(int i, int[] j) { // change메서드는 i값을 20 , j값을 40000
		i = 20;
		j[3] = 4000;
	}

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 1, 2, 3, 4 };

		System.out.println(i + "," + j[3]);

		// int l = i;
		// l = 20;

		// int[] k = j;
		// k[3] = 4000;

		change(i, j); // i = call by value j = call by reference

		System.out.println(i + "," + j[3]);

		int a = 10;
		double b = 10.0;
		// primitive == primitivie ==> 값 비교.
		System.out.println(a == b);

		// reference,
		int[] a1 = { 1, 2, 3, 4 };
		int[] b1 = { 1, 2, 3, 4 };
		int[] c1 = b1;
		// ref == ref => 두 ref가 같은 객체를 참조하는 지를 판단.
		// 같은 객체를 참조하면 true, 같은 객체를 참조하지 않으면 false
		System.out.println(a1 == b1); // 값 false. reference로 비교하게 되면 값이 같은지를 비교.
		System.out.println(a1 == c1);

	}
}
