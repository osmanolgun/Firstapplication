package collectionsCalisma;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        File f = new File("asd.txt");
        Stack<String> strings = new Stack<>();

        strings.push("osman");
        strings.push("Arife");
        strings.push("Yusuf");
        strings.add("yüksel");
        strings.push("Filiz");
        strings.push("Leyla");
        strings.push("Kamil");

        System.out.println("strings = " + strings);

        strings.add("hakan");

        System.out.println("strings = " + strings);


        strings.addElement("celal");
        strings.push("Filiz");

        System.out.println("strings = " + strings);

        //strings.forEach(System.out::println);
        strings.remove("Filiz");
        System.out.println("strings = " + strings);

        System.out.println("strings.search(\"osman\") = " + strings.search("celal"));




    }
    public static <T1,T2,t3> void display(T1 a,T2 b,t3 v) {

    }
}
