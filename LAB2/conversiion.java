//Write a Java program to read an int number, double number and a char from keyboard
// and perform the following conversions:- int to byte, char to int, double to byte, double
// to int
import java.util.*;
public class conversiion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int intnum;
        double doublenum;
        char charnum;
        System.out.println("enter a integer");
        intnum=sc.nextInt();
        System.out.println("enter a double number");
        doublenum=sc.nextDouble();
        System.out.println("enter a character");
        charnum=sc.next().charAt(0);

        byte byteFromInt=(byte)intnum;
        int intFromChar=(int)charnum;
        byte byteFromDouble=(byte)doublenum;
        int intFromDouble=(int)doublenum;
        System.out.println("int to byte:" + byteFromInt);
        System.out.println("char to int :"+ intFromChar);
        System.out.println("double to byte :"+ byteFromDouble);
        System.out.println("double to int :"+ intFromDouble);
        



    }
    
}
