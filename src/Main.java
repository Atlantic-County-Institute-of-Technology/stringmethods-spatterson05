import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Makes a new scanner to listen to user input
        Scanner scan = new Scanner(System.in);

        // Your program should first decode this block of text and display it. Then, prompt the user for a name. Take that name and output the following: The name in reverse, the Reverse order in ALL CAPITALS, the original string using CaMeL cAsE, and finally the original string in ASCII. DO NOT USE ANY STRING MANIPULATION METHODS.
        // Puts the given numbers into a list separated with commas
        List<Integer> ascii = Arrays.asList(89, 111, 117, 114, 32, 112, 114, 111, 103, 114, 97, 109, 32, 115, 104, 111, 117, 108, 100, 32, 102, 105, 114, 115, 116, 32, 100, 101, 99, 111, 100, 101, 32, 116, 104, 105, 115, 32, 98, 108, 111, 99, 107, 32, 111, 102, 32, 116, 101, 120, 116, 32, 97, 110, 100, 32, 100, 105, 115, 112, 108, 97, 121, 32, 105, 116, 46, 32, 84, 104, 101, 110, 44, 32, 112, 114, 111, 109, 112, 116, 32, 116, 104, 101, 32, 117, 115, 101, 114, 32, 102, 111, 114, 32, 97, 32, 110, 97, 109, 101, 46, 32, 84, 97, 107, 101, 32, 116, 104, 97, 116, 32, 110, 97, 109, 101, 32, 97, 110, 100, 32, 111, 117, 116, 112, 117, 116, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 58, 32, 84, 104, 101, 32, 110, 97, 109, 101, 32, 105, 110, 32, 114, 101, 118, 101, 114, 115, 101, 44, 32, 116, 104, 101, 32, 82, 101, 118, 101, 114, 115, 101, 32, 111, 114, 100, 101, 114, 32, 105, 110, 32, 65, 76, 76, 32, 67, 65, 80, 73, 84, 65, 76, 83, 44, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 117, 115, 105, 110, 103, 32, 67, 97, 77, 101, 76, 32, 99, 65, 115, 69, 44, 32, 97, 110, 100, 32, 102, 105, 110, 97, 108, 108, 121, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 105, 110, 32, 65, 83, 67, 73, 73, 46, 32, 68, 79, 32, 78, 79, 84, 32, 85, 83, 69, 32, 65, 78, 89, 32, 83, 84, 82, 73, 78, 71, 32, 77, 65, 78, 73, 80, 85, 76, 65, 84, 73, 79, 78, 32, 77, 69, 84, 72, 79, 68, 83, 46, 13, 10);

        // Loops through every value in the list and prints the ascii value for each number
        for (int i = 0; i < ascii.size(); i++) {
            int num = ascii.get(i);
            System.out.print((char) num);
        }

        // Asks the user for their username
        System.out.print("Gimme a name, homedawg! I don't want any symbols or anything though. ");
        String name = scan.nextLine();

        // Declares a buncha variables
        String nameReverse = "";
        String nameCapital = "";
        String nameCamelCase = "";
        String nameAscii = "";
        boolean symbolUsed = false;

        for (int i = 0; i < name.length(); i++) {
            // Gets a letter
            char letter = name.charAt(i);

            // Reverses the name
            nameReverse = letter + nameReverse;

            // Makes sure letter hasn't changed
            letter = name.charAt(i);

            // Checks if the character is a letter rather than a symbol
            if (((int)letter > 64 && ((int)letter < 91)) || ((int)letter > 96 && ((int)letter < 123))) {
                // Capitalizes the name
                if ((int) letter > 91) {
                    letter = (char) ((int) letter - 32);
                }
            }
            nameCapital = letter + nameCapital;

            // Makes sure letter hasn't changed
            letter = name.charAt(i);

            // ASCII A-Z = 65 - 90      ASCII a-z = 97-122
            // Checks if the character is a letter rather than a symbol
            if (((int)letter > 64 && ((int)letter < 91)) || ((int)letter > 96 && ((int)letter < 123))) {
                // Puts the name into camel case
                if (i % 2 == 1) {
                    if ((int) letter < 91) {
                        letter = (char) ((int) letter + 32);
                    }
                } else {
                    if ((int) letter > 91) {
                        letter = (char) ((int) letter - 32);
                    }
                }
            }
            nameCamelCase = nameCamelCase + letter;

            // Makes sure letter hasn't changed
            letter = name.charAt(i);

            // Converts the name to ASCII
            nameAscii = nameAscii + (int) letter + " ";
        }

        // Prints out what the user's inputted name is in reverse, capitalized and reversed, in camel case, and in ASCII
        System.out.print("\nYour name is " + name + ", yeah? \n"
                + "Your name in reverse is: " + nameReverse + "\n"
                + "Your capitalized reversed name is: " + nameCapital + "\n"
                + "Your name in camel case is: " + nameCamelCase + "\n"
                + "Your name in ASCII is: " + nameAscii);

    }
}