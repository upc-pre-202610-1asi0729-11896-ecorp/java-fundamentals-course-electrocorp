import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String name = scanner.nextLine();

        System.out.print("Escribe tu edad: ");
        int age = scanner.nextInt();

        System.out.println("Hola, " + name + ".");
        System.out.println("Tienes " + age + " anios y estas practicando Java.");

        scanner.close();
    }
}
