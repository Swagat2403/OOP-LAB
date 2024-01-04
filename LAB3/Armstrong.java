// 1. Write a program to compute whether a no . is an Armstrong number or not.Use
// any of the iteration statements
import java.util.*;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number: ");
        num =sc.nextInt();
        int rem,armstrg=0;
        int orignum=num;
        while(num>0){//(num>=0 wrong)
            rem= num%10;
            armstrg=armstrg+(rem*rem*rem);
            num= num/10;


        }
        if(armstrg==orignum){
            System.out.println("the number is a armstrong ");

        }
        else{
            System.out.println("the number is not a armstrong ");
            
        }


        
    }

}