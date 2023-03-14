public class Test_02_06_01 {
    public static void main(String[] args){
        int i, j, k;
        i = j = k = 2;
        System.out.println(i + "" + j + "" + k);
    }
}

// Thank you for sharing your code with me. I think your code does not work because you are trying to assign
// multiple variables in one statement. According to 1, Java permits the use of multiple assignments in one statement,
// but the assignment operators are applied from right to left, rather than from left to right.
// This means that your statement int i = j = k = 2; is equivalent to int i = (j = (k = 2));.
// However, this is not a valid way to declare and initialize variables in Java.
// You need to declare each variable separately before assigning them values. For example, you can write: