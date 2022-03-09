import java.util.Scanner;


 class javaCalculator
{

    public static void main(String[] args)
    {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);
        System.out.println("CALCULATOR");

        System.out.println("Enter your first number:");
        num1 = input.nextInt();

        System.out.println("Enter your second number:");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("What would you like to do, addition, subtraction, multiplication or division?");
        System.out.println("Enter one of these to make your choice: +,-,*,/");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Your answer is: " + (num1 + num2));
        }
        else if  (operation.equals("-"))
        {
            System.out.println("Your answer is: " + (num1 - num2));
        }

        else if (operation.equals("/"))
        {
            System.out.println("Your answer is: " + (num1 / num2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Your answer is: " + (num1 * num2));
        }
        else
        {
            System.out.println("Wrong selection");
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ie) {
        }
    }
}
