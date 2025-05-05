
		class print{
		static class spaceprint{
		    
		 static void printspace(int j){
		    if(j==0){
		      
		       return ;
		       
		    }
		      System.out.print(" ");
		    
		    printspace(j-1);   // j-- wrong it gives stack StackOverflowError
		}
		
		static void printstar(int k){
		    if(k==0){
		        return;
		    }
		    System.out.print("*");
		    printstar(k-1);
		}
		
		}
		}
		
public class Main
{
	public static void main(String[] args) {
		int n=8;
		int j=n;

		
		for(int i=0;i<n;i++){
          j=n-i-1;
          
      print.spaceprint.printspace(j);
      
         int k=i+1;
     print.spaceprint.printstar(k);
          System.out.println();
       
          
		}
	}
}

