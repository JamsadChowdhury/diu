import java.util.Scanner;

class Mahin {

    String universityName;
    String location;

    public Mahin(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    public void jamsadDisplay() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + location);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner jamsad = new Scanner(System.in);

        System.out.print("Enter University Name: ");
        String universityName = jamsad.nextLine();

        System.out.print("Enter Location: ");
        String location = jamsad.nextLine();

        Mahin mahin = new Mahin(universityName, location);

        System.out.println("\n--- University Information ---");
        mahin.jamsadDisplay();

        jamsad.close();
    }
}
