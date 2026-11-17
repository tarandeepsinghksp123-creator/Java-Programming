package objectclass ;
class objectmethodtostring {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Taran";
        s1.age = 19;
        System.out.println(s1.toString());

        
    }
}
class Student {
    String name ;
    int age;

    @Override 
    public String toString(){
        return (name + " " +age);
    }
}