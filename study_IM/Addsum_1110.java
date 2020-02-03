package study_IM;

import java.util.Scanner;

public class Addsum_1110 {

	public static void main(String[] args) {
		int count=0;
		Scanner scan =new Scanner(System.in);
		int origin =scan.nextInt();
		int n =origin;
		do {
			n= (n%10)*10 +(n/10+n%10)%10;
			count++;
		}while(origin!=n);
		System.out.println(count);

	}

}
