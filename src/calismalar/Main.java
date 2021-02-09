package calismalar;

import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    private static int a;
    public final double PI;

    public Main(double pi) {
        PI = pi;
    }

    public static void main(String[] args) {

        double[] q =new double[1];
        a=12;
        osman();
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 23*12);
        System.out.printf("%b%n", "random text");
        System.out.println("selam");

        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000);;

        Consumer<Integer> squareAreaCalculator = arg->System.out.println(arg*arg);
        squareAreaCalculator.accept(13);


        Supplier<Integer> randomNumber= () -> new Random().nextInt(100)+1;
        System.out.println("randomNumber.get() = " + randomNumber.get());


        Function<String,Integer> lengthGetter = myString -> myString.length();
        System.out.println("lengthGetter.apply(\"Osman\") = " + lengthGetter.apply("Osman"));
    }
    public static void osman(){
     a=123;
    }
}
