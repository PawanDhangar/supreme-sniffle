import java.util.Scanner;

public class Factors {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // for (int i = 2; i < n; i++) {
    // if (n % i == 0) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    public static int printFactorsInt(int number) {

        if (number < 1) {
            return -1;
        }

        int factor = 0;

        for (int i = 2; i < number; i++) {

            if ((number % i) == 0) {
                factor = i;
                System.out.print(factor + " ");
            }
        }

        return factor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printFactorsInt(number);
    }
}
