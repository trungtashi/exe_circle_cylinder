import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3,5);
        System.out.println(cylinder.getAround());
        System.out.println(cylinder.getV());
        System.out.println(circle.getPeri());
    }
}
