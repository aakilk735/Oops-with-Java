// Method Overloading
class TestPlymorphism{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double c,double d){
        return c*d;
    }
}
public class Overloading{
    public static void main(String[] args) {
        TestPlymorphism sc=new TestPlymorphism();
        System.out.println(sc.add(5,3));
        System.out.println(sc.add(5.0,6.0));
    }
}
