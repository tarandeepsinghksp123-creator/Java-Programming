package interfaces;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        TeamLead T = new TeamLead();
        T.work();
        T.conductMeeting();
        
    }
    
}
interface Employee {
    void work();
}
interface Manager extends Employee {
    void conductMeeting();
}
class TeamLead implements Manager {
    @Override 
    public void work (){
        System.out.println("Team lead is working");
    }
    @Override 
    public void conductMeeting(){
        System.out.println("team leader is going to conduct a meating");
    }
}
