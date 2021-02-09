package collectionsCalisma;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDeneme {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<String>();

        isimler.add("Osman");
        isimler.add("Filiz");
        isimler.add("Leyla");

        String [] isimlerStr = isimler.toArray(String[]::new);

        System.out.println("isimler = " + isimler);
        System.out.println("isimlerStr = " + Arrays.toString(isimlerStr));

    }
}
