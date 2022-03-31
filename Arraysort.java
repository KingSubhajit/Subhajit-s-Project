package Interview;
import java.util.*;
import java.util.Scanner;
class Arraysort {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	     int res=0;
		int n = sc.nextInt();
		String[] strNums;
		int arr[]= new int [n];
		for(int i = 0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i =0 ; i < n ; i++  )
		{
		  res = arr[0]+arr[n-1];
		}
		
		System.out.println(res);
		
}
}
