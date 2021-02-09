package calismalar;


import java.util.*;

public class StringEqualsDeneme {


    public static void main(String[] args) {


        Comparator<Student2> compareByName = Comparator.comparing(o->o.name);
        Comparator<Student2> compareByAge = Comparator.comparing(o->o.age);
        Comparator<Student2> compareByNameThenAge = compareByName.thenComparing(compareByAge);

        Comparator<Student2> compareByNameReverse = (o1, o2) -> o1.name.compareTo(o2.name)*-1;
        Comparator<Student2> compareByAgeReverse = (o1, o2) -> Integer.compare(o1.age,o2.age)*-1;
        Comparator<Student2> compareNameReversedThenAge = compareByNameReverse.thenComparing(compareByAge);
        Comparator<Student2> compareAgeReversedThenName = compareByAgeReverse.thenComparing(compareByName);




        List<Student2> arrayList = new ArrayList<Student2>();
        arrayList.add(new Student2("Osman",32));
        arrayList.add(new Student2("Osman",33));
        arrayList.add(new Student2("Ali",33));
        arrayList.add(new Student2("Ali",23));
        arrayList.add(new Student2("Ahmet",42));
        arrayList.add(new Student2("Zeki",4));



        arrayList.sort(compareAgeReversedThenName);
        arrayList.forEach(System.out::println);


        TreeSet<Student2> treeSet = new TreeSet<>(compareByAge);

        treeSet.add(new Student2("Osman",39));
        treeSet.add(new Student2("Osman",34));
        treeSet.add(new Student2("Osman",34));
        treeSet.add(new Student2("Arife",34));
        treeSet.add(new Student2("Meltem",25));
        treeSet.add(new Student2("Olcay",123));

        System.out.println("treeSet = " + treeSet);

    }

}

 class Student2 implements Comparable<Student2>{

    public static final Comparator<Student2> NAME_COMPARATOR = Comparator.comparing(o->o.name);

    String name;
    int age;
    Student2 (String name,int age) {
         this.name=name;
         this.age=age;
     }




     @Override
     public String toString() {
         return "Student2{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }

     @Override
     public int compareTo(Student2 o) {

         return this.name.compareTo(o.name);
     }
 }
