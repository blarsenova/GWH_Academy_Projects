package CS_Programming;

public class LastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim(); // Remove trailing spaces
        int length = s.length();
        int lastWordLength = 0;

        // Iterate backward from the last character of the trimmed string
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            lastWordLength++;
        }

        return lastWordLength;
    }


    public static void main(String[] args) {

        LastWord cs = new LastWord();

        // Test cases
        System.out.println(cs.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(cs.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(cs.lengthOfLastWord("luffy is still joyboy")); // Output: 6
        System.out.println(cs.lengthOfLastWord("a")); // Output: 1
        System.out.println(cs.lengthOfLastWord("   ")); // Output: 0
    }

    }