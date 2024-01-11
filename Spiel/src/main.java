import java.util.Random;

public class main {

    public static void main(String[] args) {
        Random random = new Random();
        Regie regie = new Regie("Oliver", "Gegner");
        regie.starteKampf();
    }
}