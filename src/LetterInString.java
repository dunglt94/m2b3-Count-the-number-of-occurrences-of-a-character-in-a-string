import java.util.Scanner;

public class LetterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Count the number of occurrences of a character in a string.";
        System.out.println("We have a string: " + str);
        String strLowerCase = str.toLowerCase();
        char letter;
        int count = 0;

        do {
            System.out.print("Enter a letter from the string: ");
            letter = scanner.next().charAt(0);
            for (int i = 0; i < strLowerCase.length(); i++) {
                if (strLowerCase.charAt(i) == letter) {
                    count++;
                }
            }
            if (count == 0) System.out.println("Letter '" + letter + "' is not in the string.");
        } while (count == 0);

        System.out.println("There are " + count + " letter(s) '" + letter + "' in the string.");
    }
}
