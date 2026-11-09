package inheritance;

public class employemanagementsystem {
    public static void main(String[] args) {
        FullTimeEmployee E1 = new FullTimeEmployee("Taran", 101, 20000);
        PartTimeEmployee E2 = new  PartTimeEmployee("Tushar", 102, 8, 500);
        
        System.out.println("This is a FullTimeEmployee");
        E1.display();
        System.out.println("Salary" +E1.calculatesalary());

        System.out.println("This is a PartTimeEmployee");
        E2.display();
        System.out.println("Salary" +E2.calculatesalary());

    }
}

class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }
    Employee (){}

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public double calculatesalary() {
        return 0;
    }

    public void display() {
        System.out.println("name =" + name);
        System.out.println("ID =" + id);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlysalary ;

    FullTimeEmployee (String name, int id , double monthlysalary){
        super(name,id);
        this.monthlysalary = monthlysalary ;
    }
    @Override 
    public double calculatesalary(){
        return monthlysalary ;
    }
}
class PartTimeEmployee extends Employee {
    private int hours;
    private double hourlyrate;

    PartTimeEmployee (String name,int id ,int hours ,double hourlyrate){
        super(name,id);
        this.hours = hours ;
        this.hourlyrate = hourlyrate ;
    
    }
    @Override 
    public double calculatesalary (){
        return hours * hourlyrate  ;
    }
}
