public class Main {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
