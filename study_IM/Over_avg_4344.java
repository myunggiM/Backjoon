package study_IM;

import java.util.Scanner;

public class Over_avg_4344 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int TC = scan.nextInt();
		int sum=0,count=0;
		for (int i = 0; i < TC; i++) {
			int num = scan.nextInt();
			int arr[] = new int[num];
			for (int j = 0; j < num; j++) {
				arr[j]= scan.nextInt();
				sum+=arr[j];
			}
			for (int j = 0; j < num; j++) {
				if (sum/num < arr[j]) {
					count++;
				}
				//System.out.println("avg:"+sum/num+" count:"+count+"수: "+ arr[j]);
			}
			System.out.printf("%.3f",Math.round(((float)count/num) *100000)/1000.0);
			System.out.println("%");
			count=0;
			sum=0;
			
		}// TC for 문 
		

	}

}
