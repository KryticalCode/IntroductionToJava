import java.util.Scanner;

public class IncreasePay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score = input.nextDouble();
        double pay = 750.00; // initial pay
        if(score > 90) {
            pay *= 1.03; // increase pay by 3%
        }
        System.out.println("New pay: $" + pay );


        // below is used if I wanted the answer to show two decimal points instead of one
        // e.g. 772.5 > 772.50

    /*    String payFormatted = String.format("%.2f", pay);
        System.out.println("New pay: $" + payFormatted);*/

    }
}

/*
        In this program, the pay variable is initialized to 750.0 instead of 0.0 or 1000.0 as in the
        previous examples. Then, the if statement checks if score is greater than 90, and if it is,
        it increases the value of pay by 3% using the compound assignment operator *=.
        Finally, the new value of pay is printed to the console. When you run this program,
        it will prompt you to enter a value for score, and then it will print out the new
        value of pay based on the input you provided, potentially increased by 3%
        if the score is greater than 90.*/
