package math;

import java.util.Scanner;

/**
 �������� �����(����, ����: common divisor)�� ���ÿ� �׵� ����� ����� ������. 
 ��� �ϳ��� 0�� �ƴ� �������� �ִ�����(��������, ��ȭ��: �üӳ�����; ����: greatest common divisor, ���� GCD)�� ����� ��� ���� ū �ϳ���. 
 ���׽��̳� ȯ�� ���ҿ� ���ؼ��� ������ �� �ִ�.

 �����(�����)�� �� �� �̻��� �ڿ����� ������ ����� ���Ѵ�. 
 ���� ��� 3�� 4�� ������� 3�� ����̱⵵ �ϰ� 4�� ����̱⵵ �� ���̴�. 
 �� ���� ����� �߿��� ���� ���� ���� �ּҰ������� �ϴµ�, ��� ������� �ּҰ������ ����̴� 
 Least Common Multi = LCM

 **/
public class CommonMulti {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("�ִ� ������� �ּҰ������ ���� �� ���� �Է��ϼ���.");
		int num1 =24,
				num2 = 14,
				big =0,
				small =0,
				mok =0,
				nmg =0,
				lcm = 0, //�ּ� �����
				gcd =0;

		if(num1 > num2){
			big = num1;
			small = num2;
		}else{
			big = num2;
			small =num1;
		}
		mok = big / small;
		nmg = big % small;
		
		while (nmg != 0) {
			if(nmg < small){
				mok = nmg;
				nmg = small;
				small = mok;
			}
			nmg  %= small;
		}
		gcd = small;
		
		
//		for (int i = 0; i < num1; i++) {
//			if(num1 % (i+1) == 0 && num2 % (i+1) == 0){
//				gcd = (i+1);
//				lcm =(num1 * num2) /gcd;
//			}
//		}
		lcm =(num1 * num2) /gcd;
		System.out.printf("%d �� %d �� �ּҰ���� : %d & �ִ����� : %d",num1,num2,lcm,gcd);


	}

}
