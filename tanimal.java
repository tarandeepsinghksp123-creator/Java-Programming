public class tanimal {
    public static void main(String[] args) {
        animal a1 = new animal("lion", "wild");
        System.out.println(a1.name);
        System.out.println(a1.type);

        a1.legs(4);
    }
}

class animal {
    String name;
    String type;

    public animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void legs(int legs) {
        System.out.println("there are four legs");
    }
}
