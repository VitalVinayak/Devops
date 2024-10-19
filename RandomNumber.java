import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(800000) + 100000; // Generates a number between 1000000 and 9000000
        System.out.println(randomNum);
    }
}
