public class Trafficlightsystem {

    public static void main(String[] args) {

        for (Signal s : Signal.values()) {

            System.out.println("Signal: " + s.name());
            System.out.println("Duration: " + s.getDuration() + " seconds");
            System.out.println("Action: " + s.getAction());
            System.out.println("----------------------");
        }
    }
}

enum Signal {
    RED(60),
    YELLOW(5),
    GREEN(45);

    private int duration;

    Signal(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getAction() {

        switch (this) {
            case RED:
                return "Stop";

            case YELLOW:
                return "Get Ready";

            case GREEN:
                return "Go";

            default:
                return "Invalid";
        }
    }
}