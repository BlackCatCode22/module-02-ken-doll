import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //create a Scanner object to read user input
        //I use s b/c scanner is long & i usually can't spell it right the first time
        Scanner s = new Scanner(System.in);
        //Prompt the user
        System.out.println("Enter a word or a sentence:");
        //read the user input
        String userInput = s.nextLine();
        //make the string backwards
        String reversedString = reverseString(userInput);
        //show the reversed string
        System.out.println("Reversed string: " + reversedString);
        s.close();
    }
    private static String reverseString(String input)
    {
        //make the string to a char array for easy use
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end)
        {
            //ignore spaces while reversing
            if (charArray[start] != ' ' && charArray[end] != ' ')
            {
                //swap chars at start and end positions
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                //move the start & end towards each other
                start++;
                end--;
            } else {
                //if one of the chars is a space move the start & end
                if (charArray[start] == ' ')
                {
                    start++;
                }
                if (charArray[end] == ' ')
                {
                    end--;
                }
            }
        }
        //convert the char array back to a string to be effcient
        return new String(charArray);
    }
}
