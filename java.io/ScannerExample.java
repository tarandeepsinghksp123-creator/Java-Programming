import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = sc.nextLine();

        System.out.println("Enter your age ");
        int age = sc.nextInt();
        
        System.out.println("Enter the value of x ");
        int x = sc.nextInt();

        System.out.println("enter the value of y");
        int y = sc.nextInt();
        int sum = x +y;

        System.out.println(name);
        System.out.println(age);
        System.out.println("Sum = " +sum);
        
        
    }
}