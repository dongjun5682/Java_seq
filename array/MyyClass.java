package array;

import java.util.Random;
import java.util.Scanner;

public class MyyClass {
	public static void main(String[] args) {
		String[] vivace = {"����","����","����","â��","����"};
		String[] royal = {"â��","����","��ȣ","����",""};
		String[] atlas = {"����","�̷�","����","����",""};
		String[] ntom = {"����","��ȣ","����","�¾�",""};
		String[][] mtx = {vivace,royal,atlas,ntom};
		int[][] score = new int[4][5];
		String[][] res = new String[4][5];
		Random random = new Random();

		for (int i = 0; i < res.length; i++) {
			System.out.println();
			for (int j = 0; j < mtx[i].length; j++) {
				score[i][j] = random.nextInt(101);
				System.out.print(score[i][j]+ " ");
			}
		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				if(score[i][j] < score[i][j]){
					
				}
			}
		}
	}
}
