package webproject;

public class prime_num 
{
	 public static boolean isPrime(int n) 
	 {  
		 /* This function is used to find the prime number. If the number is prime then return true else it returns false */
	       if (n <= 1) /*Checks if the number is less than equal to 1 then it is not a prime return false  */
	       {  
	           return false;  
	       }  
	       for (int i = 2; i <n; i++) /* Check whether the number is divisble by number from 2  */
	       {  
	           if (n % i == 0)  /* If it is divisible by any of the number then returnn false */
	           {  
	               return false;  
	           }  
	       }  
	       return true;   
	 } 

}
