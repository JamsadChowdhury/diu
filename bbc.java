import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner jamsad = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter first name: ");
        names.add(jamsad.nextLine());

        System.out.print("Enter second name: ");
        names.add(jamsad.nextLine());

        System.out.println("Names: " + names);

        jamsad.close();
    }
}
