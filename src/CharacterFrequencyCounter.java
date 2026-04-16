import java.util.HashMap;
import java.util.Map;

/**
 * The CharacterFrequencyCounter class analyzes a given string to count the frequency
 * of characters (letters and digits ONLY) in a case-insensitive manner. It provides methods
 * to get the frequency of a specific character, retrieve the full frequency map, and 
 * calculate the relative percentage of a character's occurrence.
 */
public class CharacterFrequencyCounter {
    private Map<Character, Integer> frequencyMap; // Stores character frequencies
    private int totalCharacterCount; // Total count of characters processed

    /**
     * Constructs a CharacterFrequencyCounter with the provided input string.
     * Initializes the frequency map and processes the input to count the frequency
     * of each letter and digit in the string (case-insensitive).
     *
     * @param input the string to analyze for character frequency
     */
    public CharacterFrequencyCounter(String input) {
        frequencyMap = new HashMap<>();
        processString(input);
    }

    /**
     * Processes the input string and updates the frequency map with counts of each
     * letter and digit (case-insensitive). Only letters and digits are counted.
     *
     * @param input the string to be processed
     */
    private void processString(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Count only letters and digits
                c = Character.toLowerCase(c);  // Case insensitive counting
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
                totalCharacterCount++;
            }
        }
    }

    /**
     * Returns the frequency of the specified character (case-insensitive).
     * If the character is not present in the input string, returns 0.
     *
     * @param c the character to get the frequency for
     * @return the frequency of the specified character, or 0 if it is not present
     */
    public int getFrequency(char c) {
        c = Character.toLowerCase(c);  // Case insensitive lookup
        return frequencyMap.getOrDefault(c, 0);
    }

    /**
     * Returns the relative percentage of a character's occurrence in the input string.
     * The percentage is calculated as (character's frequency / total characters) * 100.
     *
     * @param c the character to calculate the relative percentage for
     * @return the relative percentage of the character's occurrence in the string
     */
    public double getRelativePercentage(char c) {
        c = Character.toLowerCase(c);
        int charCount = frequencyMap.getOrDefault(c, 0);

        return ((double) charCount / totalCharacterCount) * 100;
    }
}
