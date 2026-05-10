
class A {
    public int x = 10;
}

class B extends A {

    public int x = 20;

    public void show() {
        System.out.println("Value of x in class B: " + x);
        System.out.println("Value of x in class A: " + super.x);
    }
}

public class super_data_member {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}