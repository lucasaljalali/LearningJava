public class Exercise5 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            System.out.println("num = " + num);
        }

        msg("This is a test", 5);
        System.out.println(sum2(10, 20));
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(1.5, 2.5, 3.5, 4.5, 5.5));
    }

    public static int sum(int... numbers) {
        int res = 0;
        for (int n : numbers) {
            res += n;
        }
        return res;
    }

    public static Double sum(Double... numbers) {
        Double res = 0.0;
        for (Double n : numbers) {
            res += n;
        }
        return res;
    }

    public static int sum2(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public static void msg(String m, int l) {
        for (int i = 0; i < l; i++) {
            System.out.println(m);
        }
    }
}
