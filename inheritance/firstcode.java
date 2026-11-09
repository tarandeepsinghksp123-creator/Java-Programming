package inheritance;

public class firstcode {
    public static void main(String[] args) {
        student s1 = new student("Taran",19,20);
        s1.displayperson();
        s1.displayrollno();
        
    }
    
}
class person{
    String name ;
    int age; 
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayperson(){
        System.out.println(name);
        System.out.println(age);    
    }
}
class student extends person {
    int rollno ;
    student(String name,int age,int rollno){
        super(name,age);
        this.rollno = rollno ;
    }
    void displayrollno(){
        System.out.println(rollno);
    }
}