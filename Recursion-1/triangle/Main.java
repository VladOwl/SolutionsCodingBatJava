public class Main {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(triangle(num));
    }

    public static int triangle(int rows) {
        if (rows == 0) return 0;
        if (rows == 1) return 1;
        if (rows == 2) return 3;
        return triangle(rows - 1) + rows;
    }
}
