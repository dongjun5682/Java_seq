package arithmetic;
/**
 ���� ���� : �����ϴ� �� ���� ���̰� ��� ������
 ����(common difference)��  ���������� ��Ÿ���� ����
 
 * */
public class Sequence01 {

	public static void main(String[] args) {
		//2+8+14+20+26=70
		int a = 2; //����
		int s =a;
		int d = 6;//����
		int n =2;//��°
		int an = 0;
		String ex = "2";
		for(int i = 0; i < 4; i++){
			an = a+(n-1)*d;
			a = an;
			s += an;
			ex += "+" + an;
			
		}
		System.out.println(ex+"="+s);
	}

}
