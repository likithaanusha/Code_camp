package code_camp;
import java.util.*;
public class Shift_Elements {
	static void shift (int arr[] , int n)
	 {
		 int i;
		 int temp =  arr[0]; 
		 for( i = 0; i<n-1; i++)
		 {
			 arr[i] = arr[i+1];
		 }
		 arr[i] = temp;
	 }
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		System.out.println("Enter the value to shift:");
		int p = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter "+ n + " elements:");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<p; i++)
			shift(arr,n);
			
		for (int i = 0; i<n; i++)
		{
			if(i==(n-1))
			   System.out.print(arr[i]);
			else
			System.out.print(arr[i]+",");
		}
	}
}
