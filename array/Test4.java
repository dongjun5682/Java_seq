package array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
//		1�ݺ��� 6�ݱ����� ��������� ������ �� �� ���� �� ��ȣ�� �Է¹޾� �� �� ��������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//		�ݺ� ��������� �ʱⰪ���� 1�ݺ��� ���ʷ� 85.6 79.5 83.1 80.0 78.2 75.0���� �ʱ�ȭ�ϰ� 
//		����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� �Ѵ�.
		Scanner scanner =new Scanner(System.in);
		System.out.println("1�� ���� 6�ݱ��� �� ���� �Է��ϼ���.");
		int number = scanner.nextInt();
		int number2 = scanner.nextInt();
		double[] school = {0,85.6,79.5,83.1,80.0,78.2,75.0};
		double res = 0.0;
		res = (school[number] + school[number2]);
		System.out.println("�ι��� ��������� : "+res);
	}
}
