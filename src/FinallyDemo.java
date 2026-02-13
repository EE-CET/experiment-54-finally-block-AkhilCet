import java.util.Scanner;

public class FinallyDemo {
    
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      try {
         int c = a / b;
         System.out.println("Result: " + c);
      } 
      catch (ArithmeticException e) {
         System.out.println("Error: / by zero");
      }
      finally {
         System.out.println("Finally block executed");
      }
      

      input.close();
   }
    }
}
