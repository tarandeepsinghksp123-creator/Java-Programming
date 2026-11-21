public class inheritance {
    public static void main(String[] args) {
        engeeneringstudent e1 = new engeeneringstudent();
        e1.print();
        e1.labprint();
        
        
    }   
}
class student {
    String name ;
    int rollno;
    String college;
    student (String name,int rollno,String college){
        this.name= name;
        this.rollno = rollno;
        this.college = college ;
        System.out.println(name + " " +rollno + " " +college);
    }
    student(){}
    void print(){
        System.out.println("dbuu");
    }
}
class engeeneringstudent extends student{
    engeeneringstudent (){
        super("taran",19,"dbuu");

    }
    void labprint(){
        super.name = "Taran";   
        System.out.println(super.name);
        System.out.println("lab attend successfully");
    }
}
