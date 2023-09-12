import java.util.Scanner;

public class swt
{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();
        if(button=='1'){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if(button==3){
            System.out.println("Hila");
        }
        else if(button==4){
            System.out.println("Bonjour");
        }
        else if(button==5){
            System.out.println("Ciao");
        
        
        }
        else{
            System.out.println("Please enter a valid input from 1 to 6");
        }
    }
}
