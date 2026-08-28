public class IntegerRightTriangleMaximizer {
    public static void main(String[] args) {

        int[] solutions = new int[501];

        for (int a = 1; a <= 250; a++) {

            for (int b = a; b <= 250; b++) {

                double c = Math.sqrt(a * a + b * b);

                if (c == (int) c) {

                    int perimeter = a + b + (int) c;

                    if (perimeter <= 500) {
                        solutions[perimeter]++;
                    }
                }
            }
        }

        int maxSolutions = 0;
        int bestPerimeter = 0;

        for (int p = 1; p <= 500; p++) {

            if (solutions[p] > maxSolutions) {
                maxSolutions = solutions[p];
                bestPerimeter = p;
            }
        }

        System.out.println("Best perimeter: " + bestPerimeter);
        System.out.println("Number of solutions: " + maxSolutions);
    }
}