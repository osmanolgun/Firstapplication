package calismalar;

import java.util.ArrayList;

public class FinallyDeneme {

    public static void main(String[] args) {


        try {
            System.out.println("try");
            ArrayList<String> list = new ArrayList<>(1000000000);
            ArrayList<String> list2 = new ArrayList<>(1000000000);
            ArrayList<String> list3 = new ArrayList<>(1000000000);
            ArrayList<String> list4 = new ArrayList<>(1000000000);
        } catch (Throwable throwable) {
            System.out.println("catch");
            System.out.println(throwable);
            return;

        } finally {
            System.out.println("finally");
        }

        System.out.println("at the end");
    }
}
