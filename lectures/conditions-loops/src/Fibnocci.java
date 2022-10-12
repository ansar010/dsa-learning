public class Fibnocci {
    public static void main(String[] args) {
        int n = 19;
        int result = find_Nth_Fibonacci(n);


        System.out.printf("Fibonacci of %d is:%d", n, result);
    }

    private static int find_Nth_Fibonacci(int n) {
        if (n == 1)
            return n;
        int firstNumber = 0, secondNumber = 1, nextNumber = 0;
        for (int i = 2; i <= n; i++) {
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        return nextNumber;
    }
}
