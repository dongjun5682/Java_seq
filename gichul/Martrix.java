package gichul;

public class Martrix {

	public static void main(String[] args) {
		int[][] P =new int[5][5];
		int[][] Q = new int[5][5];
		int H=0,L=0;

		for (int i = 0; i < Q.length; i++) {
			System.out.println();
			for (int j = 0; j < Q.length; j++) {
				H = H+2;
				P[i][j] = H;
				System.out.print(P[i][j]+"\t");
			}	
		}
		
		for (int i = 2; i > 1; i--) {
			for (int j = 0; j < Q.length; j++) {
				for (H = 0;  H < Q.length; H++) {
					L = 4-H;
					if(i == 2 ){
						Q[j][H] =P[L][j]; 
					}else{
						P[j][H] = Q[L][j];
					}
				}
			}
		}
		System.out.println("");
		System.out.println("==================90µµ 1È¸Àü");
		for (int i = 0; i < Q.length; i++) {
			System.out.println("");
			for (int j = 0; j < Q.length; j++) {
				System.out.print(Q[i][j]+"\t");
			}
		}
		
	}

}
