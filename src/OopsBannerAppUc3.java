/**
 * OOPSBannerApp – OOPS Banner Application (Use Case 3)
 *
 * This class extends User Story 2 to display the "OOPS" banner
 * using a modular approach by implementing the Single Responsibility
 * Principle (SRP) and Method Extraction.
 *
 * <p><b>Pattern:</b> String arrays representing ASCII art for
 * letters O, P, and S are generated and combined horizontally
 * to create the visual "OOPS" message.</p>
 *
 * @author Developer
 * @version 3.0
 */
public class OopsBannerAppUc3 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  ",
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
                " ******* ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******* "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and print the banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +
                            oPattern[i] + "  " +
                            pPattern[i] + "  " +
                            sPattern[i]
            );
        }
    }
}
