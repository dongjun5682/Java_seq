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
		for (int i = 2; i > 0; i--) { //90도를 두번 회전 시켜서 if문에서 i==2일떄 한번하고 i를 감소시킨다음에 else에서 한번 더 돌리기
			for (int j = 0; j < 5; j++) {
				for ( H = 0; H < 5; H++) {
					L = 4-H; //배열 인덱스 끝이 4이기떄문에 
					if(i == 2){ //P -> Q
						Q[j][H] = P[L][j];
					}
					else{// Q -> P
						P[j][H] = Q[L][j];
					}
				}
			}
			
		}
		System.out.printf("=============================첫번째 90도 회전\n");
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q.length; j++) {
				System.out.printf("%d \t",Q[i][j]);
			}
			System.out.println();
		}
		System.out.printf("=============================두번째 90도 회전\n");
		for (int i = 0; i < Q.length; i++) {
			for (int j = 0; j < Q.length; j++) {
				System.out.printf("%d \t",P[i][j]);
			}
			System.out.println();
		}

	}

}
