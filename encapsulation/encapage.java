public class encapage {
    public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.setage(300);
        System.out.println(s1.getage());

    }
    
}
class Student {
    private int age ;
    public void setage(int age){
        if (age > 0 && age < 120){
            this.age=age;
        }
        else {
            System.out.println("Invalid age");
        }
        

    }
    public int getage(){
        return age ;
    }

}
