package geometric;
/**
 등비수열 : 가 항이 그 앞 항과, 일정한 비(곱셈)를 가지는 수열 
2 + 6 + 18 + 54 = 80 4항까지의 합이다.
그렇다면 10항까지의 합은 얼마인가? 59048
2 + (2*3)6 + (2*3*3)18 +(2*3*3*3)54 +(2*3*3*3*3) 
 */
public class Sequence59048 {

	public static void main(String[] args) {
		int A = 2;//초항 init
		int R = 3;//공비 common rate
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
