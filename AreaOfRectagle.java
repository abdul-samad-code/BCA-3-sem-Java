import java.util.*;

public class AreaOfRectagle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth");
        float breadth = sc.nextFloat();
        float result = length*breadth;
        System.out.println("The area of rectagle is : "+result);
        sc.close();
    }
}
