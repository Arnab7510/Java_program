class area{
    int r;
    area(int x){
        r = x;
    }
    void area_of_circle(){
        final double pi = 3.14; 
        double area = pi * r * r;
        System.out.println("Area of circle: " + area);
    }
}



public class final_as_variable {
    public static void main(String[] args) {
        area a = new area(5);
        a.area_of_circle();
    }
}
