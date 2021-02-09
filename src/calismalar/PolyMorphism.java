package calismalar;
import java.util.Objects;

public class PolyMorphism {
    public static void main(String[] args) {

        Parent o = new Child();

        o.parentMethod();
        Parent.staticParentMethod();
        Objects.hash(o,4,5);






        Child c = new Child();



        System.out.println("c.numberChild = " + c.numberChild);
        System.out.println("c.numberParent = " + c.numberParent);
        c.childMethod();
        c.parentMethod();
        Child.staticParentMethod();
        Child.staticChildMethod();

        c = (Child) o;




    }
}

class Parent{



    public static void staticParentMethod(){
        System.out.println("staticParentMethod PARENT");
    }

    int numberParent = 99;
    static int numberStaticParent =88;
    public void parentMethod(){
        System.out.println("Parent class Parent method");


    }
}

class Child extends Parent{
    int numberChild = 10;
    static int numberStaticChild =88;
    public static void staticChildMethod(){
        System.out.println("staticChildMethod CHILD");
    }

    public static void staticParentMethod(){
        System.out.println("staticParentMethod CHILD");
    }
    public void childMethod(){
        System.out.println("Child class Child Method ");

    }

    public void parentMethod(){
        System.out.println("Child class Parent method");
    }

}