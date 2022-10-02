package Exercise9;

import java.util.Scanner;

public class Calc {

    static public void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            Number n1 = new Number();
            Number n2 = new Number();
            Number res = new Number();
            String opt = "S";

            while (opt.equals("S") || opt.equals("s")) {
                System.out.printf("%nType the first value: ");
                n1.setValue(scan.nextInt());

                System.out.printf("%nType the second value: ");
                n2.setValue(scan.nextInt());

                res.setValue(n1.getValue() + n2.getValue());
                System.out.printf("%nThe sum of %d and %d is equal to %d", n1.getValue(), n2.getValue(),
                        res.getValue());

                System.out.printf("%nDo you want to sum again?");
                opt = scan.next();
                System.out.printf("%n%n");
            }
        }
    }
}
