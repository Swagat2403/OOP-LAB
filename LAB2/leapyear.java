//1. Write a Java program to find whether a given year is leap or not using boolean data
//type
import java.util.*;
public class leapyear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
        int yr= sc.nextInt();
        boolean leapyr=false;

        if(yr%4==0){
            if(yr%100!=0||yr%400==0){
            leapyr=true;
            }

        }
        if(leapyr){
            System.out.println("the year is a leap year ");
        }
        else{
            System.out.println("the year is not a leap year");
        }
      
        
        
        
    }
}