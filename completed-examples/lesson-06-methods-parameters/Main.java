public class Main {
    public static void main(String[] args) {
        greetStudent("Diego");

        int result = doubleNumber(8);
        System.out.println("El doble es: " + result);
    }

    public static void greetStudent(String name) {
        System.out.println("Hola, " + name + ". Bienvenido a Java.");
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }
}
