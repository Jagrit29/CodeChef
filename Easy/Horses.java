import java.util.*;
import java.io.*;
import java.lang.*;
public class Horses {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
        int[] nextIntArray(int n)
        {
        	int a[]=new int[n];
        	for(int i=0;i<n;i++)
        	{
        		a[i]=Integer.parseInt(next()); 
        	}
        	return a;
        }
        
    } 
	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
			int n=sc.nextInt();
			int a[]=sc.nextIntArray(n);
			Arrays.sort(a);
			
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n-1;i++)
			{
				min=Math.min(a[i+1]-a[i],min);
			}
			System.out.println(min);
		}

	}

}
