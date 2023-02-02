import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum_of_even = 0, Sum_of_odd = 0;
        while (n > 0) {
            int last_digit = n % 10;

            if (last_digit % 2 == 0) {
                Sum_of_even += last_digit;
            } else {
                Sum_of_odd += last_digit;
            }
            n = n / 10;
        }
        System.out.println(Sum_of_even + "" + Sum_of_odd);
    }
}
