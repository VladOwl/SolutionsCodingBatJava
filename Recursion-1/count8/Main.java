public class Main {
    public static void main(String[] args) {
        int num = 8818;
        System.out.println(count8(num));
    }

    public static int count8(int n) {
        int cnt = 0;
        if (n == 0) return 0;
        if (n % 10 == 8) {
            if ( (n / 10) % 10 == 8) {
                cnt += 2;
            } else {
                cnt++;
            }
        }
        return count8(n/10) + cnt;
    }
}
