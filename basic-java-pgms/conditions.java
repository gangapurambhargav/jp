import java.util.Scanner;
public class conditions{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();

      if(age>18){
         System.out.println("Adult, You can vote");
      }
      else{
         System.out.println("Child, You cannot vote");
      }
   }
}