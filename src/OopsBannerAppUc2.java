/**
 * OOPSBannerApp UC2 – OOPS Banner Display Application
 *
 * This class demonstrates the creation of ASCII art banner using
 * Object-Oriented Programming principles.
 * It extends the basic banner concept by displaying the word "OOPS"
 * in a visual format using asterisks (*) and spaces.
 *
 * @author Developer
 * @version 2.0
 */
public class OopsBannerAppUc2 {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O O P S
        String[] lines = {
                "  *****     *****    ******    ****** ",
                " *     *   *     *   *     *   *      ",
                " *     *   *     *   *     *   *      ",
                " *     *   *     *   ******     ***** ",
                " *     *   *     *   *              *",
                " *     *   *     *   *              *",
                "  *****     *****    *          ****** "


        };

        // Use a loop to print each line of the banner
        // to create the visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
