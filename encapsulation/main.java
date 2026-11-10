public class main {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setpatientname("Taran");
        p1.setage(21);
        p1.setdisease("abc");
        p1.displaydetails();
    }  
}
class Patient {
    private String patientname;
    private int age;
    private String disease ;
    
    public void setpatientname (String patientname){
        this.patientname = patientname;
               
    }
    public void setage (int age){
        if(age> 0 && age < 120){
            this.age = age ;
        }else {
            System.out.println("Invalid age");
        }
    }
    public void setdisease (String disease){
        this.disease = disease ;
    }
    public String getpatientname(){
        return patientname ;
    }
    public int getage(){
        return age ;
    }
    public String getdisease(){
        return disease;
    }
    public void displaydetails(){
        System.out.println(getpatientname());
        System.out.println(getage());
        System.out.println(getdisease());
    }

}
