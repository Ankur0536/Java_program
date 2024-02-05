class Cylinder{
    private double radius;
    private double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius=radius;
    }
    public Cylinder()
    {
        this.height=0;
        this.radius=0;
    }
    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double area(){
        return 2*Math.PI*radius*(height+radius);
    }
}


public class Assignment17 {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder(12,5);
        System.out.println("Radius of cylinder 1 is "+c1.getRadius());
        System.out.println("Height of cylinder 1 is "+c1.getHeight());
        System.out.println("Area of cylinder 1 is "+c1.area());
        System.out.println("Volume of cylinder 1 is "+c1.volume());
        System.out.println();
        Cylinder c2=new Cylinder();
        c2.setHeight(8);
        c2.setRadius(10);

        System.out.println("Radius of cylinder 2 is "+c2.getRadius());
        System.out.println("Height of cylinder 2 is "+c2.getHeight());
        System.out.println("Area of cylinder 2  is "+c2.area());
        System.out.println("Volume of cylinder 2 is "+c2.volume());
    }
}
