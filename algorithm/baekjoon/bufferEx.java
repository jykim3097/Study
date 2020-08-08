//15552번
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bufferEx {

public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
	
		String a[] = new String[n];
		String b[] = new String[n];
		
		//입력
		for(int i=0; i<n; i++) {
			String s = bf.readLine();
			a[i] = s;
		}
		
		for(int i=0; i<n; i++) {
			int x = 0;
			StringTokenizer st = new StringTokenizer(a[i]);
			while(st.hasMoreTokens()) {
				x = x + Integer.parseInt(st.nextToken());
			}
			bw.write(x+"\n");
		}
		
		bw.flush();
		bw.close();
	}

}
