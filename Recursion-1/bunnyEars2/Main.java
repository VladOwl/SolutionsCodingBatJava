public class Main {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(bunnyEars2(num));
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies == 1) return 2;
        if (bunnies == 2) return 5;
        if (bunnies % 2 == 0) return bunnyEars2(bunnies - 1) + 3;
        return bunnyEars2(bunnies - 1) + 2;
    }
}
