// 5. Create the equivalent of a four-function calculator. The program should request the
// user to enter a number, an operator, and another number. (Use floating point.) It should
// then carry out the specified arithmetic operation: adding, subtracting, multiplying, or
// dividing the two numbers. Use a switch statement to select the operation. Finally,
// display the result. When it finishes the calculation, the program should ask if the user
// wants to do another calculation. The response can be 'y' or 'n'. [Hint: use do-while
// loop]
import java.util.*;
public class calculator {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        char operator;
        char option;
        int result;
        do{
            System.out.println("enter number 1");
            num1=sc.nextInt();
            System.out.println("enter number 2");
            num2=sc.nextInt();
            System.out.println("Enter the operation to be performed:");
            operator=sc.next().charAt(0);
           
            switch(operator){
                case '+': result=num1+num2;
                System.out.println("Result :"+result);
                break;
                case '-':result =num1-num2;
                System.out.println("Result :"+result);
                break;
                case '*':result=num1*num2;
                System.out.println("Result :"+result);
                break;
                case '/':result =num1/num2;
                System.out.println("Result :"+result);
                break;
                default:System.out.println("invalid operator");

            }
          
            System.out.println("do you want to continue?(y for yes and n for no)");
            option=sc.next().charAt(0);


        }while(option=='y');

    }
}
