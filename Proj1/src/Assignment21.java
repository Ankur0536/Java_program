class NegDimException extends Exception{
    @Override
    public String toString(){
        return "Dimension should be positive";
    }
}

interface Rectangle1{
    public void area(int a,int b) throws NegDimException;
}
//interface Triangle1{
//    public void area(int a,int b);
//}

public class Assignment21 {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1() {
            @Override
            public void area( int a, int b) throws NegDimException  {
                try {
                    if(a<0 || b<0){
                        throw new NegDimException();
                    }
                    System.out.println("Area of rectangle "+a*b);
                } catch (NegDimException e) {
                    System.out.println(e);
                }
                finally {
                    System.out.println("The final block is execute");
                }
            }
        };
//        Triangle1 t=(a,b)->a*b;
        try {
            r.area(4,-5);
        } catch (NegDimException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("Area of triangle :"+t.area(2,7));
    }

}
