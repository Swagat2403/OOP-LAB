//3. Write a Java program to print table of number entered by user .
import java.util.*;

public class add_table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int i,num;
        System.out.println("enter the number you want table of :");
        num=sc.nextInt();
        System.out.println("Table of "+ num + "is :");
        for(i=1;i<=10;i++){
            System.out.println(num +"*" +i +"=" +num*i);
        }
        

        
    }
    
}
