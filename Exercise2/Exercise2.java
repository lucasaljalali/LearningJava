import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int n1 = 0, n2 = 0, res = 0;

            System.out.println("Type a integer: ");
            n1 = scan.nextInt();

            System.out.println("Type another integer: ");
            n2 = scan.nextInt();

            res = n1 + n2;

            System.out.printf("Sum of %d with %d is equal to: %d\n", n1, n2, res);
        }

        System.out.println("end of the program");

    }
}
