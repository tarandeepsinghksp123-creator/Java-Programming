import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        System.out.println("Enter your name ");
        String a = br.readLine();

        System.out.println("enter your age ");
        String b = br.readLine();
        int e = Integer.parseInt(b);

        System.out.println("Enter the value of c ");
        String c = br.readLine();
        
        System.out.println("Enter the value of d ");
        String d = br.readLine();

        int x = Integer.parseInt(c);
        int y = Integer.parseInt(d);

        int sum = (x + y);

        System.out.println(a);
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);
        System.out.println(sum);

        br.close();
    }
    
}
