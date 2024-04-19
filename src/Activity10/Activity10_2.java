package Activity10;

class C{
    public void Print(){
        System.out.println("C is the Parent Class to all A, B, D");
    }
}

class A extends C{
    public void Print(){
        System.out.println("A has Single Inhertence with C and shares Hierarchy with B");
    }
}

class B extends C{
    public void Print(){
        System.out.println("B has Single Inhertence with C and shares Hierarchy with A");
    }
}

class D extends A{
    public void Print(){
        System.out.println("D has Single Inhertence with A and Multi-Level inheritence with C");
    }
}
public class Activity10_2 {
    public static void main(String args[]){
        A w = new A();
        B x = new B();
        C y = new C();
        D z = new D();
        
        y.Print();
        w.Print();
        x.Print();
        z.Print();
    }
}
