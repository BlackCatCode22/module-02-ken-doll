import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //calling my methods with one line of code
        getAnIntFromTheUser();
        compareTwoInts();
        sumTwoInts();
    }
    //method for collecting an int
    public static void getAnIntFromTheUser()
    {
        Scanner s = new Scanner(System.in);
        //prompt
        System.out.println("Enter an integer :)");
        //putting user input into a var
        int input = s.nextInt();
        //displaying it to the user
        System.out.println("Integer entered: " + input);
    }
    //compare method
    public static void compareTwoInts()
    {
        //i used different names for each scanner to switch things up
        Scanner scan = new Scanner(System.in);
        //prompt
        System.out.println("Enter your first integer :)");
        int one = scan.nextInt();
        System.out.println("Enter your second integer :)");
        int two = scan.nextInt();
        //i made two ints to make it easier but orignaly I tried to parse
        // to challenge myself and I just ended up going the easier route
        if(one>two)
        {
            System.out.println("The larger int is "+one);
        }else
        {
            System.out.println("The larger int is "+two);
        }
        //simple if else to make sure the largest number is showed to the user /\
    }
    //for me summin
    public static void sumTwoInts()
    {
        Scanner sc = new Scanner(System.in);
        //i also did two vars for this one as well
        System.out.println("Enter first integer to be summed");
        int juan = sc.nextInt();
        System.out.println("Enter second integer to be summed");
        int tu = sc.nextInt();
        //got creative with the vars a lil bit
        int sum = juan + tu;
        //returning to the user
        System.out.println("Summed number: "+sum);
    }
}
