import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        //scanner for collect user input
        Scanner s = new Scanner(System.in);

        System.out.println("Please input a number");
        int number = s.nextInt();// pause

        if(number % 2 == 1){
            System.out.println( number + " is an odd number");
        } else {
            System.out.println( number + " is an even number");
        }

        



    }
}
