public class RecursiveFibonacci {

    public int fibonacci(int index) { // Change return type to int
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return (fibonacci(index - 1) + fibonacci(index - 2));
        }
    }

    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        int index = 45; // Example index
        System.out.println("Fibonacci number at index " + index + " is: " + rf.fibonacci(index));
    }
}
