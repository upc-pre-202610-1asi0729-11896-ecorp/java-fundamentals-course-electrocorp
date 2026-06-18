class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 20) {
            this.grade = grade;
        }
    }

    public void showInformation() {
        System.out.println("Estudiante: " + name);
        System.out.println("Nota: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Lucia", 15.5);

        student.setGrade(18);
        student.showInformation();
    }
}
