package gichul;

public class Test17_3 {

	public static void main(String[] args) {
		int a =0 ,sum = 0;
		while (a < 10) {
			a++;
			if(a%2 == 1 )//3의 배수들 
				continue;// 컨티뉴때문에 다시 if문으로 돌아
				sum += a;// 컨티뉴 떄문에 2의 배수들이 저장됨
			
		}
		System.out.println(sum);
	}

}
