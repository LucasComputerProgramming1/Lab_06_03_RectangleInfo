import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        //Declaring Variables
        int firstSide = 0;
        int secondSide = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash="";
        Scanner in = new Scanner(System.in);
        //Prompt Side 1
        System.out.println("What is the length of your first side?");
        //Input Side 1
        if(in.hasNextInt())
        {
            firstSide = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input, please restart and try again.");
        }
        //Prompt Side 2
        System.out.println("What is the length of your second side?");
        //Input Side 2
        if(in.hasNextInt())
        {
            secondSide = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input, please restart and try again.");
        }
        //Processing
        area = firstSide * secondSide;
        perimeter = (firstSide + secondSide)*2;
        diagonal = Math.sqrt((Math.pow(firstSide, 2)) + (Math.pow(secondSide, 2)));
        //Output
        System.out.println("The area of your rectangle is "+area);
        System.out.println("The perimeter of your rectangle is "+perimeter);
        System.out.println("The length diagonally is of your rectangle is "+diagonal);
    }
}