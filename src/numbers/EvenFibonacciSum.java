public class EvenFibonacciSum {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = 2;

        int next = a + b;
        while (next <= 4_000_000) {
            if (next % 2 == 0) {
                sum += next;
            }
            a = b;
            b = next;
            next = a + b;
        }

        System.out.println(sum);
    }
}
