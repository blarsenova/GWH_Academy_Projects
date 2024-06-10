package CS_Programming;

public class LengthofLastWord {

    public class CountLength {
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
    }
}
