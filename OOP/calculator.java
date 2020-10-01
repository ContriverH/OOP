import java.util.*;

public class calculator{
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        
        double num1, num2;
        System.out.println("This is a menu driven program to perform arithmetic operation on two numbers");
        System.out.println("A : addition\nS : subtraction\nM : multiplication\nD : divide\n\tPress any other key to quit\n");
         
        System.out.println("Enter the 1st number = ");
        num1 = sn.nextDouble();
        System.out.println("Enter the 2nd number = ");
        num2 = sn.nextDouble();
        
        calculate(num1, num2);
    }
    
    void calculate(double num1, double num2){
        int flag = 1;
        char ch;

        while(flag){

            System.out.println("Please make your choice : ");
            ch = next().charAt(0);

            switch(ch){

                case 'a':
                case 'A':
                    System.out.println("Addition = " + add(num1, num2);
                    break;
    
                case 's':
                case 'S':
                    System.out.println("Subtraction (num1 - num2) = " + subtract(num1, num2);
                    break;

                case 'm':
                case 'M':
                    System.out.println("Multiplication = " + mutiply(num1, num2);
                    break;

                case 'd':
                case 'D':
                    System.out.println("Division (num1 / num2) = " + divide(num1, num2);
                    break;
                    
                default :
                    flag = 0;
                    break;
            }
        }
    }

    double add(double num1, double num2){
        return (num1 + num2);
    }

    double subtract(double num1, double num2){
        return (num1 - num2);
    }

    double multiply(double num1, double num2){
        return (num1 * num2);
    }

    double divide(double num1, double num2){
        return (num1 / num2);
    }    
}
