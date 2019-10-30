public class Main {
    public static void main(String[] args) {
        int num = 717;
        System.out.println(count7(num));
    }

    public static int count7(int n) {
        int cnt = 0;
        if (n == 0) return 0;
        if (n % 10 == 7) cnt++;
        return count7(n/10) + cnt;
    }
}
