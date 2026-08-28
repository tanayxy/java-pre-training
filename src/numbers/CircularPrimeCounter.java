public class CircularPrimeCounter {

    public static void main(String[] args) {

        int limit = 100;
        boolean[] prime = new boolean[limit];

        for (int i = 2; i < limit; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < limit; i++) {

            if (prime[i]) {

                for (int j = i * i; j < limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int number = 2; number < 100; number++) {

            if (!prime[number]) {
                continue;
            }

            int temp = number;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            int divisor = 1;

            for (int i = 1; i < digits; i++) {
                divisor *= 10;
            }

            boolean circular = true;
            int rotation = number;

            for (int i = 0; i < digits; i++) {

                if (!prime[rotation]) {
                    circular = false;
                    break;
                }

                int lastDigit = rotation % 10;
                rotation = lastDigit * divisor + rotation / 10;
            }

            if (circular) {
                System.out.println("Circular prime: " + number);
                count++;
            }
        }

        System.out.println("Total circular primes below 100: " + count);
    }
}