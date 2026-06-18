class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void showInformation() {
        System.out.println("Estudiante: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Nota: " + grade);

        if (grade >= 13) {
            System.out.println("Estado: aprobado");
        } else {
            System.out.println("Estado: necesita practicar mas");
        }

        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ana", 15, 18),
            new Student("Luis", 16, 12),
            new Student("Maria", 14, 16)
        };

        for (Student student : students) {
            student.showInformation();
        }
    }
}
