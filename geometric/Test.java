package geometric;
/*
 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  1+2+4+7+11+16+22+... +
 *  �����ϴ�� 20�� �ݺ����� ���� ������� ? ��?
 */

public class Test {
	public static void main(String[] args) {
		int S = 0;
		int a = 1;
		for (int i = 1; i < 20; i++) {
			S += a;
			a = a+i;
			System.out.println(a);
		}
		
	}
}
