package gichul;

public class Martrix17_3 {

	public static void main(String[] args) {
		int[][] P =new int[5][5];
		int[][] Q = new int[5][5];
		int H=0,L=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				H = H+2;
				P[i][j] = H;
				System.out.printf("%d \t",P[i][j]);
			}
			System.out.println();
		}
		for (int i = 2; i > 0; i--) { //90���� �ι� ȸ�� ���Ѽ� if������ i==2�ϋ� �ѹ��ϰ� i�� ���ҽ�Ų������ else���� �ѹ� �� ������
			for (int j = 0; j < 5; j++) {
				for ( H = 0; H < 5; H++) {
					L = 4-H; //�迭 �ε��� ���� 4�̱⋚���� 
					if(i == 2){ //P -> Q
						Q[j][H] = P[L][j];
					}
					else{// Q -> P
						P[j][H] = Q[L][j];
					}
				}
			}
			
		}
		System.out.printf("=============================ù��° 90�� ȸ��\n");
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q.length; j++) {
				System.out.printf("%d \t",Q[i][j]);
			}
			System.out.println();
		}
		System.out.printf("=============================�ι�° 90�� ȸ��\n");
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q.length; j++) {
				System.out.printf("%d \t",P[i][j]);
			}
			System.out.println();
		}

	}

}
