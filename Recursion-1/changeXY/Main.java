public class Main {
    public static void main(String[] args) {
        String s = "codex";
        System.out.println(changeXY(s));
    }

    public static String changeXY(String str) {
        if (str.length() == 0) return "";
        int count = str.lastIndexOf("x");
        String res = "";
        if (count < 0) {
            return str;
        } else {
            res += "y" + str.substring(count + 1);
        }
        return changeXY(str.substring(0, count)) + res;
    }
}
