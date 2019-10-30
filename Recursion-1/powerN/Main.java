public class Main {
    public static void main(String[] args) {
        int b = 3, num = 3;
        System.out.println(powerN(b, num));
    }

    public static int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }
}
