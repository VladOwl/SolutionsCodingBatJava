public class Main {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }

    public static int factorial(int n) {
        int res = 1;
        if (n >= 1) {
            res = n * factorial(n - 1);
        }
        return res;
    }
}
