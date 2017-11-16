import java.security.SecureRandom;

class Limericks{
    public static int rand(){
        SecureRandom rand = new SecureRandom();
        return rand.nextInt(3);
    }

    public static void main(String[] args) {
        String [] line1Ending = {"beard", "herd", "bed"};
        String [] line2Ending = {"hen", "head", "hem"};
        String [] line3Ending = {"feared!\"", "cheered!\"", "peer!\""};
        String [] line4Ending = {"wren", "hen", "glen"};
        String line1 = "There was an old man with a ";
        String line2 = "Two owls and a ";
        String line3 = "Who said, \"it’s just how I ";
        String line4 = "Four larks and a ";
        String line5 = "Have all built their nests in my ";

        System.out.println(line1+line1Ending[rand()]);
        System.out.println(line2+line2Ending[rand()]);
        System.out.println(line3+line3Ending[rand()]);
        System.out.println(line4+line4Ending[rand()]);
        System.out.println(line5+line1Ending[rand()]);
    }
}