package grila2;

public class Grila2 {

    void test(){
        try{
            met(); }
        catch (NullPointerException ex){
            System.out.print("NPE ");
        }
        catch (Exception ex){
            System.out.print("EX ");
        }
        finally{
            System.out.print("FIN ");
        }
        System.out.println("END");
    }

    void met() {
        throw new IllegalArgumentException();
    }
}

class Test {
    public static void main(String[] args) {
        new Grila2().test();
    }
}
