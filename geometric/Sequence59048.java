package geometric;
/**
 ������ : �� ���� �� �� �װ�, ������ ��(����)�� ������ ���� 
2 + 6 + 18 + 54 = 80 4�ױ����� ���̴�.
�׷��ٸ� 10�ױ����� ���� ���ΰ�? 59048
2 + (2*3)6 + (2*3*3)18 +(2*3*3*3)54 +(2*3*3*3*3) 
 */
public class Sequence59048 {

	public static void main(String[] args) {
		int A = 2;//���� init
		int R = 3;//���� common rate
		int S = A;//series
		int N = 2;// count 
		while (true) {
			A = A*R; //A *= R;
			System.out.println(A);
			S += A;
			N++;
		
			if(N > 10){
				break;
			}
		}
		System.out.printf("S is %s", S);
	}

}
