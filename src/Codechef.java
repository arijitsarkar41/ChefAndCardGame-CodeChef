/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static long sum(long N)
	{
		long m,sum = 0;
		while(N  > 0)
		{
			 m= N % 10;
	          sum = sum + m;
	            m= N / 10;
		}
		return sum;
		
		
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = 0;
		if(sc.hasNextInt()){
		 t = sc.nextInt();
		}
		while( t-- > 0) {
			int rounds = sc.nextInt();
			int chef_count = 0;
			int morty_count = 0;
			for(int i = 0; i < rounds; i++){
				long chef_card, morty_card = 0;
			    chef_card = sc.nextLong();
			    morty_card = sc.nextLong();
			    if(sum(chef_card) > sum(morty_card))
			        chef_count++;
			    else if(sum(morty_card) > sum(chef_card)) 
			        morty_count++;
			    else {
			    	chef_count++;
			    	morty_count++;
			    }
			}
			if(chef_count > morty_count){
			    System.out.println("0 "+chef_count);
			}
			else if(morty_count > chef_count){
			    System.out.println("1 "+morty_count);
			}
			else
			    System.out.println("2 "+chef_count);
			
		}
	}
}