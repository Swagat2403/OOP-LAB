//2. Write a Java programs to print factorial of a given no.
import java.util.*;


public class add_factorial {
    public int  fact(int n){
    
        while(n>=0){
            if(n==1||n==0){
                return 1;
            }
            else{
                return n*fact(n-1);
                
                
            }
        }
        return -1;

        
    }
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num,factorial;
        System.out.println("enter the number for the factorial:");
        num =sc.nextInt();
       add_factorial obj = new add_factorial();
       factorial= obj.fact(num);
       
       
       System.out.println("factorial of "+ num +"is"+ factorial);

    }
    
}
