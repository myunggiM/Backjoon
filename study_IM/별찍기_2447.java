import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class 별찍기_2447 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void pattern(int N, int i,int j) throws IOException {
		if(N==1) {
			bw.write("*");
			return;
		}
	
		if(N/3 <= i%N && i%N< 2*N/3
		&& N/3 <= j%N && j%N< 2*N/3 ) {
			bw.write(" ");
			return;
			}

		pattern(N/3,i,j);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				pattern(N,i,j);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
