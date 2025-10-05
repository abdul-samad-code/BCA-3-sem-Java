//this is my second java program 
// adding two numbers 
import java.util.*;
public class AddNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of a and b is : "+sum);
        sc.close();
    }

}
