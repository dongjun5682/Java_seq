package array;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//���� 10���� ������ �� �ִ� �迭�� ����� 10���� ���ڸ� �Է¹޾� �Է¹��� 
		//���ڸ� �̾ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		String[] num = new String[5];
		Scanner scanner =new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���.");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.next();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}
}
