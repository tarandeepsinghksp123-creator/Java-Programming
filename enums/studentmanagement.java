public class studentmanagement {

    public static void main(String[] args) {

        for (Grade g : Grade.values()) {
            System.out.println("Grade: " + g.name());
            System.out.println("Description: " + g.getDescription());
            System.out.println("Minimum Marks: " + g.getMinimumMarks());
            System.out.println("----------------------");
        }
    }
}

enum Grade {
    A("Excellent", 90),
    B("Very Good", 80),
    C("Good", 70),
    D("Average", 60),
    F("Fail", 0);

    private String description;
    private int minimumMarks;

    Grade(String description, int minimumMarks) {
        this.description = description;
        this.minimumMarks = minimumMarks;
    }

    public String getDescription() {
        return description;
    }

    public int getMinimumMarks() {
        return minimumMarks;
    }
}