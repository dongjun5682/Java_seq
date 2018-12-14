package array;

import java.util.Random;
import java.util.Scanner;

public class MyyClass2 {
	public static void main(String[] args) {
		
		String[] vivace = {"은지","지우","현일","창준","서우"};
		String[] royal = {"창하","정욱","수호","은영",""};
		String[] atlas = {"동준","이레","지은","종협",""};
		String[] ntom = {"정우","기호","태혁","승아",""};
		String[][] mtx = {vivace,royal,atlas,ntom};
		String[][] res = new String[4][5];
		int[][] score = new int[4][5];
		Random random = new Random();
		for (int i = 0; i < res.length; i++) {
			System.out.println();
			for (int j = 0; j < res[i].length;  j++) {
				score[i][j] =random.nextInt(101);
				System.out.print(score[i][j]+ " " );
			}
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = i+1; j < res[i].length; j++) {
					if(score[i][j] <score[i][j]){
						
					}
			}
		}
		
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score.length; j++) {
//				System.out.print(" 1등 :"+res[i][j]+ " "+score[i][j]);
//			}
//		}
		
	}
}
