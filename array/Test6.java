package array;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
//10���� ���ڸ� �Է¹޾� ���������� �Է¹��� ���ں��� ù ��° �Է¹��� ���ڱ��� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String[] num = new String[10];
		System.out.println("���� 5���� �Է��ϼ���.");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.next();
			count++;
		}
		for (int i = count; i > 0; i--) {
			System.out.print(num[i-1] + " ");
		}
	}
}



