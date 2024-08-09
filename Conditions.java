import java.util.*;
public class Conditions {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int age = sc.nextInt();
            if(age>=18){
                System.out.println("You are an adult");
            }
            else{
                System.out.println("You are not an adult");
            }
            switch(age){
                case 1: System.out.println("Hello");
                break;
                case 2: System.out.println("Namaste");
                break;
                default: System.out.println("Cha haal aa");
            }
        }
    }
}
