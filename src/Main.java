import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
//414-machined surfaces


	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int x;
		ArrayList <Integer>z = new ArrayList();
		while((x=sc.nextInt())!=0) {
			
			z.clear();
			int res=0;
			int min=29;
			int count=0;
			if(x==1) {
				count=-1;

				String y=sc.nextLine();
				//System.out.println(y);

			}
			else {
				Character [] mach=new Character [25]; int n=x;
				while(n!=0) {
				//	System.out.println(n);
					String t=sc.nextLine();

					//System.out.println(t);
					for(int i=0;i<t.length();i++) {
						//	System.out.println("L");
						mach[i]=t.charAt(i);
						if(mach[i]==' ')//change to space
							count++;
					}

					z.add(count);
					//System.out.println(z.toString());
					min=Math.min(min, count);
					//System.out.println(min+"hnaa");
					n--; count=0;
				}

				if(count==-1)
					res=0;
				else{
					//System.out.println("ll");
					for(int i=0;i<z.size();i++) {
						res+=z.get(i)-min;
					}}}


			out.println(res);
//System.out.println(res);


		}
		out.close();

	}



	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}