package gichul;

public class Test17_3 {

	public static void main(String[] args) {
		int a =0 ,sum = 0;
		while (a < 10) {
			a++;
			if(a%2 == 1 )//3�� ����� 
				continue;// ��Ƽ�������� �ٽ� if������ ����
				sum += a;// ��Ƽ�� ������ 2�� ������� �����
			
		}
		System.out.println(sum);
	}

}
