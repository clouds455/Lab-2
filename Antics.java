/**
 Project 2
 Description: Methods that modify strings
 @author Bernardo Fichman Lacerda
 @author Jaya Menon
 @since 03/17/2025
 */
public class Antics {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        System.out.println("Enter Word:");
        boolean isPalindrome = true;
        int word_start = 0;
        int word_end = word.length() - 1;
        while (word_start < word_end) {
            if (word.charAt(word_start) != word.charAt(word_end)) {
                isPalindrome = false;
                break;
            }
            word_start++;
            word_end--;
        }
        if (isPalindrome) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAbecedarian(String name) {
        name=name.toLowerCase();
        int index = name.length() - 1;
        for (int i = 0; i < index; i++) {
            if (name.charAt(i) <= name.charAt(i + 1)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;}

    /**
     * this method tells if the word or phrase is a pangram or not
     * @param word is the word or phrase evaluated
     * @return true if the word/phrase is a pangram, otherwise, it returns false
     */

        public static boolean isPangram (String word){
            word = word.toLowerCase();

            for (int i = 97; i < 123; i++) {
                if (!word.contains(String.valueOf(Character.toChars(i)))) {
                    return false;
                }
            }
            return true;
        }

    /**
     * this method capitalizes only the first character of a word or phrase, keeping the other characters lower case
     * @param text is the word or phrase evaluated
     * @return the word/phrase with the modifications described
     */

        public static String capitalizeFirstLetter (String text){
            text = text.toLowerCase();
            String firstLetter = String.valueOf(text.charAt(0));
            firstLetter = firstLetter.toUpperCase();
            text = text.replaceFirst("^[a-z]", firstLetter);

            return text;

        }

}