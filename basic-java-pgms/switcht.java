import java.util.Scanner;

public class switcht {
    public static void main(String[] args){
        System.out.println("1. Aadhar card\n , 2. Pan card\n , 3. 10th mark sheet\n , 4. Driving Licence\n , 5. RC\n , 5. Ci\n");
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();
        
        switch(button){
            case 1:
              System.out.println("aadhar card number is 1234567890"); 
                break;
            case 2:
                System.out.println("Pan card number is 1234567890");
                break;
            case 3:
                System.out.println("10 th mark sheet");
                break;
            case 4:
                System.out.println("Driving Licence number is 1234567890");
                break;
            case 5:
                System.out.println("RC ");
                break;
            default:
                System.out.println("Please enter a valid input from 1 to 6");
        }
    }
}
