import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //here's my scanner
        Scanner s = new Scanner(System.in);
        //just like last assignment I made seperate variables
        System.out.println("Please enter three integers below");
        System.out.print("First: ");
        int one =s.nextInt();
        System.out.print("Second: ");
        int two =s.nextInt();
        System.out.print("Third: ");
        int three =s.nextInt();
        //my if statement to counter all possible outcomes
        if(one>two)
        {
            System.out.println(one);
            if (three > two)
            {
                System.out.println(three);
                if (two > three)
                {
                    System.out.println(two);
                    if (two > one)
                    {
                        System.out.println(two);
                        if (one > three)
                        {
                            System.out.println(one);
                        }
                    }
                }

            }
        }//the else subs for the three> two
            else
            {
                System.out.println(three);
            }
    }
}