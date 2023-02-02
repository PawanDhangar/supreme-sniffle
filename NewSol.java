import java.util.Scanner;

public class NewSol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;

        for (i = n; i > 0; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(0);
            }
            System.out.print("*");

            for (j = i - 1; j > 0; j--) {
                System.out.print(0);
            }
            System.out.print("*");

            for (j = i - 1; j > 0; j--) {
                System.out.print(0);
            }
            System.out.print("*");

            for (j = 1; j <= n - i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }

    }

}
