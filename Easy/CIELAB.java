import java.util.Scanner;

public class CIELAB {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=a-b;
		int r=ans%10;
		
		if(r==9)
		{
			System.out.println(ans-1);
		}
		else
		{
			System.out.println(ans+1);
		}
	}

}
