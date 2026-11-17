package objectclass;

public class equals {
    public static void main(String[] args) {
        Studentequals s1 = new Studentequals("Taran", 19);
        Studentequals s2 = new Studentequals("Taran", 19);

        System.out.println(s1.equals(s2));

    }
}

class Studentequals {
    String name;
    int age;

    Studentequals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Studentequals s = (Studentequals) obj;
        return age == s.age && name.equals(s.name);

    }
}
