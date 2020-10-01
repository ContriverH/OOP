import java.util.*;

public class hello{
    public static void main(String[] args){
        if(args.length > 0) {
            System.out.println(args[1] + " HelloWorld!");
        }
        else {
            greet();
        }

        System.out.println("Thank you :)");
        
    }
    
    void greet(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter your name : ");
        
        String user_name = sn.next();

        System.out.println(user_name + " HelloWorld!");
    }
}
