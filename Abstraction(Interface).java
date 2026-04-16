interface Shape {
    void draw();
}
class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("drawing rectangle");
}
}
//Main class to create object and call methods
public class AbstractionWithInterface{
    public static void main(String args[]){
        Rectangle sc =new Rectangle();
        sc.draw();
    }
}
