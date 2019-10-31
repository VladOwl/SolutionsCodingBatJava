public class Main {
    public static void main(String[] args) {
        String s = "xhixhix";
        System.out.println(countX(s));
    }

    public static int countX(String str) {
        int cnt = 0;
        if (str.length() == 0) return 0;
        if (str.equals("x")) return 1;
        if (str.charAt(str.length() - 1) == 'x') cnt++;
        return countX(str.substring(0, str.length() - 1)) + cnt;
    }
}
