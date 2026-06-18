class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduceYourself() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " anios.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Sebastian", 16);
        student.introduceYourself();
    }
}
