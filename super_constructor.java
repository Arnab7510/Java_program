class A {
    A() {
        System.out.println("Burdwan");
    }
}
class B extends A {
    B() {
        super();
    }
}
public class super_constructor {
    public static void main(String[] args) {
        B obj = new B();
    }
}
