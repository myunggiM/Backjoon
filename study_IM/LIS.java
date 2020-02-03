package study_IM;

import java.util.Scanner;


public class LIS {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		int N=sc.nextInt();
		int a[] =new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i]= sc.nextInt();
		}
	
		
		int b[]= new int[N];
		for (int i = a.length-1; i >=0; i--) {
			for (int j = a.length-2; j >=0; j--) {
				if(a[i]>a[j]){
					b[j]++;
				}
			}
		}
		int max=0;
		for (int i = 0; i < b.length; i++) {
			max=Math.max(max,b[i]);
		}
		System.out.println(max);
		
	}//main

}
