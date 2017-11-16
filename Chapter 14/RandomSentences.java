import java.security.SecureRandom;

class RandomSentences{
    public static int rand(){
        SecureRandom rand = new SecureRandom();
        return rand.nextInt(5);
    }
    public static void main(String[] args) {
        String [] article = {"the", "a", "one", "some", "any"};
        String [] noun = {"boy", "girl", "dog", "town", "car"};
        String [] verb = {"jumped", "ran", "walked", "skipped"};
        String [] preposition = {"to", "from", "over", "on"};

        System.out.println(article[rand()]+" "+noun[rand()]+" "+verb[rand()]+" "+
        preposition[rand()]+" "+article[rand()]+" "+noun[rand()]);
    }
}