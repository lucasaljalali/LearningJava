public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("First Exercise");
        System.out.print("123456\n");
        System.out.println(123456);
        System.out.printf("I am doing a: %s\nYear: %d\n", "Test of string", 2022);

        int grade = 85;
        int faults = 10;
        int maxFaults = 5;
        int average = 60;

        String res;
        res = (grade >= average ? "Approved" : "Failed");
        System.out.println("Result: " + res);

        if (grade >= average && faults <= maxFaults) {
            System.out.println("Approved");
        } else if (grade >= 40) {
            System.out.println("Recovery");
        } else {
            System.out.println("Failed");
        }
        System.out.println("End of the program");

        int pos = 4;

        switch (pos) {
            case 1:
                System.out.println("First place");
                break;
            case 2:
                System.out.println("Second place");
                break;
            case 3:
                System.out.println("Third place");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Participation award");
                break;
            default:
                System.out.println("Disqualified");
                break;
        }
    }
}