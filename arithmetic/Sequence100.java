package arithmetic;
/**
 등차 수열 : 연속하는 두 항의 차이가 모두 일정한
 공차(common difference)는  공통적으로 나타나는 차이
 
 * */
public class Sequence100 {

	public static void main(String[] args) {
		int i=0, x = 0;
		String re = "";
		for (int j = 1; j <= 100; j++) {
			re += j +"+";
			x += j;
		}
		System.out.println(re+"\n"+x);
	}

}
