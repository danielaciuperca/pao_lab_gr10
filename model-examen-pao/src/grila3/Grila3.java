package grila3;

public class Grila3 {
    public static void main(String[] args) {
        String s = "abcbd";
        String t = "Programare";
        int p = t.indexOf(s.charAt(0));
        t = t.substring(0, p) + t.substring(p+1);
        System.out.println(t);
    }
}
