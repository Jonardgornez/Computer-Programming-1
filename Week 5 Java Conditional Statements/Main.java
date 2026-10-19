import  java.util.Scanner;
public class Main {
    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);

       System.out.print("Choose a number based on a weeks: ");
        int choose  = input.nextInt();

        switch (choose){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Keyword");
                break;

        }


    }
}
