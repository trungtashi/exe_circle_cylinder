public class Cylinder extends Circle {
    double height;
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    protected double getAround(){
        return (this.getPeri()*height);
    }
    protected double getV(){
        return (this.getArea()*height);
    }
    protected double getSall(){
        return 2*this.getArea()+this.getAround();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
