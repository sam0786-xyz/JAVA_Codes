import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] arg) {
        System.out.print("Enter a number for which you want Multiplication Table: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int flg = 0;
        while (flg != 10) {
            System.out.println(num + " * " + flg + " = " + (num * flg));
            flg++;
        }
    }
}