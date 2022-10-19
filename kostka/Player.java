import java.util.Random;

public class Player {
    private Random r = new Random();
    public int guess() {
        return r.nextInt(6) + 1;
    }

    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Nieprawidłowe imię!");
        }
    }
}