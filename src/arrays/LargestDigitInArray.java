public class LargestDigitInArray {
    public static void main(String[] args) {

        int[] arr = {123, 456, 789, 234};
        int maxDigit = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            while (num > 0) {
                int digit = num % 10;

                if (digit > maxDigit) {
                    maxDigit = digit;
                }

                num = num / 10;
            }
        }

        System.out.println("Largest single digit: " + maxDigit);
    }
}