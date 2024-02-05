import java.awt.*;

class Rectangle{
    public double len;
    public double bre;
  public double area(){
      return len*bre;
    }
    public double perimeter(){
      return 2*(len+bre);
    }

    public double getBre() {
        return bre;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public void setBre(double bre) {
        this.bre = bre;
    }

    public boolean isSquare()
    {
        return len==bre;
    }

    public Rectangle(double bre,double len) {
        this.len=len;
        this.bre = bre;
    }
}

public class Assignment16 {

    public static void main(String[] args) {
        Rectangle r=new Rectangle(6,4);

        System.out.println("Area of rectangle "+r.area());
        System.out.println("Perimeter of rectangle "+r.perimeter());
        if(r.isSquare())
        {
            System.out.println("It is square");
        }
        else
        {
            System.out.println("It is not a square");
        }

        Rectangle r1=new Rectangle(6,6);

        System.out.println("Area of rectangle "+r1.area());
        System.out.println("Perimeter of rectangle "+r1.perimeter());
        if(r1.isSquare())
        {
            System.out.println("It is square");
        }
        else
        {
            System.out.println("It is not a square");
        }
    }
}
