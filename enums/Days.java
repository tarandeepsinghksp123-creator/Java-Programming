enum Day {
    Monday, Tuesday, Wednesday, Thursday,
    Friday, Saturday, Sunday
}

public class Days {
    public static void main(String[] args) {

        Day d = Day.Monday;

        System.out.println("Day: " + d.name());
        System.out.println("Position: " + d.ordinal());

        switch (d) {
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Weekday");
        }

        System.out.println("\nAll Days:");

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
