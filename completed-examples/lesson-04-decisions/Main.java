public class Main {
    public static void main(String[] args) {
        int age = 15;
        boolean hasPermission = true;

        if (age >= 12) {
            System.out.println("Puedes participar en el curso.");
        } else {
            System.out.println("Necesitas esperar un poco mas para participar.");
        }

        if (age < 18 && hasPermission) {
            System.out.println("Participas con permiso de tu apoderado.");
        } else if (age >= 18) {
            System.out.println("Puedes inscribirte por tu cuenta.");
        } else {
            System.out.println("Primero necesitas permiso de tu apoderado.");
        }
    }
}
