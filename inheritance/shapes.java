package inheritance;

public class shapes {
    public static void main(String[] args) {
        circle c1 = new circle(4);
        c1.display();
        c1.calculatearea();

        rectangle r1 = new rectangle(10, 20);
        r1.display();
        r1.calculatearea();
    }   
}
class parent {
    void display(){
        System.out.println("This is a shape ");
    }
}
class circle extends parent {
    double r ;
    circle (double r){
        this.r = r;
    }
    void calculatearea(){
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}
class rectangle extends parent {
    int length ;
    int breadth ;
    rectangle (int length,int breadth){
        this.length = length ;
        this.breadth = breadth ;
    }
    void calculatearea(){
        double area = length * breadth ;
        System.out.println(area);
    }
}
