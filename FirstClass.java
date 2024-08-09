import java.util.*;

public class FirstClass{
    /**
     * @param args
     */
    public static void main(String args[]){
        
        // System.out.println("Hello World"); // to print the next line in separate line
        // System.out.print("Hello World \n");
        // System.out.print("Hello World");

        // try (// input
        // Scanner sc = new Scanner (System.in)) {
        //     String Name = sc.nextLine();
        //     System.out.println(Name);
        // }

        // sum of two numbers
        try(
            Scanner num = new Scanner(System.in)){
                int a = num.nextInt();
                int b = num.nextInt();
                int Sum = a+b;
                System.out.println("Sum of +a and +b is " +Sum);
            }
    }
}