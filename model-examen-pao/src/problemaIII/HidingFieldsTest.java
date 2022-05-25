package problemaIII;

class A {
    public int x = 1; // in memorie, constructorul de A creeaza un int x, x-ul lui A

    void afisare() {
        System.out.println(x);
    }
}

class B extends A {
    public int x = 2; // in memorie, constructorul de B creeaza un alt int x, x-ul lui B

    void afisare() {
        System.out.println(x);
    }
}

public class HidingFieldsTest {
    public static void main(String[] args) {
        A ob = new B();
        System.out.println(++ob.x);
        // se foloseste x-ul definit in A, pentru ca este field
        // mecanismul de invocare a metodelor suprascrise in clasa copil se intampla doar pentru metode,
        // nu si pentru fielduri
    }
}
