package cap3;

/**
 * Learning
 */
class Person {
    public String name;
    public String location;

    Person(String name) {
        this.name = name;
        location = "beijing";
    }

    Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String info() {
        return "name:" + name + " location:" + location;
    }
}

class Student extends Person {
    public String school;

    Student(String name, String school) {

        this(name, "beijing", school);
    }

    Student(String n, String l, String s) {
        super(n, l);
        this.school = s;

    }

    public String info() {
        return super.info() + " school: " + school;
    }

}

class Teacher extends Person {
    public String capital;

    Teacher(String name, String capital) {
        this(name, "beijing", capital);
    }

    Teacher(String n, String l, String capital) {
        super(n, l);
        this.capital = capital;

    }

    public String info() {
        return super.info() + "capital: " + capital;
    }
}


public class TestConstructor {
    public static void main(String[] arg) {
        Person p1 = new Person("c1");
        Person p2 = new Person("c2", "l2");
        Student s1 = new Student("s3", "s9");
        Student s2 = new Student("s4", "l3", "s5");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());

        Teacher t1 = new Teacher("t1", "professor");
        System.out.println(t1.info());
    }
}
