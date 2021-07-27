package webproject;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customer: ");   
		int num=sc.nextInt();                                    // Get the number of customer
		int n1=0,n2=0,n3=0,n4=0;
		int[] id=new int[num];                                   // array to store the customers id
		int[] prime=new int[num];         // As ID's are should be prioritized, The prime numbers are get collected and stored in the array 
		int[] pow=new int[num];          // Then power of 2 numbers are get collected and stored in the array
		int[] rem=new int[num];         // Then the remaining elements are get collected in a array
		int[] fin=new int[num];         // Finally all 3 arrays are get stored in a single array
		for(int i=0;i<num;i++)
		{
			id[i]=sc.nextInt();       // Getting the customer's ID in the array
		}
		prime_num p=new prime_num();   // creating a method to access the function of other class and to check whether it is prime or not
		power_of_2 p1=new power_of_2(); // creating a method to access the function of other class and to check whether it is  power of 2 or not
		for(int i=0;i<num;i++)
		{
		if(p.isPrime(id[i]))  // in this if statement if the function returns true then it is a prime number and then get stored in the array
		{
			//System.out.println("it is prime");
			int m1=id[i];
			prime[n1++]=m1;
		}
		 else if(p1.isPowerOfTwo(id[i]))  // Then it checks whether it is power of 2 then it returns true else it return false
			 {
			 int m2=id[i];
			 pow[n2++]=m2;
			//System.out.println("it is not a prime");
		}
		 else   // it return the elements which are not the prime numbers and not the power of 2 
		 {
			 int m3=id[i];
			 rem[n3++]=m3;
		 }
		}
		/*for(int i=0;i<n1;i++)
		{
			System.out.println(prime[i]);
		}
		for(int i=0;i<n2;i++)
		{
			System.out.println(pow[i]);
		}
		for(int i=0;i<n3;i++)
		{
			System.out.println(rem[i]);
		}*/
		for(int i=0;i<n1;i++)
		{
			fin[n4++]=prime[i];
			//System.out.println(pri[i]);
		}
		
		for(int i=0;i<n2;i++)
		{
			fin[n4++]=pow[i];
			//System.out.println(pow[i]);
		}
		for(int i=0;i<n3;i++)
		{
			fin[n4++]=rem[i];
			//System.out.println(rem[i]);
		}
		for(int i=0;i<num;i++)     // It prints the final prioritized array in order of prime number then power of 2 and remaining numbers
		{
			System.out.println(fin[i]);
		}
		int twodm[][]=new int[4][4];
		// TODO Auto-generated method stub
	}
}
