package geometric;
/*
 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = -50
 * ���� : Ȧ���� + , ¦����  -
 */

public class Switch100 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			sum += (i%2 != 0) ? i : -i;
		}
		System.out.println(sum);
	}
}
