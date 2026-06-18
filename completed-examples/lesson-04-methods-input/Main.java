import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String name = scanner.nextLine();

        greet(name);

        scanner.close();
    }

    public static void greet(String name) {
        System.out.println("Hola, " + name + ". Bienvenido al curso de Java.");
    }
}
