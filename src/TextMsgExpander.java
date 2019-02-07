import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userLine;

        // Prompt user for text
        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);
        System.out.println("");

        // Check for abbreviations
       if (userLine.indexOf("BFF") > -1) {
           userLine = userLine.replace("BFF", "best friends forever");
       }

        // Output expanded text
        System.out.println("");
        System.out.println("Expanded: " + userLine);
    }
}