public class ArrayPeakElementFinder {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 4, 4, 2};

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    System.out.println("Peak: " + arr[i]);
                }

            } else if (i == arr.length - 1) {
                if (arr[i] >= arr[i - 1]) {
                    System.out.println("Peak: " + arr[i]);
                }

            } else {
                if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }
        }
    }
}