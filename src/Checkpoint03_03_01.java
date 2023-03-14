import java.util.Scanner;

public class Checkpoint03_03_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for y: ");
        int y = input.nextInt();
        int x = 0;

        if(y > 0) {
            x = 1;
        }
    System.out.println("x = " + x);
    }
}


/*
In this program, the Scanner is used to read in an integer value for y.
Then, the if statement checks if y is greater than 0, and assigns 1 to x if it is.
Finally, the value of x is printed to the console. When you run this program,
it will prompt you to enter a value for y, and then it will print out
the value of x based on the input you provided*/
