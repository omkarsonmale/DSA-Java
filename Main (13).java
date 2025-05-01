/*
Question
Q: Write a function that takes input as an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime numbers, print both.

Example:

graphql
Copy
Edit
Input#1: 32
Output#1: 31

Input#2: 30
Output#2: 29 31
*/


/*My logic*/
import java.util.Scanner;

class check{
    void pnum(int n){
        int num=0;
        boolean flag= true;
         int f=n-1;
        int l1=0;
        int e=n+1;
        int l2=0;
        if(n>=3){
           
            
            while(f>2){
                for(int i=2;i<f/2;i++){
                    if(f%i==0){
                       
                        flag=false;
                        break;
                    }
                    
                }
                if(flag==true){
                    break;
                }
                else{
                    f=f-1;
                    l1=l1+1;
                    flag=true;
                }
                
            }
            
            flag=false;
            
            while(flag!=true){
                flag=true;
                for(int i=2;i<e/2;i++){             // not from 0 other wise it gives exception aritmatic /by zero
                    if(e%i==0){
                        flag=false;
                        break;
                    }
                    
                    
                }
                
                if(flag==true){
                    continue;
                    
                }
                else{
                    e=e+1;
                    l2=l2+1;
                }
                
            }
            
            
        }
        
        if(l1==l2){
            int arr[]= new int[2];
            arr[0]=f;
            arr[1]=e;
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        else{
            if(l1>l2){
              System.out.println(e);
            }
            else{
                System.out.println(f);
            }
        }
        
    }
    
}

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		check ch = new check();
		ch.pnum(n);
		
		
	}
}

/*Structured and optimized logic*/
import java.util.Scanner;

class printprime{
    boolean isprime(int num){
       
         if (num <= 1) return false;
        for(int i=2;i <= Math.sqrt(49);i++){         // not i<=num because To check if a number num is not prime, you only need to check up to √num.  Because if num = a × b, then at least one of the factors a or b must be ≤ √num.i = 7 — and since 49 % 7 == 0
            if(num%i==0){
                
                return false;
            }
        }
        return true;
    }
    
    
    void printelements(int num){
        int lower=num-1,upper=num+1;
        int lowergap=0,uppergap=0;
        
        while(num>=2 && !isprime(lower)){
            lower=lower-1;
            lowergap++;
        }
        while(!isprime(upper)){
            upper++;
            uppergap++;
        }
        if(lowergap==uppergap){
            System.out.println(lower + " "+ upper);
            return;
        }
        else{
            if(lowergap<uppergap){
                System.out.println(lower);
            }
            else{
                System.out.println(upper);
            }
        }
    } 
    
}
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	printprime p =new printprime();
	
	p.printelements(n);
	}
}
