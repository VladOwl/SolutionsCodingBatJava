public class Main {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(bunnyEars(num));
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies == 1) return 2;
        return 2 + bunnyEars(bunnies - 1);
    }
}
