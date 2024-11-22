import java.util.Scanner;

public class Sum2num {
    public static void main(String[] args) {
        System.out.print("Please enter num1: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Please enter num2: ");
        int num2 = input.nextInt();

        System.out.println("The sum is " + (num1 + num2));
    }
}