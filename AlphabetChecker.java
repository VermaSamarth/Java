import java.util.Scanner;
public class AlphabetChecker
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char chr;
        System.out.println("Enter the character: ");
        chr = scan.next().charAt(0);
        if(Character.isLetter(chr) == true)
        {
            if("AEIOUaeiou".indexOf(chr)==-1)
                System.out.println("Consonant!!!!");
            else
                System.out.println("Vowel!!!");
        }
        else
        {
            System.out.println("Not a alphabet.");
        }
        scan.close();
    }
}