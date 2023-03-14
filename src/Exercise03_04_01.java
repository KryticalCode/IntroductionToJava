import java.util.Scanner;

public class Exercise03_04_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score: ");                //Ask for score
        int score = input.nextInt();                        //Store score in int 'score'
        int pay = 1000;                                     // set default pay

        if(score > 90){
            pay *= 1.3;                                     // multiply 'pay' by 3% (1.3)
        }
        else{
            pay *= 1.1;                                     // multiply 'pay' by 1% (1.1)
        }
        System.out.println("The new pay is: " + pay);       // gives the new pay
    }
}
