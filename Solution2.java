package Interview;
import java.util.Arrays;
import java.util.Scanner;
class Solution2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
			int n = sc.nextInt();
			int a[]=new int [n];
			for( int i= 0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int k = a[n-2];
			
		System.out.println(k);

	}

}
