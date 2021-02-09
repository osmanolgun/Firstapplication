package calismalar;

import collectionsCalisma.ArrayListDeneme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MyAnonymous {

    public static void main(String[] args) {

        // burada s nesnesi Sample interface'ini implement eden bir classı işaret eder. Class Anonymous olarak oluşturulur
        // s referansı ile ulaşılabilir. Bu class LAMBDA ile de oluşturulabilir.

        Sample s = new Sample() {
            @Override
            public void methodSample() {
                System.out.println("Hello from methodSample");

            }
        };

        s.methodSample();
        exampleMethod(s);

        ArrayList<Ogrenci> ogrencis = new ArrayList<>();

        ogrencis.add(new Ogrenci());
        ogrencis.add(new Ogrenci());
        ogrencis.add(new Ogrenci());
        ogrencis.add(new Ogrenci());

        Collections.sort(ogrencis, new Comparator<Ogrenci>() {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) {
                return Integer.compare(o1.age,o2.age);
            }
        });

    }
    public static void exampleMethod(Sample sample){
        System.out.println("example method");
    }
}

interface Sample{
    public void methodSample();
}

class Ogrenci  {
    String name;
    int age;

}
