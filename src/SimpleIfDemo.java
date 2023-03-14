import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();                // enter input

        if (number % 5 == 0)                        // check 5 , divisible by 5
            System.out.println("HiFive");

        if (number % 2 == 0)                        // check even , divisible by 2
            System.out.println("HiEven");
        }
    }

