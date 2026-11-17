package objectclass;

import java.util.Objects;

public class Book_Comparison {
    public static void main(String[] args) {
        Book b1 = new Book("Dictionary", 240.00);
        Book b2 = new Book("Dictionary", 240.00);

        System.out.println("IS both the books are same " + b1.equals(b2));

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        System.out.println(b1.hashCode() == b2.hashCode());

    }
}

class Book {
    String name;
    double price;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book b = (Book) obj;
        return price == b.price && this.name.equals(b.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
