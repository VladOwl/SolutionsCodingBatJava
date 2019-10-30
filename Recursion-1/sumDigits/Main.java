public class Main {
    public static void main(String[] args) {
        int num = 126;
        System.out.println(sumDigits(num));
    }

    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return sumDigits(n / 10) + n % 10;
    }
}
