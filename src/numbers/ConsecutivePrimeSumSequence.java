public class ConsecutivePrimeSumSequence {
    public static void main(String[] args) {

        int[] primes = new int[30];
        int primeCount = 0;

        for (int number = 2; number < 100; number++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[primeCount] = number;
                primeCount++;
            }
        }

        int maxLength = 0;
        int bestSum = 0;

        for (int i = 0; i < primeCount; i++) {

            int sum = 0;

            for (int j = i; j < primeCount; j++) {

                sum += primes[j];

                if (sum >= 100) {
                    break;
                }

                boolean isPrime = false;

                for (int k = 0; k < primeCount; k++) {
                    if (primes[k] == sum) {
                        isPrime = true;
                        break;
                    }
                }

                int length = j - i + 1;

                if (isPrime && length > maxLength) {
                    maxLength = length;
                    bestSum = sum;
                }
            }
        }

        System.out.println("Prime: " + bestSum);
        System.out.println("Sequence length: " + maxLength);
    }
}