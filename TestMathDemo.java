public class TestMathDemo {

    public static void main(String[] args) {

        // just for testing the MathDemo class methods!
        System.out.println("Min: " + MathDemo.min(5, 3));
        System.out.println("Max: " + MathDemo.max(5, 3));

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Sum: " + MathDemo.sum(numbers));
        System.out.println("Mean: " + MathDemo.mean(numbers));

        System.out.println("Factorial (5): " + MathDemo.factorial(5));

    }
}