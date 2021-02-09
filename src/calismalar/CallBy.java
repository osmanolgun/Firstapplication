package calismalar;

import java.util.ArrayList;

public class CallBy {

    public static void main(String[] args) {
        String str = new String("Arife");
        System.out.println(str);
        add(str);
        System.out.println(str);

        System.out.println("Sample5.number = " + Sample5.number);

        Sample5 sa = new Sample5();
        System.out.println("Sample5.number = " + Sample5.number);

        A a = new A();
        a.b.add(new B());

    }

    public static void add(String string) {
        string += "osman";
    }
}
class Sample5 {

    static int number= 4;
    int number2;

    Sample5(){
        number=10;
    }
}
class B {

}
class A {
    ArrayList<B> b;
}

