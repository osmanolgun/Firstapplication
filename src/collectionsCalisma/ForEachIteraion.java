package collectionsCalisma;

import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.*;
import java.util.function.Consumer;

class Ogrenci {
    String name;
    Ogrenci (String name) {
        this.name = name ;
    }

}
public class ForEachIteraion {
    public static void main(String[] args) {

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();


        LinkedList<String> strings = new LinkedList<>();
        strings.add("asfasdf");
        strings.add("asfasdf");
        strings.add("asfasdf");
        strings.add("asfasdf");
        strings.add("asfasdf");
        strings.add("asfasdf");
        strings.add("asfasdf");




        ogrenciler.add(new Ogrenci("Osman"));
        ogrenciler.add(new Ogrenci("Arife"));
        ogrenciler.add(new Ogrenci("Leyla"));
        ogrenciler.add(new Ogrenci("Filiz"));
        ogrenciler.add(new Ogrenci("Yusuf"));
        ogrenciler.add(new Ogrenci("Kamil"));



        for (Ogrenci ogr: ogrenciler) {
            System.out.println(ogr.name);

        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,2);
        hashMap.put(3,4);
        hashMap.put(4,7);
        hashMap.put(5,8);
        hashMap.put(6,9);

        hashMap.forEach((a,b) -> {
            System.out.println(a +" " +b);
        });

        hashMap.keySet().forEach(k->{
            System.out.println(k);
        });


        hashMap.values().forEach(l-> System.out.println(l));

    }
}
