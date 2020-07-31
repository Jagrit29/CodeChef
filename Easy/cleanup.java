import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.*;
import java.util.*;

public class cleanup {
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
		// TODO Auto-generated method stub
		FastReader sc=new FastReader();
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int done[]=sc.nextIntArray(m);
			HashSet<Integer> hs=new HashSet<>();
			for(int i:done)
			{
				hs.add(i);
			}
			
			StringBuffer boss=new StringBuffer("");
			StringBuffer ass=new StringBuffer("");
			boolean taken=false; //not taken by boss
			for(int i=1;i<=n;i++)
			{
				if(!hs.contains(i) && !taken)
				{
					boss.append(i+" ");
					taken=true;
				}
				else if(!hs.contains(i))
				{
					ass.append(i+" ");
					taken=false;
				}
			}
			System.out.println(boss.toString());
			System.out.println(ass.toString());
		}

	}

}
