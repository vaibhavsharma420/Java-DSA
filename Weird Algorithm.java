/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.print(n+" ");
	    while(n!=1)
	    {
	        if(n%2==0)
	        n=n/2;
	        else {
	        if(n%2!=0)
	        n=(n*3)+1;}
	        System.out.print(n+" ");
	    }
	    
		
	}
}
