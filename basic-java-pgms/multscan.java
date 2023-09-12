import java.util.Scanner;

public class multscan{
    public static void main(String[] args){
        Scanner finput = new Scanner(System.in);
        Scanner linput = new Scanner(System.in);
        String firstname = finput.next();
        String lastname = linput.next();
        System.out.println("Hello  "+firstname+" "+lastname);
    }
}