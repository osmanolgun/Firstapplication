package calismalar;

import java.util.EnumSet;

import java.util.Objects;
class X{

}

 enum DAY {


    ONE (1,"asdadsasdas",new X()),
    TWO (1,"asdadsasdas",new X()),
    THREE (1,"asdadsasdas",new X());

    private  int number;
    private  String pattern;

     DAY(int a, String b, X x){
         number = a;
         pattern = b;
     }

     public int getNumber() {
         return number;
     }

     public String getPattern() {
         return pattern;
     }
 }

public class HashDeneme {

    public static void main(String[] args) {

       Student s1 = new Student("Osman",38,"lajlfkajldfjalsdjlajdfl","computer engineer");
       Student s2 = new Student("Osman",39,"lajlfkajldfjalsdjlajdf","computer enginee");

       Student s3 = new Student("John Smith",88,"jalsdjf laskjdf lasjkdf laskjdf lasdjkf lasjdf lasjdfl","nurse");

        System.out.println("Objects.hashCode(s1) = " + Objects.hashCode(s1));
        System.out.println("Objects.hashCode(s2) = " + Objects.hashCode(s2));
        System.out.println("Objects.hashCode(s3) = " + Objects.hashCode(s3));

        System.out.println("--------------------------------");

        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s3.hashCode() = " + s3.hashCode());
        System.out.printf("%s\t%s\t%s",DAY.ONE, DAY.ONE.getNumber(), DAY.ONE.getPattern());

        for(DAY d : DAY.values()) {
            System.out.println(d);

        }
        System.out.println();
        for(DAY d : EnumSet.range(DAY.TWO,DAY.THREE)) {

            System.out.println(d);
        }

    }

    public static <T> T osman (T... t){
        T r = null;

        for(T x : t) {
            r = x;
        }
        return r;
    }

}


class Student  {
    String name;
    int age;
    String address;
    String job;

    public Student(String name, int age, String address, String job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }


}

