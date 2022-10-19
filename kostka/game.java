import java.util.Random;

public class game {
    public static void main(String[] args) {
        Player player = new Player();
        Random rand = new Random();     
        int number;                     
        int guess = player.guess();                      
        
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);
            System.out.println("Gracz" + player.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }
        } while (number != guess);
    }
}
