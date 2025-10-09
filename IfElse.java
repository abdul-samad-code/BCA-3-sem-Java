import java.util.*;
public class IfElse {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
       /*  int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int modulo = a%b;*/
       /*System.out.println("sum : "+(a+b));
       System.out.println("sub : "+(a-b));
       System.out.println("mul : "+(a*b));
       System.out.println("div : "+(a/b));
       System.out.println("modulo : "+(a%b));*/
       System.out.println("Choose an operation");;
       System.out.println("1 : + (Adddition)");
       System.out.println("2 : - (subtraction)");
       System.out.println("3 : * (multiply)");
       System.out.println("4 : / (devide)");
       System.out.println("5 : % (modulo)");
       int choice = sc.nextInt();
       if (choice == 1){
        System.out.println("Result : "+(a+b));
       } else if (choice == 2){
        System.out.println("Result : "+(a-b));
       } else if (choice == 3){
        System.out.println("Result : "+(a*b));
       } else if (choice == 4){
        if (b != 0) {
            System.out.println("Result : "+(a/b));
        } else{
            System.out.println("Devision by 0 is not allowed");
        }
       } else if (choice == 5) {
        if (b != 0) {
            System.out.println("Result : "+(a%b));
        } else {
            System.out.println("Division by 0 is not aloowed");
        }
       } else {
        System.out.println("Invalid operation");
       }
       sc.close();

     }
}
