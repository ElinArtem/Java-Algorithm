public class RecursiveFactorial {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        RecursiveFactorial factorial = new RecursiveFactorial();
        System.out.println(factorial.factorial(20));
    }
}
