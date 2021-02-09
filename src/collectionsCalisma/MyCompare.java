package collectionsCalisma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class MyCompare {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1,"Osman",39));
        students.add(new Student(5,"Osman",55));
        students.add(new Student(5,"Osma",55));
        students.add(new Student(2,"Arife",24));
        students.add(new Student(3,"Leyla",5));
        students.add(new Student(4,"Leyla",6));
        students.add(new Student(4,"Leyla",7));
        students.add(new Student(3,"Leyla",8));
        students.add(new Student(4,"Filiz",19));
        students.add(new Student(5,"Yusuf",2));

        //students.forEach(s->System.out.println(s.toString()));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        students.forEach(Student::topla);



    }
}

class Student  {

    int id;
    String name;
    int age;

    public static void topla(Object number){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

