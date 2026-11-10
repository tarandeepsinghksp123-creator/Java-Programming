class Employee_Payroll_Management_System {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Taran",101,40000);
        Employee e2 = new PartTimeEmployee ("Amit",105,8,500);
        Employee e3 = new Intern ("Vikram",121,5000);
        e1.details();
        e2.details();
        e3.details();

        System.out.println("Salary = " +e1.calculatesalary());
        System.out.println("Salary = "+e2.calculatesalary());
        System.out.println("Salary = " +e3.calculatesalary());

        
    }
}
abstract class Employee {
    String name ;
    int id ;
    Employee (){}

    Employee (String name , int id){
        this.name = name ;
        this.id = id ;

    }
    abstract double calculatesalary();
    void details(){
        System.out.println("Name of the employee " +name);
        System.out.println("ID of the employee " +id);
    }
}
class FullTimeEmployee extends Employee {
    private double fixedsalary;
    FullTimeEmployee (String name , int id ,double fixedsalary){
        super(name,id);
        this.fixedsalary = fixedsalary ;
    }
    @Override 
    double calculatesalary (){
       return fixedsalary ;
    }
}
class PartTimeEmployee extends Employee {
    private double hoursworked ;
    private double hourlyrate ;
    PartTimeEmployee (String name , int id , double hoursworked , double hourlyrate){
        super(name,id);
        this.hoursworked = hoursworked ;
        this.hourlyrate = hourlyrate ;
    }
    @Override 
    double calculatesalary (){
        return hoursworked * hourlyrate;
    }
}
class Intern extends Employee {
    private double stipend ; 
    Intern (String name , int id , double stipend){
        super(name,id);
        this.stipend = stipend ;
    }
    @Override 
    double calculatesalary (){
        return stipend ;

    }
}