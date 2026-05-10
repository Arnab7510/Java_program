class A {
    int x = 10;

    void show() {
        System.out.println("Value of x in class A: " + x);
    }
}

class B extends A {
    int x = 20;
    void show() {
        System.out.println("Value of x in class B: " + x);      
    }
}

public class super_member_function {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
