package threads;

public class C {
    public static void main(String[] args) {
        A objectA = new B(); // -> orice B este A
        objectA.methodA("test");
        //objectA.methodB("test"); -> pot sa dereferentiez doar elemente din A, pentru ca A este tipul referintei

        B objectB = (B) objectA;
        objectB.methodB("test2");

        B objectB2 = new B();
        objectB2.methodB("test3");

        // B objectB3 = new A(); -> nu orice A este B
    }
}
