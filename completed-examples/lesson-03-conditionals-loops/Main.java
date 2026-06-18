public class Main {
    public static void main(String[] args) {
        int age = 15;

        if (age >= 12) {
            System.out.println("Puedes participar en el curso.");
        } else {
            System.out.println("Necesitas acompanamiento para participar.");
        }

        for (int attempt = 1; attempt <= 5; attempt++) {
            System.out.println("Intento numero: " + attempt);
        }

        int counter = 1;

        while (counter <= 3) {
            System.out.println("Contando: " + counter);
            counter++;
        }
    }
}
