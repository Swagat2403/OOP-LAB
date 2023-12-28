// 2. Write a Java program to enter 10 numbers and display the number of
// positive,negative and zeros number
import java.util.*;
public class integer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,n,integer;
        int pos=0,neg=0,zero=0;

        
        System.out.println("enter number of integers");
        n= sc.nextInt();

        int arr[]= new int[n];

        System.out.println("enter the  integer");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
        if(arr[i]>0){
            pos++;

        }
        else if(arr[i]<0){
            neg++;
        }
        else{
            zero++;

        }
    }
    System.out.println("the number of positive integers :"+ pos);
    System.out.println("the number of negative integers :"+ neg);
    System.out.println("the number of zeros :"+ zero);




        
    }
    
}
