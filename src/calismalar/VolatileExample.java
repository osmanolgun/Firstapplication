package calismalar;

import java.util.ArrayList;

public class VolatileExample {

    //volatile 'de thread olsa bile main memory de sadece 1 tane class veya field oluyor ve tüm thredler buna ortak ulaşabiliyor.
    //Class'ın static değişkenleri gibi. Objelerin ortak ulaşabildikleri değişken gibi.
    // aşağıdaki yapı tipik bir singleton design yapısıdır.

    private static volatile VolatileExample instance = new VolatileExample();

    private VolatileExample(){

    }

    public static VolatileExample getInstance(){
        return instance;
    }

}
class deneme{
    public static void main(String[] args) {
    }
}
