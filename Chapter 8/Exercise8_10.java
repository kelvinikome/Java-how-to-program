

class Exercise8_10{
    public enum TrafficLight { 
        RED(5), 
        GREEN(2), 
        YELLOW(9); 
        private int duration;

        TrafficLight(int dur){
            duration = dur;
        }
        int getDuration(){
            return duration;
        }
    };

    public static void main(String[] args) {
        TrafficLight rlight = TrafficLight.RED;
        TrafficLight glight = TrafficLight.GREEN;
        TrafficLight ylight = TrafficLight.YELLOW;

        System.out.println("Light\tDuration");
        System.out.println("RED\t"+rlight.getDuration());
        System.out.println("GREEN\t"+glight.getDuration());
        System.out.println("YELLOW\t"+ylight.getDuration());

    }
}