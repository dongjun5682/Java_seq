package array;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//5개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("정수 5개를 입력하세요.");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			if(num[i] >1000){
				System.out.println("입력수는 1000이 넘으면안됩니다.");
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				}
			System.out.println(num[i]);
			}
		

	}
}



