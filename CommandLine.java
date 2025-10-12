public class CommandLine {
    public static void main(String args[]){
        if(args.length ==0)
        System.out.println("No Command Line Argument are supplied as coount = "+args.length);
        else
        System.out.println("Total Number of Arguments = "+args.length);
        for(int i=0; i<args.length; i++)
        {
            System.out.println("The Arguments are ["+(i+1)+"]"+args[i]);
        }
    }
}
