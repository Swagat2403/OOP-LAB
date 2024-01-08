//3. Write a Java program to multiply and divide a number by 2 using bitwise operator
import java.util.*;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int multiply;
        int divide;
        multiply=num<<1;//left shift
        divide=num>>1;//right shift
        System.out.println("number multiplied by 2 is "+multiply);
        System.out.println("number divided by 2 is "+ divide);
    }
    
}
