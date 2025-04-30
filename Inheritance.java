// simple Inheritance
/* class A{
    public void PrintA(){
        System.out.println("A");
    }
}
class B extends A{
    public void PrintB(){
        System.out.println("B");
    }
}
public class TestInheritence {
    public static void main(String[] args) {
        B sc = new B();
        sc.PrintA();
        sc.PrintB();
    }
}
*/ //till here code of simple inheritance

// Multi-level Inheritance

/*
class A{
    public void printA(){
        System.out.println("A");
    }
}
class B extends A{
    public void printB(){
        System.out.println("B");
    }
}
class C extends B{
    public void printc(){
        System.out.println("C");
    }
}
class D extends C{
    public void printD(){
        System.out.println("D");
    }
}
public class TestInheritence {
    public static void main(String[] args) {
        D sc=new D();
        sc.printA();
        sc.printB();
        sc.printc();
        sc.printD();
    }
}
*/ // till here code of Multi-Inheritance

// Multiple Inheritance(java does not support multiple inheritance but we can do with interface )

/*
interface Coder{
    void writeCode();
}
interface Tester{
    void testCode();
}
interface jdbc{
    void connect();
}
class DevOps implements  Coder ,Tester,jdbc{
    @Override
    public void writeCode(){
        System.out.println("i am writing code of Web Application");
    }
    @Override
    public void testCode(){
        System.out.println("i am testing of Web Application");
    }

    @Override
    public void connect(){
        System.out.println("it connection with jdbc in spring");
    }
}

public class TestInheritence {
    public static void main(String[] args) {

        DevOps sc=new DevOps();
        sc.testCode();
        sc.writeCode();
        sc.connect();

    }
}
*/