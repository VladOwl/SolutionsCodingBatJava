public class Main {
    public static void main(String[] args) {
        String s = "xhixhix";
        System.out.println(countHi(s));
    }

    public static int countHi(String str) {
        int cnt = 0;
        if (str.equals("hi")) return 1;
        if (str.length() <= 2) return 0;
        if (str.lastIndexOf("hi") >= 0) {
            cnt++;
        } else {
            return 0;
        }
        return countHi(str.substring(0, str.lastIndexOf("hi"))) + cnt;
    }
}
