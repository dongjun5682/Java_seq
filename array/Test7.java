package array;

import java.util.Random;

public class Test7 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		for (int i = 0; i < 100; i++) {
			int n = random.nextInt(10);
			System.out.println(n);
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}
}

