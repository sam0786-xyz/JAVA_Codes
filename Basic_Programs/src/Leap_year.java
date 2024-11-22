import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.print("Please enter a year: ");
        Scanner input = new Scanner(System.in);
        int yr = input.nextInt();
        if (yr % 4 == 0 || yr % 400 == 0) {
            System.out.println(yr + " is a Leap Year.");
        } else {
            System.out.println(yr + " is not a Leap Year.");
        }
    }
}