package grila4;

class A {
    public static int f(int x) {
        return x + 1;
    }

    public int g(int x) {
        return x + 2;
    }
}

class B extends A {
    public static int f(int x) {
        return x + 4;
    }

    public int g(int x) {
        return x + 3;
    }
}

public class Grila4 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.f(1) + a.g(3));
    }
}
