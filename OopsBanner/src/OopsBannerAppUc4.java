/**
 * OOPSBannerApp UC4 – Banner Display Application with Character Pattern Mapping
 *
 * This class demonstrates key Object-Oriented Programming (OOP) concepts
 * through a banner display system that renders text using ASCII art patterns.
 *
 * @author Developer
 * @version 1.0
 */
public class OopsBannerAppUc4 {

    /**
     * CharacterPatternMap – Inner class for storing character-to-pattern mappings
     *
     * Encapsulates a single character and its corresponding ASCII art pattern.
     * Provides immutable access to character and pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        private final Character character;

        /** The ASCII art pattern lines for the character */
        private final String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern
         *
         * @param character the character to be mapped
         * @param pattern the ASCII art pattern representation
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** @return the mapped character */
        public Character getCharacter() {
            return character;
        }

        /** @return the ASCII art pattern */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array
     *
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {

                new CharacterPatternMap('O', new String[] {
                        "  *****  ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        "  *****  ",
                }),

                new CharacterPatternMap('P', new String[] {
                        " ******* ",
                        " *     * ",
                        " *     * ",
                        " ******* ",
                        " *       ",
                        " *       ",
                        " *       "
                }),

                new CharacterPatternMap('S', new String[] {
                        " ******* ",
                        " *       ",
                        " *       ",
                        "  *****  ",
                        "       * ",
                        "       * ",
                        " ******* "
                }),

                new CharacterPatternMap(' ', new String[] {
                        "   ",
                        "   ",
                        "   ",
                        "   ",
                        "   ",
                        "   ",
                        "   "
                })
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character
     *
     * @param ch the character to look up
     * @param charMaps available character pattern mappings
     * @return pattern for the character or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // Default to space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as an ASCII art banner
     *
     * @param message the message to display
     * @param charMaps available character pattern mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int rows = charMaps[0].getPattern().length;

        for (int i = 0; i < rows; i++) {
            String line = "";

            for (char ch : message.toCharArray()) {
                line += getCharacterPattern(ch, charMaps)[i] + "  ";
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – Entry point for the banner display application
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}
