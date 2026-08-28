public class StrictPandigitalArrayValidator {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean[] seen = new boolean[10];
        boolean valid = true;

        if (arr.length != 9) {
            valid = false;
        } else {

            for (int i = 0; i < arr.length; i++) {

                int value = arr[i];

                if (value < 1 || value > 9 || seen[value]) {
                    valid = false;
                    break;
                }

                seen[value] = true;
            }
        }

        if (valid) {
            System.out.println("Valid: Contains every digit from 1 to 9 exactly once.");
        } else {
            System.out.println("Invalid array.");
        }
    }
}