package array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		//10���� ���ڸ� �Է¹޾Ƽ� ù ��° �� ��° �ϰ� ��° �Է¹��� ���ڸ� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		String[] a = new String[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("5�� ���ڸ� �Է��ϼ���.");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.next();
			
			if(i == 0 || i == 3|| i == 4){
				System.out.println(a[i]);
			}
		}
		
	}
}
