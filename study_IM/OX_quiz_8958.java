package study_IM;

import java.util.Scanner;

public class OX_quiz_8958 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int TC = scan.nextInt();
		int sum=0,count=0;
		for (int i = 0; i < TC; i++) {
			String st= scan.next();
			for (int j = 0; j < st.length(); j++) {
				if (st.charAt(j)=='O') {
					count++;
				}else {
					count =0;
				}
				sum+=count;
			}
			System.out.println(sum);
			sum=0;
			count=0;
		}
	}

}
