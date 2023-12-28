//1. Write a program to check whether a number is palindrome or not.
import java.util.*;
public class add_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,rev=0
        ,rem,orignum;
        System.out.println("enter the number:");
        num=sc.nextInt();
        orignum=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10 + rem;
            num=num/10;

        }
        if(rev==orignum){
            System.out.println("the number is palindrome.");

        }
        else{
            System.out.println("the number is not a palindrome.");
        }
        
        
    }
    
}
