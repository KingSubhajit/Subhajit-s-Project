package Interview;
import java.util.*;
class Solution {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int rem=0;
		int temp = n;
		int r;
		while (n>0)
		{
			r=n%10;
			rem = (rem*10)+r;
			n=n/10;
		}
		
		if(temp==rem)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
