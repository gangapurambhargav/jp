import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the operation to be performed");
        System.out.println("1. Addition\n , 2. Subtraction\n , 3. Multiplication\n , 4. divide\n , 5. divisor\n , 6. exit");
        int button = sc.nextInt();
        
        switch(button){
            case 1:
              System.out.println("Addition of two numbers is "+(a+b)); 
                break;
            case 2:
                System.out.println("Subtraction of two numbers is "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is "+(a*b));
                break;
            case 4:
                System.out.println("Division of two numbers is "+(a/b));
                break;
            case 5:
                System.out.println("Divisor of two numbers is "+(a%b));
                break;
            default:
                System.out.println("Please enter a valid input from 1 to 6");
        }
    }
}
