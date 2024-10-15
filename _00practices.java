import java.util.Scanner;

public class _00practices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int n = sc.nextInt();
        int rem;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            System.out.println(rem);
        }
    }
}
