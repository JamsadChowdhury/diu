import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> chowdhury = new ArrayList<>();

        chowdhury.add("Java");
        chowdhury.add("Python");
        chowdhury.add("C++");

        chowdhury.remove(1);

        System.out.println(chowdhury);
    }
}
