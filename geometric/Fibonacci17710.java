package geometric;
/**
 ù° �� ��° ���� 1�̸� �� ���� ��� ���� �ٷ� �� �� ���� ���� �����̴�. 
 ó�� ���� ���� ���� 1, 1, 2, 3, 5, 8�̴�.  
 �Ǻ���ġ ������ 20���� �ױ����� ���� ���ΰ���? 17710
 5�ױ����� ���� 12�� ������ ���� ���� �����ô�.

 **/
public class Fibonacci17710 {

	public static void main(String[] args) {
		int A = 1;
		int B = 1;
		int S = A+B;
		int C = 0; //3 ~ 20��° ��
		int N = 2;  
		for (N = 2; N < 20 ; N++) {
			C = A+B;
			A = B;
			B = C;
			S +=C;
		}	
		System.out.printf("S is %d",S);

		//		while (true) {
		//			C = A+B;
		//			A = B;
		//			B = C;
		//			S += C;
		//			N++;
		//			if(N == 20){
		//				break;
		//			}
		//		}
		//		System.out.printf("S is %d",S);

	}

}
