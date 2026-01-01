import java.util.HashMap;

/**
 * OOPSBannerApp UC5 – Advanced OOP Concepts Implementation
 *
 * This class demonstrates advanced Object-Oriented Programming concepts
 * through the creation and display of an ASCII art banner.
 * It extends Use Case 4 by implementing a modular, reusable
 * character pattern system using the Collections Framework.
 *
 * @author Developer
 * @version 5.0
 */
public class OopsBannerAppUc5 {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * @return HashMap where key = character and value = String[] pattern
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "

        });

        charMap.put('P', new String[] {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "

        });

        charMap.put('S', new String[] {
                " ******* ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******* "

        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * @param message the message to display as a banner
     * @param charMap map containing character patterns
     */
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        // Get pattern height (all patterns assumed to be same height)
        int patternHeight = charMap.get('O').length;

        // Loop through each row of the pattern
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder rowBuilder = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {
                rowBuilder.append(charMap.get(ch)[line]).append("  ");
            }

            System.out.println(rowBuilder.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
