import java.util.Scanner;

public class LIS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int a[] =new int[N];
		for (int i = 0; i < N; i++) {
			a[i]= sc.nextInt();
		}
		int b[] =new int[N];
		
		int max=1;
		for (int i = a.length-1; i >= 0; i--) {
			b[i]=1;
			for (int j = i+1; j < N ; j++) {
				if(a[i] <a[j]) {
					b[i]=Math.max(b[i], b[j]+1);
				}
				
			}
		}
		for (int i = 0; i < b.length; i++) {
			max=Math.max(max, b[i]);
        }
		
		System.out.println(max);
	}

}
